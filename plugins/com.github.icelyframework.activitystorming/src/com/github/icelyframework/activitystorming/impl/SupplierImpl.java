/**
 */
package com.github.icelyframework.activitystorming.impl;

import com.github.icelyframework.activitystorming.Action;
import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.ConstraintPin;
import com.github.icelyframework.activitystorming.DomainEvent;
import com.github.icelyframework.activitystorming.ReadModel;
import com.github.icelyframework.activitystorming.Supplier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.SupplierImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.SupplierImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.SupplierImpl#getReadmodels <em>Readmodels</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.SupplierImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SupplierImpl extends ObjectNodeImpl implements Supplier {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainEvent> triggers;

	/**
	 * The cached value of the '{@link #getReadmodels() <em>Readmodels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadmodels()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadModel> readmodels;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintPin> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitystormingPackage.Literals.SUPPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitystormingPackage.SUPPLIER__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.SUPPLIER__ACTION, oldAction, newAction);
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
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, ActivitystormingPackage.ACTION__SUPPLIER, Action.class, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, ActivitystormingPackage.ACTION__SUPPLIER, Action.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.SUPPLIER__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainEvent> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectWithInverseResolvingEList<DomainEvent>(DomainEvent.class, this, ActivitystormingPackage.SUPPLIER__TRIGGERS, ActivitystormingPackage.DOMAIN_EVENT__SUPPLIER);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReadModel> getReadmodels() {
		if (readmodels == null) {
			readmodels = new EObjectWithInverseResolvingEList<ReadModel>(ReadModel.class, this, ActivitystormingPackage.SUPPLIER__READMODELS, ActivitystormingPackage.READ_MODEL__SUPPLIER);
		}
		return readmodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstraintPin> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<ConstraintPin>(ConstraintPin.class, this, ActivitystormingPackage.SUPPLIER__CONSTRAINTS, ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER);
		}
		return constraints;
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
			case ActivitystormingPackage.SUPPLIER__ACTION:
				if (action != null)
					msgs = ((InternalEObject)action).eInverseRemove(this, ActivitystormingPackage.ACTION__SUPPLIER, Action.class, msgs);
				return basicSetAction((Action)otherEnd, msgs);
			case ActivitystormingPackage.SUPPLIER__TRIGGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggers()).basicAdd(otherEnd, msgs);
			case ActivitystormingPackage.SUPPLIER__READMODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadmodels()).basicAdd(otherEnd, msgs);
			case ActivitystormingPackage.SUPPLIER__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
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
			case ActivitystormingPackage.SUPPLIER__ACTION:
				return basicSetAction(null, msgs);
			case ActivitystormingPackage.SUPPLIER__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
			case ActivitystormingPackage.SUPPLIER__READMODELS:
				return ((InternalEList<?>)getReadmodels()).basicRemove(otherEnd, msgs);
			case ActivitystormingPackage.SUPPLIER__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case ActivitystormingPackage.SUPPLIER__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case ActivitystormingPackage.SUPPLIER__TRIGGERS:
				return getTriggers();
			case ActivitystormingPackage.SUPPLIER__READMODELS:
				return getReadmodels();
			case ActivitystormingPackage.SUPPLIER__CONSTRAINTS:
				return getConstraints();
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
			case ActivitystormingPackage.SUPPLIER__ACTION:
				setAction((Action)newValue);
				return;
			case ActivitystormingPackage.SUPPLIER__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends DomainEvent>)newValue);
				return;
			case ActivitystormingPackage.SUPPLIER__READMODELS:
				getReadmodels().clear();
				getReadmodels().addAll((Collection<? extends ReadModel>)newValue);
				return;
			case ActivitystormingPackage.SUPPLIER__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ConstraintPin>)newValue);
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
			case ActivitystormingPackage.SUPPLIER__ACTION:
				setAction((Action)null);
				return;
			case ActivitystormingPackage.SUPPLIER__TRIGGERS:
				getTriggers().clear();
				return;
			case ActivitystormingPackage.SUPPLIER__READMODELS:
				getReadmodels().clear();
				return;
			case ActivitystormingPackage.SUPPLIER__CONSTRAINTS:
				getConstraints().clear();
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
			case ActivitystormingPackage.SUPPLIER__ACTION:
				return action != null;
			case ActivitystormingPackage.SUPPLIER__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
			case ActivitystormingPackage.SUPPLIER__READMODELS:
				return readmodels != null && !readmodels.isEmpty();
			case ActivitystormingPackage.SUPPLIER__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupplierImpl
