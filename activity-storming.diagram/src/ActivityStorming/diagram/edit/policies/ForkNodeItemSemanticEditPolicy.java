/*
* 
*/
package ActivityStorming.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ForkNodeItemSemanticEditPolicy
		extends ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ForkNodeItemSemanticEditPolicy() {
		super(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(incomingLink) == ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(incomingLink) == ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(incomingLink) == ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(incomingLink) == ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(incomingLink) == ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(incomingLink) == ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(outgoingLink) == ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(outgoingLink) == ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(outgoingLink) == ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(outgoingLink) == ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(outgoingLink) == ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(outgoingLink) == ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ObjectFlowCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ObjectFlow2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ControlFlowCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ControlFlow2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ActivityEdgeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ActivityEdge2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ObjectFlowCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ObjectFlow2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ControlFlowCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ControlFlow2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ActivityEdgeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ActivityEdge2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ObjectFlowReorientCommand(req));
		case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID:
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ObjectFlow2ReorientCommand(req));
		case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ControlFlowReorientCommand(req));
		case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID:
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ControlFlow2ReorientCommand(req));
		case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ActivityEdgeReorientCommand(req));
		case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID:
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ActivityEdge2ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
