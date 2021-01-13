/**
 */
package ActivityStorming;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.Action#getName <em>Name</em>}</li>
 *   <li>{@link ActivityStorming.Action#getInputpin <em>Inputpin</em>}</li>
 *   <li>{@link ActivityStorming.Action#getOutputpin <em>Outputpin</em>}</li>
 *   <li>{@link ActivityStorming.Action#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link ActivityStorming.Action#getCallactions <em>Callactions</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ActivityStorming.ActivityStormingPackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityStorming.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inputpin</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputpin</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getAction_Inputpin()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getInputpin();

	/**
	 * Returns the value of the '<em><b>Outputpin</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputpin</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getAction_Outputpin()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getOutputpin();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.Supplier#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(Supplier)
	 * @see ActivityStorming.ActivityStormingPackage#getAction_Supplier()
	 * @see ActivityStorming.Supplier#getAction
	 * @model opposite="action"
	 *        annotation="gmf.link tool.name='Action to Supplier' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	Supplier getSupplier();

	/**
	 * Sets the value of the '{@link ActivityStorming.Action#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Supplier value);

	/**
	 * Returns the value of the '<em><b>Callactions</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.CallAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callactions</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getAction_Callactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CallAction> getCallactions();

} // Action
