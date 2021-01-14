/**
 */
package com.github.icelyframework.activitystorming;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.ObjectAction#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getObjectAction()
 * @model
 * @generated
 */
public interface ObjectAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.activitystorming.ObjectActionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.github.icelyframework.activitystorming.ObjectActionKind
	 * @see #setKind(ObjectActionKind)
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getObjectAction_Kind()
	 * @model
	 * @generated
	 */
	ObjectActionKind getKind();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.activitystorming.ObjectAction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.github.icelyframework.activitystorming.ObjectActionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ObjectActionKind value);

} // ObjectAction
