/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.navigator;

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

import com.github.icelyframework.activitystorming.ActivityDiagram;
import com.github.icelyframework.activitystorming.ActivityEdge;
import com.github.icelyframework.activitystorming.ControlFlow;
import com.github.icelyframework.activitystorming.ObjectFlow;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActionSupplierEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityDiagramEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdge2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdgeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityPartitionEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityPartitionNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActorEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActorNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Aggregate2EditPart;
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
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectName3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectNameEditPart;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingDiagramEditorPlugin;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingParserProvider;

/**
 * @generated
 */
public class ActivitystormingNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ActivitystormingDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ActivitystormingDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ActivitystormingNavigatorItem
				&& !isOwnView(((ActivitystormingNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ActivitystormingNavigatorGroup) {
			ActivitystormingNavigatorGroup group = (ActivitystormingNavigatorGroup) element;
			return ActivitystormingDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ActivitystormingNavigatorItem) {
			ActivitystormingNavigatorItem navigatorItem = (ActivitystormingNavigatorItem) element;
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
		switch (ActivitystormingVisualIDRegistry.getVisualID(view)) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://github.com/icelyframework/activitystorming?ActivityDiagram", //$NON-NLS-1$
					ActivitystormingElementTypes.ActivityDiagram_1000);
		case CommandActionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?CommandAction", //$NON-NLS-1$
					ActivitystormingElementTypes.CommandAction_2001);
		case AggregateEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?Aggregate", //$NON-NLS-1$
					ActivitystormingElementTypes.Aggregate_2002);
		case QueryActionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?QueryAction", //$NON-NLS-1$
					ActivitystormingElementTypes.QueryAction_2003);
		case ValueObjectEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?ValueObject", //$NON-NLS-1$
					ActivitystormingElementTypes.ValueObject_2004);
		case EntityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?Entity", //$NON-NLS-1$
					ActivitystormingElementTypes.Entity_2005);
		case ExternalSystemEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?ExternalSystem", //$NON-NLS-1$
					ActivitystormingElementTypes.ExternalSystem_2006);
		case ConstraintPinEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?ConstraintPin", //$NON-NLS-1$
					ActivitystormingElementTypes.ConstraintPin_2007);
		case InitialNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?InitialNode", //$NON-NLS-1$
					ActivitystormingElementTypes.InitialNode_2008);
		case ForkNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?ForkNode", //$NON-NLS-1$
					ActivitystormingElementTypes.ForkNode_2009);
		case JoinNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?JoinNode", //$NON-NLS-1$
					ActivitystormingElementTypes.JoinNode_2010);
		case DecisionNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?DecisionNode", //$NON-NLS-1$
					ActivitystormingElementTypes.DecisionNode_2011);
		case MergeNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?MergeNode", //$NON-NLS-1$
					ActivitystormingElementTypes.MergeNode_2012);
		case FinalNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?FinalNode", //$NON-NLS-1$
					ActivitystormingElementTypes.FinalNode_2013);
		case DomainObjectEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?DomainObject", //$NON-NLS-1$
					ActivitystormingElementTypes.DomainObject_2014);
		case ReadModelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?ReadModel", //$NON-NLS-1$
					ActivitystormingElementTypes.ReadModel_2015);
		case DomainEventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?DomainEvent", //$NON-NLS-1$
					ActivitystormingElementTypes.DomainEvent_2016);
		case ControlNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?ControlNode", //$NON-NLS-1$
					ActivitystormingElementTypes.ControlNode_2017);
		case ActorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?Actor", //$NON-NLS-1$
					ActivitystormingElementTypes.Actor_2018);
		case SystemEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?System", //$NON-NLS-1$
					ActivitystormingElementTypes.System_2019);
		case ActivityPartitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://github.com/icelyframework/activitystorming?ActivityPartition", //$NON-NLS-1$
					ActivitystormingElementTypes.ActivityPartition_2020);
		case ConstraintPin2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?ConstraintPin", //$NON-NLS-1$
					ActivitystormingElementTypes.ConstraintPin_3001);
		case ValueObject2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?ValueObject", //$NON-NLS-1$
					ActivitystormingElementTypes.ValueObject_3002);
		case Entity2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?Entity", //$NON-NLS-1$
					ActivitystormingElementTypes.Entity_3003);
		case DomainObject2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?DomainObject", //$NON-NLS-1$
					ActivitystormingElementTypes.DomainObject_3004);
		case CommandAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?CommandAction", //$NON-NLS-1$
					ActivitystormingElementTypes.CommandAction_3005);
		case Aggregate2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?Aggregate", //$NON-NLS-1$
					ActivitystormingElementTypes.Aggregate_3006);
		case QueryAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?QueryAction", //$NON-NLS-1$
					ActivitystormingElementTypes.QueryAction_3007);
		case ValueObject3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?ValueObject", //$NON-NLS-1$
					ActivitystormingElementTypes.ValueObject_3008);
		case Entity3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?Entity", //$NON-NLS-1$
					ActivitystormingElementTypes.Entity_3009);
		case ExternalSystem2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?ExternalSystem", //$NON-NLS-1$
					ActivitystormingElementTypes.ExternalSystem_3010);
		case ConstraintPin3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?ConstraintPin", //$NON-NLS-1$
					ActivitystormingElementTypes.ConstraintPin_3011);
		case InitialNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?InitialNode", //$NON-NLS-1$
					ActivitystormingElementTypes.InitialNode_3012);
		case ForkNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?ForkNode", //$NON-NLS-1$
					ActivitystormingElementTypes.ForkNode_3013);
		case JoinNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?JoinNode", //$NON-NLS-1$
					ActivitystormingElementTypes.JoinNode_3014);
		case DecisionNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?DecisionNode", //$NON-NLS-1$
					ActivitystormingElementTypes.DecisionNode_3015);
		case MergeNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?MergeNode", //$NON-NLS-1$
					ActivitystormingElementTypes.MergeNode_3016);
		case FinalNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?FinalNode", //$NON-NLS-1$
					ActivitystormingElementTypes.FinalNode_3017);
		case DomainObject3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?DomainObject", //$NON-NLS-1$
					ActivitystormingElementTypes.DomainObject_3018);
		case ReadModel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?ReadModel", //$NON-NLS-1$
					ActivitystormingElementTypes.ReadModel_3019);
		case DomainEvent2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?DomainEvent", //$NON-NLS-1$
					ActivitystormingElementTypes.DomainEvent_3020);
		case ControlNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://github.com/icelyframework/activitystorming?ControlNode", //$NON-NLS-1$
					ActivitystormingElementTypes.ControlNode_3021);
		case ObjectFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?ObjectFlow", //$NON-NLS-1$
					ActivitystormingElementTypes.ObjectFlow_4001);
		case ObjectFlow2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?ObjectFlow", //$NON-NLS-1$
					ActivitystormingElementTypes.ObjectFlow_4002);
		case ControlFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?ControlFlow", //$NON-NLS-1$
					ActivitystormingElementTypes.ControlFlow_4003);
		case ControlFlow2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?ControlFlow", //$NON-NLS-1$
					ActivitystormingElementTypes.ControlFlow_4004);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?ActivityEdge", //$NON-NLS-1$
					ActivitystormingElementTypes.ActivityEdge_4005);
		case ActivityEdge2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?ActivityEdge", //$NON-NLS-1$
					ActivitystormingElementTypes.ActivityEdge_4006);
		case ActionSupplierEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?Action?supplier", //$NON-NLS-1$
					ActivitystormingElementTypes.ActionSupplier_4007);
		case SupplierTriggersEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?Supplier?triggers", //$NON-NLS-1$
					ActivitystormingElementTypes.SupplierTriggers_4008);
		case SupplierReadmodelsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?Supplier?readmodels", //$NON-NLS-1$
					ActivitystormingElementTypes.SupplierReadmodels_4009);
		case DomainEventReadmodelEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?DomainEvent?readmodel", //$NON-NLS-1$
					ActivitystormingElementTypes.DomainEventReadmodel_4010);
		case ConstraintPinTriggersEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://github.com/icelyframework/activitystorming?ConstraintPin?triggers", //$NON-NLS-1$
					ActivitystormingElementTypes.ConstraintPinTriggers_4011);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ActivitystormingDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ActivitystormingElementTypes.isKnownElementType(elementType)) {
			image = ActivitystormingElementTypes.getImage(elementType);
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
		if (element instanceof ActivitystormingNavigatorGroup) {
			ActivitystormingNavigatorGroup group = (ActivitystormingNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ActivitystormingNavigatorItem) {
			ActivitystormingNavigatorItem navigatorItem = (ActivitystormingNavigatorItem) element;
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
		switch (ActivitystormingVisualIDRegistry.getVisualID(view)) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return getActivityDiagram_1000Text(view);
		case CommandActionEditPart.VISUAL_ID:
			return getCommandAction_2001Text(view);
		case AggregateEditPart.VISUAL_ID:
			return getAggregate_2002Text(view);
		case QueryActionEditPart.VISUAL_ID:
			return getQueryAction_2003Text(view);
		case ValueObjectEditPart.VISUAL_ID:
			return getValueObject_2004Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2005Text(view);
		case ExternalSystemEditPart.VISUAL_ID:
			return getExternalSystem_2006Text(view);
		case ConstraintPinEditPart.VISUAL_ID:
			return getConstraintPin_2007Text(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2008Text(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2009Text(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2010Text(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2011Text(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_2012Text(view);
		case FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2013Text(view);
		case DomainObjectEditPart.VISUAL_ID:
			return getDomainObject_2014Text(view);
		case ReadModelEditPart.VISUAL_ID:
			return getReadModel_2015Text(view);
		case DomainEventEditPart.VISUAL_ID:
			return getDomainEvent_2016Text(view);
		case ControlNodeEditPart.VISUAL_ID:
			return getControlNode_2017Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2018Text(view);
		case SystemEditPart.VISUAL_ID:
			return getSystem_2019Text(view);
		case ActivityPartitionEditPart.VISUAL_ID:
			return getActivityPartition_2020Text(view);
		case ConstraintPin2EditPart.VISUAL_ID:
			return getConstraintPin_3001Text(view);
		case ValueObject2EditPart.VISUAL_ID:
			return getValueObject_3002Text(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_3003Text(view);
		case DomainObject2EditPart.VISUAL_ID:
			return getDomainObject_3004Text(view);
		case CommandAction2EditPart.VISUAL_ID:
			return getCommandAction_3005Text(view);
		case Aggregate2EditPart.VISUAL_ID:
			return getAggregate_3006Text(view);
		case QueryAction2EditPart.VISUAL_ID:
			return getQueryAction_3007Text(view);
		case ValueObject3EditPart.VISUAL_ID:
			return getValueObject_3008Text(view);
		case Entity3EditPart.VISUAL_ID:
			return getEntity_3009Text(view);
		case ExternalSystem2EditPart.VISUAL_ID:
			return getExternalSystem_3010Text(view);
		case ConstraintPin3EditPart.VISUAL_ID:
			return getConstraintPin_3011Text(view);
		case InitialNode2EditPart.VISUAL_ID:
			return getInitialNode_3012Text(view);
		case ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3013Text(view);
		case JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3014Text(view);
		case DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3015Text(view);
		case MergeNode2EditPart.VISUAL_ID:
			return getMergeNode_3016Text(view);
		case FinalNode2EditPart.VISUAL_ID:
			return getFinalNode_3017Text(view);
		case DomainObject3EditPart.VISUAL_ID:
			return getDomainObject_3018Text(view);
		case ReadModel2EditPart.VISUAL_ID:
			return getReadModel_3019Text(view);
		case DomainEvent2EditPart.VISUAL_ID:
			return getDomainEvent_3020Text(view);
		case ControlNode2EditPart.VISUAL_ID:
			return getControlNode_3021Text(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4001Text(view);
		case ObjectFlow2EditPart.VISUAL_ID:
			return getObjectFlow_4002Text(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4003Text(view);
		case ControlFlow2EditPart.VISUAL_ID:
			return getControlFlow_4004Text(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4005Text(view);
		case ActivityEdge2EditPart.VISUAL_ID:
			return getActivityEdge_4006Text(view);
		case ActionSupplierEditPart.VISUAL_ID:
			return getActionSupplier_4007Text(view);
		case SupplierTriggersEditPart.VISUAL_ID:
			return getSupplierTriggers_4008Text(view);
		case SupplierReadmodelsEditPart.VISUAL_ID:
			return getSupplierReadmodels_4009Text(view);
		case DomainEventReadmodelEditPart.VISUAL_ID:
			return getDomainEventReadmodel_4010Text(view);
		case ConstraintPinTriggersEditPart.VISUAL_ID:
			return getConstraintPinTriggers_4011Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getActivityDiagram_1000Text(View view) {
		ActivityDiagram domainModelElement = (ActivityDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommandAction_2001Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.CommandAction_2001,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(CommandActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAggregate_2002Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.Aggregate_2002,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(AggregateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQueryAction_2003Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.QueryAction_2003,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(QueryActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValueObject_2004Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ValueObject_2004,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ValueObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_2005Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.Entity_2005,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExternalSystem_2006Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ExternalSystem_2006,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ExternalSystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraintPin_2007Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ConstraintPin_2007,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ConstraintPinNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitialNode_2008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getForkNode_2009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getJoinNode_2010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDecisionNode_2011Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.DecisionNode_2011,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(DecisionNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMergeNode_2012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getFinalNode_2013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDomainObject_2014Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.DomainObject_2014,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(DomainObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReadModel_2015Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ReadModel_2015,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ReadModelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDomainEvent_2016Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.DomainEvent_2016,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(DomainEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getControlNode_2017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getActor_2018Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.Actor_2018,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSystem_2019Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.System_2019,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(SystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivityPartition_2020Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ActivityPartition_2020,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ActivityPartitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraintPin_3001Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ConstraintPin_3001,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ConstraintPinName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValueObject_3002Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ValueObject_3002,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ValueObjectName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_3003Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.Entity_3003,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(EntityName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDomainObject_3004Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.DomainObject_3004,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(DomainObjectName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCommandAction_3005Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.CommandAction_3005,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(CommandActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAggregate_3006Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.Aggregate_3006,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(AggregateName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQueryAction_3007Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.QueryAction_3007,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(QueryActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValueObject_3008Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ValueObject_3008,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ValueObjectName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_3009Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.Entity_3009,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(EntityName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExternalSystem_3010Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ExternalSystem_3010,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ExternalSystemName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraintPin_3011Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ConstraintPin_3011,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ConstraintPinName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitialNode_3012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getForkNode_3013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getJoinNode_3014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDecisionNode_3015Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.DecisionNode_3015,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(DecisionNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMergeNode_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getFinalNode_3017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDomainObject_3018Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.DomainObject_3018,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(DomainObjectName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReadModel_3019Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ReadModel_3019,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(ReadModelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDomainEvent_3020Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.DomainEvent_3020,
				view.getElement() != null ? view.getElement() : view,
				ActivitystormingVisualIDRegistry.getType(DomainEventName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getControlNode_3021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getObjectFlow_4001Text(View view) {
		ObjectFlow domainModelElement = (ObjectFlow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObjectFlow_4002Text(View view) {
		ObjectFlow domainModelElement = (ObjectFlow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getControlFlow_4003Text(View view) {
		ControlFlow domainModelElement = (ControlFlow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getControlFlow_4004Text(View view) {
		ControlFlow domainModelElement = (ControlFlow) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivityEdge_4005Text(View view) {
		ActivityEdge domainModelElement = (ActivityEdge) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivityEdge_4006Text(View view) {
		ActivityEdge domainModelElement = (ActivityEdge) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActionSupplier_4007Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.ActionSupplier_4007,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupplierTriggers_4008Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.SupplierTriggers_4008,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupplierReadmodels_4009Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(ActivitystormingElementTypes.SupplierReadmodels_4009,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDomainEventReadmodel_4010Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(
				ActivitystormingElementTypes.DomainEventReadmodel_4010,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConstraintPinTriggers_4011Text(View view) {
		IParser parser = ActivitystormingParserProvider.getParser(
				ActivitystormingElementTypes.ConstraintPinTriggers_4011,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitystormingDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
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
		return ActivityDiagramEditPart.MODEL_ID.equals(ActivitystormingVisualIDRegistry.getModelID(view));
	}

}
