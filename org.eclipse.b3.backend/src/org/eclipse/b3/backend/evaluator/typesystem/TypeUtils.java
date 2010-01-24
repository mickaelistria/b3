package org.eclipse.b3.backend.evaluator.typesystem;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;

public class TypeUtils {
	private static WeakReference<TypeDistance> typeDistance = new WeakReference<TypeDistance>(null);

	private static final String lock = "";

	/**
	 * mapping from object to primitive types
	 */
	private static final Map<Type, Type> objectToPrimitiveMap = new HashMap<Type, Type>();

	/**
	 * mapping from primitive to object types
	 */
	private static final Map<Type, Type> primitiveToObjectMap = new HashMap<Type, Type>();

	/**
	 * map of possible automatic coercions for all appropriate types
	 */
	private static final Map<Type, Set<Type>> coerceMap = new HashMap<Type, Set<Type>>();

	static {
		Class<?> objectTypeClasses[][] = { { Void.class, Boolean.class, Double.class }, { Float.class },
				{ Long.class }, { Integer.class }, { Character.class, Short.class }, { Byte.class } };

		Set<Type> coerceTypeSet = Collections.emptySet();
		Set<Type> previousCoerceTypeSet = coerceTypeSet;

		for(Class<?> objectTypes[] : objectTypeClasses) {
			for(Class<?> objectType : objectTypes) {
				Class<?> primitiveType = getPrimitiveTypeReflectively(objectType);

				objectToPrimitiveMap.put(objectType, primitiveType);
				primitiveToObjectMap.put(primitiveType, objectType);

				coerceTypeSet = new HashSet<Type>(previousCoerceTypeSet);
				coerceTypeSet.add(primitiveType);

				coerceMap.put(objectType, coerceTypeSet);
				coerceMap.put(primitiveType, coerceTypeSet);
			}

			previousCoerceTypeSet = coerceTypeSet;
		}
	}

