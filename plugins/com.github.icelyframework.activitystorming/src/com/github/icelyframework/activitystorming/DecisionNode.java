/**
 */
package com.github.icelyframework.activitystorming;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.DecisionNode#getObjectnode <em>Objectnode</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.DecisionNode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getDecisionNode()
 * @model annotation="gmf.node label='name' label.placement='external' tool.name='Decision (Policy)' figure='svg' svg.uri='platform:/plugin/com.github.icelyframework.activitystorming/svg/diamond-3.svg' label.icon='false' size='40,40' resizable='false' margin='2'"
 * @generated
 */
public interface DecisionNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Objectnode</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.activitystorming.ObjectNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectnode</em>' reference list.
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getDecisionNode_Objectnode()
	 * @model
	 * @generated
	 */
	EList<ObjectNode> getObjectnode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getDecisionNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.activitystorming.DecisionNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DecisionNode
