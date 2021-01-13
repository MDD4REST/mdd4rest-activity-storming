/*
* 
*/
package ActivityStorming.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;

/**
 * @generated
 */
public class ActivityDiagramCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	* @generated
	*/
	private Set<EStructuralFeature> myFeaturesToSynchronize;

	/**
	* @generated
	*/
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	* @generated
	*/
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet<EStructuralFeature>();
			myFeaturesToSynchronize
					.add(ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityDiagram_Activitynode());
			myFeaturesToSynchronize
					.add(ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityDiagram_Activitypartition());
		}
		return myFeaturesToSynchronize;
	}

	/**
	* @generated
	*/
	@SuppressWarnings("rawtypes")

	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> childDescriptors = ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
				.getActivityDiagram_1000SemanticChildren(viewObject);
		for (ActivityStorming.diagram.part.ActivityStormingNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	* @generated
	*/
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		if (isShortcut(view)) {
			return ActivityStorming.diagram.part.ActivityStormingDiagramUpdater.isShortcutOrphaned(view);
		}
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	* @generated
	*/
	private boolean isMyDiagramElement(View view) {
		int visualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
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
		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID:
		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected static boolean isShortcut(View view) {
		return view.getEAnnotation("Shortcut") != null; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> childDescriptors = ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
				.getActivityDiagram_1000SemanticChildren((View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours and not shortcuts
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isShortcut(v)) {
				if (ActivityStorming.diagram.part.ActivityStormingDiagramUpdater.isShortcutOrphaned(v)) {
					orphaned.add(v);
				}
				continue;
			}
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<ActivityStorming.diagram.part.ActivityStormingNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			ActivityStorming.diagram.part.ActivityStormingNodeDescriptor next = descriptorsIterator.next();
			String hint = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (ActivityStorming.diagram.part.ActivityStormingNodeDescriptor next : childDescriptors) {
			String hint = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
					Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")

			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		Collection<IAdaptable> createdConnectionViews = refreshConnections();

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews,
					host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	* @generated
	*/
	private Collection<IAdaptable> refreshConnections() {
		Domain2Notation domain2NotationMap = new Domain2Notation();
		Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> linkDescriptors = collectAllLinks(
				getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> linkDescriptorsIterator = linkDescriptors
					.iterator(); linkDescriptorsIterator.hasNext();) {
				ActivityStorming.diagram.part.ActivityStormingLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	* @generated
	*/
	private Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> collectAllLinks(View view,
			Domain2Notation domain2NotationMap) {
		if (!ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.MODEL_ID
				.equals(ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> result = new LinkedList<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor>();
		switch (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view)) {
		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getActivityDiagram_1000ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getCommandAction_2051ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getAggregate_2052ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getQueryAction_2053ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getValueObject_2054ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getEntity_2055ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getExternalSystem_2056ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getConstraintPin_2057ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getInitialNode_2058ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getForkNode_2059ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getJoinNode_2060ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getDecisionNode_2061ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getMergeNode_2062ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getFinalNode_2063ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getDomainObject_2064ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getReadModel_2065ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getDomainEvent_2066ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getControlNode_2067ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(
						ActivityStorming.diagram.part.ActivityStormingDiagramUpdater.getActor_2068ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getSystem_2069ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getActivityPartition_2070ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getConstraintPin_3026ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getValueObject_3027ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getEntity_3028ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getDomainObject_3029ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getCommandAction_3030ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getAggregate_3031ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getQueryAction_3032ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getValueObject_3033ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getEntity_3034ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getExternalSystem_3035ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getConstraintPin_3036ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getInitialNode_3037ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getForkNode_3038ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getJoinNode_3039ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getDecisionNode_3040ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getMergeNode_3041ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getFinalNode_3042ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getDomainObject_3043ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getReadModel_3044ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getDomainEvent_3045ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getControlNode_3046ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getObjectFlow_4021ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getObjectFlow_4022ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getControlFlow_4023ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getControlFlow_4024ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getActivityEdge_4025ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(ActivityStorming.diagram.part.ActivityStormingDiagramUpdater
						.getActivityEdge_4026ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(), domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(), domain2NotationMap));
		}
		return result;
	}

	/**
	* @generated
	*/
	private Collection<IAdaptable> createConnections(
			Collection<ActivityStorming.diagram.part.ActivityStormingLinkDescriptor> linkDescriptors,
			Domain2Notation domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (ActivityStorming.diagram.part.ActivityStormingLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getSourceEditPart(nextLinkDescriptor, domain2NotationMap);
			EditPart targetEditPart = getTargetEditPart(nextLinkDescriptor, domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(nextLinkDescriptor.getVisualID()),
					ViewUtil.APPEND, false, ((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	* @generated
	*/
	private EditPart getEditPart(EObject domainModelElement, Domain2Notation domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	* @generated
	*/
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	* @generated
	*/
	private EditPart getSourceEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getSource(), domain2NotationMap);
	}

	/**
	* @generated
	*/
	private EditPart getTargetEditPart(UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getDestination(), domain2NotationMap);
	}

	/**
	* @generated
	*/
	protected final EditPart getHintedEditPart(EObject domainModelElement, Domain2Notation domain2NotationMap,
			int hintVisualId) {
		View view = (View) domain2NotationMap.getHinted(domainModelElement,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(hintVisualId));
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	* @generated
	*/
	@SuppressWarnings("serial")
	protected static class Domain2Notation extends HashMap<EObject, View> {
		/**
		* @generated
		*/
		public boolean containsDomainElement(EObject domainElement) {
			return this.containsKey(domainElement);
		}

		/**
		* @generated
		*/
		public View getHinted(EObject domainEObject, String hint) {
			return this.get(domainEObject);
		}

		/**
		* @generated
		*/
		public void putView(EObject domainElement, View view) {
			if (!containsKey(view.getElement()) || !isShortcut(view)) {
				this.put(domainElement, view);
			}
		}

	}
}
