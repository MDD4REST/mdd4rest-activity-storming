/*
* 
*/
package ActivityStorming.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ActivityStormingVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "activity-storming.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view.getType());
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
				ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
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
		if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityDiagram()
				.isSuperTypeOf(domainElement.eClass()) && isDiagram((ActivityStorming.ActivityDiagram) domainElement)) {
			return ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID;
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
		String containerModelID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"ActivityStorming".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getCommandAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getAggregate()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getQueryAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getValueObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getExternalSystem()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getInitialNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getForkNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getJoinNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDecisionNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getMergeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getReadModel()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainEvent()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getSystem().isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityPartition()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID;
			}
			break;
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID;
			}
			break;
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID;
			}
			break;
		case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getValueObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getCommandAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getAggregate()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getQueryAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getValueObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getExternalSystem()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getInitialNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getForkNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getJoinNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDecisionNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getMergeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getReadModel()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainEvent()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID;
			}
			break;
		case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getValueObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID;
			}
			break;
		case ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getCommandAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getAggregate()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getQueryAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getValueObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getExternalSystem()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getInitialNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getForkNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getJoinNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDecisionNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getMergeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getReadModel()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainEvent()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getCommandAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getAggregate()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getQueryAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getValueObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getExternalSystem()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getInitialNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getForkNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getJoinNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDecisionNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getMergeNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getFinalNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getReadModel()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainEvent()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID;
			}
			if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
				.getModelID(containerView);
		if (!ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"ActivityStorming".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.CommandActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.AggregateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.QueryActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ValueObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ExternalSystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ConstraintPinNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.DecisionNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.DomainObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ReadModelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.DomainEventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.SystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ActivityPartitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ConstraintPinName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ValueObjectName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.EntityName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.DomainObjectName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.CommandActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.AggregateName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.QueryActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ValueObjectName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.EntityName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ExternalSystemName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ConstraintPinName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.DecisionNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.DomainObjectName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ReadModelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.DomainEventName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID:
			if (ActivityStorming.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
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
		if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectFlow().isSuperTypeOf(domainElement.eClass())) {
			return ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID;
		}
		if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectFlow().isSuperTypeOf(domainElement.eClass())) {
			return ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID;
		}
		if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlFlow().isSuperTypeOf(domainElement.eClass())) {
			return ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID;
		}
		if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlFlow().isSuperTypeOf(domainElement.eClass())) {
			return ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID;
		}
		if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityEdge()
				.isSuperTypeOf(domainElement.eClass())) {
			return ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID;
		}
		if (ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityEdge()
				.isSuperTypeOf(domainElement.eClass())) {
			return ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ActivityStorming.ActivityDiagram element) {
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
		case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
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
		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID:
			return false;
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID:
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
			return ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
