/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.RequiredCapability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.RequiredCapabilityImpl#getVersionRange <em>Version Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredCapabilityImpl extends CapabilityImpl implements RequiredCapability {
	/**
	 * The default value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionRange()
	 * @generated
	 * @ordered
	 */
	protected static final VersionRange VERSION_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionRange()
	 * @generated
	 * @ordered
	 */
	protected VersionRange versionRange = VERSION_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.REQUIRED_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionRange getVersionRange() {
		return versionRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionRange(VersionRange newVersionRange) {
		VersionRange oldVersionRange = versionRange;
		versionRange = newVersionRange;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE,
					oldVersionRange, versionRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE:
			return getVersionRange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE:
			setVersionRange((VersionRange) newValue);
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
		switch(featureID) {
		case B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE:
			setVersionRange(VERSION_RANGE_EDEFAULT);
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
		switch(featureID) {
		case B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE:
			return VERSION_RANGE_EDEFAULT == null
					? versionRange != null
					: !VERSION_RANGE_EDEFAULT.equals(versionRange);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (versionRange: ");
		result.append(versionRange);
		result.append(')');
		return result.toString();
	}

} //RequiredCapabilityImpl
