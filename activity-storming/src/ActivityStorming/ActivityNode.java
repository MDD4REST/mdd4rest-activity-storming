/**
 */
package ActivityStorming;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.ActivityNode#getIncomming <em>Incomming</em>}</li>
 *   <li>{@link ActivityStorming.ActivityNode#getOutcomming <em>Outcomming</em>}</li>
 *   <li>{@link ActivityStorming.ActivityNode#getActivitypartition <em>Activitypartition</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getActivityNode()
 * @model
 * @generated
 */
public interface ActivityNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Incomming</b></em>' reference list.
	 * The list contents are of type {@link ActivityStorming.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomming</em>' reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getActivityNode_Incomming()
	 * @see ActivityStorming.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdge> getIncomming();

	/**
	 * Returns the value of the '<em><b>Outcomming</b></em>' reference list.
	 * The list contents are of type {@link ActivityStorming.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcomming</em>' reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getActivityNode_Outcomming()
	 * @see ActivityStorming.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdge> getOutcomming();

	/**
	 * Returns the value of the '<em><b>Activitypartition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ActivityPartition#getActivitynode <em>Activitynode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitypartition</em>' container reference.
	 * @see #setActivitypartition(ActivityPartition)
	 * @see ActivityStorming.ActivityStormingPackage#getActivityNode_Activitypartition()
	 * @see ActivityStorming.ActivityPartition#getActivitynode
	 * @model opposite="activitynode" transient="false"
	 * @generated
	 */
	ActivityPartition getActivitypartition();

	/**
	 * Sets the value of the '{@link ActivityStorming.ActivityNode#getActivitypartition <em>Activitypartition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitypartition</em>' container reference.
	 * @see #getActivitypartition()
	 * @generated
	 */
	void setActivitypartition(ActivityPartition value);

} // ActivityNode
