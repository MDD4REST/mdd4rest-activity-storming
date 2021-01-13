/**
 */
package ActivityStorming.impl;

import ActivityStorming.ActivityEdge;
import ActivityStorming.ActivityNode;
import ActivityStorming.ActivityPartition;
import ActivityStorming.ActivityStormingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.impl.ActivityPartitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ActivityStorming.impl.ActivityPartitionImpl#getSubpartition <em>Subpartition</em>}</li>
 *   <li>{@link ActivityStorming.impl.ActivityPartitionImpl#getActivityedge <em>Activityedge</em>}</li>
 *   <li>{@link ActivityStorming.impl.ActivityPartitionImpl#getActivitynode <em>Activitynode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityPartitionImpl extends EObjectImpl implements ActivityPartition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubpartition() <em>Subpartition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> subpartition;

	/**
	 * The cached value of the '{@link #getActivityedge() <em>Activityedge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityedge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> activityedge;

	/**
	 * The cached value of the '{@link #getActivitynode() <em>Activitynode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitynode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> activitynode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityStormingPackage.Literals.ACTIVITY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityStormingPackage.ACTIVITY_PARTITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityPartition> getSubpartition() {
		if (subpartition == null) {
			subpartition = new EObjectContainmentEList<ActivityPartition>(ActivityPartition.class, this, ActivityStormingPackage.ACTIVITY_PARTITION__SUBPARTITION);
		}
		return subpartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getActivityedge() {
		if (activityedge == null) {
			activityedge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYEDGE, ActivityStormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION);
		}
		return activityedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityNode> getActivitynode() {
		if (activitynode == null) {
			activitynode = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYNODE, ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION);
		}
		return activitynode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYEDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityedge()).basicAdd(otherEnd, msgs);
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYNODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivitynode()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityStormingPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return ((InternalEList<?>)getSubpartition()).basicRemove(otherEnd, msgs);
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYEDGE:
				return ((InternalEList<?>)getActivityedge()).basicRemove(otherEnd, msgs);
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYNODE:
				return ((InternalEList<?>)getActivitynode()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityStormingPackage.ACTIVITY_PARTITION__NAME:
				return getName();
			case ActivityStormingPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return getSubpartition();
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYEDGE:
				return getActivityedge();
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYNODE:
				return getActivitynode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivityStormingPackage.ACTIVITY_PARTITION__NAME:
				setName((String)newValue);
				return;
			case ActivityStormingPackage.ACTIVITY_PARTITION__SUBPARTITION:
				getSubpartition().clear();
				getSubpartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYEDGE:
				getActivityedge().clear();
				getActivityedge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYNODE:
				getActivitynode().clear();
				getActivitynode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivityStormingPackage.ACTIVITY_PARTITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivityStormingPackage.ACTIVITY_PARTITION__SUBPARTITION:
				getSubpartition().clear();
				return;
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYEDGE:
				getActivityedge().clear();
				return;
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYNODE:
				getActivitynode().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivityStormingPackage.ACTIVITY_PARTITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivityStormingPackage.ACTIVITY_PARTITION__SUBPARTITION:
				return subpartition != null && !subpartition.isEmpty();
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYEDGE:
				return activityedge != null && !activityedge.isEmpty();
			case ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYNODE:
				return activitynode != null && !activitynode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActivityPartitionImpl
