/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import com.github.icelyframework.activitystorming.Action;
import com.github.icelyframework.activitystorming.ActivityDiagram;
import com.github.icelyframework.activitystorming.ActivityEdge;
import com.github.icelyframework.activitystorming.ActivityNode;
import com.github.icelyframework.activitystorming.ActivityPartition;
import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.Actor;
import com.github.icelyframework.activitystorming.Aggregate;
import com.github.icelyframework.activitystorming.CommandAction;
import com.github.icelyframework.activitystorming.ConstraintPin;
import com.github.icelyframework.activitystorming.ControlFlow;
import com.github.icelyframework.activitystorming.ControlNode;
import com.github.icelyframework.activitystorming.DecisionNode;
import com.github.icelyframework.activitystorming.DomainEvent;
import com.github.icelyframework.activitystorming.DomainObject;
import com.github.icelyframework.activitystorming.Entity;
import com.github.icelyframework.activitystorming.ExternalSystem;
import com.github.icelyframework.activitystorming.FinalNode;
import com.github.icelyframework.activitystorming.ForkNode;
import com.github.icelyframework.activitystorming.InitialNode;
import com.github.icelyframework.activitystorming.JoinNode;
import com.github.icelyframework.activitystorming.MergeNode;
import com.github.icelyframework.activitystorming.ObjectFlow;
import com.github.icelyframework.activitystorming.QueryAction;
import com.github.icelyframework.activitystorming.ReadModel;
import com.github.icelyframework.activitystorming.Supplier;
import com.github.icelyframework.activitystorming.System;
import com.github.icelyframework.activitystorming.ValueObject;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActionSupplierEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityDiagramEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdge2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdgeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityPartitionEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActorEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Aggregate2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandAction2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandActionEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPin2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPin3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinTriggersEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlFlow2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlFlowEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEvent2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEventEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEventReadmodelEditPart;
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
import com.github.icelyframework.activitystorming.diagram.edit.parts.ObjectFlow2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ObjectFlowEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.QueryAction2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.QueryActionEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModel2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModelEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SupplierReadmodelsEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SupplierTriggersEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SystemEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectEditPart;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;

/**
 * @generated
 */
