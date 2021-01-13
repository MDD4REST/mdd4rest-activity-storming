
/*
 * 
 */
package ActivityStorming.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ActivityStormingPaletteFactory {

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
		PaletteDrawer paletteContainer = new PaletteDrawer(ActivityStorming.diagram.part.Messages.Objects1Group_title);
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
		PaletteDrawer paletteContainer = new PaletteDrawer(
				ActivityStorming.diagram.part.Messages.Connections2Group_title);
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.ActivityPartition1CreationTool_title,
				ActivityStorming.diagram.part.Messages.ActivityPartition1CreationTool_desc, Collections.singletonList(
						ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityPartition_2070));
		entry.setId("createActivityPartition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImageDescriptor(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityPartition_2070));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActor2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.Actor2CreationTool_title,
				ActivityStorming.diagram.part.Messages.Actor2CreationTool_desc,
				Collections.singletonList(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Actor_2068));
		entry.setId("createActor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Actor_2068));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregate3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.Aggregate3CreationTool_title,
				ActivityStorming.diagram.part.Messages.Aggregate3CreationTool_desc, types);
		entry.setId("createAggregate3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCommandAction4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.CommandAction4CreationTool_title,
				ActivityStorming.diagram.part.Messages.CommandAction4CreationTool_desc, types);
		entry.setId("createCommandAction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImageDescriptor(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConstraintPin5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.ConstraintPin5CreationTool_title,
				ActivityStorming.diagram.part.Messages.ConstraintPin5CreationTool_desc, types);
		entry.setId("createConstraintPin5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImageDescriptor(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createControlNode6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.ControlNode6CreationTool_title,
				ActivityStorming.diagram.part.Messages.ControlNode6CreationTool_desc, types);
		entry.setId("createControlNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDecisionPolicy7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.DecisionPolicy7CreationTool_title,
				ActivityStorming.diagram.part.Messages.DecisionPolicy7CreationTool_desc, types);
		entry.setId("createDecisionPolicy7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainEvent8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.DomainEvent8CreationTool_title,
				ActivityStorming.diagram.part.Messages.DomainEvent8CreationTool_desc, types);
		entry.setId("createDomainEvent8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDomainObject9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.DomainObject9CreationTool_title,
				ActivityStorming.diagram.part.Messages.DomainObject9CreationTool_desc, types);
		entry.setId("createDomainObject9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntity10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.Entity10CreationTool_title,
				ActivityStorming.diagram.part.Messages.Entity10CreationTool_desc, types);
		entry.setId("createEntity10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExternalSystem11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.ExternalSystem11CreationTool_title,
				ActivityStorming.diagram.part.Messages.ExternalSystem11CreationTool_desc, types);
		entry.setId("createExternalSystem11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImageDescriptor(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinalNode12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.FinalNode12CreationTool_title,
				ActivityStorming.diagram.part.Messages.FinalNode12CreationTool_desc, types);
		entry.setId("createFinalNode12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createForkNode13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.ForkNode13CreationTool_title,
				ActivityStorming.diagram.part.Messages.ForkNode13CreationTool_desc, types);
		entry.setId("createForkNode13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitialNode14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.InitialNode14CreationTool_title,
				ActivityStorming.diagram.part.Messages.InitialNode14CreationTool_desc, types);
		entry.setId("createInitialNode14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJoinNode15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.JoinNode15CreationTool_title,
				ActivityStorming.diagram.part.Messages.JoinNode15CreationTool_desc, types);
		entry.setId("createJoinNode15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMergeNode16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.MergeNode16CreationTool_title,
				ActivityStorming.diagram.part.Messages.MergeNode16CreationTool_desc, types);
		entry.setId("createMergeNode16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQueryAction17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.QueryAction17CreationTool_title,
				ActivityStorming.diagram.part.Messages.QueryAction17CreationTool_desc, types);
		entry.setId("createQueryAction17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReadModel18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.ReadModel18CreationTool_title,
				ActivityStorming.diagram.part.Messages.ReadModel18CreationTool_desc, types);
		entry.setId("createReadModel18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSystem19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.System19CreationTool_title,
				ActivityStorming.diagram.part.Messages.System19CreationTool_desc,
				Collections.singletonList(ActivityStorming.diagram.providers.ActivityStormingElementTypes.System_2069));
		entry.setId("createSystem19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.System_2069));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createValueObject20CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ActivityStorming.diagram.part.Messages.ValueObject20CreationTool_title,
				ActivityStorming.diagram.part.Messages.ValueObject20CreationTool_desc, types);
		entry.setId("createValueObject20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActiontoSupplier1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ActivityStorming.diagram.part.Messages.ActiontoSupplier1CreationTool_title,
				ActivityStorming.diagram.part.Messages.ActiontoSupplier1CreationTool_desc, Collections.singletonList(
						ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActionSupplier_4027));
		entry.setId("createActiontoSupplier1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImageDescriptor(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActionSupplier_4027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActivityEdge2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ActivityStorming.diagram.part.Messages.ActivityEdge2CreationTool_title,
				ActivityStorming.diagram.part.Messages.ActivityEdge2CreationTool_desc, types);
		entry.setId("createActivityEdge2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConstrainttoEvent3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ActivityStorming.diagram.part.Messages.ConstrainttoEvent3CreationTool_title,
				ActivityStorming.diagram.part.Messages.ConstrainttoEvent3CreationTool_desc, Collections.singletonList(
						ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPinTriggers_4031));
		entry.setId("createConstrainttoEvent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImageDescriptor(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPinTriggers_4031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createControlFlow4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ActivityStorming.diagram.part.Messages.ControlFlow4CreationTool_title,
				ActivityStorming.diagram.part.Messages.ControlFlow4CreationTool_desc, types);
		entry.setId("createControlFlow4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEventToReadModel5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ActivityStorming.diagram.part.Messages.EventToReadModel5CreationTool_title,
				ActivityStorming.diagram.part.Messages.EventToReadModel5CreationTool_desc, Collections.singletonList(
						ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEventReadmodel_4030));
		entry.setId("createEventToReadModel5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImageDescriptor(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEventReadmodel_4030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObjectFlow6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ActivityStorming.diagram.part.Messages.ObjectFlow6CreationTool_title,
				ActivityStorming.diagram.part.Messages.ObjectFlow6CreationTool_desc, types);
		entry.setId("createObjectFlow6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes
				.getImageDescriptor(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSuppliertoEvent7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ActivityStorming.diagram.part.Messages.SuppliertoEvent7CreationTool_title,
				ActivityStorming.diagram.part.Messages.SuppliertoEvent7CreationTool_desc, Collections.singletonList(
						ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierTriggers_4028));
		entry.setId("createSuppliertoEvent7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImageDescriptor(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierTriggers_4028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSuppliertoReadModel8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ActivityStorming.diagram.part.Messages.SuppliertoReadModel8CreationTool_title,
				ActivityStorming.diagram.part.Messages.SuppliertoReadModel8CreationTool_desc, Collections.singletonList(
						ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierReadmodels_4029));
		entry.setId("createSuppliertoReadModel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivityStorming.diagram.providers.ActivityStormingElementTypes.getImageDescriptor(
				ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierReadmodels_4029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
