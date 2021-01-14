/**
 */
package com.github.icelyframework.activitystorming.impl;

import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.ConstraintPin;
import com.github.icelyframework.activitystorming.DomainEvent;
import com.github.icelyframework.activitystorming.Supplier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ConstraintPinImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ConstraintPinImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ConstraintPinImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintPinImpl extends PinImpl implements ConstraintPin {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitystormingPackage.Literals.CONSTRAINT_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supplier getSupplier() {
		if (eContainerFeatureID() != ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER) return null;
		return (Supplier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(Supplier newSupplier, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSupplier, ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplier(Supplier newSupplier) {
		if (newSupplier != eInternalContainer() || (eContainerFeatureID() != ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER && newSupplier != null)) {
			if (EcoreUtil.isAncestor(this, newSupplier))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, ActivitystormingPackage.SUPPLIER__CONSTRAINTS, Supplier.class, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER, newSupplier, newSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainEvent> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectWithInverseResolvingEList<DomainEvent>(DomainEvent.class, this, ActivitystormingPackage.CONSTRAINT_PIN__TRIGGERS, ActivitystormingPackage.DOMAIN_EVENT__CONSTRAINT);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.CONSTRAINT_PIN__DESCRIPTION, oldDescription, description));
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
			case ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSupplier((Supplier)otherEnd, msgs);
			case ActivitystormingPackage.CONSTRAINT_PIN__TRIGGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggers()).basicAdd(otherEnd, msgs);
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
			case ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case ActivitystormingPackage.CONSTRAINT_PIN__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
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
			case ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER:
				return eInternalContainer().eInverseRemove(this, ActivitystormingPackage.SUPPLIER__CONSTRAINTS, Supplier.class, msgs);
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
			case ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER:
				return getSupplier();
			case ActivitystormingPackage.CONSTRAINT_PIN__TRIGGERS:
				return getTriggers();
			case ActivitystormingPackage.CONSTRAINT_PIN__DESCRIPTION:
				return getDescription();
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
			case ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER:
				setSupplier((Supplier)newValue);
				return;
			case ActivitystormingPackage.CONSTRAINT_PIN__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends DomainEvent>)newValue);
				return;
			case ActivitystormingPackage.CONSTRAINT_PIN__DESCRIPTION:
				setDescription((String)newValue);
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
			case ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER:
				setSupplier((Supplier)null);
				return;
			case ActivitystormingPackage.CONSTRAINT_PIN__TRIGGERS:
				getTriggers().clear();
				return;
			case ActivitystormingPackage.CONSTRAINT_PIN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ActivitystormingPackage.CONSTRAINT_PIN__SUPPLIER:
				return getSupplier() != null;
			case ActivitystormingPackage.CONSTRAINT_PIN__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
			case ActivitystormingPackage.CONSTRAINT_PIN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ConstraintPinImpl
