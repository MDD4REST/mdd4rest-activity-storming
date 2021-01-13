/**
 */
package ActivityStorming;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Activity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.CallActivityAction#getActivitydiagram <em>Activitydiagram</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getCallActivityAction()
 * @model
 * @generated
 */
public interface CallActivityAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Activitydiagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitydiagram</em>' containment reference.
	 * @see #setActivitydiagram(ActivityDiagram)
	 * @see ActivityStorming.ActivityStormingPackage#getCallActivityAction_Activitydiagram()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActivityDiagram getActivitydiagram();

	/**
	 * Sets the value of the '{@link ActivityStorming.CallActivityAction#getActivitydiagram <em>Activitydiagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitydiagram</em>' containment reference.
	 * @see #getActivitydiagram()
	 * @generated
	 */
	void setActivitydiagram(ActivityDiagram value);

} // CallActivityAction
