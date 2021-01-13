/*
* 
*/
package ActivityStorming.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class SupplierTriggersItemSemanticEditPolicy
		extends ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SupplierTriggersItemSemanticEditPolicy() {
		super(ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierTriggers_4028);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
