/**
 */
package ActivityStorming;

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
 *   <li>{@link ActivityStorming.Aggregate#getDomainobject <em>Domainobject</em>}</li>
 * </ul>
 *
 * @see ActivityStorming.ActivityStormingPackage#getAggregate()
 * @model annotation="gmf.node label='name' color='243,208,43'"
 * @generated
 */
public interface Aggregate extends Supplier {
	/**
	 * Returns the value of the '<em><b>Domainobject</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityStorming.DomainObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainobject</em>' containment reference list.
	 * @see ActivityStorming.ActivityStormingPackage#getAggregate_Domainobject()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<DomainObject> getDomainobject();

} // Aggregate
