/*
* 
*/
package ActivityStorming.diagram.part;

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

/**
 * @generated
 */
public class ActivityStormingDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getSemanticChildren(View view) {
		switch (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view)) {
		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID:
			return getActivityDiagram_1000SemanticChildren(view);
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getAggregate_2052SemanticChildren(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2056SemanticChildren(view);
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3031SemanticChildren(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3035SemanticChildren(view);
		case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID:
			return getAggregateAggregateDomainobjectCompartment_7007SemanticChildren(view);
		case ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID:
			return getActorActorActivitynodeCompartment_7008SemanticChildren(view);
		case ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID:
			return getAggregateAggregateDomainobjectCompartment_7009SemanticChildren(view);
		case ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID:
			return getSystemSystemActivitynodeCompartment_7010SemanticChildren(view);
		case ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID:
			return getActivityPartitionActivityPartitionActivitynodeCompartment_7011SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getActivityDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.ActivityDiagram modelElement = (ActivityStorming.ActivityDiagram) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivitynode().iterator(); it.hasNext();) {
			ActivityStorming.ActivityNode childElement = (ActivityStorming.ActivityNode) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActivitypartition().iterator(); it.hasNext();) {
			ActivityStorming.ActivityPartition childElement = (ActivityStorming.ActivityPartition) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getAggregate_2052SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			ActivityStorming.ConstraintPin childElement = (ActivityStorming.ConstraintPin) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getExternalSystem_2056SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.ExternalSystem modelElement = (ActivityStorming.ExternalSystem) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			ActivityStorming.ConstraintPin childElement = (ActivityStorming.ConstraintPin) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getAggregate_3031SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			ActivityStorming.ConstraintPin childElement = (ActivityStorming.ConstraintPin) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getExternalSystem_3035SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.ExternalSystem modelElement = (ActivityStorming.ExternalSystem) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it.hasNext();) {
			ActivityStorming.ConstraintPin childElement = (ActivityStorming.ConstraintPin) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getAggregateAggregateDomainobjectCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) containerView.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDomainobject().iterator(); it.hasNext();) {
			ActivityStorming.DomainObject childElement = (ActivityStorming.DomainObject) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getActorActorActivitynodeCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.Actor modelElement = (ActivityStorming.Actor) containerView.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivitynode().iterator(); it.hasNext();) {
			ActivityStorming.ActivityNode childElement = (ActivityStorming.ActivityNode) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getAggregateAggregateDomainobjectCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) containerView.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDomainobject().iterator(); it.hasNext();) {
			ActivityStorming.DomainObject childElement = (ActivityStorming.DomainObject) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getSystemSystemActivitynodeCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.System modelElement = (ActivityStorming.System) containerView.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivitynode().iterator(); it.hasNext();) {
			ActivityStorming.ActivityNode childElement = (ActivityStorming.ActivityNode) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getActivityPartitionActivityPartitionActivitynodeCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityStorming.ActivityPartition modelElement = (ActivityStorming.ActivityPartition) containerView
				.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivitynode().iterator(); it.hasNext();) {
			ActivityStorming.ActivityNode childElement = (ActivityStorming.ActivityNode) it.next();
			int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getContainedLinks(View view) {
		switch (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view)) {
		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID:
			return getActivityDiagram_1000ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
			return getCommandAction_2051ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getAggregate_2052ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
			return getQueryAction_2053ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
			return getValueObject_2054ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2055ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2056ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID:
			return getConstraintPin_2057ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2058ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2059ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2060ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2061ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2062ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2063ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID:
			return getDomainObject_2064ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID:
			return getReadModel_2065ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID:
			return getDomainEvent_2066ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID:
			return getControlNode_2067ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2068ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_2069ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2070ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID:
			return getConstraintPin_3026ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID:
			return getValueObject_3027ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID:
			return getEntity_3028ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID:
			return getDomainObject_3029ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID:
			return getCommandAction_3030ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3031ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID:
			return getQueryAction_3032ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID:
			return getValueObject_3033ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID:
			return getEntity_3034ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3035ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID:
			return getConstraintPin_3036ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3037ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3038ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3039ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3040ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3041ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3042ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID:
			return getDomainObject_3043ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID:
			return getReadModel_3044ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID:
			return getDomainEvent_3045ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID:
			return getControlNode_3046ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4021ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID:
			return getObjectFlow_4022ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4023ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID:
			return getControlFlow_4024ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4025ContainedLinks(view);
		case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID:
			return getActivityEdge_4026ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingLinks(View view) {
		switch (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view)) {
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
			return getCommandAction_2051IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getAggregate_2052IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
			return getQueryAction_2053IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
			return getValueObject_2054IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2055IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2056IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID:
			return getConstraintPin_2057IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2058IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2059IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2060IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2061IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2062IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2063IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID:
			return getDomainObject_2064IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID:
			return getReadModel_2065IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID:
			return getDomainEvent_2066IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID:
			return getControlNode_2067IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2068IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_2069IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2070IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID:
			return getConstraintPin_3026IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID:
			return getValueObject_3027IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID:
			return getEntity_3028IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID:
			return getDomainObject_3029IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID:
			return getCommandAction_3030IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3031IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID:
			return getQueryAction_3032IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID:
			return getValueObject_3033IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID:
			return getEntity_3034IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3035IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID:
			return getConstraintPin_3036IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3037IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3038IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3039IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3040IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3041IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3042IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID:
			return getDomainObject_3043IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID:
			return getReadModel_3044IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID:
			return getDomainEvent_3045IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID:
			return getControlNode_3046IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4021IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID:
			return getObjectFlow_4022IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4023IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID:
			return getControlFlow_4024IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4025IncomingLinks(view);
		case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID:
			return getActivityEdge_4026IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingLinks(View view) {
		switch (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view)) {
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
			return getCommandAction_2051OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getAggregate_2052OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
			return getQueryAction_2053OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
			return getValueObject_2054OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2055OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2056OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID:
			return getConstraintPin_2057OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2058OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2059OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2060OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2061OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2062OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2063OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID:
			return getDomainObject_2064OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID:
			return getReadModel_2065OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID:
			return getDomainEvent_2066OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID:
			return getControlNode_2067OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2068OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_2069OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2070OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID:
			return getConstraintPin_3026OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID:
			return getValueObject_3027OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID:
			return getEntity_3028OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID:
			return getDomainObject_3029OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID:
			return getCommandAction_3030OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3031OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID:
			return getQueryAction_3032OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID:
			return getValueObject_3033OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID:
			return getEntity_3034OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3035OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID:
			return getConstraintPin_3036OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3037OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3038OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3039OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3040OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3041OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3042OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID:
			return getDomainObject_3043OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID:
			return getReadModel_3044OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID:
			return getDomainEvent_3045OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID:
			return getControlNode_3046OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4021OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID:
			return getObjectFlow_4022OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4023OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID:
			return getControlFlow_4024OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4025OutgoingLinks(view);
		case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID:
			return getActivityEdge_4026OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityDiagram_1000ContainedLinks(
			View view) {
		ActivityStorming.ActivityDiagram modelElement = (ActivityStorming.ActivityDiagram) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getCommandAction_2051ContainedLinks(
			View view) {
		ActivityStorming.CommandAction modelElement = (ActivityStorming.CommandAction) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getAggregate_2052ContainedLinks(
			View view) {
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getQueryAction_2053ContainedLinks(
			View view) {
		ActivityStorming.QueryAction modelElement = (ActivityStorming.QueryAction) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getValueObject_2054ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getEntity_2055ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getExternalSystem_2056ContainedLinks(
			View view) {
		ActivityStorming.ExternalSystem modelElement = (ActivityStorming.ExternalSystem) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getConstraintPin_2057ContainedLinks(
			View view) {
		ActivityStorming.ConstraintPin modelElement = (ActivityStorming.ConstraintPin) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getInitialNode_2058ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getForkNode_2059ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getJoinNode_2060ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDecisionNode_2061ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getMergeNode_2062ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getFinalNode_2063ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainObject_2064ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getReadModel_2065ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainEvent_2066ContainedLinks(
			View view) {
		ActivityStorming.DomainEvent modelElement = (ActivityStorming.DomainEvent) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlNode_2067ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActor_2068ContainedLinks(
			View view) {
		ActivityStorming.Actor modelElement = (ActivityStorming.Actor) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getSystem_2069ContainedLinks(
			View view) {
		ActivityStorming.System modelElement = (ActivityStorming.System) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityPartition_2070ContainedLinks(
			View view) {
		ActivityStorming.ActivityPartition modelElement = (ActivityStorming.ActivityPartition) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getConstraintPin_3026ContainedLinks(
			View view) {
		ActivityStorming.ConstraintPin modelElement = (ActivityStorming.ConstraintPin) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getValueObject_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getEntity_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainObject_3029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getCommandAction_3030ContainedLinks(
			View view) {
		ActivityStorming.CommandAction modelElement = (ActivityStorming.CommandAction) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getAggregate_3031ContainedLinks(
			View view) {
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getQueryAction_3032ContainedLinks(
			View view) {
		ActivityStorming.QueryAction modelElement = (ActivityStorming.QueryAction) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getValueObject_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getEntity_3034ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getExternalSystem_3035ContainedLinks(
			View view) {
		ActivityStorming.ExternalSystem modelElement = (ActivityStorming.ExternalSystem) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getConstraintPin_3036ContainedLinks(
			View view) {
		ActivityStorming.ConstraintPin modelElement = (ActivityStorming.ConstraintPin) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getInitialNode_3037ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getForkNode_3038ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getJoinNode_3039ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDecisionNode_3040ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getMergeNode_3041ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getFinalNode_3042ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainObject_3043ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getReadModel_3044ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainEvent_3045ContainedLinks(
			View view) {
		ActivityStorming.DomainEvent modelElement = (ActivityStorming.DomainEvent) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlNode_3046ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getObjectFlow_4021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getObjectFlow_4022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlFlow_4023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlFlow_4024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityEdge_4025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityEdge_4026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getCommandAction_2051IncomingLinks(
			View view) {
		ActivityStorming.CommandAction modelElement = (ActivityStorming.CommandAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getAggregate_2052IncomingLinks(
			View view) {
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Supplier_4027(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getQueryAction_2053IncomingLinks(
			View view) {
		ActivityStorming.QueryAction modelElement = (ActivityStorming.QueryAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getValueObject_2054IncomingLinks(
			View view) {
		ActivityStorming.ValueObject modelElement = (ActivityStorming.ValueObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getEntity_2055IncomingLinks(
			View view) {
		ActivityStorming.Entity modelElement = (ActivityStorming.Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getExternalSystem_2056IncomingLinks(
			View view) {
		ActivityStorming.ExternalSystem modelElement = (ActivityStorming.ExternalSystem) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Supplier_4027(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getConstraintPin_2057IncomingLinks(
			View view) {
		ActivityStorming.ConstraintPin modelElement = (ActivityStorming.ConstraintPin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getInitialNode_2058IncomingLinks(
			View view) {
		ActivityStorming.InitialNode modelElement = (ActivityStorming.InitialNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getForkNode_2059IncomingLinks(
			View view) {
		ActivityStorming.ForkNode modelElement = (ActivityStorming.ForkNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getJoinNode_2060IncomingLinks(
			View view) {
		ActivityStorming.JoinNode modelElement = (ActivityStorming.JoinNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDecisionNode_2061IncomingLinks(
			View view) {
		ActivityStorming.DecisionNode modelElement = (ActivityStorming.DecisionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getMergeNode_2062IncomingLinks(
			View view) {
		ActivityStorming.MergeNode modelElement = (ActivityStorming.MergeNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getFinalNode_2063IncomingLinks(
			View view) {
		ActivityStorming.FinalNode modelElement = (ActivityStorming.FinalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainObject_2064IncomingLinks(
			View view) {
		ActivityStorming.DomainObject modelElement = (ActivityStorming.DomainObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getReadModel_2065IncomingLinks(
			View view) {
		ActivityStorming.ReadModel modelElement = (ActivityStorming.ReadModel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_DomainEvent_Readmodel_4030(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainEvent_2066IncomingLinks(
			View view) {
		ActivityStorming.DomainEvent modelElement = (ActivityStorming.DomainEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlNode_2067IncomingLinks(
			View view) {
		ActivityStorming.ControlNode modelElement = (ActivityStorming.ControlNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActor_2068IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getSystem_2069IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityPartition_2070IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getConstraintPin_3026IncomingLinks(
			View view) {
		ActivityStorming.ConstraintPin modelElement = (ActivityStorming.ConstraintPin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getValueObject_3027IncomingLinks(
			View view) {
		ActivityStorming.ValueObject modelElement = (ActivityStorming.ValueObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getEntity_3028IncomingLinks(
			View view) {
		ActivityStorming.Entity modelElement = (ActivityStorming.Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainObject_3029IncomingLinks(
			View view) {
		ActivityStorming.DomainObject modelElement = (ActivityStorming.DomainObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getCommandAction_3030IncomingLinks(
			View view) {
		ActivityStorming.CommandAction modelElement = (ActivityStorming.CommandAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getAggregate_3031IncomingLinks(
			View view) {
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Supplier_4027(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getQueryAction_3032IncomingLinks(
			View view) {
		ActivityStorming.QueryAction modelElement = (ActivityStorming.QueryAction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getValueObject_3033IncomingLinks(
			View view) {
		ActivityStorming.ValueObject modelElement = (ActivityStorming.ValueObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getEntity_3034IncomingLinks(
			View view) {
		ActivityStorming.Entity modelElement = (ActivityStorming.Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getExternalSystem_3035IncomingLinks(
			View view) {
		ActivityStorming.ExternalSystem modelElement = (ActivityStorming.ExternalSystem) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Action_Supplier_4027(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getConstraintPin_3036IncomingLinks(
			View view) {
		ActivityStorming.ConstraintPin modelElement = (ActivityStorming.ConstraintPin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getInitialNode_3037IncomingLinks(
			View view) {
		ActivityStorming.InitialNode modelElement = (ActivityStorming.InitialNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getForkNode_3038IncomingLinks(
			View view) {
		ActivityStorming.ForkNode modelElement = (ActivityStorming.ForkNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getJoinNode_3039IncomingLinks(
			View view) {
		ActivityStorming.JoinNode modelElement = (ActivityStorming.JoinNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDecisionNode_3040IncomingLinks(
			View view) {
		ActivityStorming.DecisionNode modelElement = (ActivityStorming.DecisionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getMergeNode_3041IncomingLinks(
			View view) {
		ActivityStorming.MergeNode modelElement = (ActivityStorming.MergeNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getFinalNode_3042IncomingLinks(
			View view) {
		ActivityStorming.FinalNode modelElement = (ActivityStorming.FinalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainObject_3043IncomingLinks(
			View view) {
		ActivityStorming.DomainObject modelElement = (ActivityStorming.DomainObject) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getReadModel_3044IncomingLinks(
			View view) {
		ActivityStorming.ReadModel modelElement = (ActivityStorming.ReadModel) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_DomainEvent_Readmodel_4030(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainEvent_3045IncomingLinks(
			View view) {
		ActivityStorming.DomainEvent modelElement = (ActivityStorming.DomainEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlNode_3046IncomingLinks(
			View view) {
		ActivityStorming.ControlNode modelElement = (ActivityStorming.ControlNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4021(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4022(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4023(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4024(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4025(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ActivityEdge_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getObjectFlow_4021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getObjectFlow_4022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlFlow_4023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlFlow_4024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityEdge_4025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityEdge_4026IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getCommandAction_2051OutgoingLinks(
			View view) {
		ActivityStorming.CommandAction modelElement = (ActivityStorming.CommandAction) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getAggregate_2052OutgoingLinks(
			View view) {
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getQueryAction_2053OutgoingLinks(
			View view) {
		ActivityStorming.QueryAction modelElement = (ActivityStorming.QueryAction) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getValueObject_2054OutgoingLinks(
			View view) {
		ActivityStorming.ValueObject modelElement = (ActivityStorming.ValueObject) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getEntity_2055OutgoingLinks(
			View view) {
		ActivityStorming.Entity modelElement = (ActivityStorming.Entity) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getExternalSystem_2056OutgoingLinks(
			View view) {
		ActivityStorming.ExternalSystem modelElement = (ActivityStorming.ExternalSystem) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getConstraintPin_2057OutgoingLinks(
			View view) {
		ActivityStorming.ConstraintPin modelElement = (ActivityStorming.ConstraintPin) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getInitialNode_2058OutgoingLinks(
			View view) {
		ActivityStorming.InitialNode modelElement = (ActivityStorming.InitialNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getForkNode_2059OutgoingLinks(
			View view) {
		ActivityStorming.ForkNode modelElement = (ActivityStorming.ForkNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getJoinNode_2060OutgoingLinks(
			View view) {
		ActivityStorming.JoinNode modelElement = (ActivityStorming.JoinNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDecisionNode_2061OutgoingLinks(
			View view) {
		ActivityStorming.DecisionNode modelElement = (ActivityStorming.DecisionNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getMergeNode_2062OutgoingLinks(
			View view) {
		ActivityStorming.MergeNode modelElement = (ActivityStorming.MergeNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getFinalNode_2063OutgoingLinks(
			View view) {
		ActivityStorming.FinalNode modelElement = (ActivityStorming.FinalNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainObject_2064OutgoingLinks(
			View view) {
		ActivityStorming.DomainObject modelElement = (ActivityStorming.DomainObject) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getReadModel_2065OutgoingLinks(
			View view) {
		ActivityStorming.ReadModel modelElement = (ActivityStorming.ReadModel) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainEvent_2066OutgoingLinks(
			View view) {
		ActivityStorming.DomainEvent modelElement = (ActivityStorming.DomainEvent) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlNode_2067OutgoingLinks(
			View view) {
		ActivityStorming.ControlNode modelElement = (ActivityStorming.ControlNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActor_2068OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getSystem_2069OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityPartition_2070OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getConstraintPin_3026OutgoingLinks(
			View view) {
		ActivityStorming.ConstraintPin modelElement = (ActivityStorming.ConstraintPin) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getValueObject_3027OutgoingLinks(
			View view) {
		ActivityStorming.ValueObject modelElement = (ActivityStorming.ValueObject) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getEntity_3028OutgoingLinks(
			View view) {
		ActivityStorming.Entity modelElement = (ActivityStorming.Entity) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainObject_3029OutgoingLinks(
			View view) {
		ActivityStorming.DomainObject modelElement = (ActivityStorming.DomainObject) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getCommandAction_3030OutgoingLinks(
			View view) {
		ActivityStorming.CommandAction modelElement = (ActivityStorming.CommandAction) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getAggregate_3031OutgoingLinks(
			View view) {
		ActivityStorming.Aggregate modelElement = (ActivityStorming.Aggregate) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getQueryAction_3032OutgoingLinks(
			View view) {
		ActivityStorming.QueryAction modelElement = (ActivityStorming.QueryAction) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_Supplier_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getValueObject_3033OutgoingLinks(
			View view) {
		ActivityStorming.ValueObject modelElement = (ActivityStorming.ValueObject) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getEntity_3034OutgoingLinks(
			View view) {
		ActivityStorming.Entity modelElement = (ActivityStorming.Entity) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getExternalSystem_3035OutgoingLinks(
			View view) {
		ActivityStorming.ExternalSystem modelElement = (ActivityStorming.ExternalSystem) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getConstraintPin_3036OutgoingLinks(
			View view) {
		ActivityStorming.ConstraintPin modelElement = (ActivityStorming.ConstraintPin) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getInitialNode_3037OutgoingLinks(
			View view) {
		ActivityStorming.InitialNode modelElement = (ActivityStorming.InitialNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getForkNode_3038OutgoingLinks(
			View view) {
		ActivityStorming.ForkNode modelElement = (ActivityStorming.ForkNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getJoinNode_3039OutgoingLinks(
			View view) {
		ActivityStorming.JoinNode modelElement = (ActivityStorming.JoinNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDecisionNode_3040OutgoingLinks(
			View view) {
		ActivityStorming.DecisionNode modelElement = (ActivityStorming.DecisionNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getMergeNode_3041OutgoingLinks(
			View view) {
		ActivityStorming.MergeNode modelElement = (ActivityStorming.MergeNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getFinalNode_3042OutgoingLinks(
			View view) {
		ActivityStorming.FinalNode modelElement = (ActivityStorming.FinalNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainObject_3043OutgoingLinks(
			View view) {
		ActivityStorming.DomainObject modelElement = (ActivityStorming.DomainObject) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getReadModel_3044OutgoingLinks(
			View view) {
		ActivityStorming.ReadModel modelElement = (ActivityStorming.ReadModel) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getDomainEvent_3045OutgoingLinks(
			View view) {
		ActivityStorming.DomainEvent modelElement = (ActivityStorming.DomainEvent) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4030(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlNode_3046OutgoingLinks(
			View view) {
		ActivityStorming.ControlNode modelElement = (ActivityStorming.ControlNode) view.getElement();
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ActivityEdge_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getObjectFlow_4021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getObjectFlow_4022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlFlow_4023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getControlFlow_4024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityEdge_4025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getActivityEdge_4026OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getContainedTypeModelFacetLinks_ObjectFlow_4021(
			ActivityStorming.ActivityDiagram container) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ObjectFlow) {
				continue;
			}
			ActivityStorming.ObjectFlow link = (ActivityStorming.ObjectFlow) linkObject;
			if (ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021,
					ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getContainedTypeModelFacetLinks_ObjectFlow_4022(
			ActivityStorming.ActivityPartition container) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ObjectFlow) {
				continue;
			}
			ActivityStorming.ObjectFlow link = (ActivityStorming.ObjectFlow) linkObject;
			if (ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022,
					ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getContainedTypeModelFacetLinks_ControlFlow_4023(
			ActivityStorming.ActivityDiagram container) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ControlFlow) {
				continue;
			}
			ActivityStorming.ControlFlow link = (ActivityStorming.ControlFlow) linkObject;
			if (ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023,
					ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getContainedTypeModelFacetLinks_ControlFlow_4024(
			ActivityStorming.ActivityPartition container) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ControlFlow) {
				continue;
			}
			ActivityStorming.ControlFlow link = (ActivityStorming.ControlFlow) linkObject;
			if (ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024,
					ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getContainedTypeModelFacetLinks_ActivityEdge_4025(
			ActivityStorming.ActivityDiagram container) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ActivityEdge) {
				continue;
			}
			ActivityStorming.ActivityEdge link = (ActivityStorming.ActivityEdge) linkObject;
			if (ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025,
					ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getContainedTypeModelFacetLinks_ActivityEdge_4026(
			ActivityStorming.ActivityPartition container) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ActivityEdge) {
				continue;
			}
			ActivityStorming.ActivityEdge link = (ActivityStorming.ActivityEdge) linkObject;
			if (ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026,
					ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingTypeModelFacetLinks_ObjectFlow_4021(
			ActivityStorming.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getActivityEdge_Target() || false == setting.getEObject() instanceof ActivityStorming.ObjectFlow) {
				continue;
			}
			ActivityStorming.ObjectFlow link = (ActivityStorming.ObjectFlow) setting.getEObject();
			if (ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, target, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021,
					ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingTypeModelFacetLinks_ObjectFlow_4022(
			ActivityStorming.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getActivityEdge_Target() || false == setting.getEObject() instanceof ActivityStorming.ObjectFlow) {
				continue;
			}
			ActivityStorming.ObjectFlow link = (ActivityStorming.ObjectFlow) setting.getEObject();
			if (ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, target, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022,
					ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingTypeModelFacetLinks_ControlFlow_4023(
			ActivityStorming.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityStorming.ControlFlow) {
				continue;
			}
			ActivityStorming.ControlFlow link = (ActivityStorming.ControlFlow) setting.getEObject();
			if (ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, target, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023,
					ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingTypeModelFacetLinks_ControlFlow_4024(
			ActivityStorming.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityStorming.ControlFlow) {
				continue;
			}
			ActivityStorming.ControlFlow link = (ActivityStorming.ControlFlow) setting.getEObject();
			if (ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, target, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024,
					ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityEdge_4025(
			ActivityStorming.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityStorming.ActivityEdge) {
				continue;
			}
			ActivityStorming.ActivityEdge link = (ActivityStorming.ActivityEdge) setting.getEObject();
			if (ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, target, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025,
					ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingTypeModelFacetLinks_ActivityEdge_4026(
			ActivityStorming.ActivityNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getActivityEdge_Target()
					|| false == setting.getEObject() instanceof ActivityStorming.ActivityEdge) {
				continue;
			}
			ActivityStorming.ActivityEdge link = (ActivityStorming.ActivityEdge) setting.getEObject();
			if (ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode src = link.getSource();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, target, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026,
					ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingFeatureModelFacetLinks_Action_Supplier_4027(
			ActivityStorming.Supplier target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getAction_Supplier()) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(setting.getEObject(),
						target, ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActionSupplier_4027,
						ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingFeatureModelFacetLinks_Supplier_Triggers_4028(
			ActivityStorming.DomainEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getSupplier_Triggers()) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(setting.getEObject(),
						target, ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierTriggers_4028,
						ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingFeatureModelFacetLinks_Supplier_Readmodels_4029(
			ActivityStorming.ReadModel target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getSupplier_Readmodels()) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(setting.getEObject(),
						target, ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierReadmodels_4029,
						ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingFeatureModelFacetLinks_DomainEvent_Readmodel_4030(
			ActivityStorming.ReadModel target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getDomainEvent_Readmodel()) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(setting.getEObject(),
						target,
						ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEventReadmodel_4030,
						ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(
			ActivityStorming.DomainEvent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ActivityStorming.ActivityStormingPackage.eINSTANCE
					.getConstraintPin_Triggers()) {
				result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(setting.getEObject(),
						target,
						ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPinTriggers_4031,
						ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ObjectFlow_4021(
			ActivityStorming.ActivityNode source) {
		ActivityStorming.ActivityDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityStorming.ActivityDiagram) {
				container = (ActivityStorming.ActivityDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ObjectFlow) {
				continue;
			}
			ActivityStorming.ObjectFlow link = (ActivityStorming.ObjectFlow) linkObject;
			if (ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021,
					ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ObjectFlow_4022(
			ActivityStorming.ActivityNode source) {
		ActivityStorming.ActivityPartition container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityStorming.ActivityPartition) {
				container = (ActivityStorming.ActivityPartition) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ObjectFlow) {
				continue;
			}
			ActivityStorming.ObjectFlow link = (ActivityStorming.ObjectFlow) linkObject;
			if (ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022,
					ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ControlFlow_4023(
			ActivityStorming.ActivityNode source) {
		ActivityStorming.ActivityDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityStorming.ActivityDiagram) {
				container = (ActivityStorming.ActivityDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ControlFlow) {
				continue;
			}
			ActivityStorming.ControlFlow link = (ActivityStorming.ControlFlow) linkObject;
			if (ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023,
					ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ControlFlow_4024(
			ActivityStorming.ActivityNode source) {
		ActivityStorming.ActivityPartition container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityStorming.ActivityPartition) {
				container = (ActivityStorming.ActivityPartition) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ControlFlow) {
				continue;
			}
			ActivityStorming.ControlFlow link = (ActivityStorming.ControlFlow) linkObject;
			if (ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024,
					ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityEdge_4025(
			ActivityStorming.ActivityNode source) {
		ActivityStorming.ActivityDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityStorming.ActivityDiagram) {
				container = (ActivityStorming.ActivityDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ActivityEdge) {
				continue;
			}
			ActivityStorming.ActivityEdge link = (ActivityStorming.ActivityEdge) linkObject;
			if (ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025,
					ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingTypeModelFacetLinks_ActivityEdge_4026(
			ActivityStorming.ActivityNode source) {
		ActivityStorming.ActivityPartition container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityStorming.ActivityPartition) {
				container = (ActivityStorming.ActivityPartition) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> links = container.getActivityedge().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActivityStorming.ActivityEdge) {
				continue;
			}
			ActivityStorming.ActivityEdge link = (ActivityStorming.ActivityEdge) linkObject;
			if (ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID != ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityStorming.ActivityNode dst = link.getTarget();
			ActivityStorming.ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(src, dst, link,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026,
					ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_Action_Supplier_4027(
			ActivityStorming.Action source) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		ActivityStorming.Supplier destination = source.getSupplier();
		if (destination == null) {
			return result;
		}
		result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(source, destination,
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActionSupplier_4027,
				ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_Supplier_Triggers_4028(
			ActivityStorming.Supplier source) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriggers().iterator(); destinations.hasNext();) {
			ActivityStorming.DomainEvent destination = (ActivityStorming.DomainEvent) destinations.next();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(source, destination,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierTriggers_4028,
					ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_Supplier_Readmodels_4029(
			ActivityStorming.Supplier source) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> destinations = source.getReadmodels().iterator(); destinations.hasNext();) {
			ActivityStorming.ReadModel destination = (ActivityStorming.ReadModel) destinations.next();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(source, destination,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierReadmodels_4029,
					ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_DomainEvent_Readmodel_4030(
			ActivityStorming.DomainEvent source) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		ActivityStorming.ReadModel destination = source.getReadmodel();
		if (destination == null) {
			return result;
		}
		result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(source, destination,
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEventReadmodel_4030,
				ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingFeatureModelFacetLinks_ConstraintPin_Triggers_4031(
			ActivityStorming.ConstraintPin source) {
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriggers().iterator(); destinations.hasNext();) {
			ActivityStorming.DomainEvent destination = (ActivityStorming.DomainEvent) destinations.next();
			result.add(new ActivityStorming.diagram.part.ActivityStormingLinkDescriptor(source, destination,
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPinTriggers_4031,
					ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID));
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

		public List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> getSemanticChildren(View view) {
			return ActivityStormingDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getContainedLinks(View view) {
			return ActivityStormingDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getIncomingLinks(View view) {
			return ActivityStormingDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> getOutgoingLinks(View view) {
			return ActivityStormingDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
