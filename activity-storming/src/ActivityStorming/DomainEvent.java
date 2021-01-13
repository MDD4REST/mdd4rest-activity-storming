/**
 */
package ActivityStorming;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.DomainEvent#getReadmodel <em>Readmodel</em>}</li>
 *   <li>{@link ActivityStorming.DomainEvent#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link ActivityStorming.DomainEvent#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getDomainEvent()
 * @model annotation="gmf.node label='name' color='243,156,18'"
 * @generated
 */
public interface DomainEvent extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Readmodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ReadModel#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readmodel</em>' reference.
	 * @see #setReadmodel(ReadModel)
	 * @see ActivityStorming.ActivityStormingPackage#getDomainEvent_Readmodel()
	 * @see ActivityStorming.ReadModel#getEvent
	 * @model opposite="event"
	 *        annotation="gmf.link tool.name='Event To ReadModel' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	ReadModel getReadmodel();

	/**
	 * Sets the value of the '{@link ActivityStorming.DomainEvent#getReadmodel <em>Readmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readmodel</em>' reference.
	 * @see #getReadmodel()
	 * @generated
	 */
	void setReadmodel(ReadModel value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.Supplier#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(Supplier)
	 * @see ActivityStorming.ActivityStormingPackage#getDomainEvent_Supplier()
	 * @see ActivityStorming.Supplier#getTriggers
	 * @model opposite="triggers"
	 * @generated
	 */
	Supplier getSupplier();

	/**
	 * Sets the value of the '{@link ActivityStorming.DomainEvent#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Supplier value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ConstraintPin#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(ConstraintPin)
	 * @see ActivityStorming.ActivityStormingPackage#getDomainEvent_Constraint()
	 * @see ActivityStorming.ConstraintPin#getTriggers
	 * @model opposite="triggers"
	 * @generated
	 */
	ConstraintPin getConstraint();

	/**
	 * Sets the value of the '{@link ActivityStorming.DomainEvent#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ConstraintPin value);

} // DomainEvent
