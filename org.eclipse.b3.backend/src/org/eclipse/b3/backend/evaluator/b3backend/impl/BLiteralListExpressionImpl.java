/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.b3.backend.evaluator.BackendHelper;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression;
import org.eclipse.b3.backend.evaluator.typesystem.B3ParameterizedType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BLiteral List Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralListExpressionImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralListExpressionImpl#getEntryType <em>Entry Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BLiteralListExpressionImpl extends BExpressionImpl implements BLiteralListExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<BExpression> entries;

	/**
	 * The cached value of the '{@link #getEntryType() <em>Entry Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryType()
	 * @generated
	 * @ordered
	 */
	protected Type entryType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BLiteralListExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BLITERAL_LIST_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BExpression> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<BExpression>(BExpression.class, this, B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEntryType() {
		if (entryType != null && ((EObject)entryType).eIsProxy()) {
			InternalEObject oldEntryType = (InternalEObject)entryType;
			entryType = (Type)eResolveProxy(oldEntryType);
			if (entryType != oldEntryType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRY_TYPE, oldEntryType, entryType));
			}
		}
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetEntryType() {
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryType(Type newEntryType) {
		Type oldEntryType = entryType;
		entryType = newEntryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRY_TYPE, oldEntryType, entryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRIES:
				return getEntries();
			case B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRY_TYPE:
				if (resolve) return getEntryType();
				return basicGetEntryType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends BExpression>)newValue);
				return;
			case B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRY_TYPE:
				setEntryType((Type)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRIES:
				getEntries().clear();
				return;
			case B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRY_TYPE:
				setEntryType((Type)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRIES:
				return entries != null && !entries.isEmpty();
			case B3backendPackage.BLITERAL_LIST_EXPRESSION__ENTRY_TYPE:
				return entryType != null;
		}
		return super.eIsSet(featureID);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		Type t = entryType == null ? Object.class : entryType;
		List<Object> list = new ArrayList<Object>(entries.size());
		int counter = 0;
		for(BExpression expr : entries) {
			Object result = expr.evaluate(ctx);
			Class entryClass = null;
			if( t instanceof ParameterizedType)
				entryClass = (Class)((ParameterizedType)t).getRawType();
			else
				entryClass = (Class)t;
			if(!entryClass.isAssignableFrom(result.getClass()))
				throw BackendHelper.createException(expr, 
						"List creation error for index {0}. "
						+"A List<{1}>, does not accept an instance of type {2}.",
						new Object[] { counter, t, result.getClass()});
			list.add(result);
			counter++;
			}
		return list;
	}
	/**
	 * Returns the declared entry, type or Object if not specified.
	 * TODO: the common super type could be computed instead.
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		if(entryType == null)
			return new B3ParameterizedType(List.class, new Type[] { Object.class });
		return new B3ParameterizedType(List.class, new Type[] { entryType });
	}
} //BLiteralListExpressionImpl
