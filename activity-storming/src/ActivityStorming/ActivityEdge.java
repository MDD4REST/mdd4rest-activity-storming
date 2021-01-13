/**
 */
package ActivityStorming;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.ActivityEdge#getName <em>Name</em>}</li>
 *   <li>{@link ActivityStorming.ActivityEdge#getGuard <em>Guard</em>}</li>
 *   <li>{@link ActivityStorming.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link ActivityStorming.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link ActivityStorming.ActivityEdge#getWeight <em>Weight</em>}</li>
 *   <li>{@link ActivityStorming.ActivityEdge#getActivitypartition <em>Activitypartition</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getActivityEdge()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' width='2'"
 * @generated
 */
public interface ActivityEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ActivityStorming.ActivityStormingPackage#getActivityEdge_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityStorming.ActivityEdge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see ActivityStorming.ActivityStormingPackage#getActivityEdge_Guard()
	 * @model
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link ActivityStorming.ActivityEdge#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ActivityNode#getIncomming <em>Incomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see ActivityStorming.ActivityStormingPackage#getActivityEdge_Target()
	 * @see ActivityStorming.ActivityNode#getIncomming
	 * @model opposite="incomming" required="true"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link ActivityStorming.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ActivityNode#getOutcomming <em>Outcomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see ActivityStorming.ActivityStormingPackage#getActivityEdge_Source()
	 * @see ActivityStorming.ActivityNode#getOutcomming
	 * @model opposite="outcomming" required="true"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link ActivityStorming.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getActivityEdge_Weight()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getWeight();

	/**
	 * Returns the value of the '<em><b>Activitypartition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ActivityStorming.ActivityPartition#getActivityedge <em>Activityedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitypartition</em>' container reference.
	 * @see #setActivitypartition(ActivityPartition)
	 * @see ActivityStorming.ActivityStormingPackage#getActivityEdge_Activitypartition()
	 * @see ActivityStorming.ActivityPartition#getActivityedge
	 * @model opposite="activityedge" transient="false"
	 * @generated
	 */
	ActivityPartition getActivitypartition();

	/**
	 * Sets the value of the '{@link ActivityStorming.ActivityEdge#getActivitypartition <em>Activitypartition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitypartition</em>' container reference.
	 * @see #getActivitypartition()
	 * @generated
	 */
	void setActivitypartition(ActivityPartition value);

} // ActivityEdge
