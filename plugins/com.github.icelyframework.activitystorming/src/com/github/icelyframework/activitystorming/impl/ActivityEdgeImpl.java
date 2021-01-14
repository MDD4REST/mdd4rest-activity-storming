/**
 */
package com.github.icelyframework.activitystorming.impl;

import com.github.icelyframework.activitystorming.ActivityEdge;
import com.github.icelyframework.activitystorming.ActivityNode;
import com.github.icelyframework.activitystorming.ActivityPartition;
import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.ValueSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityEdgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityEdgeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityEdgeImpl#getActivitypartition <em>Activitypartition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityEdgeImpl extends EObjectImpl implements ActivityEdge {
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
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected String guard = GUARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> weight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitystormingPackage.Literals.ACTIVITY_EDGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_EDGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuard(String newGuard) {
		String oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_EDGE__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitystormingPackage.ACTIVITY_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ActivityNode newTarget, NotificationChain msgs) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_EDGE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ActivityNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ActivitystormingPackage.ACTIVITY_NODE__INCOMMING, ActivityNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ActivitystormingPackage.ACTIVITY_NODE__INCOMMING, ActivityNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_EDGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitystormingPackage.ACTIVITY_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ActivityNode newSource, NotificationChain msgs) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_EDGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ActivityNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ActivitystormingPackage.ACTIVITY_NODE__OUTCOMMING, ActivityNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ActivitystormingPackage.ACTIVITY_NODE__OUTCOMMING, ActivityNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_EDGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValueSpecification> getWeight() {
		if (weight == null) {
			weight = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this, ActivitystormingPackage.ACTIVITY_EDGE__WEIGHT);
		}
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityPartition getActivitypartition() {
		if (eContainerFeatureID() != ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION) return null;
		return (ActivityPartition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivitypartition(ActivityPartition newActivitypartition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivitypartition, ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivitypartition(ActivityPartition newActivitypartition) {
		if (newActivitypartition != eInternalContainer() || (eContainerFeatureID() != ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION && newActivitypartition != null)) {
			if (EcoreUtil.isAncestor(this, newActivitypartition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivitypartition != null)
				msgs = ((InternalEObject)newActivitypartition).eInverseAdd(this, ActivitystormingPackage.ACTIVITY_PARTITION__ACTIVITYEDGE, ActivityPartition.class, msgs);
			msgs = basicSetActivitypartition(newActivitypartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION, newActivitypartition, newActivitypartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitystormingPackage.ACTIVITY_EDGE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ActivitystormingPackage.ACTIVITY_NODE__INCOMMING, ActivityNode.class, msgs);
				return basicSetTarget((ActivityNode)otherEnd, msgs);
			case ActivitystormingPackage.ACTIVITY_EDGE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ActivitystormingPackage.ACTIVITY_NODE__OUTCOMMING, ActivityNode.class, msgs);
				return basicSetSource((ActivityNode)otherEnd, msgs);
			case ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION:
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
			case ActivitystormingPackage.ACTIVITY_EDGE__TARGET:
				return basicSetTarget(null, msgs);
			case ActivitystormingPackage.ACTIVITY_EDGE__SOURCE:
				return basicSetSource(null, msgs);
			case ActivitystormingPackage.ACTIVITY_EDGE__WEIGHT:
				return ((InternalEList<?>)getWeight()).basicRemove(otherEnd, msgs);
			case ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION:
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
			case ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION:
				return eInternalContainer().eInverseRemove(this, ActivitystormingPackage.ACTIVITY_PARTITION__ACTIVITYEDGE, ActivityPartition.class, msgs);
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
			case ActivitystormingPackage.ACTIVITY_EDGE__NAME:
				return getName();
			case ActivitystormingPackage.ACTIVITY_EDGE__GUARD:
				return getGuard();
			case ActivitystormingPackage.ACTIVITY_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ActivitystormingPackage.ACTIVITY_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ActivitystormingPackage.ACTIVITY_EDGE__WEIGHT:
				return getWeight();
			case ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION:
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
			case ActivitystormingPackage.ACTIVITY_EDGE__NAME:
				setName((String)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__GUARD:
				setGuard((String)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__WEIGHT:
				getWeight().clear();
				getWeight().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION:
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
			case ActivitystormingPackage.ACTIVITY_EDGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__GUARD:
				setGuard(GUARD_EDEFAULT);
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)null);
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)null);
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__WEIGHT:
				getWeight().clear();
				return;
			case ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION:
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
			case ActivitystormingPackage.ACTIVITY_EDGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivitystormingPackage.ACTIVITY_EDGE__GUARD:
				return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
			case ActivitystormingPackage.ACTIVITY_EDGE__TARGET:
				return target != null;
			case ActivitystormingPackage.ACTIVITY_EDGE__SOURCE:
				return source != null;
			case ActivitystormingPackage.ACTIVITY_EDGE__WEIGHT:
				return weight != null && !weight.isEmpty();
			case ActivitystormingPackage.ACTIVITY_EDGE__ACTIVITYPARTITION:
				return getActivitypartition() != null;
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
		result.append(", guard: ");
		result.append(guard);
		result.append(')');
		return result.toString();
	}

} //ActivityEdgeImpl
