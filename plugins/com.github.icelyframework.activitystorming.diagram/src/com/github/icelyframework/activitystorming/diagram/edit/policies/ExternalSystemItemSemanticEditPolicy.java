/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import com.github.icelyframework.activitystorming.diagram.edit.commands.ActionSupplierCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ActionSupplierReorientCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ActivityEdge2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ActivityEdge2ReorientCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ActivityEdgeCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ActivityEdgeReorientCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ConstraintPin2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ControlFlow2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ControlFlow2ReorientCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ControlFlowCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ControlFlowReorientCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ObjectFlow2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ObjectFlow2ReorientCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ObjectFlowCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ObjectFlowReorientCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.SupplierReadmodelsCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.SupplierReadmodelsReorientCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.SupplierTriggersCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.SupplierTriggersReorientCommand;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActionSupplierEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdge2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdgeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPin2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinTriggersEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlFlow2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlFlowEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ObjectFlow2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ObjectFlowEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SupplierReadmodelsEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SupplierTriggersEditPart;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;

/**
 * @generated
 */
public class ExternalSystemItemSemanticEditPolicy extends ActivitystormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ExternalSystemItemSemanticEditPolicy() {
		super(ActivitystormingElementTypes.ExternalSystem_2006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ActivitystormingElementTypes.ConstraintPin_3001 == req.getElementType()) {
			return getGEFWrapper(new ConstraintPin2CreateCommand(req));
		}
		return super.getCreateCommand(req);
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
			if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ObjectFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ControlFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ActivityEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ActivityEdge2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ActionSupplierEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ObjectFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ObjectFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ControlFlowEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ControlFlow2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ActivityEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ActivityEdge2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == SupplierTriggersEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == SupplierReadmodelsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ActivitystormingVisualIDRegistry.getVisualID(node)) {
			case ConstraintPin2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ObjectFlowEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ObjectFlow2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ControlFlowEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ControlFlow2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ActivityEdgeEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(incomingLink) == ActivityEdge2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ObjectFlowEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ObjectFlow2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ControlFlowEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ControlFlow2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ActivityEdgeEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry.getVisualID(outgoingLink) == ActivityEdge2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (ActivitystormingVisualIDRegistry
							.getVisualID(outgoingLink) == ConstraintPinTriggersEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(),
								null, outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
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
		if (ActivitystormingElementTypes.ObjectFlow_4001 == req.getElementType()) {
			return getGEFWrapper(new ObjectFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ObjectFlow_4002 == req.getElementType()) {
			return getGEFWrapper(new ObjectFlow2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ControlFlow_4003 == req.getElementType()) {
			return getGEFWrapper(new ControlFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ControlFlow_4004 == req.getElementType()) {
			return getGEFWrapper(new ControlFlow2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ActivityEdge_4005 == req.getElementType()) {
			return getGEFWrapper(new ActivityEdgeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ActivityEdge_4006 == req.getElementType()) {
			return getGEFWrapper(new ActivityEdge2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ActionSupplier_4007 == req.getElementType()) {
			return null;
		}
		if (ActivitystormingElementTypes.SupplierTriggers_4008 == req.getElementType()) {
			return getGEFWrapper(new SupplierTriggersCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.SupplierReadmodels_4009 == req.getElementType()) {
			return getGEFWrapper(new SupplierReadmodelsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ActivitystormingElementTypes.ObjectFlow_4001 == req.getElementType()) {
			return getGEFWrapper(new ObjectFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ObjectFlow_4002 == req.getElementType()) {
			return getGEFWrapper(new ObjectFlow2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ControlFlow_4003 == req.getElementType()) {
			return getGEFWrapper(new ControlFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ControlFlow_4004 == req.getElementType()) {
			return getGEFWrapper(new ControlFlow2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ActivityEdge_4005 == req.getElementType()) {
			return getGEFWrapper(new ActivityEdgeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ActivityEdge_4006 == req.getElementType()) {
			return getGEFWrapper(new ActivityEdge2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.ActionSupplier_4007 == req.getElementType()) {
			return getGEFWrapper(new ActionSupplierCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ActivitystormingElementTypes.SupplierTriggers_4008 == req.getElementType()) {
			return null;
		}
		if (ActivitystormingElementTypes.SupplierReadmodels_4009 == req.getElementType()) {
			return null;
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
		case ObjectFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectFlowReorientCommand(req));
		case ObjectFlow2EditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectFlow2ReorientCommand(req));
		case ControlFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ControlFlowReorientCommand(req));
		case ControlFlow2EditPart.VISUAL_ID:
			return getGEFWrapper(new ControlFlow2ReorientCommand(req));
		case ActivityEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new ActivityEdgeReorientCommand(req));
		case ActivityEdge2EditPart.VISUAL_ID:
			return getGEFWrapper(new ActivityEdge2ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ActionSupplierEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionSupplierReorientCommand(req));
		case SupplierTriggersEditPart.VISUAL_ID:
			return getGEFWrapper(new SupplierTriggersReorientCommand(req));
		case SupplierReadmodelsEditPart.VISUAL_ID:
			return getGEFWrapper(new SupplierReadmodelsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
