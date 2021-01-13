/**
 */
package ActivityStorming;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.ConstraintPin#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link ActivityStorming.ConstraintPin#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link ActivityStorming.ConstraintPin#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getConstraintPin()
 * @model annotation="gmf.node figure='rectangle' size='20,20' label='name' label.placement='external' label.icon='false'"
 * @generated
 */
public interface ConstraintPin extends Pin {
	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.Supplier#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' container reference.
	 * @see #setSupplier(Supplier)
	 * @see ActivityStorming.ActivityStormingPackage#getConstraintPin_Supplier()
	 * @see ActivityStorming.Supplier#getConstraints
	 * @model opposite="constraints" transient="false"
	 * @generated
	 */
	Supplier getSupplier();

	/**
	 * Sets the value of the '{@link ActivityStorming.ConstraintPin#getSupplier <em>Supplier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' container reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Supplier value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link ActivityStorming.DomainEvent}.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.DomainEvent#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getConstraintPin_Triggers()
	 * @see ActivityStorming.DomainEvent#getConstraint
	 * @model opposite="constraint"
	 *        annotation="gmf.link tool.name='Constraint to Event' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<DomainEvent> getTriggers();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ActivityStorming.ActivityStormingPackage#getConstraintPin_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ActivityStorming.ConstraintPin#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ConstraintPin
