/*
* 
*/
package ActivityStorming.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ActivityStormingNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem
				&& !isOwnView(((ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup) {
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup group = (ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup) element;
			return ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem) {
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem navigatorItem = (ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view)) {
		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?metamodel/ActivityStorming.ecore?ActivityDiagram", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityDiagram_1000);
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?CommandAction", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?Aggregate", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?QueryAction", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?ValueObject", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?Entity", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?ExternalSystem", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?ConstraintPin", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
		case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?InitialNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
		case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?ForkNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
		case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?JoinNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?DecisionNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
		case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?MergeNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
		case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?FinalNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?DomainObject", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?ReadModel", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?DomainEvent", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
		case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?ControlNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?Actor", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.Actor_2068);
		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?System", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.System_2069);
		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?metamodel/ActivityStorming.ecore?ActivityPartition", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityPartition_2070);
		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?ConstraintPin", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?ValueObject", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?Entity", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?DomainObject", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?CommandAction", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?Aggregate", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?QueryAction", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?ValueObject", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?Entity", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?ExternalSystem", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?ConstraintPin", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
		case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?InitialNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
		case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?ForkNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
		case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?JoinNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?DecisionNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
		case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?MergeNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
		case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?FinalNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?DomainObject", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?ReadModel", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?DomainEvent", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
		case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?metamodel/ActivityStorming.ecore?ControlNode", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?ObjectFlow", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?ObjectFlow", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?ControlFlow", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?ControlFlow", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?ActivityEdge", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?ActivityEdge", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		case ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?Action?supplier", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActionSupplier_4027);
		case ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?Supplier?triggers", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierTriggers_4028);
		case ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?Supplier?readmodels", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierReadmodels_4029);
		case ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?DomainEvent?readmodel", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEventReadmodel_4030);
		case ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID:
			return getImage("Navigator?Link?metamodel/ActivityStorming.ecore?ConstraintPin?triggers", //$NON-NLS-1$
					ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPinTriggers_4031);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ActivityStorming.diagram.providers.ActivityStormingElementTypes.isKnownElementType(elementType)) {
			image = ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup) {
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup group = (ActivityStorming.diagram.navigator.ActivityStormingNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem) {
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem navigatorItem = (ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view)) {
		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID:
			return getActivityDiagram_1000Text(view);
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
			return getCommandAction_2051Text(view);
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return getAggregate_2052Text(view);
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
			return getQueryAction_2053Text(view);
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
			return getValueObject_2054Text(view);
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2055Text(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2056Text(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID:
			return getConstraintPin_2057Text(view);
		case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2058Text(view);
		case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2059Text(view);
		case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2060Text(view);
		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2061Text(view);
		case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2062Text(view);
		case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2063Text(view);
		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID:
			return getDomainObject_2064Text(view);
		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID:
			return getReadModel_2065Text(view);
		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID:
			return getDomainEvent_2066Text(view);
		case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID:
			return getControlNode_2067Text(view);
		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2068Text(view);
		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_2069Text(view);
		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2070Text(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID:
			return getConstraintPin_3026Text(view);
		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID:
			return getValueObject_3027Text(view);
		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID:
			return getEntity_3028Text(view);
		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID:
			return getDomainObject_3029Text(view);
		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID:
			return getCommandAction_3030Text(view);
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3031Text(view);
		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID:
			return getQueryAction_3032Text(view);
		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID:
			return getValueObject_3033Text(view);
		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID:
			return getEntity_3034Text(view);
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3035Text(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID:
			return getConstraintPin_3036Text(view);
		case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3037Text(view);
		case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3038Text(view);
		case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3039Text(view);
		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3040Text(view);
		case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3041Text(view);
		case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3042Text(view);
		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID:
			return getDomainObject_3043Text(view);
		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID:
			return getReadModel_3044Text(view);
		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID:
			return getDomainEvent_3045Text(view);
		case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID:
			return getControlNode_3046Text(view);
		case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4021Text(view);
		case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID:
			return getObjectFlow_4022Text(view);
		case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4023Text(view);
		case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID:
			return getControlFlow_4024Text(view);
		case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4025Text(view);
		case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID:
			return getActivityEdge_4026Text(view);
		case ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID:
			return getActionSupplier_4027Text(view);
		case ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID:
			return getSupplierTriggers_4028Text(view);
		case ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID:
			return getSupplierReadmodels_4029Text(view);
		case ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID:
			return getDomainEventReadmodel_4030Text(view);
		case ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID:
			return getConstraintPinTriggers_4031Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getActivityDiagram_1000Text(View view) {
		ActivityStorming.ActivityDiagram domainModelElement = (ActivityStorming.ActivityDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommandAction_2051Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.CommandActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAggregate_2052Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.AggregateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQueryAction_2053Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.QueryActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValueObject_2054Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ValueObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_2055Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExternalSystem_2056Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ExternalSystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraintPin_2057Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ConstraintPinNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitialNode_2058Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getForkNode_2059Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getJoinNode_2060Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDecisionNode_2061Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.DecisionNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMergeNode_2062Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getFinalNode_2063Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDomainObject_2064Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.DomainObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReadModel_2065Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ReadModelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDomainEvent_2066Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.DomainEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getControlNode_2067Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getActor_2068Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.Actor_2068,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSystem_2069Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.System_2069,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.SystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivityPartition_2070Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityPartition_2070,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ActivityPartitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraintPin_3026Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ConstraintPinName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValueObject_3027Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ValueObjectName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_3028Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.EntityName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDomainObject_3029Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.DomainObjectName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommandAction_3030Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.CommandActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAggregate_3031Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.AggregateName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQueryAction_3032Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.QueryActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValueObject_3033Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ValueObjectName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_3034Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.EntityName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExternalSystem_3035Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ExternalSystemName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraintPin_3036Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ConstraintPinName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitialNode_3037Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getForkNode_3038Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getJoinNode_3039Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDecisionNode_3040Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.DecisionNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMergeNode_3041Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getFinalNode_3042Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDomainObject_3043Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.DomainObjectName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReadModel_3044Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.ReadModelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDomainEvent_3045Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045,
				view.getElement() != null ? view.getElement() : view,
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry
						.getType(ActivityStorming.diagram.edit.parts.DomainEventName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getControlNode_3046Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getObjectFlow_4021Text(View view) {
		ActivityStorming.ObjectFlow domainModelElement = (ActivityStorming.ObjectFlow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObjectFlow_4022Text(View view) {
		ActivityStorming.ObjectFlow domainModelElement = (ActivityStorming.ObjectFlow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getControlFlow_4023Text(View view) {
		ActivityStorming.ControlFlow domainModelElement = (ActivityStorming.ControlFlow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getControlFlow_4024Text(View view) {
		ActivityStorming.ControlFlow domainModelElement = (ActivityStorming.ControlFlow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivityEdge_4025Text(View view) {
		ActivityStorming.ActivityEdge domainModelElement = (ActivityStorming.ActivityEdge) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivityEdge_4026Text(View view) {
		ActivityStorming.ActivityEdge domainModelElement = (ActivityStorming.ActivityEdge) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActionSupplier_4027Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActionSupplier_4027,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupplierTriggers_4028Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierTriggers_4028,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupplierReadmodels_4029Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierReadmodels_4029,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDomainEventReadmodel_4030Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEventReadmodel_4030,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraintPinTriggers_4031Text(View view) {
		IParser parser = ActivityStorming.diagram.providers.ActivityStormingParserProvider.getParser(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPinTriggers_4031,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.MODEL_ID
				.equals(ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getModelID(view));
	}

}
