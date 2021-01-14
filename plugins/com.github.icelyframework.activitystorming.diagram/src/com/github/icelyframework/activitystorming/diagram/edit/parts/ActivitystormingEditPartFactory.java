/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry;

/**
 * @generated
 */
public class ActivitystormingEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ActivitystormingVisualIDRegistry.getVisualID(view)) {

			case ActivityDiagramEditPart.VISUAL_ID:
				return new ActivityDiagramEditPart(view);

			case CommandActionEditPart.VISUAL_ID:
				return new CommandActionEditPart(view);

			case CommandActionNameEditPart.VISUAL_ID:
				return new CommandActionNameEditPart(view);

			case AggregateEditPart.VISUAL_ID:
				return new AggregateEditPart(view);

			case AggregateNameEditPart.VISUAL_ID:
				return new AggregateNameEditPart(view);

			case QueryActionEditPart.VISUAL_ID:
				return new QueryActionEditPart(view);

			case QueryActionNameEditPart.VISUAL_ID:
				return new QueryActionNameEditPart(view);

			case ValueObjectEditPart.VISUAL_ID:
				return new ValueObjectEditPart(view);

			case ValueObjectNameEditPart.VISUAL_ID:
				return new ValueObjectNameEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNameEditPart.VISUAL_ID:
				return new EntityNameEditPart(view);

			case ExternalSystemEditPart.VISUAL_ID:
				return new ExternalSystemEditPart(view);

			case ExternalSystemNameEditPart.VISUAL_ID:
				return new ExternalSystemNameEditPart(view);

			case ConstraintPinEditPart.VISUAL_ID:
				return new ConstraintPinEditPart(view);

			case ConstraintPinNameEditPart.VISUAL_ID:
				return new ConstraintPinNameEditPart(view);

			case InitialNodeEditPart.VISUAL_ID:
				return new InitialNodeEditPart(view);

			case ForkNodeEditPart.VISUAL_ID:
				return new ForkNodeEditPart(view);

			case JoinNodeEditPart.VISUAL_ID:
				return new JoinNodeEditPart(view);

			case DecisionNodeEditPart.VISUAL_ID:
				return new DecisionNodeEditPart(view);

			case DecisionNodeNameEditPart.VISUAL_ID:
				return new DecisionNodeNameEditPart(view);

			case MergeNodeEditPart.VISUAL_ID:
				return new MergeNodeEditPart(view);

			case FinalNodeEditPart.VISUAL_ID:
				return new FinalNodeEditPart(view);

			case DomainObjectEditPart.VISUAL_ID:
				return new DomainObjectEditPart(view);

			case DomainObjectNameEditPart.VISUAL_ID:
				return new DomainObjectNameEditPart(view);

			case ReadModelEditPart.VISUAL_ID:
				return new ReadModelEditPart(view);

			case ReadModelNameEditPart.VISUAL_ID:
				return new ReadModelNameEditPart(view);

			case DomainEventEditPart.VISUAL_ID:
				return new DomainEventEditPart(view);

			case DomainEventNameEditPart.VISUAL_ID:
				return new DomainEventNameEditPart(view);

			case ControlNodeEditPart.VISUAL_ID:
				return new ControlNodeEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case SystemEditPart.VISUAL_ID:
				return new SystemEditPart(view);

			case SystemNameEditPart.VISUAL_ID:
				return new SystemNameEditPart(view);

			case ActivityPartitionEditPart.VISUAL_ID:
				return new ActivityPartitionEditPart(view);

			case ActivityPartitionNameEditPart.VISUAL_ID:
				return new ActivityPartitionNameEditPart(view);

			case ConstraintPin2EditPart.VISUAL_ID:
				return new ConstraintPin2EditPart(view);

			case ConstraintPinName2EditPart.VISUAL_ID:
				return new ConstraintPinName2EditPart(view);

			case ValueObject2EditPart.VISUAL_ID:
				return new ValueObject2EditPart(view);

			case ValueObjectName2EditPart.VISUAL_ID:
				return new ValueObjectName2EditPart(view);

			case Entity2EditPart.VISUAL_ID:
				return new Entity2EditPart(view);

			case EntityName2EditPart.VISUAL_ID:
				return new EntityName2EditPart(view);

			case DomainObject2EditPart.VISUAL_ID:
				return new DomainObject2EditPart(view);

			case DomainObjectName2EditPart.VISUAL_ID:
				return new DomainObjectName2EditPart(view);

