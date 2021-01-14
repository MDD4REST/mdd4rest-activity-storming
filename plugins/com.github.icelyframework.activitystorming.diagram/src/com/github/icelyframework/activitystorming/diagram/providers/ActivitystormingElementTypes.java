/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActionSupplierEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityDiagramEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdge2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityEdgeEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityPartitionEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActorEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.Aggregate2EditPart;
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
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObject3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectEditPart;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingDiagramEditorPlugin;

/**
 * @generated
 */
public class ActivitystormingElementTypes {

	/**
	* @generated
	*/
	private ActivitystormingElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ActivitystormingDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ActivityDiagram_1000 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ActivityDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CommandAction_2001 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.CommandAction_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregate_2002 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.Aggregate_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType QueryAction_2003 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.QueryAction_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ValueObject_2004 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ValueObject_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entity_2005 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.Entity_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExternalSystem_2006 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ExternalSystem_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstraintPin_2007 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ConstraintPin_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitialNode_2008 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.InitialNode_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ForkNode_2009 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ForkNode_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JoinNode_2010 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.JoinNode_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DecisionNode_2011 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.DecisionNode_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MergeNode_2012 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.MergeNode_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FinalNode_2013 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.FinalNode_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainObject_2014 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.DomainObject_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ReadModel_2015 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ReadModel_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainEvent_2016 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.DomainEvent_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ControlNode_2017 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ControlNode_2017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_2018 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.Actor_2018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType System_2019 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.System_2019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActivityPartition_2020 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ActivityPartition_2020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstraintPin_3001 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ConstraintPin_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ValueObject_3002 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ValueObject_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entity_3003 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.Entity_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainObject_3004 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.DomainObject_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CommandAction_3005 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.CommandAction_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregate_3006 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.Aggregate_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType QueryAction_3007 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.QueryAction_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ValueObject_3008 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ValueObject_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entity_3009 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.Entity_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExternalSystem_3010 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ExternalSystem_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstraintPin_3011 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ConstraintPin_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitialNode_3012 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.InitialNode_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ForkNode_3013 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ForkNode_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JoinNode_3014 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.JoinNode_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DecisionNode_3015 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.DecisionNode_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MergeNode_3016 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.MergeNode_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FinalNode_3017 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.FinalNode_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainObject_3018 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.DomainObject_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ReadModel_3019 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ReadModel_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainEvent_3020 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.DomainEvent_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ControlNode_3021 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ControlNode_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ObjectFlow_4001 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ObjectFlow_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ObjectFlow_4002 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ObjectFlow_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ControlFlow_4003 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ControlFlow_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ControlFlow_4004 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ControlFlow_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActivityEdge_4005 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ActivityEdge_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActivityEdge_4006 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ActivityEdge_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActionSupplier_4007 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ActionSupplier_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SupplierTriggers_4008 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.SupplierTriggers_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SupplierReadmodels_4009 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.SupplierReadmodels_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainEventReadmodel_4010 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.DomainEventReadmodel_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstraintPinTriggers_4011 = getElementType(
			"com.github.icelyframework.activitystorming.diagram.ConstraintPinTriggers_4011"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ActivityDiagram_1000, ActivitystormingPackage.eINSTANCE.getActivityDiagram());

			elements.put(CommandAction_2001, ActivitystormingPackage.eINSTANCE.getCommandAction());

			elements.put(Aggregate_2002, ActivitystormingPackage.eINSTANCE.getAggregate());

			elements.put(QueryAction_2003, ActivitystormingPackage.eINSTANCE.getQueryAction());

			elements.put(ValueObject_2004, ActivitystormingPackage.eINSTANCE.getValueObject());

			elements.put(Entity_2005, ActivitystormingPackage.eINSTANCE.getEntity());

			elements.put(ExternalSystem_2006, ActivitystormingPackage.eINSTANCE.getExternalSystem());

			elements.put(ConstraintPin_2007, ActivitystormingPackage.eINSTANCE.getConstraintPin());

			elements.put(InitialNode_2008, ActivitystormingPackage.eINSTANCE.getInitialNode());

			elements.put(ForkNode_2009, ActivitystormingPackage.eINSTANCE.getForkNode());

			elements.put(JoinNode_2010, ActivitystormingPackage.eINSTANCE.getJoinNode());