public class ActivitystormingDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getSemanticChildren(View view) {
		switch (ActivitystormingVisualIDRegistry.getVisualID(view)) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return getActivityDiagram_1000SemanticChildren(view);
		case AggregateEditPart.VISUAL_ID:
			return getAggregate_2002SemanticChildren(view);
		case ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2006SemanticChildren(view);
		case Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3006SemanticChildren(view);
		case ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3010SemanticChildren(view);
		case AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
			return getAggregateAggregateDomainobjectCompartment_7001SemanticChildren(view);
		case ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
			return getActorActorActivitynodeCompartment_7002SemanticChildren(view);
		case AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
			return getAggregateAggregateDomainobjectCompartment_7003SemanticChildren(view);
		case SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
			return getSystemSystemActivitynodeCompartment_7004SemanticChildren(view);
		case ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
			return getActivityPartitionActivityPartitionActivitynodeCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getActivityDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityDiagram modelElement = (ActivityDiagram) view.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivitynode().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommandActionEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregateEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == QueryActionEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueObjectEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalSystemEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConstraintPinEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialNodeEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForkNodeEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JoinNodeEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DecisionNodeEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MergeNodeEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FinalNodeEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainObjectEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReadModelEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainEventEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ControlNodeEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActivitypartition().iterator(); it.hasNext();) {
			ActivityPartition childElement = (ActivityPartition) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SystemEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityPartitionEditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getAggregate_2002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Aggregate modelElement = (Aggregate) view.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			ConstraintPin childElement = (ConstraintPin) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintPin2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getExternalSystem_2006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ExternalSystem modelElement = (ExternalSystem) view.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			ConstraintPin childElement = (ConstraintPin) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintPin2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getAggregate_3006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Aggregate modelElement = (Aggregate) view.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			ConstraintPin childElement = (ConstraintPin) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintPin2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getExternalSystem_3010SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ExternalSystem modelElement = (ExternalSystem) view.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			ConstraintPin childElement = (ConstraintPin) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintPin2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getAggregateAggregateDomainobjectCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Aggregate modelElement = (Aggregate) containerView.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDomainobject().iterator(); it.hasNext();) {
			DomainObject childElement = (DomainObject) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ValueObject2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Entity2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainObject2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getActorActorActivitynodeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Actor modelElement = (Actor) containerView.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivitynode().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommandAction2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregate2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == QueryAction2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueObject3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Entity3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalSystem2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConstraintPin3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForkNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JoinNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DecisionNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MergeNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FinalNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainObject3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReadModel2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainEvent2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ControlNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getAggregateAggregateDomainobjectCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Aggregate modelElement = (Aggregate) containerView.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDomainobject().iterator(); it.hasNext();) {
			DomainObject childElement = (DomainObject) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ValueObject2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Entity2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainObject2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getSystemSystemActivitynodeCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) containerView.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivitynode().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommandAction2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregate2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == QueryAction2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueObject3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Entity3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalSystem2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConstraintPin3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForkNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JoinNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DecisionNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MergeNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FinalNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainObject3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReadModel2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainEvent2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ControlNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingNodeDescriptor> getActivityPartitionActivityPartitionActivitynodeCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityPartition modelElement = (ActivityPartition) containerView.getElement();
		LinkedList<ActivitystormingNodeDescriptor> result = new LinkedList<ActivitystormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivitynode().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = ActivitystormingVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommandAction2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregate2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == QueryAction2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueObject3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Entity3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalSystem2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConstraintPin3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForkNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JoinNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DecisionNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MergeNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FinalNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainObject3EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReadModel2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainEvent2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ControlNode2EditPart.VISUAL_ID) {
				result.add(new ActivitystormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingLinkDescriptor> getContainedLinks(View view) {
		switch (ActivitystormingVisualIDRegistry.getVisualID(view)) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return getActivityDiagram_1000ContainedLinks(view);
		case CommandActionEditPart.VISUAL_ID:
			return getCommandAction_2001ContainedLinks(view);
		case AggregateEditPart.VISUAL_ID:
			return getAggregate_2002ContainedLinks(view);
		case QueryActionEditPart.VISUAL_ID:
			return getQueryAction_2003ContainedLinks(view);
		case ValueObjectEditPart.VISUAL_ID:
			return getValueObject_2004ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2005ContainedLinks(view);
		case ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2006ContainedLinks(view);
		case ConstraintPinEditPart.VISUAL_ID:
			return getConstraintPin_2007ContainedLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2008ContainedLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2009ContainedLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2010ContainedLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2011ContainedLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2012ContainedLinks(view);
		case FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2013ContainedLinks(view);
		case DomainObjectEditPart.VISUAL_ID:
			return getDomainObject_2014ContainedLinks(view);
		case ReadModelEditPart.VISUAL_ID:
			return getReadModel_2015ContainedLinks(view);
		case DomainEventEditPart.VISUAL_ID:
			return getDomainEvent_2016ContainedLinks(view);
		case ControlNodeEditPart.VISUAL_ID:
			return getControlNode_2017ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2018ContainedLinks(view);
		case SystemEditPart.VISUAL_ID:
			return getSystem_2019ContainedLinks(view);
		case ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2020ContainedLinks(view);
		case ConstraintPin2EditPart.VISUAL_ID:
			return getConstraintPin_3001ContainedLinks(view);
		case ValueObject2EditPart.VISUAL_ID:
			return getValueObject_3002ContainedLinks(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_3003ContainedLinks(view);
		case DomainObject2EditPart.VISUAL_ID:
			return getDomainObject_3004ContainedLinks(view);
		case CommandAction2EditPart.VISUAL_ID:
			return getCommandAction_3005ContainedLinks(view);
		case Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3006ContainedLinks(view);
		case QueryAction2EditPart.VISUAL_ID:
			return getQueryAction_3007ContainedLinks(view);
		case ValueObject3EditPart.VISUAL_ID:
			return getValueObject_3008ContainedLinks(view);
		case Entity3EditPart.VISUAL_ID:
			return getEntity_3009ContainedLinks(view);
		case ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3010ContainedLinks(view);
		case ConstraintPin3EditPart.VISUAL_ID:
			return getConstraintPin_3011ContainedLinks(view);
		case InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3012ContainedLinks(view);
		case ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3013ContainedLinks(view);
		case JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3014ContainedLinks(view);
		case DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3015ContainedLinks(view);
		case MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3016ContainedLinks(view);
		case FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3017ContainedLinks(view);
		case DomainObject3EditPart.VISUAL_ID:
			return getDomainObject_3018ContainedLinks(view);
		case ReadModel2EditPart.VISUAL_ID:
			return getReadModel_3019ContainedLinks(view);
		case DomainEvent2EditPart.VISUAL_ID:
			return getDomainEvent_3020ContainedLinks(view);
		case ControlNode2EditPart.VISUAL_ID:
			return getControlNode_3021ContainedLinks(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4001ContainedLinks(view);
		case ObjectFlow2EditPart.VISUAL_ID:
			return getObjectFlow_4002ContainedLinks(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4003ContainedLinks(view);
		case ControlFlow2EditPart.VISUAL_ID:
			return getControlFlow_4004ContainedLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4005ContainedLinks(view);
		case ActivityEdge2EditPart.VISUAL_ID:
			return getActivityEdge_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingLinkDescriptor> getIncomingLinks(View view) {
		switch (ActivitystormingVisualIDRegistry.getVisualID(view)) {
		case CommandActionEditPart.VISUAL_ID:
			return getCommandAction_2001IncomingLinks(view);
		case AggregateEditPart.VISUAL_ID:
			return getAggregate_2002IncomingLinks(view);
		case QueryActionEditPart.VISUAL_ID:
			return getQueryAction_2003IncomingLinks(view);
		case ValueObjectEditPart.VISUAL_ID:
			return getValueObject_2004IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2005IncomingLinks(view);
		case ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2006IncomingLinks(view);
		case ConstraintPinEditPart.VISUAL_ID:
			return getConstraintPin_2007IncomingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2008IncomingLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2009IncomingLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2010IncomingLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2011IncomingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2012IncomingLinks(view);
		case FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2013IncomingLinks(view);
		case DomainObjectEditPart.VISUAL_ID:
			return getDomainObject_2014IncomingLinks(view);
		case ReadModelEditPart.VISUAL_ID:
			return getReadModel_2015IncomingLinks(view);
		case DomainEventEditPart.VISUAL_ID:
			return getDomainEvent_2016IncomingLinks(view);
		case ControlNodeEditPart.VISUAL_ID:
			return getControlNode_2017IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2018IncomingLinks(view);
		case SystemEditPart.VISUAL_ID:
			return getSystem_2019IncomingLinks(view);
		case ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2020IncomingLinks(view);
		case ConstraintPin2EditPart.VISUAL_ID:
			return getConstraintPin_3001IncomingLinks(view);
		case ValueObject2EditPart.VISUAL_ID:
			return getValueObject_3002IncomingLinks(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_3003IncomingLinks(view);
		case DomainObject2EditPart.VISUAL_ID:
			return getDomainObject_3004IncomingLinks(view);
		case CommandAction2EditPart.VISUAL_ID:
			return getCommandAction_3005IncomingLinks(view);
		case Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3006IncomingLinks(view);
		case QueryAction2EditPart.VISUAL_ID:
			return getQueryAction_3007IncomingLinks(view);
		case ValueObject3EditPart.VISUAL_ID:
			return getValueObject_3008IncomingLinks(view);
		case Entity3EditPart.VISUAL_ID:
			return getEntity_3009IncomingLinks(view);
		case ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3010IncomingLinks(view);
		case ConstraintPin3EditPart.VISUAL_ID:
			return getConstraintPin_3011IncomingLinks(view);
		case InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3012IncomingLinks(view);
		case ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3013IncomingLinks(view);
		case JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3014IncomingLinks(view);
		case DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3015IncomingLinks(view);
		case MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3016IncomingLinks(view);
		case FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3017IncomingLinks(view);
		case DomainObject3EditPart.VISUAL_ID:
			return getDomainObject_3018IncomingLinks(view);
		case ReadModel2EditPart.VISUAL_ID:
			return getReadModel_3019IncomingLinks(view);
		case DomainEvent2EditPart.VISUAL_ID:
			return getDomainEvent_3020IncomingLinks(view);
		case ControlNode2EditPart.VISUAL_ID:
			return getControlNode_3021IncomingLinks(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4001IncomingLinks(view);
		case ObjectFlow2EditPart.VISUAL_ID:
			return getObjectFlow_4002IncomingLinks(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4003IncomingLinks(view);
		case ControlFlow2EditPart.VISUAL_ID:
			return getControlFlow_4004IncomingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4005IncomingLinks(view);
		case ActivityEdge2EditPart.VISUAL_ID:
			return getActivityEdge_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ActivitystormingLinkDescriptor> getOutgoingLinks(View view) {
		switch (ActivitystormingVisualIDRegistry.getVisualID(view)) {
		case CommandActionEditPart.VISUAL_ID:
			return getCommandAction_2001OutgoingLinks(view);
		case AggregateEditPart.VISUAL_ID:
			return getAggregate_2002OutgoingLinks(view);
		case QueryActionEditPart.VISUAL_ID:
			return getQueryAction_2003OutgoingLinks(view);
		case ValueObjectEditPart.VISUAL_ID:
			return getValueObject_2004OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2005OutgoingLinks(view);
		case ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2006OutgoingLinks(view);
		case ConstraintPinEditPart.VISUAL_ID:
			return getConstraintPin_2007OutgoingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2008OutgoingLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2009OutgoingLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2010OutgoingLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2011OutgoingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2012OutgoingLinks(view);
		case FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2013OutgoingLinks(view);
		case DomainObjectEditPart.VISUAL_ID:
			return getDomainObject_2014OutgoingLinks(view);
		case ReadModelEditPart.VISUAL_ID:
			return getReadModel_2015OutgoingLinks(view);
		case DomainEventEditPart.VISUAL_ID:
			return getDomainEvent_2016OutgoingLinks(view);
		case ControlNodeEditPart.VISUAL_ID:
			return getControlNode_2017OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2018OutgoingLinks(view);
		case SystemEditPart.VISUAL_ID:
			return getSystem_2019OutgoingLinks(view);
		case ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2020OutgoingLinks(view);
		case ConstraintPin2EditPart.VISUAL_ID:
			return getConstraintPin_3001OutgoingLinks(view);
		case ValueObject2EditPart.VISUAL_ID:
			return getValueObject_3002OutgoingLinks(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_3003OutgoingLinks(view);
		case DomainObject2EditPart.VISUAL_ID:
			return getDomainObject_3004OutgoingLinks(view);
		case CommandAction2EditPart.VISUAL_ID:
			return getCommandAction_3005OutgoingLinks(view);
		case Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3006OutgoingLinks(view);
		case QueryAction2EditPart.VISUAL_ID:
			return getQueryAction_3007OutgoingLinks(view);
		case ValueObject3EditPart.VISUAL_ID:
			return getValueObject_3008OutgoingLinks(view);
		case Entity3EditPart.VISUAL_ID:
			return getEntity_3009OutgoingLinks(view);
		case ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3010OutgoingLinks(view);
		case ConstraintPin3EditPart.VISUAL_ID:
			return getConstraintPin_3011OutgoingLinks(view);
		case InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3012OutgoingLinks(view);
		case ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3013OutgoingLinks(view);
		case JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3014OutgoingLinks(view);
		case DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3015OutgoingLinks(view);
		case MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3016OutgoingLinks(view);
		case FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3017OutgoingLinks(view);
		case DomainObject3EditPart.VISUAL_ID:
			return getDomainObject_3018OutgoingLinks(view);
		case ReadModel2EditPart.VISUAL_ID:
			return getReadModel_3019OutgoingLinks(view);
		case DomainEvent2EditPart.VISUAL_ID:
			return getDomainEvent_3020OutgoingLinks(view);
		case ControlNode2EditPart.VISUAL_ID:
			return getControlNode_3021OutgoingLinks(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4001OutgoingLinks(view);
		case ObjectFlow2EditPart.VISUAL_ID:
			return getObjectFlow_4002OutgoingLinks(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4003OutgoingLinks(view);
		case ControlFlow2EditPart.VISUAL_ID:
			return getControlFlow_4004OutgoingLinks(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4005OutgoingLinks(view);
		case ActivityEdge2EditPart.VISUAL_ID:
			return getActivityEdge_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityDiagram_1000ContainedLinks(View view) {
		ActivityDiagram modelElement = (ActivityDiagram) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getCommandAction_2001ContainedLinks(View view) {
		CommandAction modelElement = (CommandAction) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getAggregate_2002ContainedLinks(View view) {
		Aggregate modelElement = (Aggregate) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getQueryAction_2003ContainedLinks(View view) {
		QueryAction modelElement = (QueryAction) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getValueObject_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getEntity_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getExternalSystem_2006ContainedLinks(View view) {
		ExternalSystem modelElement = (ExternalSystem) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getConstraintPin_2007ContainedLinks(View view) {
		ConstraintPin modelElement = (ConstraintPin) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getInitialNode_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getForkNode_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getJoinNode_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDecisionNode_2011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getMergeNode_2012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getFinalNode_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainObject_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getReadModel_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainEvent_2016ContainedLinks(View view) {
		DomainEvent modelElement = (DomainEvent) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlNode_2017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActor_2018ContainedLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getSystem_2019ContainedLinks(View view) {
		System modelElement = (System) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityPartition_2020ContainedLinks(View view) {
		ActivityPartition modelElement = (ActivityPartition) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getConstraintPin_3001ContainedLinks(View view) {
		ConstraintPin modelElement = (ConstraintPin) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getValueObject_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getEntity_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainObject_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getCommandAction_3005ContainedLinks(View view) {
		CommandAction modelElement = (CommandAction) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getAggregate_3006ContainedLinks(View view) {
		Aggregate modelElement = (Aggregate) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getQueryAction_3007ContainedLinks(View view) {
		QueryAction modelElement = (QueryAction) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getValueObject_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getEntity_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getExternalSystem_3010ContainedLinks(View view) {
		ExternalSystem modelElement = (ExternalSystem) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getConstraintPin_3011ContainedLinks(View view) {
		ConstraintPin modelElement = (ConstraintPin) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getInitialNode_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getForkNode_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getJoinNode_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDecisionNode_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getMergeNode_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getFinalNode_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainObject_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getReadModel_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainEvent_3020ContainedLinks(View view) {
		DomainEvent modelElement = (DomainEvent) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlNode_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getObjectFlow_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getObjectFlow_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlFlow_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlFlow_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityEdge_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityEdge_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getCommandAction_2001IncomingLinks(View view) {
		CommandAction modelElement = (CommandAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getAggregate_2002IncomingLinks(View view) {
		Aggregate modelElement = (Aggregate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Supplier_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getQueryAction_2003IncomingLinks(View view) {
		QueryAction modelElement = (QueryAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getValueObject_2004IncomingLinks(View view) {
		ValueObject modelElement = (ValueObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getEntity_2005IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getExternalSystem_2006IncomingLinks(View view) {
		ExternalSystem modelElement = (ExternalSystem) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Supplier_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getConstraintPin_2007IncomingLinks(View view) {
		ConstraintPin modelElement = (ConstraintPin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getInitialNode_2008IncomingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getForkNode_2009IncomingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getJoinNode_2010IncomingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDecisionNode_2011IncomingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getMergeNode_2012IncomingLinks(View view) {
		MergeNode modelElement = (MergeNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getFinalNode_2013IncomingLinks(View view) {
		FinalNode modelElement = (FinalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainObject_2014IncomingLinks(View view) {
		DomainObject modelElement = (DomainObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getReadModel_2015IncomingLinks(View view) {
		ReadModel modelElement = (ReadModel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_DomainEvent_Readmodel_4010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainEvent_2016IncomingLinks(View view) {
		DomainEvent modelElement = (DomainEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlNode_2017IncomingLinks(View view) {
		ControlNode modelElement = (ControlNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActor_2018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getSystem_2019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityPartition_2020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getConstraintPin_3001IncomingLinks(View view) {
		ConstraintPin modelElement = (ConstraintPin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getValueObject_3002IncomingLinks(View view) {
		ValueObject modelElement = (ValueObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getEntity_3003IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainObject_3004IncomingLinks(View view) {
		DomainObject modelElement = (DomainObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getCommandAction_3005IncomingLinks(View view) {
		CommandAction modelElement = (CommandAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getAggregate_3006IncomingLinks(View view) {
		Aggregate modelElement = (Aggregate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Supplier_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getQueryAction_3007IncomingLinks(View view) {
		QueryAction modelElement = (QueryAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getValueObject_3008IncomingLinks(View view) {
		ValueObject modelElement = (ValueObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getEntity_3009IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getExternalSystem_3010IncomingLinks(View view) {
		ExternalSystem modelElement = (ExternalSystem) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Supplier_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getConstraintPin_3011IncomingLinks(View view) {
		ConstraintPin modelElement = (ConstraintPin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getInitialNode_3012IncomingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getForkNode_3013IncomingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getJoinNode_3014IncomingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDecisionNode_3015IncomingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getMergeNode_3016IncomingLinks(View view) {
		MergeNode modelElement = (MergeNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getFinalNode_3017IncomingLinks(View view) {
		FinalNode modelElement = (FinalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainObject_3018IncomingLinks(View view) {
		DomainObject modelElement = (DomainObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getReadModel_3019IncomingLinks(View view) {
		ReadModel modelElement = (ReadModel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_DomainEvent_Readmodel_4010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainEvent_3020IncomingLinks(View view) {
		DomainEvent modelElement = (DomainEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlNode_3021IncomingLinks(View view) {
		ControlNode modelElement = (ControlNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getObjectFlow_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getObjectFlow_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlFlow_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlFlow_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityEdge_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityEdge_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getCommandAction_2001OutgoingLinks(View view) {
		CommandAction modelElement = (CommandAction) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getAggregate_2002OutgoingLinks(View view) {
		Aggregate modelElement = (Aggregate) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getQueryAction_2003OutgoingLinks(View view) {
		QueryAction modelElement = (QueryAction) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getValueObject_2004OutgoingLinks(View view) {
		ValueObject modelElement = (ValueObject) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getEntity_2005OutgoingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getExternalSystem_2006OutgoingLinks(View view) {
		ExternalSystem modelElement = (ExternalSystem) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getConstraintPin_2007OutgoingLinks(View view) {
		ConstraintPin modelElement = (ConstraintPin) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getInitialNode_2008OutgoingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getForkNode_2009OutgoingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getJoinNode_2010OutgoingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDecisionNode_2011OutgoingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getMergeNode_2012OutgoingLinks(View view) {
		MergeNode modelElement = (MergeNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getFinalNode_2013OutgoingLinks(View view) {
		FinalNode modelElement = (FinalNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainObject_2014OutgoingLinks(View view) {
		DomainObject modelElement = (DomainObject) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getReadModel_2015OutgoingLinks(View view) {
		ReadModel modelElement = (ReadModel) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainEvent_2016OutgoingLinks(View view) {
		DomainEvent modelElement = (DomainEvent) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlNode_2017OutgoingLinks(View view) {
		ControlNode modelElement = (ControlNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActor_2018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getSystem_2019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityPartition_2020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getConstraintPin_3001OutgoingLinks(View view) {
		ConstraintPin modelElement = (ConstraintPin) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getValueObject_3002OutgoingLinks(View view) {
		ValueObject modelElement = (ValueObject) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getEntity_3003OutgoingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainObject_3004OutgoingLinks(View view) {
		DomainObject modelElement = (DomainObject) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getCommandAction_3005OutgoingLinks(View view) {
		CommandAction modelElement = (CommandAction) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getAggregate_3006OutgoingLinks(View view) {
		Aggregate modelElement = (Aggregate) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getQueryAction_3007OutgoingLinks(View view) {
		QueryAction modelElement = (QueryAction) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getValueObject_3008OutgoingLinks(View view) {
		ValueObject modelElement = (ValueObject) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getEntity_3009OutgoingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getExternalSystem_3010OutgoingLinks(View view) {
		ExternalSystem modelElement = (ExternalSystem) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getConstraintPin_3011OutgoingLinks(View view) {
		ConstraintPin modelElement = (ConstraintPin) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getInitialNode_3012OutgoingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getForkNode_3013OutgoingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getJoinNode_3014OutgoingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDecisionNode_3015OutgoingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getMergeNode_3016OutgoingLinks(View view) {
		MergeNode modelElement = (MergeNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getFinalNode_3017OutgoingLinks(View view) {
		FinalNode modelElement = (FinalNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainObject_3018OutgoingLinks(View view) {
		DomainObject modelElement = (DomainObject) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getReadModel_3019OutgoingLinks(View view) {
		ReadModel modelElement = (ReadModel) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getDomainEvent_3020OutgoingLinks(View view) {
		DomainEvent modelElement = (DomainEvent) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlNode_3021OutgoingLinks(View view) {
		ControlNode modelElement = (ControlNode) view.getElement();
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getObjectFlow_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getObjectFlow_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlFlow_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getControlFlow_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityEdge_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitystormingLinkDescriptor> getActivityEdge_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getContainedTypeModelFacetLinks_ObjectFlow_4001(
			ActivityDiagram container) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow) linkObject;
			if (ObjectFlowEditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, dst, link, ActivitystormingElementTypes.ObjectFlow_4001,
					ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getContainedTypeModelFacetLinks_ObjectFlow_4002(
			ActivityPartition container) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow) linkObject;
			if (ObjectFlow2EditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, dst, link, ActivitystormingElementTypes.ObjectFlow_4002,
					ObjectFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getContainedTypeModelFacetLinks_ControlFlow_4003(
			ActivityDiagram container) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow) linkObject;
			if (ControlFlowEditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, dst, link, ActivitystormingElementTypes.ControlFlow_4003,
					ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getContainedTypeModelFacetLinks_ControlFlow_4004(
			ActivityPartition container) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow) linkObject;
			if (ControlFlow2EditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, dst, link, ActivitystormingElementTypes.ControlFlow_4004,
					ControlFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getContainedTypeModelFacetLinks_ActivityEdge_4005(
			ActivityDiagram container) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, dst, link,
					ActivitystormingElementTypes.ActivityEdge_4005, ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getContainedTypeModelFacetLinks_ActivityEdge_4006(
			ActivityPartition container) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdge2EditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, dst, link,
					ActivitystormingElementTypes.ActivityEdge_4006, ActivityEdge2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingTypeModelFacetLinks_ObjectFlow_4001(
			ActivityNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitystormingPackage.eINSTANCE.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow) setting.getEObject();
			if (ObjectFlowEditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, target, link,
					ActivitystormingElementTypes.ObjectFlow_4001, ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingTypeModelFacetLinks_ObjectFlow_4002(
			ActivityNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitystormingPackage.eINSTANCE.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow) setting.getEObject();
			if (ObjectFlow2EditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, target, link,
					ActivitystormingElementTypes.ObjectFlow_4002, ObjectFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingTypeModelFacetLinks_ControlFlow_4003(
			ActivityNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitystormingPackage.eINSTANCE.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow) setting.getEObject();
			if (ControlFlowEditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, target, link,
					ActivitystormingElementTypes.ControlFlow_4003, ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingTypeModelFacetLinks_ControlFlow_4004(
			ActivityNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitystormingPackage.eINSTANCE.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow) setting.getEObject();
			if (ControlFlow2EditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, target, link,
					ActivitystormingElementTypes.ControlFlow_4004, ControlFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityEdge_4005(
			ActivityNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitystormingPackage.eINSTANCE.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) setting.getEObject();
			if (ActivityEdgeEditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, target, link,
					ActivitystormingElementTypes.ActivityEdge_4005, ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityEdge_4006(
			ActivityNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitystormingPackage.eINSTANCE.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) setting.getEObject();
			if (ActivityEdge2EditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new ActivitystormingLinkDescriptor(src, target, link,
					ActivitystormingElementTypes.ActivityEdge_4006, ActivityEdge2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingFeatureModelFacetLinks_Action_Supplier_4007(
			Supplier target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivitystormingPackage.eINSTANCE.getAction_Supplier()) {
				result.add(new ActivitystormingLinkDescriptor(setting.getEObject(), target,
						ActivitystormingElementTypes.ActionSupplier_4007, ActionSupplierEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingFeatureModelFacetLinks_Supplier_Triggers_4008(
			DomainEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivitystormingPackage.eINSTANCE.getSupplier_Triggers()) {
				result.add(new ActivitystormingLinkDescriptor(setting.getEObject(), target,
						ActivitystormingElementTypes.SupplierTriggers_4008, SupplierTriggersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingFeatureModelFacetLinks_Supplier_Readmodels_4009(
			ReadModel target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivitystormingPackage.eINSTANCE.getSupplier_Readmodels()) {
				result.add(new ActivitystormingLinkDescriptor(setting.getEObject(), target,
						ActivitystormingElementTypes.SupplierReadmodels_4009, SupplierReadmodelsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingFeatureModelFacetLinks_DomainEvent_Readmodel_4010(
			ReadModel target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivitystormingPackage.eINSTANCE.getDomainEvent_Readmodel()) {
				result.add(new ActivitystormingLinkDescriptor(setting.getEObject(), target,
						ActivitystormingElementTypes.DomainEventReadmodel_4010,
						DomainEventReadmodelEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitystormingLinkDescriptor> getIncomingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(
			DomainEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivitystormingPackage.eINSTANCE.getConstraintPin_Triggers()) {
				result.add(new ActivitystormingLinkDescriptor(setting.getEObject(), target,
						ActivitystormingElementTypes.ConstraintPinTriggers_4011,
						ConstraintPinTriggersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ObjectFlow_4001(
			ActivityNode source) {
		ActivityDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityDiagram) {
				container = (ActivityDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow) linkObject;
			if (ObjectFlowEditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivitystormingLinkDescriptor(src, dst, link, ActivitystormingElementTypes.ObjectFlow_4001,
					ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ObjectFlow_4002(
			ActivityNode source) {
		ActivityPartition container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityPartition) {
				container = (ActivityPartition) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow) linkObject;
			if (ObjectFlow2EditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivitystormingLinkDescriptor(src, dst, link, ActivitystormingElementTypes.ObjectFlow_4002,
					ObjectFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ControlFlow_4003(
			ActivityNode source) {
		ActivityDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityDiagram) {
				container = (ActivityDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow) linkObject;
			if (ControlFlowEditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivitystormingLinkDescriptor(src, dst, link, ActivitystormingElementTypes.ControlFlow_4003,
					ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ControlFlow_4004(
			ActivityNode source) {
		ActivityPartition container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityPartition) {
				container = (ActivityPartition) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow) linkObject;
			if (ControlFlow2EditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivitystormingLinkDescriptor(src, dst, link, ActivitystormingElementTypes.ControlFlow_4004,
					ControlFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityEdge_4005(
			ActivityNode source) {
		ActivityDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityDiagram) {
				container = (ActivityDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdgeEditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivitystormingLinkDescriptor(src, dst, link,
					ActivitystormingElementTypes.ActivityEdge_4005, ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityEdge_4006(
			ActivityNode source) {
		ActivityPartition container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityPartition) {
				container = (ActivityPartition) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityEdge) {
				continue;
			}
			ActivityEdge link = (ActivityEdge) linkObject;
			if (ActivityEdge2EditPart.VISUAL_ID != ActivitystormingVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivitystormingLinkDescriptor(src, dst, link,
					ActivitystormingElementTypes.ActivityEdge_4006, ActivityEdge2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_Action_Supplier_4007(
			Action source) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		Supplier destination = source.getSupplier();
		if (destination == null) {
			return result;
		}
		result.add(new ActivitystormingLinkDescriptor(source, destination,
				ActivitystormingElementTypes.ActionSupplier_4007, ActionSupplierEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4008(
			Supplier source) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriggers().iterator(); destinations.hasNext();) {
			DomainEvent destination = (DomainEvent) destinations.next();
			result.add(new ActivitystormingLinkDescriptor(source, destination,
					ActivitystormingElementTypes.SupplierTriggers_4008, SupplierTriggersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4009(
			Supplier source) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> destinations = source.getReadmodels().iterator(); destinations.hasNext();) {
			ReadModel destination = (ReadModel) destinations.next();
			result.add(new ActivitystormingLinkDescriptor(source, destination,
					ActivitystormingElementTypes.SupplierReadmodels_4009, SupplierReadmodelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4010(
			DomainEvent source) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		ReadModel destination = source.getReadmodel();
		if (destination == null) {
			return result;
		}
		result.add(new ActivitystormingLinkDescriptor(source, destination,
				ActivitystormingElementTypes.DomainEventReadmodel_4010, DomainEventReadmodelEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitystormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4011(
			ConstraintPin source) {
		LinkedList<ActivitystormingLinkDescriptor> result = new LinkedList<ActivitystormingLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriggers().iterator(); destinations.hasNext();) {
			DomainEvent destination = (DomainEvent) destinations.next();
			result.add(new ActivitystormingLinkDescriptor(source, destination,
					ActivitystormingElementTypes.ConstraintPinTriggers_4011, ConstraintPinTriggersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ActivitystormingNodeDescriptor> getSemanticChildren(View view) {
			return ActivitystormingDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ActivitystormingLinkDescriptor> getContainedLinks(View view) {
			return ActivitystormingDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ActivitystormingLinkDescriptor> getIncomingLinks(View view) {
			return ActivitystormingDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ActivitystormingLinkDescriptor> getOutgoingLinks(View view) {
			return ActivitystormingDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
