/*
* 
*/
package ActivityStorming.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ObjectFlowItemSemanticEditPolicy
		extends ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ObjectFlowItemSemanticEditPolicy() {
		super(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
