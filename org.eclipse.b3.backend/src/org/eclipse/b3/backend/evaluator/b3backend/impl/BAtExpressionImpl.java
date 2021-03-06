/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BAtExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BAt Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAtExpressionImpl#getObjExpr <em>Obj Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAtExpressionImpl#getIndexExpr <em>Index Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BAtExpressionImpl extends BExpressionImpl implements BAtExpression {
	/**
	 * The cached value of the '{@link #getObjExpr() <em>Obj Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getObjExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression objExpr;

	/**
	 * The cached value of the '{@link #getIndexExpr() <em>Index Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIndexExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression indexExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BAtExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIndexExpr(BExpression newIndexExpr, NotificationChain msgs) {
		BExpression oldIndexExpr = indexExpr;
		indexExpr = newIndexExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BAT_EXPRESSION__INDEX_EXPR, oldIndexExpr, newIndexExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetObjExpr(BExpression newObjExpr, NotificationChain msgs) {
		BExpression oldObjExpr = objExpr;
		objExpr = newObjExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BAT_EXPRESSION__OBJ_EXPR, oldObjExpr, newObjExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3backendPackage.BAT_EXPRESSION__OBJ_EXPR:
				return getObjExpr();
			case B3backendPackage.BAT_EXPRESSION__INDEX_EXPR:
				return getIndexExpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3backendPackage.BAT_EXPRESSION__OBJ_EXPR:
				return basicSetObjExpr(null, msgs);
			case B3backendPackage.BAT_EXPRESSION__INDEX_EXPR:
				return basicSetIndexExpr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3backendPackage.BAT_EXPRESSION__OBJ_EXPR:
				return objExpr != null;
			case B3backendPackage.BAT_EXPRESSION__INDEX_EXPR:
				return indexExpr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3backendPackage.BAT_EXPRESSION__OBJ_EXPR:
				setObjExpr((BExpression) newValue);
				return;
			case B3backendPackage.BAT_EXPRESSION__INDEX_EXPR:
				setIndexExpr((BExpression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3backendPackage.BAT_EXPRESSION__OBJ_EXPR:
				setObjExpr((BExpression) null);
				return;
			case B3backendPackage.BAT_EXPRESSION__INDEX_EXPR:
				setIndexExpr((BExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getIndexExpr() {
		return indexExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getObjExpr() {
		return objExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIndexExpr(BExpression newIndexExpr) {
		if(newIndexExpr != indexExpr) {
			NotificationChain msgs = null;
			if(indexExpr != null)
				msgs = ((InternalEObject) indexExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BAT_EXPRESSION__INDEX_EXPR, null, msgs);
			if(newIndexExpr != null)
				msgs = ((InternalEObject) newIndexExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BAT_EXPRESSION__INDEX_EXPR, null, msgs);
			msgs = basicSetIndexExpr(newIndexExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BAT_EXPRESSION__INDEX_EXPR, newIndexExpr, newIndexExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setObjExpr(BExpression newObjExpr) {
		if(newObjExpr != objExpr) {
			NotificationChain msgs = null;
			if(objExpr != null)
				msgs = ((InternalEObject) objExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BAT_EXPRESSION__OBJ_EXPR, null, msgs);
			if(newObjExpr != null)
				msgs = ((InternalEObject) newObjExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BAT_EXPRESSION__OBJ_EXPR, null, msgs);
			msgs = basicSetObjExpr(newObjExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BAT_EXPRESSION__OBJ_EXPR, newObjExpr, newObjExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BAT_EXPRESSION;
	}
} // BAtExpressionImpl
