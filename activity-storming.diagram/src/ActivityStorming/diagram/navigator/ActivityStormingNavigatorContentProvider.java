/*
* 
*/
package ActivityStorming.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class ActivityStormingNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ActivityStormingNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem> result = new ArrayList<ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup) {
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup group = (ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem) {
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem navigatorItem = (ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view)) {

		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup links = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ActivityDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_CommandAction_2051_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_CommandAction_2051_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Aggregate_2052_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Aggregate_2052_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_QueryAction_2053_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_QueryAction_2053_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ValueObject_2054_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ValueObject_2054_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Entity_2055_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Entity_2055_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ExternalSystem_2056_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ExternalSystem_2056_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ConstraintPin_2057_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ConstraintPin_2057_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_InitialNode_2058_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_InitialNode_2058_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ForkNode_2059_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ForkNode_2059_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_JoinNode_2060_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_JoinNode_2060_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DecisionNode_2061_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DecisionNode_2061_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_MergeNode_2062_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_MergeNode_2062_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_FinalNode_2063_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_FinalNode_2063_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainObject_2064_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainObject_2064_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ReadModel_2065_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ReadModel_2065_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainEvent_2066_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainEvent_2066_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ControlNode_2067_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ControlNode_2067_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActorActorActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.SystemSystemActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.ActivityPartitionActivityPartitionActivitynodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ConstraintPin_3026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ConstraintPin_3026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ValueObject_3027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ValueObject_3027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Entity_3028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Entity_3028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainObject_3029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainObject_3029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_CommandAction_3030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_CommandAction_3030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Aggregate_3031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Aggregate_3031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getType(
							ActivityStorming.diagram.edit.parts.AggregateAggregateDomainobjectCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_QueryAction_3032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_QueryAction_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ValueObject_3033_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ValueObject_3033_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Entity_3034_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_Entity_3034_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ExternalSystem_3035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ExternalSystem_3035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ConstraintPin_3036_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ConstraintPin_3036_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_InitialNode_3037_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_InitialNode_3037_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ForkNode_3038_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ForkNode_3038_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_JoinNode_3039_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_JoinNode_3039_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DecisionNode_3040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DecisionNode_3040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_MergeNode_3041_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_MergeNode_3041_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_FinalNode_3042_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_FinalNode_3042_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainObject_3043_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainObject_3043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ReadModel_3044_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ReadModel_3044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainEvent_3045_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainEvent_3045_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Node sv = (Node) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup incominglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ControlNode_3046_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup outgoinglinks = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ControlNode_3046_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ObjectFlow_4021_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ObjectFlow_4021_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ObjectFlow_4022_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ObjectFlow_4022_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ControlFlow_4023_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ControlFlow_4023_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ControlFlow_4024_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ControlFlow_4024_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ActivityEdge_4025_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ActivityEdge_4025_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ActivityEdge_4026_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ActivityEdge_4026_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ActionSupplier_4027_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ActionSupplier_4027_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_SupplierTriggers_4028_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_SupplierTriggers_4028_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_SupplierReadmodels_4029_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_SupplierReadmodels_4029_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainEventReadmodel_4030_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_DomainEventReadmodel_4030_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID: {
			LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem> result = new LinkedList<ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup target = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ConstraintPinTriggers_4031_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup source = new ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup(
					ActivityStorming.diagram.part.Messages.NavigatorGroupName_ConstraintPinTriggers_4031_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
							.getType(ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.MODEL_ID
				.equals(ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem> result = new ArrayList<ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem) {
			ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem abstractNavigatorItem = (ActivityStorming.diagram.navigator.ActivityStormingAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
