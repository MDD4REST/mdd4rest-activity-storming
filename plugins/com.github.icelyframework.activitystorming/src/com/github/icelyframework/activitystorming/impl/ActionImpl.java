/**
 */
package com.github.icelyframework.activitystorming.impl;

import com.github.icelyframework.activitystorming.Action;
import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.CallAction;
import com.github.icelyframework.activitystorming.InputPin;
import com.github.icelyframework.activitystorming.OutputPin;
import com.github.icelyframework.activitystorming.Supplier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActionImpl#getInputpin <em>Inputpin</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActionImpl#getOutputpin <em>Outputpin</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActionImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActionImpl#getCallactions <em>Callactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends ExecutableNodeImpl implements Action {
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
	 * The cached value of the '{@link #getInputpin() <em>Inputpin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputpin()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> inputpin;

	/**
	 * The cached value of the '{@link #getOutputpin() <em>Outputpin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputpin()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> outputpin;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Supplier supplier;

	/**
	 * The cached value of the '{@link #getCallactions() <em>Callactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallactions()
	 * @generated
	 * @ordered
	 */
	protected EList<CallAction> callactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitystormingPackage.Literals.ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputPin> getInputpin() {
		if (inputpin == null) {
			inputpin = new EObjectContainmentEList<InputPin>(InputPin.class, this, ActivitystormingPackage.ACTION__INPUTPIN);
		}
		return inputpin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputPin> getOutputpin() {
		if (outputpin == null) {
			outputpin = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActivitystormingPackage.ACTION__OUTPUTPIN);
		}
		return outputpin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supplier getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (Supplier)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitystormingPackage.ACTION__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(Supplier newSupplier, NotificationChain msgs) {
		Supplier oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTION__SUPPLIER, oldSupplier, newSupplier);
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
	public void setSupplier(Supplier newSupplier) {
		if (newSupplier != supplier) {
			NotificationChain msgs = null;
			if (supplier != null)
				msgs = ((InternalEObject)supplier).eInverseRemove(this, ActivitystormingPackage.SUPPLIER__ACTION, Supplier.class, msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, ActivitystormingPackage.SUPPLIER__ACTION, Supplier.class, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTION__SUPPLIER, newSupplier, newSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CallAction> getCallactions() {
		if (callactions == null) {
			callactions = new EObjectContainmentEList<CallAction>(CallAction.class, this, ActivitystormingPackage.ACTION__CALLACTIONS);
		}
		return callactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitystormingPackage.ACTION__SUPPLIER:
				if (supplier != null)
					msgs = ((InternalEObject)supplier).eInverseRemove(this, ActivitystormingPackage.SUPPLIER__ACTION, Supplier.class, msgs);
				return basicSetSupplier((Supplier)otherEnd, msgs);
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
			case ActivitystormingPackage.ACTION__INPUTPIN:
				return ((InternalEList<?>)getInputpin()).basicRemove(otherEnd, msgs);
			case ActivitystormingPackage.ACTION__OUTPUTPIN:
				return ((InternalEList<?>)getOutputpin()).basicRemove(otherEnd, msgs);
			case ActivitystormingPackage.ACTION__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case ActivitystormingPackage.ACTION__CALLACTIONS:
				return ((InternalEList<?>)getCallactions()).basicRemove(otherEnd, msgs);
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
			case ActivitystormingPackage.ACTION__NAME:
				return getName();
			case ActivitystormingPackage.ACTION__INPUTPIN:
				return getInputpin();
			case ActivitystormingPackage.ACTION__OUTPUTPIN:
				return getOutputpin();
			case ActivitystormingPackage.ACTION__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case ActivitystormingPackage.ACTION__CALLACTIONS:
				return getCallactions();
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
			case ActivitystormingPackage.ACTION__NAME:
				setName((String)newValue);
				return;
			case ActivitystormingPackage.ACTION__INPUTPIN:
				getInputpin().clear();
				getInputpin().addAll((Collection<? extends InputPin>)newValue);
				return;
			case ActivitystormingPackage.ACTION__OUTPUTPIN:
				getOutputpin().clear();
				getOutputpin().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case ActivitystormingPackage.ACTION__SUPPLIER:
				setSupplier((Supplier)newValue);
				return;
			case ActivitystormingPackage.ACTION__CALLACTIONS:
				getCallactions().clear();
				getCallactions().addAll((Collection<? extends CallAction>)newValue);
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
			case ActivitystormingPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivitystormingPackage.ACTION__INPUTPIN:
				getInputpin().clear();
				return;
			case ActivitystormingPackage.ACTION__OUTPUTPIN:
				getOutputpin().clear();
				return;
			case ActivitystormingPackage.ACTION__SUPPLIER:
				setSupplier((Supplier)null);
				return;
			case ActivitystormingPackage.ACTION__CALLACTIONS:
				getCallactions().clear();
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
			case ActivitystormingPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivitystormingPackage.ACTION__INPUTPIN:
				return inputpin != null && !inputpin.isEmpty();
			case ActivitystormingPackage.ACTION__OUTPUTPIN:
				return outputpin != null && !outputpin.isEmpty();
			case ActivitystormingPackage.ACTION__SUPPLIER:
				return supplier != null;
			case ActivitystormingPackage.ACTION__CALLACTIONS:
				return callactions != null && !callactions.isEmpty();
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

} //ActionImpl