			elements.put(DecisionNode_2011, ActivitystormingPackage.eINSTANCE.getDecisionNode());

			elements.put(MergeNode_2012, ActivitystormingPackage.eINSTANCE.getMergeNode());

			elements.put(FinalNode_2013, ActivitystormingPackage.eINSTANCE.getFinalNode());

			elements.put(DomainObject_2014, ActivitystormingPackage.eINSTANCE.getDomainObject());

			elements.put(ReadModel_2015, ActivitystormingPackage.eINSTANCE.getReadModel());

			elements.put(DomainEvent_2016, ActivitystormingPackage.eINSTANCE.getDomainEvent());

			elements.put(ControlNode_2017, ActivitystormingPackage.eINSTANCE.getControlNode());

			elements.put(Actor_2018, ActivitystormingPackage.eINSTANCE.getActor());

			elements.put(System_2019, ActivitystormingPackage.eINSTANCE.getSystem());

			elements.put(ActivityPartition_2020, ActivitystormingPackage.eINSTANCE.getActivityPartition());

			elements.put(ConstraintPin_3001, ActivitystormingPackage.eINSTANCE.getConstraintPin());

			elements.put(ValueObject_3002, ActivitystormingPackage.eINSTANCE.getValueObject());

			elements.put(Entity_3003, ActivitystormingPackage.eINSTANCE.getEntity());

			elements.put(DomainObject_3004, ActivitystormingPackage.eINSTANCE.getDomainObject());

			elements.put(CommandAction_3005, ActivitystormingPackage.eINSTANCE.getCommandAction());

			elements.put(Aggregate_3006, ActivitystormingPackage.eINSTANCE.getAggregate());

			elements.put(QueryAction_3007, ActivitystormingPackage.eINSTANCE.getQueryAction());

			elements.put(ValueObject_3008, ActivitystormingPackage.eINSTANCE.getValueObject());

			elements.put(Entity_3009, ActivitystormingPackage.eINSTANCE.getEntity());

			elements.put(ExternalSystem_3010, ActivitystormingPackage.eINSTANCE.getExternalSystem());

			elements.put(ConstraintPin_3011, ActivitystormingPackage.eINSTANCE.getConstraintPin());

			elements.put(InitialNode_3012, ActivitystormingPackage.eINSTANCE.getInitialNode());

			elements.put(ForkNode_3013, ActivitystormingPackage.eINSTANCE.getForkNode());

			elements.put(JoinNode_3014, ActivitystormingPackage.eINSTANCE.getJoinNode());

			elements.put(DecisionNode_3015, ActivitystormingPackage.eINSTANCE.getDecisionNode());

			elements.put(MergeNode_3016, ActivitystormingPackage.eINSTANCE.getMergeNode());

			elements.put(FinalNode_3017, ActivitystormingPackage.eINSTANCE.getFinalNode());

			elements.put(DomainObject_3018, ActivitystormingPackage.eINSTANCE.getDomainObject());

			elements.put(ReadModel_3019, ActivitystormingPackage.eINSTANCE.getReadModel());

			elements.put(DomainEvent_3020, ActivitystormingPackage.eINSTANCE.getDomainEvent());

			elements.put(ControlNode_3021, ActivitystormingPackage.eINSTANCE.getControlNode());

			elements.put(ObjectFlow_4001, ActivitystormingPackage.eINSTANCE.getObjectFlow());

			elements.put(ObjectFlow_4002, ActivitystormingPackage.eINSTANCE.getObjectFlow());

			elements.put(ControlFlow_4003, ActivitystormingPackage.eINSTANCE.getControlFlow());

			elements.put(ControlFlow_4004, ActivitystormingPackage.eINSTANCE.getControlFlow());

			elements.put(ActivityEdge_4005, ActivitystormingPackage.eINSTANCE.getActivityEdge());

			elements.put(ActivityEdge_4006, ActivitystormingPackage.eINSTANCE.getActivityEdge());

			elements.put(ActionSupplier_4007, ActivitystormingPackage.eINSTANCE.getAction_Supplier());

			elements.put(SupplierTriggers_4008, ActivitystormingPackage.eINSTANCE.getSupplier_Triggers());

			elements.put(SupplierReadmodels_4009, ActivitystormingPackage.eINSTANCE.getSupplier_Readmodels());

			elements.put(DomainEventReadmodel_4010, ActivitystormingPackage.eINSTANCE.getDomainEvent_Readmodel());