			case CommandAction2EditPart.VISUAL_ID:
				return new CommandAction2EditPart(view);

			case CommandActionName2EditPart.VISUAL_ID:
				return new CommandActionName2EditPart(view);

			case Aggregate2EditPart.VISUAL_ID:
				return new Aggregate2EditPart(view);

			case AggregateName2EditPart.VISUAL_ID:
				return new AggregateName2EditPart(view);

			case QueryAction2EditPart.VISUAL_ID:
				return new QueryAction2EditPart(view);

			case QueryActionName2EditPart.VISUAL_ID:
				return new QueryActionName2EditPart(view);

			case ValueObject3EditPart.VISUAL_ID:
				return new ValueObject3EditPart(view);

			case ValueObjectName3EditPart.VISUAL_ID:
				return new ValueObjectName3EditPart(view);

			case Entity3EditPart.VISUAL_ID:
				return new Entity3EditPart(view);

			case EntityName3EditPart.VISUAL_ID:
				return new EntityName3EditPart(view);

			case ExternalSystem2EditPart.VISUAL_ID:
				return new ExternalSystem2EditPart(view);

			case ExternalSystemName2EditPart.VISUAL_ID:
				return new ExternalSystemName2EditPart(view);

			case ConstraintPin3EditPart.VISUAL_ID:
				return new ConstraintPin3EditPart(view);

			case ConstraintPinName3EditPart.VISUAL_ID:
				return new ConstraintPinName3EditPart(view);

			case InitialNode2EditPart.VISUAL_ID:
				return new InitialNode2EditPart(view);

			case ForkNode2EditPart.VISUAL_ID:
				return new ForkNode2EditPart(view);

			case JoinNode2EditPart.VISUAL_ID:
				return new JoinNode2EditPart(view);

			case DecisionNode2EditPart.VISUAL_ID:
				return new DecisionNode2EditPart(view);

			case DecisionNodeName2EditPart.VISUAL_ID:
				return new DecisionNodeName2EditPart(view);

			case MergeNode2EditPart.VISUAL_ID:
				return new MergeNode2EditPart(view);

			case FinalNode2EditPart.VISUAL_ID:
				return new FinalNode2EditPart(view);

			case DomainObject3EditPart.VISUAL_ID:
				return new DomainObject3EditPart(view);

			case DomainObjectName3EditPart.VISUAL_ID:
				return new DomainObjectName3EditPart(view);

			case ReadModel2EditPart.VISUAL_ID:
				return new ReadModel2EditPart(view);

			case ReadModelName2EditPart.VISUAL_ID:
				return new ReadModelName2EditPart(view);

			case DomainEvent2EditPart.VISUAL_ID:
				return new DomainEvent2EditPart(view);

			case DomainEventName2EditPart.VISUAL_ID:
				return new DomainEventName2EditPart(view);

			case ControlNode2EditPart.VISUAL_ID:
				return new ControlNode2EditPart(view);

			case AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
				return new AggregateAggregateDomainobjectCompartmentEditPart(view);

			case ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
				return new ActorActorActivitynodeCompartmentEditPart(view);

			case AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
				return new AggregateAggregateDomainobjectCompartment2EditPart(view);

			case SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
				return new SystemSystemActivitynodeCompartmentEditPart(view);

			case ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
				return new ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart(view);

			case ObjectFlowEditPart.VISUAL_ID:
				return new ObjectFlowEditPart(view);

			case ObjectFlow2EditPart.VISUAL_ID:
				return new ObjectFlow2EditPart(view);

			case ControlFlowEditPart.VISUAL_ID:
				return new ControlFlowEditPart(view);

			case ControlFlow2EditPart.VISUAL_ID:
				return new ControlFlow2EditPart(view);

			case ActivityEdgeEditPart.VISUAL_ID:
				return new ActivityEdgeEditPart(view);

			case ActivityEdge2EditPart.VISUAL_ID:
				return new ActivityEdge2EditPart(view);

			case ActionSupplierEditPart.VISUAL_ID:
				return new ActionSupplierEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case SupplierTriggersEditPart.VISUAL_ID:
				return new SupplierTriggersEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case SupplierReadmodelsEditPart.VISUAL_ID:
				return new SupplierReadmodelsEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case DomainEventReadmodelEditPart.VISUAL_ID:
				return new DomainEventReadmodelEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case ConstraintPinTriggersEditPart.VISUAL_ID:
				return new ConstraintPinTriggersEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
