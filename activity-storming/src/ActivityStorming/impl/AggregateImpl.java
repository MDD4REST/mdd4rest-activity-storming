/**
 */
package ActivityStorming.impl;

import ActivityStorming.ActivityStormingPackage;
import ActivityStorming.Aggregate;
import ActivityStorming.DomainObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityStorming.impl.AggregateImpl#getDomainobject <em>Domainobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateImpl extends SupplierImpl implements Aggregate {
	/**
	 * The cached value of the '{@link #getDomainobject() <em>Domainobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainobject()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> domainobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityStormingPackage.Literals.AGGREGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainObject> getDomainobject() {
		if (domainobject == null) {
			domainobject = new EObjectContainmentEList<DomainObject>(DomainObject.class, this, ActivityStormingPackage.AGGREGATE__DOMAINOBJECT);
		}
		return domainobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityStormingPackage.AGGREGATE__DOMAINOBJECT:
				return ((InternalEList<?>)getDomainobject()).basicRemove(otherEnd, msgs);
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
			case ActivityStormingPackage.AGGREGATE__DOMAINOBJECT:
				return getDomainobject();
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
			case ActivityStormingPackage.AGGREGATE__DOMAINOBJECT:
				getDomainobject().clear();
				getDomainobject().addAll((Collection<? extends DomainObject>)newValue);
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
			case ActivityStormingPackage.AGGREGATE__DOMAINOBJECT:
				getDomainobject().clear();
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
			case ActivityStormingPackage.AGGREGATE__DOMAINOBJECT:
				return domainobject != null && !domainobject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AggregateImpl
