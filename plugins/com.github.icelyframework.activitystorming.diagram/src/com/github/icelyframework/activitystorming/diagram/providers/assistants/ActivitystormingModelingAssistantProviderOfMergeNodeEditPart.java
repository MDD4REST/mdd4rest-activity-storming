/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import com.github.icelyframework.activitystorming.diagram.edit.parts.Aggregate2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandAction2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandActionEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPin2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPin3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEvent2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEventEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObject2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObject3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObjectEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Entity2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Entity3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.EntityEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ExternalSystem2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ExternalSystemEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.FinalNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.FinalNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ForkNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ForkNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.InitialNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.InitialNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.JoinNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.JoinNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.MergeNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.MergeNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.QueryAction2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.QueryActionEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModel2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModelEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectEditPart;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingModelingAssistantProvider;

/**
 * @generated
 */
public class ActivitystormingModelingAssistantProviderOfMergeNodeEditPart
		extends ActivitystormingModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((MergeNodeEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(MergeNodeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		types.add(ActivitystormingElementTypes.ControlFlow_4003);
		types.add(ActivitystormingElementTypes.ControlFlow_4004);
		types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((MergeNodeEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(MergeNodeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CommandActionEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof AggregateEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof QueryActionEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ValueObjectEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ExternalSystemEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ConstraintPinEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof FinalNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof DomainObjectEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ReadModelEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof DomainEventEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ControlNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ConstraintPin2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ValueObject2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof DomainObject2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof CommandAction2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof Aggregate2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof QueryAction2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ValueObject3EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof Entity3EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ExternalSystem2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ConstraintPin3EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof FinalNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof DomainObject3EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ReadModel2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof DomainEvent2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof ControlNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		}
		if (targetEditPart instanceof CommandActionEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AggregateEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof QueryActionEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ValueObjectEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ExternalSystemEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ConstraintPinEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof FinalNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DomainObjectEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ReadModelEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DomainEventEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ControlNodeEditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ConstraintPin2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ValueObject2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DomainObject2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CommandAction2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof Aggregate2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof QueryAction2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ValueObject3EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof Entity3EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ExternalSystem2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ConstraintPin3EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof FinalNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DomainObject3EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ReadModel2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DomainEvent2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ControlNode2EditPart) {
			types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CommandActionEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof AggregateEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof QueryActionEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ValueObjectEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ExternalSystemEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ConstraintPinEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof FinalNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof DomainObjectEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ReadModelEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof DomainEventEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ControlNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ConstraintPin2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ValueObject2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof DomainObject2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof CommandAction2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof Aggregate2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof QueryAction2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ValueObject3EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof Entity3EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ExternalSystem2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ConstraintPin3EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof FinalNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof DomainObject3EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ReadModel2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof DomainEvent2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof ControlNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4003);
		}
		if (targetEditPart instanceof CommandActionEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof AggregateEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof QueryActionEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ValueObjectEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ExternalSystemEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ConstraintPinEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof FinalNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof DomainObjectEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ReadModelEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof DomainEventEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ControlNodeEditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ConstraintPin2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ValueObject2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof DomainObject2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof CommandAction2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof Aggregate2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof QueryAction2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ValueObject3EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof Entity3EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ExternalSystem2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ConstraintPin3EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof FinalNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof DomainObject3EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ReadModel2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof DomainEvent2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof ControlNode2EditPart) {
			types.add(ActivitystormingElementTypes.ControlFlow_4004);
		}
		if (targetEditPart instanceof CommandActionEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof AggregateEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof QueryActionEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ValueObjectEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ExternalSystemEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ConstraintPinEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof FinalNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof DomainObjectEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ReadModelEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof DomainEventEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ControlNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ConstraintPin2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ValueObject2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof DomainObject2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof CommandAction2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof Aggregate2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof QueryAction2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ValueObject3EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof Entity3EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ExternalSystem2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ConstraintPin3EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof FinalNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof DomainObject3EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ReadModel2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof DomainEvent2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof ControlNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		}
		if (targetEditPart instanceof CommandActionEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof AggregateEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof QueryActionEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ValueObjectEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ExternalSystemEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ConstraintPinEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof FinalNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof DomainObjectEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ReadModelEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof DomainEventEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ControlNodeEditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ConstraintPin2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ValueObject2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof DomainObject2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof CommandAction2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof Aggregate2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof QueryAction2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ValueObject3EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof Entity3EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ExternalSystem2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ConstraintPin3EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof FinalNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof DomainObject3EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ReadModel2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof DomainEvent2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		if (targetEditPart instanceof ControlNode2EditPart) {
			types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((MergeNodeEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(MergeNodeEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ActivitystormingElementTypes.ObjectFlow_4001) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ObjectFlow_4002) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ControlFlow_4003) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ControlFlow_4004) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ActivityEdge_4005) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ActivityEdge_4006) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((MergeNodeEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(MergeNodeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		types.add(ActivitystormingElementTypes.ControlFlow_4003);
		types.add(ActivitystormingElementTypes.ControlFlow_4004);
		types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((MergeNodeEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(MergeNodeEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ActivitystormingElementTypes.ObjectFlow_4001) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ObjectFlow_4002) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ControlFlow_4003) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ControlFlow_4004) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ActivityEdge_4005) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		} else if (relationshipType == ActivitystormingElementTypes.ActivityEdge_4006) {
			types.add(ActivitystormingElementTypes.CommandAction_2001);
			types.add(ActivitystormingElementTypes.Aggregate_2002);
			types.add(ActivitystormingElementTypes.QueryAction_2003);
			types.add(ActivitystormingElementTypes.ValueObject_2004);
			types.add(ActivitystormingElementTypes.Entity_2005);
			types.add(ActivitystormingElementTypes.ExternalSystem_2006);
			types.add(ActivitystormingElementTypes.ConstraintPin_2007);
			types.add(ActivitystormingElementTypes.InitialNode_2008);
			types.add(ActivitystormingElementTypes.ForkNode_2009);
			types.add(ActivitystormingElementTypes.JoinNode_2010);
			types.add(ActivitystormingElementTypes.DecisionNode_2011);
			types.add(ActivitystormingElementTypes.MergeNode_2012);
			types.add(ActivitystormingElementTypes.FinalNode_2013);
			types.add(ActivitystormingElementTypes.DomainObject_2014);
			types.add(ActivitystormingElementTypes.ReadModel_2015);
			types.add(ActivitystormingElementTypes.DomainEvent_2016);
			types.add(ActivitystormingElementTypes.ControlNode_2017);
			types.add(ActivitystormingElementTypes.ConstraintPin_3001);
			types.add(ActivitystormingElementTypes.ValueObject_3002);
			types.add(ActivitystormingElementTypes.Entity_3003);
			types.add(ActivitystormingElementTypes.DomainObject_3004);
			types.add(ActivitystormingElementTypes.CommandAction_3005);
			types.add(ActivitystormingElementTypes.Aggregate_3006);
			types.add(ActivitystormingElementTypes.QueryAction_3007);
			types.add(ActivitystormingElementTypes.ValueObject_3008);
			types.add(ActivitystormingElementTypes.Entity_3009);
			types.add(ActivitystormingElementTypes.ExternalSystem_3010);
			types.add(ActivitystormingElementTypes.ConstraintPin_3011);
			types.add(ActivitystormingElementTypes.InitialNode_3012);
			types.add(ActivitystormingElementTypes.ForkNode_3013);
			types.add(ActivitystormingElementTypes.JoinNode_3014);
			types.add(ActivitystormingElementTypes.DecisionNode_3015);
			types.add(ActivitystormingElementTypes.MergeNode_3016);
			types.add(ActivitystormingElementTypes.FinalNode_3017);
			types.add(ActivitystormingElementTypes.DomainObject_3018);
			types.add(ActivitystormingElementTypes.ReadModel_3019);
			types.add(ActivitystormingElementTypes.DomainEvent_3020);
			types.add(ActivitystormingElementTypes.ControlNode_3021);
		}
		return types;
	}

}
