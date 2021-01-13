/*
* 
*/
package ActivityStorming.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SystemSystemActivitynodeCompartmentItemSemanticEditPolicy
		extends ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SystemSystemActivitynodeCompartmentItemSemanticEditPolicy() {
		super(ActivityStorming.diagram.providers.ActivityStormingElementTypes.System_2069);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030 == req
				.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.CommandAction2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.Aggregate2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.QueryAction2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ValueObject3CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.Entity3CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035 == req
				.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ExternalSystem2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036 == req
				.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ConstraintPin3CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.InitialNode2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ForkNode2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.JoinNode2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.DecisionNode2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.MergeNode2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.FinalNode2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.DomainObject3CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ReadModel2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.DomainEvent2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ControlNode2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
