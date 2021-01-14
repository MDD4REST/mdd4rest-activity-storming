/**
 */
package com.github.icelyframework.activitystorming;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.activitystorming.Aggregate#getDomainobject <em>Domainobject</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getAggregate()
 * @model annotation="gmf.node label='name' color='243,208,43'"
 * @generated
 */
public interface Aggregate extends Supplier {
	/**
	 * Returns the value of the '<em><b>Domainobject</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.activitystorming.DomainObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainobject</em>' containment reference list.
	 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getAggregate_Domainobject()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<DomainObject> getDomainobject();

} // Aggregate
