/*
 * 
 */
package ActivityStorming.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ActivityStormingModelingAssistantProviderOfDomainObject3EditPart
		extends ActivityStorming.diagram.providers.ActivityStormingModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ActivityStorming.diagram.edit.parts.DomainObject3EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ActivityStorming.diagram.edit.parts.DomainObject3EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(ActivityStorming.diagram.edit.parts.DomainObject3EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ActivityStorming.diagram.edit.parts.DomainObject3EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.AggregateEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.EntityEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystemEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPinEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModelEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEventEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Aggregate2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModel2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEvent2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.AggregateEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.EntityEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystemEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPinEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModelEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEventEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Aggregate2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModel2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEvent2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.AggregateEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.EntityEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystemEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPinEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModelEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEventEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Aggregate2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModel2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEvent2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.AggregateEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.EntityEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystemEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPinEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModelEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEventEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Aggregate2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModel2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEvent2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.AggregateEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.EntityEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystemEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPinEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModelEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEventEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Aggregate2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModel2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEvent2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.AggregateEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryActionEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.EntityEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystemEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPinEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObjectEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModelEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEventEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNodeEditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.CommandAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Aggregate2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.QueryAction2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ValueObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.Entity3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.InitialNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ForkNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.JoinNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DecisionNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.MergeNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.FinalNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainObject3EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ReadModel2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.DomainEvent2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		if (targetEditPart instanceof ActivityStorming.diagram.edit.parts.ControlNode2EditPart) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ActivityStorming.diagram.edit.parts.DomainObject3EditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ActivityStorming.diagram.edit.parts.DomainObject3EditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ActivityStorming.diagram.edit.parts.DomainObject3EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ActivityStorming.diagram.edit.parts.DomainObject3EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ActivityStorming.diagram.edit.parts.DomainObject3EditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ActivityStorming.diagram.edit.parts.DomainObject3EditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		} else if (relationshipType == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026) {
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
			types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		}
		return types;
	}

}
