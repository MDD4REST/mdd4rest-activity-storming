/*
 * 
 */
package ActivityStorming.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ActivityStormingEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view)) {

			case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart(view);

			case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.CommandActionEditPart(view);

			case ActivityStorming.diagram.edit.parts.CommandActionNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.CommandActionNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.AggregateEditPart(view);

			case ActivityStorming.diagram.edit.parts.AggregateNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.AggregateNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.QueryActionEditPart(view);

			case ActivityStorming.diagram.edit.parts.QueryActionNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.QueryActionNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ValueObjectEditPart(view);

			case ActivityStorming.diagram.edit.parts.ValueObjectNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ValueObjectNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.EntityEditPart(view);

			case ActivityStorming.diagram.edit.parts.EntityNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.EntityNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ExternalSystemEditPart(view);

			case ActivityStorming.diagram.edit.parts.ExternalSystemNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ExternalSystemNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ConstraintPinEditPart(view);

			case ActivityStorming.diagram.edit.parts.ConstraintPinNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ConstraintPinNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.InitialNodeEditPart(view);

			case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ForkNodeEditPart(view);

			case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.JoinNodeEditPart(view);

			case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DecisionNodeEditPart(view);

			case ActivityStorming.diagram.edit.parts.DecisionNodeNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DecisionNodeNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.MergeNodeEditPart(view);

			case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.FinalNodeEditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainObjectEditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainObjectNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainObjectNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ReadModelEditPart(view);

			case ActivityStorming.diagram.edit.parts.ReadModelNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ReadModelNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainEventEditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainEventNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainEventNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ControlNodeEditPart(view);

			case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActorEditPart(view);

			case ActivityStorming.diagram.edit.parts.ActorNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActorNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.SystemEditPart(view);

			case ActivityStorming.diagram.edit.parts.SystemNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.SystemNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart(view);

			case ActivityStorming.diagram.edit.parts.ActivityPartitionNameEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActivityPartitionNameEditPart(view);

			case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ConstraintPinName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ConstraintPinName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ValueObject2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ValueObjectName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ValueObjectName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.Entity2EditPart(view);

			case ActivityStorming.diagram.edit.parts.EntityName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.EntityName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainObject2EditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainObjectName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainObjectName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.CommandAction2EditPart(view);

			case ActivityStorming.diagram.edit.parts.CommandActionName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.CommandActionName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.Aggregate2EditPart(view);

			case ActivityStorming.diagram.edit.parts.AggregateName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.AggregateName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.QueryAction2EditPart(view);

			case ActivityStorming.diagram.edit.parts.QueryActionName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.QueryActionName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ValueObject3EditPart(view);

			case ActivityStorming.diagram.edit.parts.ValueObjectName3EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ValueObjectName3EditPart(view);

			case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.Entity3EditPart(view);

			case ActivityStorming.diagram.edit.parts.EntityName3EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.EntityName3EditPart(view);

			case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ExternalSystemName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ExternalSystemName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart(view);

			case ActivityStorming.diagram.edit.parts.ConstraintPinName3EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ConstraintPinName3EditPart(view);

			case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.InitialNode2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ForkNode2EditPart(view);

			case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.JoinNode2EditPart(view);

			case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DecisionNode2EditPart(view);

			case ActivityStorming.diagram.edit.parts.DecisionNodeName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DecisionNodeName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.MergeNode2EditPart(view);

			case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.FinalNode2EditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainObject3EditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainObjectName3EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainObjectName3EditPart(view);

			case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ReadModel2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ReadModelName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ReadModelName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainEvent2EditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainEventName2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainEventName2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ControlNode2EditPart(view);

			case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart(view);

			case ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart(view);

			case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart(view);

			case ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart(view);

			case ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart(
						view);

			case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ObjectFlowEditPart(view);

			case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ControlFlowEditPart(view);

			case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ControlFlow2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart(view);

			case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart(view);

			case ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ActionSupplierEditPart(view);

			case ActivityStorming.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.WrappingLabelEditPart(view);

			case ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart(view);

			case ActivityStorming.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.WrappingLabel2EditPart(view);

			case ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart(view);

			case ActivityStorming.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.WrappingLabel3EditPart(view);

			case ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart(view);

			case ActivityStorming.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.WrappingLabel4EditPart(view);

			case ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart(view);

			case ActivityStorming.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new ActivityStorming.diagram.edit.parts.WrappingLabel5EditPart(view);

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
