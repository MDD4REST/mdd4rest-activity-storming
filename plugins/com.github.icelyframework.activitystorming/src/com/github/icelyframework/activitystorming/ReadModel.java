/**
 */
package com.github.icelyframework.activitystorming;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.ReadModel#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.ReadModel#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getReadModel()
 * @model annotation="gmf.node label='name' color='209,227,109'"
 * @generated
 */
public interface ReadModel extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.activitystorming.Supplier#getReadmodels <em>Readmodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(Supplier)
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getReadModel_Supplier()
	 * @see com.github.icelyframework.activitystorming.Supplier#getReadmodels
	 * @model opposite="readmodels"
	 * @generated
	 */
	Supplier getSupplier();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.activitystorming.ReadModel#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Supplier value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.activitystorming.DomainEvent#getReadmodel <em>Readmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(DomainEvent)
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getReadModel_Event()
	 * @see com.github.icelyframework.activitystorming.DomainEvent#getReadmodel
	 * @model opposite="readmodel"
	 * @generated
	 */
	DomainEvent getEvent();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.activitystorming.ReadModel#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(DomainEvent value);

} // ReadModel
