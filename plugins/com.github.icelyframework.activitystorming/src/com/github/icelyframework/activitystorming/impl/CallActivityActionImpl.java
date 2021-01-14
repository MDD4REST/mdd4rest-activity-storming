/**
 */
package com.github.icelyframework.activitystorming.impl;

import com.github.icelyframework.activitystorming.ActivityDiagram;
import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.CallActivityAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Activity Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.CallActivityActionImpl#getActivitydiagram <em>Activitydiagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallActivityActionImpl extends CallActionImpl implements CallActivityAction {
	/**
	 * The cached value of the '{@link #getActivitydiagram() <em>Activitydiagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitydiagram()
	 * @generated
	 * @ordered
	 */
	protected ActivityDiagram activitydiagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActivityActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitystormingPackage.Literals.CALL_ACTIVITY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDiagram getActivitydiagram() {
		return activitydiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivitydiagram(ActivityDiagram newActivitydiagram, NotificationChain msgs) {
		ActivityDiagram oldActivitydiagram = activitydiagram;
		activitydiagram = newActivitydiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM, oldActivitydiagram, newActivitydiagram);
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
	public void setActivitydiagram(ActivityDiagram newActivitydiagram) {
		if (newActivitydiagram != activitydiagram) {
			NotificationChain msgs = null;
			if (activitydiagram != null)
				msgs = ((InternalEObject)activitydiagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitystormingPackage.CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM, null, msgs);
			if (newActivitydiagram != null)
				msgs = ((InternalEObject)newActivitydiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitystormingPackage.CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM, null, msgs);
			msgs = basicSetActivitydiagram(newActivitydiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM, newActivitydiagram, newActivitydiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitystormingPackage.CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM:
				return basicSetActivitydiagram(null, msgs);
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
			case ActivitystormingPackage.CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM:
				return getActivitydiagram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitystormingPackage.CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM:
				setActivitydiagram((ActivityDiagram)newValue);
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
			case ActivitystormingPackage.CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM:
				setActivitydiagram((ActivityDiagram)null);
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
			case ActivitystormingPackage.CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM:
				return activitydiagram != null;
		}
		return super.eIsSet(featureID);
	}

} //CallActivityActionImpl