			elements.put(ConstraintPinTriggers_4011, ActivitystormingPackage.eINSTANCE.getConstraintPin_Triggers());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ActivityDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(CommandAction_2001);
			KNOWN_ELEMENT_TYPES.add(Aggregate_2002);
			KNOWN_ELEMENT_TYPES.add(QueryAction_2003);
			KNOWN_ELEMENT_TYPES.add(ValueObject_2004);
			KNOWN_ELEMENT_TYPES.add(Entity_2005);
			KNOWN_ELEMENT_TYPES.add(ExternalSystem_2006);
			KNOWN_ELEMENT_TYPES.add(ConstraintPin_2007);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2008);
			KNOWN_ELEMENT_TYPES.add(ForkNode_2009);
			KNOWN_ELEMENT_TYPES.add(JoinNode_2010);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_2011);
			KNOWN_ELEMENT_TYPES.add(MergeNode_2012);
			KNOWN_ELEMENT_TYPES.add(FinalNode_2013);
			KNOWN_ELEMENT_TYPES.add(DomainObject_2014);
			KNOWN_ELEMENT_TYPES.add(ReadModel_2015);
			KNOWN_ELEMENT_TYPES.add(DomainEvent_2016);
			KNOWN_ELEMENT_TYPES.add(ControlNode_2017);
			KNOWN_ELEMENT_TYPES.add(Actor_2018);
			KNOWN_ELEMENT_TYPES.add(System_2019);
			KNOWN_ELEMENT_TYPES.add(ActivityPartition_2020);
			KNOWN_ELEMENT_TYPES.add(ConstraintPin_3001);
			KNOWN_ELEMENT_TYPES.add(ValueObject_3002);
			KNOWN_ELEMENT_TYPES.add(Entity_3003);
			KNOWN_ELEMENT_TYPES.add(DomainObject_3004);
			KNOWN_ELEMENT_TYPES.add(CommandAction_3005);
			KNOWN_ELEMENT_TYPES.add(Aggregate_3006);
			KNOWN_ELEMENT_TYPES.add(QueryAction_3007);
			KNOWN_ELEMENT_TYPES.add(ValueObject_3008);
			KNOWN_ELEMENT_TYPES.add(Entity_3009);
			KNOWN_ELEMENT_TYPES.add(ExternalSystem_3010);
			KNOWN_ELEMENT_TYPES.add(ConstraintPin_3011);
			KNOWN_ELEMENT_TYPES.add(InitialNode_3012);
			KNOWN_ELEMENT_TYPES.add(ForkNode_3013);
			KNOWN_ELEMENT_TYPES.add(JoinNode_3014);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_3015);
			KNOWN_ELEMENT_TYPES.add(MergeNode_3016);
			KNOWN_ELEMENT_TYPES.add(FinalNode_3017);
			KNOWN_ELEMENT_TYPES.add(DomainObject_3018);
			KNOWN_ELEMENT_TYPES.add(ReadModel_3019);
			KNOWN_ELEMENT_TYPES.add(DomainEvent_3020);
			KNOWN_ELEMENT_TYPES.add(ControlNode_3021);
			KNOWN_ELEMENT_TYPES.add(ObjectFlow_4001);
			KNOWN_ELEMENT_TYPES.add(ObjectFlow_4002);
			KNOWN_ELEMENT_TYPES.add(ControlFlow_4003);
			KNOWN_ELEMENT_TYPES.add(ControlFlow_4004);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4005);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4006);
			KNOWN_ELEMENT_TYPES.add(ActionSupplier_4007);
			KNOWN_ELEMENT_TYPES.add(SupplierTriggers_4008);
			KNOWN_ELEMENT_TYPES.add(SupplierReadmodels_4009);
			KNOWN_ELEMENT_TYPES.add(DomainEventReadmodel_4010);
			KNOWN_ELEMENT_TYPES.add(ConstraintPinTriggers_4011);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return ActivityDiagram_1000;
		case CommandActionEditPart.VISUAL_ID:
			return CommandAction_2001;
		case AggregateEditPart.VISUAL_ID:
			return Aggregate_2002;
		case QueryActionEditPart.VISUAL_ID:
			return QueryAction_2003;
		case ValueObjectEditPart.VISUAL_ID:
			return ValueObject_2004;
		case EntityEditPart.VISUAL_ID:
			return Entity_2005;
		case ExternalSystemEditPart.VISUAL_ID:
			return ExternalSystem_2006;
		case ConstraintPinEditPart.VISUAL_ID:
			return ConstraintPin_2007;
		case InitialNodeEditPart.VISUAL_ID:
			return InitialNode_2008;
		case ForkNodeEditPart.VISUAL_ID:
			return ForkNode_2009;
		case JoinNodeEditPart.VISUAL_ID:
			return JoinNode_2010;
		case DecisionNodeEditPart.VISUAL_ID:
			return DecisionNode_2011;
		case MergeNodeEditPart.VISUAL_ID:
			return MergeNode_2012;
		case FinalNodeEditPart.VISUAL_ID:
			return FinalNode_2013;
		case DomainObjectEditPart.VISUAL_ID:
			return DomainObject_2014;
		case ReadModelEditPart.VISUAL_ID:
			return ReadModel_2015;
		case DomainEventEditPart.VISUAL_ID:
			return DomainEvent_2016;
		case ControlNodeEditPart.VISUAL_ID:
			return ControlNode_2017;
		case ActorEditPart.VISUAL_ID:
			return Actor_2018;
		case SystemEditPart.VISUAL_ID:
			return System_2019;
		case ActivityPartitionEditPart.VISUAL_ID:
			return ActivityPartition_2020;
		case ConstraintPin2EditPart.VISUAL_ID:
			return ConstraintPin_3001;
		case ValueObject2EditPart.VISUAL_ID:
			return ValueObject_3002;
		case Entity2EditPart.VISUAL_ID:
			return Entity_3003;
		case DomainObject2EditPart.VISUAL_ID:
			return DomainObject_3004;
		case CommandAction2EditPart.VISUAL_ID:
			return CommandAction_3005;
		case Aggregate2EditPart.VISUAL_ID:
			return Aggregate_3006;
		case QueryAction2EditPart.VISUAL_ID:
			return QueryAction_3007;
		case ValueObject3EditPart.VISUAL_ID:
			return ValueObject_3008;
		case Entity3EditPart.VISUAL_ID:
			return Entity_3009;
		case ExternalSystem2EditPart.VISUAL_ID:
			return ExternalSystem_3010;
		case ConstraintPin3EditPart.VISUAL_ID:
			return ConstraintPin_3011;
		case InitialNode2EditPart.VISUAL_ID:
			return InitialNode_3012;
		case ForkNode2EditPart.VISUAL_ID:
			return ForkNode_3013;
		case JoinNode2EditPart.VISUAL_ID:
			return JoinNode_3014;
		case DecisionNode2EditPart.VISUAL_ID:
			return DecisionNode_3015;
		case MergeNode2EditPart.VISUAL_ID:
			return MergeNode_3016;
		case FinalNode2EditPart.VISUAL_ID:
			return FinalNode_3017;
		case DomainObject3EditPart.VISUAL_ID:
			return DomainObject_3018;
		case ReadModel2EditPart.VISUAL_ID:
			return ReadModel_3019;
		case DomainEvent2EditPart.VISUAL_ID:
			return DomainEvent_3020;
		case ControlNode2EditPart.VISUAL_ID:
			return ControlNode_3021;
		case ObjectFlowEditPart.VISUAL_ID:
			return ObjectFlow_4001;
		case ObjectFlow2EditPart.VISUAL_ID:
			return ObjectFlow_4002;
		case ControlFlowEditPart.VISUAL_ID:
			return ControlFlow_4003;
		case ControlFlow2EditPart.VISUAL_ID:
			return ControlFlow_4004;
		case ActivityEdgeEditPart.VISUAL_ID:
			return ActivityEdge_4005;
		case ActivityEdge2EditPart.VISUAL_ID:
			return ActivityEdge_4006;
		case ActionSupplierEditPart.VISUAL_ID:
			return ActionSupplier_4007;
		case SupplierTriggersEditPart.VISUAL_ID:
			return SupplierTriggers_4008;
		case SupplierReadmodelsEditPart.VISUAL_ID:
			return SupplierReadmodels_4009;
		case DomainEventReadmodelEditPart.VISUAL_ID:
			return DomainEventReadmodel_4010;
		case ConstraintPinTriggersEditPart.VISUAL_ID:
			return ConstraintPinTriggers_4011;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
