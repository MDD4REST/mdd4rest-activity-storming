/**
 */
package ActivityStorming;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.ObjectNode#getName <em>Name</em>}</li>
 *   <li>{@link ActivityStorming.ObjectNode#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link ActivityStorming.ObjectNode#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link ActivityStorming.ObjectNode#getOrder <em>Order</em>}</li>
 *   <li>{@link ActivityStorming.ObjectNode#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getObjectNode()
 * @model
 * @generated
 */
public interface ObjectNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ActivityStorming.ActivityStormingPackage#getObjectNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityStorming.ObjectNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(ValueSpecification)
	 * @see ActivityStorming.ActivityStormingPackage#getObjectNode_UpperBound()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getUpperBound();

	/**
	 * Sets the value of the '{@link ActivityStorming.ObjectNode#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control Type</em>' attribute.
	 * @see #setIsControlType(boolean)
	 * @see ActivityStorming.ActivityStormingPackage#getObjectNode_IsControlType()
	 * @model
	 * @generated
	 */
	boolean isIsControlType();

	/**
	 * Sets the value of the '{@link ActivityStorming.ObjectNode#isIsControlType <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control Type</em>' attribute.
	 * @see #isIsControlType()
	 * @generated
	 */
	void setIsControlType(boolean value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"FIFO"</code>.
	 * The literals are from the enumeration {@link ActivityStorming.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see ActivityStorming.ObjectNodeOrderingKind
	 * @see #setOrder(ObjectNodeOrderingKind)
	 * @see ActivityStorming.ActivityStormingPackage#getObjectNode_Order()
	 * @model default="FIFO"
	 * @generated
	 */
	ObjectNodeOrderingKind getOrder();

	/**
	 * Sets the value of the '{@link ActivityStorming.ObjectNode#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see ActivityStorming.ObjectNodeOrderingKind
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(ObjectNodeOrderingKind value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getObjectNode_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // ObjectNode
