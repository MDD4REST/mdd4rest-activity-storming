/*
* 
*/
package ActivityStorming.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ActivityDiagramItemSemanticEditPolicy
		extends ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ActivityDiagramItemSemanticEditPolicy() {
		super(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051 == req
				.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.CommandActionCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.AggregateCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.QueryActionCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ValueObjectCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.EntityCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056 == req
				.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ExternalSystemCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057 == req
				.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ConstraintPinCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.InitialNodeCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ForkNodeCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.JoinNodeCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.DecisionNodeCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.MergeNodeCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.FinalNodeCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.DomainObjectCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ReadModelCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.DomainEventCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ControlNodeCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.Actor_2068 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ActorCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.System_2069 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.SystemCreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityPartition_2070 == req
				.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ActivityPartitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
