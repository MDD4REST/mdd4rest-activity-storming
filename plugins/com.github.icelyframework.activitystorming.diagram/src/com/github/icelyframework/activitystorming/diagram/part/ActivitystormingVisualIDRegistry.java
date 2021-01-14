/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import com.github.icelyframework.activitystorming.ActivityDiagram;
import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActionSupplierEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityDiagramEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdge2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdgeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityPartitionEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityPartitionNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActorEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActorNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Aggregate2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandAction2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandActionEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandActionName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandActionNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPin2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPin3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinName3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinTriggersEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlFlow2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlFlowEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ControlNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNode2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNodeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNodeName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNodeNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEvent2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEventEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEventName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEventNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEventReadmodelEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObject2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObject3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObjectEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObjectName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObjectName3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObjectNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Entity2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Entity3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.EntityEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.EntityName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.EntityName3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.EntityNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ExternalSystem2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ExternalSystemEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ExternalSystemName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ExternalSystemNameEditPart;
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
import com.github.icelyframework.activitystorming.diagram.edit.parts.QueryActionName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.QueryActionNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModel2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModelEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModelName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModelNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SupplierReadmodelsEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SupplierTriggersEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SystemEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SystemNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectName3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.WrappingLabel2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.WrappingLabel3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.WrappingLabel4EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.WrappingLabel5EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ActivitystormingVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "com.github.icelyframework.activitystorming.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ActivityDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ActivityDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ActivitystormingDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ActivitystormingPackage.eINSTANCE.getActivityDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ActivityDiagram) domainElement)) {
			return ActivityDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"activitystorming".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ActivityDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActivityDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ActivityDiagramEditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getCommandAction().isSuperTypeOf(domainElement.eClass())) {
				return CommandActionEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getAggregate().isSuperTypeOf(domainElement.eClass())) {
				return AggregateEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getQueryAction().isSuperTypeOf(domainElement.eClass())) {
				return QueryActionEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getValueObject().isSuperTypeOf(domainElement.eClass())) {
				return ValueObjectEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getExternalSystem().isSuperTypeOf(domainElement.eClass())) {
				return ExternalSystemEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getConstraintPin().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintPinEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass())) {
				return InitialNodeEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass())) {
				return ForkNodeEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass())) {
				return JoinNodeEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass())) {
				return DecisionNodeEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass())) {
				return MergeNodeEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getFinalNode().isSuperTypeOf(domainElement.eClass())) {
				return FinalNodeEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainObject().isSuperTypeOf(domainElement.eClass())) {
				return DomainObjectEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getReadModel().isSuperTypeOf(domainElement.eClass())) {
				return ReadModelEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainEvent().isSuperTypeOf(domainElement.eClass())) {
				return DomainEventEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getControlNode().isSuperTypeOf(domainElement.eClass())) {
				return ControlNodeEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getSystem().isSuperTypeOf(domainElement.eClass())) {
				return SystemEditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(domainElement.eClass())) {
				return ActivityPartitionEditPart.VISUAL_ID;
			}
			break;
		case AggregateEditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getConstraintPin().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintPin2EditPart.VISUAL_ID;
			}
			break;
		case ExternalSystemEditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getConstraintPin().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintPin2EditPart.VISUAL_ID;
			}
			break;
		case Aggregate2EditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getConstraintPin().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintPin2EditPart.VISUAL_ID;
			}
			break;
		case ExternalSystem2EditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getConstraintPin().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintPin2EditPart.VISUAL_ID;
			}
			break;
		case AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getValueObject().isSuperTypeOf(domainElement.eClass())) {
				return ValueObject2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return Entity2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainObject().isSuperTypeOf(domainElement.eClass())) {
				return DomainObject2EditPart.VISUAL_ID;
			}
			break;
		case ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getCommandAction().isSuperTypeOf(domainElement.eClass())) {
				return CommandAction2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getAggregate().isSuperTypeOf(domainElement.eClass())) {
				return Aggregate2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getQueryAction().isSuperTypeOf(domainElement.eClass())) {
				return QueryAction2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getValueObject().isSuperTypeOf(domainElement.eClass())) {
				return ValueObject3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return Entity3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getExternalSystem().isSuperTypeOf(domainElement.eClass())) {
				return ExternalSystem2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getConstraintPin().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintPin3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass())) {
				return InitialNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass())) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass())) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass())) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass())) {
				return MergeNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getFinalNode().isSuperTypeOf(domainElement.eClass())) {
				return FinalNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainObject().isSuperTypeOf(domainElement.eClass())) {
				return DomainObject3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getReadModel().isSuperTypeOf(domainElement.eClass())) {
				return ReadModel2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainEvent().isSuperTypeOf(domainElement.eClass())) {
				return DomainEvent2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getControlNode().isSuperTypeOf(domainElement.eClass())) {
				return ControlNode2EditPart.VISUAL_ID;
			}
			break;
		case AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getValueObject().isSuperTypeOf(domainElement.eClass())) {
				return ValueObject2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return Entity2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainObject().isSuperTypeOf(domainElement.eClass())) {
				return DomainObject2EditPart.VISUAL_ID;
			}
			break;
		case SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getCommandAction().isSuperTypeOf(domainElement.eClass())) {
				return CommandAction2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getAggregate().isSuperTypeOf(domainElement.eClass())) {
				return Aggregate2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getQueryAction().isSuperTypeOf(domainElement.eClass())) {
				return QueryAction2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getValueObject().isSuperTypeOf(domainElement.eClass())) {
				return ValueObject3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return Entity3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getExternalSystem().isSuperTypeOf(domainElement.eClass())) {
				return ExternalSystem2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getConstraintPin().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintPin3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass())) {
				return InitialNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass())) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass())) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass())) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass())) {
				return MergeNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getFinalNode().isSuperTypeOf(domainElement.eClass())) {
				return FinalNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainObject().isSuperTypeOf(domainElement.eClass())) {
				return DomainObject3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getReadModel().isSuperTypeOf(domainElement.eClass())) {
				return ReadModel2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainEvent().isSuperTypeOf(domainElement.eClass())) {
				return DomainEvent2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getControlNode().isSuperTypeOf(domainElement.eClass())) {
				return ControlNode2EditPart.VISUAL_ID;
			}
			break;
		case ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
			if (ActivitystormingPackage.eINSTANCE.getCommandAction().isSuperTypeOf(domainElement.eClass())) {
				return CommandAction2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getAggregate().isSuperTypeOf(domainElement.eClass())) {
				return Aggregate2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getQueryAction().isSuperTypeOf(domainElement.eClass())) {
				return QueryAction2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getValueObject().isSuperTypeOf(domainElement.eClass())) {
				return ValueObject3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return Entity3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getExternalSystem().isSuperTypeOf(domainElement.eClass())) {
				return ExternalSystem2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getConstraintPin().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintPin3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass())) {
				return InitialNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass())) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass())) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass())) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass())) {
				return MergeNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getFinalNode().isSuperTypeOf(domainElement.eClass())) {
				return FinalNode2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainObject().isSuperTypeOf(domainElement.eClass())) {
				return DomainObject3EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getReadModel().isSuperTypeOf(domainElement.eClass())) {
				return ReadModel2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getDomainEvent().isSuperTypeOf(domainElement.eClass())) {
				return DomainEvent2EditPart.VISUAL_ID;
			}
			if (ActivitystormingPackage.eINSTANCE.getControlNode().isSuperTypeOf(domainElement.eClass())) {
				return ControlNode2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"activitystorming".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ActivityDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActivityDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ActivityDiagramEditPart.VISUAL_ID:
			if (CommandActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QueryActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintPinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReadModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityPartitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommandActionEditPart.VISUAL_ID:
			if (CommandActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregateEditPart.VISUAL_ID:
			if (AggregateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QueryActionEditPart.VISUAL_ID:
			if (QueryActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueObjectEditPart.VISUAL_ID:
			if (ValueObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalSystemEditPart.VISUAL_ID:
			if (ExternalSystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintPinEditPart.VISUAL_ID:
			if (ConstraintPinNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DecisionNodeEditPart.VISUAL_ID:
			if (DecisionNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainObjectEditPart.VISUAL_ID:
			if (DomainObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReadModelEditPart.VISUAL_ID:
			if (ReadModelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainEventEditPart.VISUAL_ID:
			if (DomainEventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorActorActivitynodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemEditPart.VISUAL_ID:
			if (SystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityPartitionEditPart.VISUAL_ID:
			if (ActivityPartitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintPin2EditPart.VISUAL_ID:
			if (ConstraintPinName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueObject2EditPart.VISUAL_ID:
			if (ValueObjectName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Entity2EditPart.VISUAL_ID:
			if (EntityName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainObject2EditPart.VISUAL_ID:
			if (DomainObjectName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommandAction2EditPart.VISUAL_ID:
			if (CommandActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Aggregate2EditPart.VISUAL_ID:
			if (AggregateName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QueryAction2EditPart.VISUAL_ID:
			if (QueryActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueObject3EditPart.VISUAL_ID:
			if (ValueObjectName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Entity3EditPart.VISUAL_ID:
			if (EntityName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalSystem2EditPart.VISUAL_ID:
			if (ExternalSystemName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintPin3EditPart.VISUAL_ID:
			if (ConstraintPinName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DecisionNode2EditPart.VISUAL_ID:
			if (DecisionNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainObject3EditPart.VISUAL_ID:
			if (DomainObjectName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReadModel2EditPart.VISUAL_ID:
			if (ReadModelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainEvent2EditPart.VISUAL_ID:
			if (DomainEventName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
			if (ValueObject2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Entity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainObject2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
			if (CommandAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QueryAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Entity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalSystem2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReadModel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainEvent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
			if (ValueObject2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Entity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainObject2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
			if (CommandAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QueryAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Entity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalSystem2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReadModel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainEvent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
			if (CommandAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QueryAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Entity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalSystem2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReadModel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainEvent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionSupplierEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SupplierTriggersEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SupplierReadmodelsEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainEventReadmodelEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintPinTriggersEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ActivitystormingPackage.eINSTANCE.getObjectFlow().isSuperTypeOf(domainElement.eClass())) {
			return ObjectFlowEditPart.VISUAL_ID;
		}
		if (ActivitystormingPackage.eINSTANCE.getObjectFlow().isSuperTypeOf(domainElement.eClass())) {
			return ObjectFlow2EditPart.VISUAL_ID;
		}
		if (ActivitystormingPackage.eINSTANCE.getControlFlow().isSuperTypeOf(domainElement.eClass())) {
			return ControlFlowEditPart.VISUAL_ID;
		}
		if (ActivitystormingPackage.eINSTANCE.getControlFlow().isSuperTypeOf(domainElement.eClass())) {
			return ControlFlow2EditPart.VISUAL_ID;
		}
		if (ActivitystormingPackage.eINSTANCE.getActivityEdge().isSuperTypeOf(domainElement.eClass())) {
			return ActivityEdgeEditPart.VISUAL_ID;
		}
		if (ActivitystormingPackage.eINSTANCE.getActivityEdge().isSuperTypeOf(domainElement.eClass())) {
			return ActivityEdge2EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ActivityDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
		case ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
		case AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
		case SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
		case ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return false;
		case CommandActionEditPart.VISUAL_ID:
		case QueryActionEditPart.VISUAL_ID:
		case ValueObjectEditPart.VISUAL_ID:
		case EntityEditPart.VISUAL_ID:
		case ConstraintPinEditPart.VISUAL_ID:
		case InitialNodeEditPart.VISUAL_ID:
		case ForkNodeEditPart.VISUAL_ID:
		case JoinNodeEditPart.VISUAL_ID:
		case DecisionNodeEditPart.VISUAL_ID:
		case MergeNodeEditPart.VISUAL_ID:
		case FinalNodeEditPart.VISUAL_ID:
		case DomainObjectEditPart.VISUAL_ID:
		case ReadModelEditPart.VISUAL_ID:
		case DomainEventEditPart.VISUAL_ID:
		case ControlNodeEditPart.VISUAL_ID:
		case ConstraintPin2EditPart.VISUAL_ID:
		case ValueObject2EditPart.VISUAL_ID:
		case Entity2EditPart.VISUAL_ID:
		case DomainObject2EditPart.VISUAL_ID:
		case CommandAction2EditPart.VISUAL_ID:
		case QueryAction2EditPart.VISUAL_ID:
		case ValueObject3EditPart.VISUAL_ID:
		case Entity3EditPart.VISUAL_ID:
		case ConstraintPin3EditPart.VISUAL_ID:
		case InitialNode2EditPart.VISUAL_ID:
		case ForkNode2EditPart.VISUAL_ID:
		case JoinNode2EditPart.VISUAL_ID:
		case DecisionNode2EditPart.VISUAL_ID:
		case MergeNode2EditPart.VISUAL_ID:
		case FinalNode2EditPart.VISUAL_ID:
		case DomainObject3EditPart.VISUAL_ID:
		case ReadModel2EditPart.VISUAL_ID:
		case DomainEvent2EditPart.VISUAL_ID:
		case ControlNode2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
					.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
					.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
