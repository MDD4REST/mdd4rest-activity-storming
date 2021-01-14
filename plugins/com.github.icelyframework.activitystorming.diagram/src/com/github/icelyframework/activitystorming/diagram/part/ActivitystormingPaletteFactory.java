
/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;

/**
 * @generated
 */
public class ActivitystormingPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActivityPartition1CreationTool());
		paletteContainer.add(createActor2CreationTool());
		paletteContainer.add(createAggregate3CreationTool());
		paletteContainer.add(createCommandAction4CreationTool());
		paletteContainer.add(createConstraintPin5CreationTool());
		paletteContainer.add(createControlNode6CreationTool());
		paletteContainer.add(createDecisionPolicy7CreationTool());
		paletteContainer.add(createDomainEvent8CreationTool());
		paletteContainer.add(createDomainObject9CreationTool());
		paletteContainer.add(createEntity10CreationTool());
		paletteContainer.add(createExternalSystem11CreationTool());
		paletteContainer.add(createFinalNode12CreationTool());
		paletteContainer.add(createForkNode13CreationTool());
		paletteContainer.add(createInitialNode14CreationTool());
		paletteContainer.add(createJoinNode15CreationTool());
		paletteContainer.add(createMergeNode16CreationTool());
		paletteContainer.add(createQueryAction17CreationTool());
		paletteContainer.add(createReadModel18CreationTool());
		paletteContainer.add(createSystem19CreationTool());
		paletteContainer.add(createValueObject20CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createActiontoSupplier1CreationTool());
		paletteContainer.add(createActivityEdge2CreationTool());
		paletteContainer.add(createConstrainttoEvent3CreationTool());
		paletteContainer.add(createControlFlow4CreationTool());
		paletteContainer.add(createEventToReadModel5CreationTool());
		paletteContainer.add(createObjectFlow6CreationTool());
		paletteContainer.add(createSuppliertoEvent7CreationTool());
		paletteContainer.add(createSuppliertoReadModel8CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActivityPartition1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ActivityPartition1CreationTool_title,
				Messages.ActivityPartition1CreationTool_desc,
				Collections.singletonList(ActivitystormingElementTypes.ActivityPartition_2020));
		entry.setId("createActivityPartition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ActivityPartition_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActor2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Actor2CreationTool_title,
				Messages.Actor2CreationTool_desc, Collections.singletonList(ActivitystormingElementTypes.Actor_2018));
		entry.setId("createActor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.Actor_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregate3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.Aggregate_2002);
		types.add(ActivitystormingElementTypes.Aggregate_3006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Aggregate3CreationTool_title,
				Messages.Aggregate3CreationTool_desc, types);
		entry.setId("createAggregate3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.Aggregate_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCommandAction4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.CommandAction_2001);
		types.add(ActivitystormingElementTypes.CommandAction_3005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CommandAction4CreationTool_title,
				Messages.CommandAction4CreationTool_desc, types);
		entry.setId("createCommandAction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.CommandAction_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConstraintPin5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ActivitystormingElementTypes.ConstraintPin_3001);
		types.add(ActivitystormingElementTypes.ConstraintPin_2007);
		types.add(ActivitystormingElementTypes.ConstraintPin_3011);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ConstraintPin5CreationTool_title,
				Messages.ConstraintPin5CreationTool_desc, types);
		entry.setId("createConstraintPin5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ConstraintPin_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createControlNode6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.ControlNode_2017);
		types.add(ActivitystormingElementTypes.ControlNode_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ControlNode6CreationTool_title,
				Messages.ControlNode6CreationTool_desc, types);
		entry.setId("createControlNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ControlNode_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDecisionPolicy7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.DecisionNode_2011);
		types.add(ActivitystormingElementTypes.DecisionNode_3015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DecisionPolicy7CreationTool_title,
				Messages.DecisionPolicy7CreationTool_desc, types);
		entry.setId("createDecisionPolicy7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.DecisionNode_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainEvent8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.DomainEvent_2016);
		types.add(ActivitystormingElementTypes.DomainEvent_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DomainEvent8CreationTool_title,
				Messages.DomainEvent8CreationTool_desc, types);
		entry.setId("createDomainEvent8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.DomainEvent_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainObject9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ActivitystormingElementTypes.DomainObject_3004);
		types.add(ActivitystormingElementTypes.DomainObject_2014);
		types.add(ActivitystormingElementTypes.DomainObject_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DomainObject9CreationTool_title,
				Messages.DomainObject9CreationTool_desc, types);
		entry.setId("createDomainObject9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.DomainObject_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntity10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ActivitystormingElementTypes.Entity_3003);
		types.add(ActivitystormingElementTypes.Entity_2005);
		types.add(ActivitystormingElementTypes.Entity_3009);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Entity10CreationTool_title,
				Messages.Entity10CreationTool_desc, types);
		entry.setId("createEntity10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.Entity_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExternalSystem11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.ExternalSystem_2006);
		types.add(ActivitystormingElementTypes.ExternalSystem_3010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExternalSystem11CreationTool_title,
				Messages.ExternalSystem11CreationTool_desc, types);
		entry.setId("createExternalSystem11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ExternalSystem_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinalNode12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.FinalNode_2013);
		types.add(ActivitystormingElementTypes.FinalNode_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FinalNode12CreationTool_title,
				Messages.FinalNode12CreationTool_desc, types);
		entry.setId("createFinalNode12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.FinalNode_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createForkNode13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.ForkNode_2009);
		types.add(ActivitystormingElementTypes.ForkNode_3013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ForkNode13CreationTool_title,
				Messages.ForkNode13CreationTool_desc, types);
		entry.setId("createForkNode13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ForkNode_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitialNode14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.InitialNode_2008);
		types.add(ActivitystormingElementTypes.InitialNode_3012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InitialNode14CreationTool_title,
				Messages.InitialNode14CreationTool_desc, types);
		entry.setId("createInitialNode14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.InitialNode_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJoinNode15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.JoinNode_2010);
		types.add(ActivitystormingElementTypes.JoinNode_3014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.JoinNode15CreationTool_title,
				Messages.JoinNode15CreationTool_desc, types);
		entry.setId("createJoinNode15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.JoinNode_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMergeNode16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.MergeNode_2012);
		types.add(ActivitystormingElementTypes.MergeNode_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MergeNode16CreationTool_title,
				Messages.MergeNode16CreationTool_desc, types);
		entry.setId("createMergeNode16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.MergeNode_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQueryAction17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.QueryAction_2003);
		types.add(ActivitystormingElementTypes.QueryAction_3007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.QueryAction17CreationTool_title,
				Messages.QueryAction17CreationTool_desc, types);
		entry.setId("createQueryAction17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.QueryAction_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReadModel18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.ReadModel_2015);
		types.add(ActivitystormingElementTypes.ReadModel_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ReadModel18CreationTool_title,
				Messages.ReadModel18CreationTool_desc, types);
		entry.setId("createReadModel18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ReadModel_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSystem19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.System19CreationTool_title,
				Messages.System19CreationTool_desc,
				Collections.singletonList(ActivitystormingElementTypes.System_2019));
		entry.setId("createSystem19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.System_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createValueObject20CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ActivitystormingElementTypes.ValueObject_3002);
		types.add(ActivitystormingElementTypes.ValueObject_2004);
		types.add(ActivitystormingElementTypes.ValueObject_3008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ValueObject20CreationTool_title,
				Messages.ValueObject20CreationTool_desc, types);
		entry.setId("createValueObject20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ValueObject_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActiontoSupplier1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ActiontoSupplier1CreationTool_title,
				Messages.ActiontoSupplier1CreationTool_desc,
				Collections.singletonList(ActivitystormingElementTypes.ActionSupplier_4007));
		entry.setId("createActiontoSupplier1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ActionSupplier_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActivityEdge2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.ActivityEdge_4005);
		types.add(ActivitystormingElementTypes.ActivityEdge_4006);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ActivityEdge2CreationTool_title,
				Messages.ActivityEdge2CreationTool_desc, types);
		entry.setId("createActivityEdge2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ActivityEdge_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConstrainttoEvent3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ConstrainttoEvent3CreationTool_title,
				Messages.ConstrainttoEvent3CreationTool_desc,
				Collections.singletonList(ActivitystormingElementTypes.ConstraintPinTriggers_4011));
		entry.setId("createConstrainttoEvent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitystormingElementTypes
				.getImageDescriptor(ActivitystormingElementTypes.ConstraintPinTriggers_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createControlFlow4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.ControlFlow_4003);
		types.add(ActivitystormingElementTypes.ControlFlow_4004);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ControlFlow4CreationTool_title,
				Messages.ControlFlow4CreationTool_desc, types);
		entry.setId("createControlFlow4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ControlFlow_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEventToReadModel5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.EventToReadModel5CreationTool_title,
				Messages.EventToReadModel5CreationTool_desc,
				Collections.singletonList(ActivitystormingElementTypes.DomainEventReadmodel_4010));
		entry.setId("createEventToReadModel5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitystormingElementTypes
				.getImageDescriptor(ActivitystormingElementTypes.DomainEventReadmodel_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObjectFlow6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivitystormingElementTypes.ObjectFlow_4001);
		types.add(ActivitystormingElementTypes.ObjectFlow_4002);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ObjectFlow6CreationTool_title,
				Messages.ObjectFlow6CreationTool_desc, types);
		entry.setId("createObjectFlow6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.ObjectFlow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSuppliertoEvent7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SuppliertoEvent7CreationTool_title,
				Messages.SuppliertoEvent7CreationTool_desc,
				Collections.singletonList(ActivitystormingElementTypes.SupplierTriggers_4008));
		entry.setId("createSuppliertoEvent7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.SupplierTriggers_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSuppliertoReadModel8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SuppliertoReadModel8CreationTool_title,
				Messages.SuppliertoReadModel8CreationTool_desc,
				Collections.singletonList(ActivitystormingElementTypes.SupplierReadmodels_4009));
		entry.setId("createSuppliertoReadModel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitystormingElementTypes.getImageDescriptor(ActivitystormingElementTypes.SupplierReadmodels_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
