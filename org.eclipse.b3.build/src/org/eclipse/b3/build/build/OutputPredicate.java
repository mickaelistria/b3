/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.OutputPredicate#getPathVector <em>Path Vector</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.OutputPredicate#getPathPattern <em>Path Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getOutputPredicate()
 * @model
 * @generated
 */
public interface OutputPredicate extends BExpression {
	/**
	 * Returns the value of the '<em><b>Path Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Vector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Vector</em>' containment reference.
	 * @see #setPathVector(PathVectorElement)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getOutputPredicate_PathVector()
	 * @model containment="true"
	 * @generated
	 */
	PathVectorElement getPathVector();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.OutputPredicate#getPathVector <em>Path Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Vector</em>' containment reference.
	 * @see #getPathVector()
	 * @generated
	 */
	void setPathVector(PathVectorElement value);

	/**
	 * Returns the value of the '<em><b>Path Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Pattern</em>' containment reference.
	 * @see #setPathPattern(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getOutputPredicate_PathPattern()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPathPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.OutputPredicate#getPathPattern <em>Path Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Pattern</em>' containment reference.
	 * @see #getPathPattern()
	 * @generated
	 */
	void setPathPattern(BExpression value);

} // OutputPredicate