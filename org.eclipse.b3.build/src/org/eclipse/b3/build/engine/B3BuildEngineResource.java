/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.engine;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.backend.core.JavaToB3Helper;
import org.eclipse.b3.backend.evaluator.IB3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BDefValue;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.functions.ArithmeticFunctions;
import org.eclipse.b3.backend.functions.RelationalFunctions;
import org.eclipse.b3.backend.functions.StringFunctions;
import org.eclipse.b3.backend.functions.SystemFunctions;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.functions.BuildFunctions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

/**
 * The Engine Resource is a b3 model loaded from the environment. It can not be saved.
 * 
 */
public class B3BuildEngineResource extends ResourceImpl {

	private static BDefValue createValue(String name, Type type, boolean isFinal) {
		BDefValue var = B3backendFactory.eINSTANCE.createBDefValue();
		var.setName(name);
		var.setType(type);
		var.setImmutable(true);
		var.setFinal(isFinal);
		return var;
	}

	// // currently unused
	// private static BDefValue createVariable(String name, Type type) {
	// BDefValue var = B3backendFactory.eINSTANCE.createBDefValue();
	// var.setName(name);
	// var.setType(type);
	// return var;
	// }

	private BDefValue varRequest;

	private BDefValue varInput;

	private BDefValue varOutput;

	private BDefValue varSource;

	private BDefValue varEngine;

	private ArrayListMultimap<String, IFunction> functionMap;

	/**
	 * @param uri
	 */
	public B3BuildEngineResource(URI uri) {
		super(uri);
	}

	/**
	 * Returns the first function having name, or null if there is no such function.
	 * 
	 * @param name
	 * @return
	 */
	public IFunction getFunctionByName(String name) {
		List<IFunction> list = functionMap.get(name);
		if(list.size() > 0)
			return list.get(0);
		return null;
	}

	public ListMultimap<String, IFunction> getFunctions() {
		return Multimaps.unmodifiableListMultimap(functionMap);
	}

	public List<IFunction> getFunctionsByName(String name) {
		return Collections.unmodifiableList(functionMap.get(name));
	}

	/**
	 * @return the varEngine
	 */
	public BDefValue getVarEngine() {
		return varEngine;
	}

	/**
	 * @return the varInput
	 */
	public BDefValue getVarInput() {
		return varInput;
	}

	/**
	 * @return the varOutput
	 */
	public BDefValue getVarOutput() {
		return varOutput;
	}

	/**
	 * @return the varRequest
	 */
	public BDefValue getVarRequest() {
		return varRequest;
	}

	/**
	 * @return the varSource
	 */
	public BDefValue getVarSource() {
		return varSource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#load(java.util.Map)
	 */
	@Override
	public void load(Map<?, ?> options) throws IOException {
		functionMap = Multimaps.newArrayListMultimap();

		EList<EObject> content = getContents();
		varRequest = createValue(B3BuildConstants.B3_VAR_REQUEST, RequiredCapability.class, true);
		content.add(varRequest);

		varInput = createValue(B3BuildConstants.B3_VAR_INPUT, BuildSet.class, true);
		content.add(varInput);

		varOutput = createValue(B3BuildConstants.B3_VAR_OUTPUT, BuildSet.class, true);
		content.add(varOutput);

		varSource = createValue(B3BuildConstants.B3_VAR_OUTPUT, BuildSet.class, true);
		content.add(varSource);

		varEngine = createValue(B3BuildConstants.B3_VAR_ENGINE, IB3Engine.class, true);
		content.add(varEngine);

		// load functions
		try {
			processFunctions(JavaToB3Helper.loadFunctions(ArithmeticFunctions.class));
			processFunctions(JavaToB3Helper.loadFunctions(RelationalFunctions.class));
			processFunctions(JavaToB3Helper.loadFunctions(StringFunctions.class));
			processFunctions(JavaToB3Helper.loadFunctions(SystemFunctions.class));

			processFunctions(JavaToB3Helper.loadFunctions(BuildFunctions.class));
		}
		catch(Exception e) {
			// TODO: Investigate if there is some better exception to throw, this
			// should not happen...
			throw new IllegalArgumentException("A system class could not be loaded", e);
		}
	}

	private void processFunctions(Multimap<IFunction, String> functions) {
		EList<EObject> content = getContents();
		for(IFunction f : functions.keySet()) {
			content.add(f);
			for(String name : functions.get(f))
				functionMap.put(name, f);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#save(java.util.Map)
	 */
	@Override
	public void save(Map<?, ?> options) throws IOException {
		// do nothing - saving the engine is not (yet) required

	}
}
