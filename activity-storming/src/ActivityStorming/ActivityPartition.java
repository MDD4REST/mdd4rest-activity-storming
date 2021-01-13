/**
 */
package ActivityStorming;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.ActivityPartition#getName <em>Name</em>}</li>
 *   <li>{@link ActivityStorming.ActivityPartition#getSubpartition <em>Subpartition</em>}</li>
 *   <li>{@link ActivityStorming.ActivityPartition#getActivityedge <em>Activityedge</em>}</li>
 *   <li>{@link ActivityStorming.ActivityPartition#getActivitynode <em>Activitynode</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getActivityPartition()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ActivityPartition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ActivityStorming.ActivityStormingPackage#getActivityPartition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityStorming.ActivityPartition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subpartition</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpartition</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getActivityPartition_Subpartition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityPartition> getSubpartition();

	/**
	 * Returns the value of the '<em><b>Activityedge</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ActivityEdge#getActivitypartition <em>Activitypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activityedge</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getActivityPartition_Activityedge()
	 * @see ActivityStorming.ActivityEdge#getActivitypartition
	 * @model opposite="activitypartition" containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getActivityedge();

	/**
	 * Returns the value of the '<em><b>Activitynode</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ActivityNode#getActivitypartition <em>Activitypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitynode</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getActivityPartition_Activitynode()
	 * @see ActivityStorming.ActivityNode#getActivitypartition
	 * @model opposite="activitypartition" containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<ActivityNode> getActivitynode();

} // ActivityPartition