	private static Class<?> getPrimitiveTypeReflectively(Class<?> objectType) {
		Field f;

		try {
			f = objectType.getField("TYPE");
		} catch(SecurityException e) {
			throw new ExceptionInInitializerError(e);
		} catch(NoSuchFieldException e) {
			throw new ExceptionInInitializerError(e);
		}

		try {
			return (Class<?>) f.get(null);
		} catch(IllegalArgumentException e) {
			throw new ExceptionInInitializerError(e);
		} catch(IllegalAccessException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public enum CandidateState {
		NONE, VARIABLE_ARITY_BY_CONVERSION, VARIABLE_ARITY_BY_SUBTYPING, FIXED_ARITY_BY_CONVERSION, FIXED_ARITY_BY_SUBTYPING;
	}

	public static Class<?> getRaw(Type t) {
		if(t instanceof Class<?>)
			return (Class<?>) t;
		if(t instanceof ParameterizedType) {
			ParameterizedType pt = ParameterizedType.class.cast(t);
			return getRaw(pt.getRawType());
		}
		if(t instanceof GenericArrayType) {
			GenericArrayType ga = GenericArrayType.class.cast(t);
			return ga.getClass();
		}
		if(t instanceof B3JavaImport) {
			return getRaw(B3JavaImport.class.cast(t).getType());
		}
		if(t instanceof B3FunctionType) {
			B3FunctionType ft = B3FunctionType.class.cast(t);
			return getRaw(ft.getFunctionType()); // i.e. what type of function this is B3, or Java
		}
		if(t instanceof B3MetaClass) {
			return ((B3MetaClass)t).getInstanceClass();
		}
		if(t instanceof TypeVariable<?>) {
			TypeVariable tv = TypeVariable.class.cast(t);
			// TODO: OMG - this is cheating...
			return getRaw(tv.getBounds()[0]);
		}
		throw new UnsupportedOperationException("UNSUPPORTED TYPE CLASS - was: " + t);
	}

	public static boolean isAssignableFrom(Type baseType, Type fromType) {
		if(baseType instanceof B3FunctionType)
			return ((B3FunctionType) baseType).isAssignableFrom(fromType);
		if(baseType instanceof B3MetaClass)
			return ((B3MetaClass)baseType).isAssignableFrom(fromType);
		return getRaw(baseType).isAssignableFrom(getRaw(fromType));
	}

	public static boolean isCoercibleFrom(Type baseType, Type fromType) {
		Set<Type> coerceTypes = coerceMap.get(fromType);

		return coerceTypes != null && coerceTypes.contains(baseType);
	}
	/**
	 * Is equivalent to calling {@link #isAssignableFrom(Type, Type)} with baseType, value.getClass(), but 
	 * handles the special case when value is null.
	 * @param baseType
	 * @param value
	 * @return
	 */
	public static boolean isAssignableFrom(Type baseType, Object value) {
		if(value == null)
			return true;
		return isAssignableFrom(baseType, value.getClass());
	}

	public static boolean isArray(Type baseType) {
		return baseType instanceof GenericArrayType
				|| (baseType instanceof Class<?> && ((Class<?>) baseType).isArray());
		// return getRaw(baseType).isArray();
	}

	/**
	 * Returns the (best) specificity distance for an interface. (A class may restate its implementation of an inherited
	 * interface - this will give a shorter distance).
	 * 
	 * @param ptc
	 * @param pc
	 * @return
	 */
	@SuppressWarnings ("unchecked")
	public static int interfaceDistance(Class ptc, Class pc) {
		if(ptc == pc)
			return 0;
		int best = Integer.MAX_VALUE;
		for(Class i : pc.getInterfaces()) {
			int distance = interfaceDistance(ptc, i);
			if(distance < best) {
				best = distance;
				if(best == 0)
					break; // unbeatable
			}
		}
		return best != Integer.MAX_VALUE
				? best + 1 : best;
	}

	public static int typeDistance(Type baseType, Type queriedType) {
		Class<?> baseClass = getRaw(baseType);
		if(baseClass.isInterface())
			return interfaceDistance(baseClass, getRaw(queriedType));
		return classDistance(baseClass, getRaw(queriedType));
	}

	/**
	 * Computes the specificity distance of a class
	 * 
	 * @param ptc
	 * @param pc
	 * @return
	 */
	@SuppressWarnings ("unchecked")
	public static int classDistance(Class ptc, Class pc) {
		if(pc == null)
			throw new IllegalArgumentException("Internal error: type is not a specialization of the class");
		if(ptc == pc)
			return 0;
		if(pc.isInterface())
			return classDistance(ptc, Object.class) + 1;
		return classDistance(ptc, pc.getSuperclass()) + 1;
	}

	/**
	 * Returns the element type of a list or the value type of map
	 * 
	 * @param baseType
	 * @return
	 */
	public static Type getElementType(Type baseType) {
		if(baseType instanceof ParameterizedType) {
			ParameterizedType pt = ParameterizedType.class.cast(baseType);
			int returnTypeIdx = -1;
			if(List.class.isAssignableFrom(getRaw(pt.getRawType())))
				returnTypeIdx = 0;
			else if(Map.class.isAssignableFrom(getRaw(pt.getRawType())))
				returnTypeIdx = 1;
			Type[] typeargs = pt.getActualTypeArguments();
			// TODO: probably too relaxed, if it was not a List<?> or Map<?>, then Object is returned
			//
			if(returnTypeIdx < 0 || typeargs == null || typeargs.length <= returnTypeIdx)
				return Object.class; // unspecified
			return typeargs[returnTypeIdx];
		}
		// TODO: probably too relaxed
		return Object.class;
	}

	public static Type getCommonSuperType(Type[] types) {
		TypeDistance td = null;
		;
		synchronized(lock) {
			td = typeDistance.get();
			if(td == null)
				typeDistance = new WeakReference<TypeDistance>(td = new TypeDistance());
		}
		return td.getMostSpecificCommonType(types);
		// Class<?>[] classes = new Class[types.length];
		// for(int i = 0; i < types.length; i++)
		// classes[i] = getRaw(types[i]);
		//		
		// int limit = classes.length;
		// nexti: for(int i = 0; i < limit; i++) {
		// nextj: for(int j = 0; j < limit; j++) {
		// if(i == j)
		// continue nextj;
		// if(!classes[i].isAssignableFrom(classes[j]))
		// continue nexti;
		// }
		// return classes[i];
		// }
		// return Object.class; // did not find any commonality
	}

	public static Class<?> getArrayComponentClass(Type type) {
		if(type instanceof Class<?>)
			return ((Class<?>) type).getComponentType();
		if(type instanceof GenericArrayType)
			type = ((GenericArrayType) type).getGenericComponentType();
		else
			throw new IllegalArgumentException("Not possible to get array component type from type:" + type);

		return getRaw(type);
	}

	/**
	 * Returns the object type corresponding to a primitive type.
	 * 
	 * @param type
	 * @return
	 */
	public static Type objectify(Type primitiveType) {
		Type objectType = primitiveToObjectMap.get(primitiveType);
		return objectType != null ? objectType : primitiveType;
	}

	public static Type primitivize(Type objectType) {
		Type primitiveType = objectToPrimitiveMap.get(objectType);
		return primitiveType != null ? primitiveType : objectType;
	}

}
