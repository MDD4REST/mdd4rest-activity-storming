/**
 */
package ActivityStorming;

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
 *   <li>{@link ActivityStorming.Supplier#getAction <em>Action</em>}</li>
 *   <li>{@link ActivityStorming.Supplier#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link ActivityStorming.Supplier#getReadmodels <em>Readmodels</em>}</li>
 *   <li>{@link ActivityStorming.Supplier#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getSupplier()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface Supplier extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.Action#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see ActivityStorming.ActivityStormingPackage#getSupplier_Action()
	 * @see ActivityStorming.Action#getSupplier
	 * @model opposite="supplier"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link ActivityStorming.Supplier#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link ActivityStorming.DomainEvent}.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.DomainEvent#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getSupplier_Triggers()
	 * @see ActivityStorming.DomainEvent#getSupplier
	 * @model opposite="supplier"
	 *        annotation="gmf.link tool.name='Supplier to Event' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<DomainEvent> getTriggers();

	/**
	 * Returns the value of the '<em><b>Readmodels</b></em>' reference list.
	 * The list contents are of type {@link ActivityStorming.ReadModel}.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ReadModel#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readmodels</em>' reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getSupplier_Readmodels()
	 * @see ActivityStorming.ReadModel#getSupplier
	 * @model opposite="supplier"
	 *        annotation="gmf.link tool.name='Supplier to ReadModel' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<ReadModel> getReadmodels();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.ConstraintPin}.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ConstraintPin#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getSupplier_Constraints()
	 * @see ActivityStorming.ConstraintPin#getSupplier
	 * @model opposite="supplier" containment="true"
	 *        annotation="gmf.affixed"
	 * @generated
	 */
	EList<ConstraintPin> getConstraints();

} // Supplier
