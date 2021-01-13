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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.impl.ActivityNodeImpl#getIncomming <em>Incomming</em>}</li>
 *   <li>{@link ActivityStorming.impl.ActivityNodeImpl#getOutcomming <em>Outcomming</em>}</li>
 *   <li>{@link ActivityStorming.impl.ActivityNodeImpl#getActivitypartition <em>Activitypartition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNodeImpl extends EObjectImpl implements ActivityNode {
	/**
	 * The cached value of the '{@link #getIncomming() <em>Incomming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomming()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> incomming;

	/**
	 * The cached value of the '{@link #getOutcomming() <em>Outcomming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomming()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> outcomming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityStormingPackage.Literals.ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getIncomming() {
		if (incomming == null) {
			incomming = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivityStormingPackage.ACTIVITY_NODE__INCOMMING, ActivityStormingPackage.ACTIVITY_EDGE__TARGET);
		}
		return incomming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getOutcomming() {
		if (outcomming == null) {
			outcomming = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivityStormingPackage.ACTIVITY_NODE__OUTCOMMING, ActivityStormingPackage.ACTIVITY_EDGE__SOURCE);
		}
		return outcomming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityPartition getActivitypartition() {
		if (eContainerFeatureID() != ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION) return null;
		return (ActivityPartition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivitypartition(ActivityPartition newActivitypartition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivitypartition, ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivitypartition(ActivityPartition newActivitypartition) {
		if (newActivitypartition != eInternalContainer() || (eContainerFeatureID() != ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION && newActivitypartition != null)) {
			if (EcoreUtil.isAncestor(this, newActivitypartition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivitypartition != null)
				msgs = ((InternalEObject)newActivitypartition).eInverseAdd(this, ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYNODE, ActivityPartition.class, msgs);
			msgs = basicSetActivitypartition(newActivitypartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION, newActivitypartition, newActivitypartition));
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
			case ActivityStormingPackage.ACTIVITY_NODE__INCOMMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomming()).basicAdd(otherEnd, msgs);
			case ActivityStormingPackage.ACTIVITY_NODE__OUTCOMMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutcomming()).basicAdd(otherEnd, msgs);
			case ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivitypartition((ActivityPartition)otherEnd, msgs);
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
			case ActivityStormingPackage.ACTIVITY_NODE__INCOMMING:
				return ((InternalEList<?>)getIncomming()).basicRemove(otherEnd, msgs);
			case ActivityStormingPackage.ACTIVITY_NODE__OUTCOMMING:
				return ((InternalEList<?>)getOutcomming()).basicRemove(otherEnd, msgs);
			case ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION:
				return basicSetActivitypartition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION:
				return eInternalContainer().eInverseRemove(this, ActivityStormingPackage.ACTIVITY_PARTITION__ACTIVITYNODE, ActivityPartition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityStormingPackage.ACTIVITY_NODE__INCOMMING:
				return getIncomming();
			case ActivityStormingPackage.ACTIVITY_NODE__OUTCOMMING:
				return getOutcomming();
			case ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION:
				return getActivitypartition();
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
			case ActivityStormingPackage.ACTIVITY_NODE__INCOMMING:
				getIncomming().clear();
				getIncomming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivityStormingPackage.ACTIVITY_NODE__OUTCOMMING:
				getOutcomming().clear();
				getOutcomming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION:
				setActivitypartition((ActivityPartition)newValue);
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
			case ActivityStormingPackage.ACTIVITY_NODE__INCOMMING:
				getIncomming().clear();
				return;
			case ActivityStormingPackage.ACTIVITY_NODE__OUTCOMMING:
				getOutcomming().clear();
				return;
			case ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION:
				setActivitypartition((ActivityPartition)null);
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
			case ActivityStormingPackage.ACTIVITY_NODE__INCOMMING:
				return incomming != null && !incomming.isEmpty();
			case ActivityStormingPackage.ACTIVITY_NODE__OUTCOMMING:
				return outcomming != null && !outcomming.isEmpty();
			case ActivityStormingPackage.ACTIVITY_NODE__ACTIVITYPARTITION:
				return getActivitypartition() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityNodeImpl
