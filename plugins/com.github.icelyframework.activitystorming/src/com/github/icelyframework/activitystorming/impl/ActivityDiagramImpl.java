/**
 */
package com.github.icelyframework.activitystorming.impl;

import com.github.icelyframework.activitystorming.ActivityDiagram;
import com.github.icelyframework.activitystorming.ActivityEdge;
import com.github.icelyframework.activitystorming.ActivityNode;
import com.github.icelyframework.activitystorming.ActivityPartition;
import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityDiagramImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityDiagramImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityDiagramImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityDiagramImpl#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityDiagramImpl#getActivityedge <em>Activityedge</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityDiagramImpl#getActivitynode <em>Activitynode</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityDiagramImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.github.icelyframework.activitystorming.impl.ActivityDiagramImpl#getActivitypartition <em>Activitypartition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDiagramImpl extends EObjectImpl implements ActivityDiagram {
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
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected String postcondition = POSTCONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLE_EXECUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleExecution = IS_SINGLE_EXECUTION_EDEFAULT;

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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The cached value of the '{@link #getActivitypartition() <em>Activitypartition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitypartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> activitypartition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitystormingPackage.Literals.ACTIVITY_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_DIAGRAM__PRECONDITION, oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostcondition(String newPostcondition) {
		String oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_DIAGRAM__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSingleExecution() {
		return isSingleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSingleExecution(boolean newIsSingleExecution) {
		boolean oldIsSingleExecution = isSingleExecution;
		isSingleExecution = newIsSingleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION, oldIsSingleExecution, isSingleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityEdge> getActivityedge() {
		if (activityedge == null) {
			activityedge = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this, ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE);
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
			activitynode = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE);
		}
		return activitynode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, ActivitystormingPackage.ACTIVITY_DIAGRAM__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityPartition> getActivitypartition() {
		if (activitypartition == null) {
			activitypartition = new EObjectContainmentEList<ActivityPartition>(ActivityPartition.class, this, ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYPARTITION);
		}
		return activitypartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
				return ((InternalEList<?>)getActivityedge()).basicRemove(otherEnd, msgs);
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
				return ((InternalEList<?>)getActivitynode()).basicRemove(otherEnd, msgs);
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYPARTITION:
				return ((InternalEList<?>)getActivitypartition()).basicRemove(otherEnd, msgs);
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
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__NAME:
				return getName();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__PRECONDITION:
				return getPrecondition();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__POSTCONDITION:
				return getPostcondition();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_READ_ONLY:
				return isIsReadOnly();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION:
				return isIsSingleExecution();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
				return getActivityedge();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
				return getActivitynode();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__VARIABLE:
				return getVariable();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYPARTITION:
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
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__POSTCONDITION:
				setPostcondition((String)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION:
				setIsSingleExecution((Boolean)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
				getActivityedge().clear();
				getActivityedge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
				getActivitynode().clear();
				getActivitynode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYPARTITION:
				getActivitypartition().clear();
				getActivitypartition().addAll((Collection<? extends ActivityPartition>)newValue);
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
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION:
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
				getActivityedge().clear();
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
				getActivitynode().clear();
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__VARIABLE:
				getVariable().clear();
				return;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYPARTITION:
				getActivitypartition().clear();
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
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION:
				return isSingleExecution != IS_SINGLE_EXECUTION_EDEFAULT;
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
				return activityedge != null && !activityedge.isEmpty();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
				return activitynode != null && !activitynode.isEmpty();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__VARIABLE:
				return variable != null && !variable.isEmpty();
			case ActivitystormingPackage.ACTIVITY_DIAGRAM__ACTIVITYPARTITION:
				return activitypartition != null && !activitypartition.isEmpty();
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
		result.append(", precondition: ");
		result.append(precondition);
		result.append(", postcondition: ");
		result.append(postcondition);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isSingleExecution: ");
		result.append(isSingleExecution);
		result.append(')');
		return result.toString();
	}

} //ActivityDiagramImpl
