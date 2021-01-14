/**
 */
package com.github.icelyframework.activitystorming;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.Supplier#getAction <em>Action</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.Supplier#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.Supplier#getReadmodels <em>Readmodels</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.Supplier#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getSupplier()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface Supplier extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.activitystorming.Action#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getSupplier_Action()
	 * @see com.github.icelyframework.activitystorming.Action#getSupplier
	 * @model opposite="supplier"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.activitystorming.Supplier#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.activitystorming.DomainEvent}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.activitystorming.DomainEvent#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getSupplier_Triggers()
	 * @see com.github.icelyframework.activitystorming.DomainEvent#getSupplier
	 * @model opposite="supplier"
	 *        annotation="gmf.link tool.name='Supplier to Event' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<DomainEvent> getTriggers();

	/**
	 * Returns the value of the '<em><b>Readmodels</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.activitystorming.ReadModel}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.activitystorming.ReadModel#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readmodels</em>' reference list.
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getSupplier_Readmodels()
	 * @see com.github.icelyframework.activitystorming.ReadModel#getSupplier
	 * @model opposite="supplier"
	 *        annotation="gmf.link tool.name='Supplier to ReadModel' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<ReadModel> getReadmodels();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.activitystorming.ConstraintPin}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.activitystorming.ConstraintPin#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getSupplier_Constraints()
	 * @see com.github.icelyframework.activitystorming.ConstraintPin#getSupplier
	 * @model opposite="supplier" containment="true"
	 *        annotation="gmf.affixed"
	 * @generated
	 */
	EList<ConstraintPin> getConstraints();

} // Supplier
