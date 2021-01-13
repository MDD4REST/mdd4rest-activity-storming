/*
 * 
 */
package ActivityStorming.diagram.providers;

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

/**
 * @generated
 */
public class ActivityStormingElementTypes {

	/**
	* @generated
	*/
	private ActivityStormingElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ActivityDiagram_1000 = getElementType(
			"activity-storming.diagram.ActivityDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CommandAction_2051 = getElementType(
			"activity-storming.diagram.CommandAction_2051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregate_2052 = getElementType("activity-storming.diagram.Aggregate_2052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType QueryAction_2053 = getElementType("activity-storming.diagram.QueryAction_2053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ValueObject_2054 = getElementType("activity-storming.diagram.ValueObject_2054"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entity_2055 = getElementType("activity-storming.diagram.Entity_2055"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExternalSystem_2056 = getElementType(
			"activity-storming.diagram.ExternalSystem_2056"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstraintPin_2057 = getElementType(
			"activity-storming.diagram.ConstraintPin_2057"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitialNode_2058 = getElementType("activity-storming.diagram.InitialNode_2058"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ForkNode_2059 = getElementType("activity-storming.diagram.ForkNode_2059"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JoinNode_2060 = getElementType("activity-storming.diagram.JoinNode_2060"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DecisionNode_2061 = getElementType("activity-storming.diagram.DecisionNode_2061"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MergeNode_2062 = getElementType("activity-storming.diagram.MergeNode_2062"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FinalNode_2063 = getElementType("activity-storming.diagram.FinalNode_2063"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainObject_2064 = getElementType("activity-storming.diagram.DomainObject_2064"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ReadModel_2065 = getElementType("activity-storming.diagram.ReadModel_2065"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainEvent_2066 = getElementType("activity-storming.diagram.DomainEvent_2066"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ControlNode_2067 = getElementType("activity-storming.diagram.ControlNode_2067"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_2068 = getElementType("activity-storming.diagram.Actor_2068"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType System_2069 = getElementType("activity-storming.diagram.System_2069"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActivityPartition_2070 = getElementType(
			"activity-storming.diagram.ActivityPartition_2070"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstraintPin_3026 = getElementType(
			"activity-storming.diagram.ConstraintPin_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ValueObject_3027 = getElementType("activity-storming.diagram.ValueObject_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entity_3028 = getElementType("activity-storming.diagram.Entity_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainObject_3029 = getElementType("activity-storming.diagram.DomainObject_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CommandAction_3030 = getElementType(
			"activity-storming.diagram.CommandAction_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregate_3031 = getElementType("activity-storming.diagram.Aggregate_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType QueryAction_3032 = getElementType("activity-storming.diagram.QueryAction_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ValueObject_3033 = getElementType("activity-storming.diagram.ValueObject_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entity_3034 = getElementType("activity-storming.diagram.Entity_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExternalSystem_3035 = getElementType(
			"activity-storming.diagram.ExternalSystem_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstraintPin_3036 = getElementType(
			"activity-storming.diagram.ConstraintPin_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitialNode_3037 = getElementType("activity-storming.diagram.InitialNode_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ForkNode_3038 = getElementType("activity-storming.diagram.ForkNode_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JoinNode_3039 = getElementType("activity-storming.diagram.JoinNode_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DecisionNode_3040 = getElementType("activity-storming.diagram.DecisionNode_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MergeNode_3041 = getElementType("activity-storming.diagram.MergeNode_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FinalNode_3042 = getElementType("activity-storming.diagram.FinalNode_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainObject_3043 = getElementType("activity-storming.diagram.DomainObject_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ReadModel_3044 = getElementType("activity-storming.diagram.ReadModel_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainEvent_3045 = getElementType("activity-storming.diagram.DomainEvent_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ControlNode_3046 = getElementType("activity-storming.diagram.ControlNode_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ObjectFlow_4021 = getElementType("activity-storming.diagram.ObjectFlow_4021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ObjectFlow_4022 = getElementType("activity-storming.diagram.ObjectFlow_4022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ControlFlow_4023 = getElementType("activity-storming.diagram.ControlFlow_4023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ControlFlow_4024 = getElementType("activity-storming.diagram.ControlFlow_4024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActivityEdge_4025 = getElementType("activity-storming.diagram.ActivityEdge_4025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActivityEdge_4026 = getElementType("activity-storming.diagram.ActivityEdge_4026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActionSupplier_4027 = getElementType(
			"activity-storming.diagram.ActionSupplier_4027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SupplierTriggers_4028 = getElementType(
			"activity-storming.diagram.SupplierTriggers_4028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SupplierReadmodels_4029 = getElementType(
			"activity-storming.diagram.SupplierReadmodels_4029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DomainEventReadmodel_4030 = getElementType(
			"activity-storming.diagram.DomainEventReadmodel_4030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConstraintPinTriggers_4031 = getElementType(
			"activity-storming.diagram.ConstraintPinTriggers_4031"); //$NON-NLS-1$

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

			elements.put(ActivityDiagram_1000, ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityDiagram());

			elements.put(CommandAction_2051, ActivityStorming.ActivityStormingPackage.eINSTANCE.getCommandAction());

			elements.put(Aggregate_2052, ActivityStorming.ActivityStormingPackage.eINSTANCE.getAggregate());

			elements.put(QueryAction_2053, ActivityStorming.ActivityStormingPackage.eINSTANCE.getQueryAction());

			elements.put(ValueObject_2054, ActivityStorming.ActivityStormingPackage.eINSTANCE.getValueObject());

			elements.put(Entity_2055, ActivityStorming.ActivityStormingPackage.eINSTANCE.getEntity());

			elements.put(ExternalSystem_2056, ActivityStorming.ActivityStormingPackage.eINSTANCE.getExternalSystem());

			elements.put(ConstraintPin_2057, ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin());

			elements.put(InitialNode_2058, ActivityStorming.ActivityStormingPackage.eINSTANCE.getInitialNode());

			elements.put(ForkNode_2059, ActivityStorming.ActivityStormingPackage.eINSTANCE.getForkNode());

			elements.put(JoinNode_2060, ActivityStorming.ActivityStormingPackage.eINSTANCE.getJoinNode());

			elements.put(DecisionNode_2061, ActivityStorming.ActivityStormingPackage.eINSTANCE.getDecisionNode());

			elements.put(MergeNode_2062, ActivityStorming.ActivityStormingPackage.eINSTANCE.getMergeNode());

			elements.put(FinalNode_2063, ActivityStorming.ActivityStormingPackage.eINSTANCE.getFinalNode());

			elements.put(DomainObject_2064, ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainObject());

			elements.put(ReadModel_2065, ActivityStorming.ActivityStormingPackage.eINSTANCE.getReadModel());

			elements.put(DomainEvent_2066, ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainEvent());

			elements.put(ControlNode_2067, ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlNode());

			elements.put(Actor_2068, ActivityStorming.ActivityStormingPackage.eINSTANCE.getActor());

			elements.put(System_2069, ActivityStorming.ActivityStormingPackage.eINSTANCE.getSystem());

			elements.put(ActivityPartition_2070,
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityPartition());

			elements.put(ConstraintPin_3026, ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin());

			elements.put(ValueObject_3027, ActivityStorming.ActivityStormingPackage.eINSTANCE.getValueObject());

			elements.put(Entity_3028, ActivityStorming.ActivityStormingPackage.eINSTANCE.getEntity());

			elements.put(DomainObject_3029, ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainObject());

			elements.put(CommandAction_3030, ActivityStorming.ActivityStormingPackage.eINSTANCE.getCommandAction());

			elements.put(Aggregate_3031, ActivityStorming.ActivityStormingPackage.eINSTANCE.getAggregate());

			elements.put(QueryAction_3032, ActivityStorming.ActivityStormingPackage.eINSTANCE.getQueryAction());

			elements.put(ValueObject_3033, ActivityStorming.ActivityStormingPackage.eINSTANCE.getValueObject());

			elements.put(Entity_3034, ActivityStorming.ActivityStormingPackage.eINSTANCE.getEntity());

			elements.put(ExternalSystem_3035, ActivityStorming.ActivityStormingPackage.eINSTANCE.getExternalSystem());

			elements.put(ConstraintPin_3036, ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin());

			elements.put(InitialNode_3037, ActivityStorming.ActivityStormingPackage.eINSTANCE.getInitialNode());

			elements.put(ForkNode_3038, ActivityStorming.ActivityStormingPackage.eINSTANCE.getForkNode());

			elements.put(JoinNode_3039, ActivityStorming.ActivityStormingPackage.eINSTANCE.getJoinNode());

			elements.put(DecisionNode_3040, ActivityStorming.ActivityStormingPackage.eINSTANCE.getDecisionNode());

			elements.put(MergeNode_3041, ActivityStorming.ActivityStormingPackage.eINSTANCE.getMergeNode());

			elements.put(FinalNode_3042, ActivityStorming.ActivityStormingPackage.eINSTANCE.getFinalNode());

			elements.put(DomainObject_3043, ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainObject());

			elements.put(ReadModel_3044, ActivityStorming.ActivityStormingPackage.eINSTANCE.getReadModel());

			elements.put(DomainEvent_3045, ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainEvent());

			elements.put(ControlNode_3046, ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlNode());

			elements.put(ObjectFlow_4021, ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectFlow());

			elements.put(ObjectFlow_4022, ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectFlow());

			elements.put(ControlFlow_4023, ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlFlow());

			elements.put(ControlFlow_4024, ActivityStorming.ActivityStormingPackage.eINSTANCE.getControlFlow());

			elements.put(ActivityEdge_4025, ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityEdge());

			elements.put(ActivityEdge_4026, ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityEdge());

			elements.put(ActionSupplier_4027, ActivityStorming.ActivityStormingPackage.eINSTANCE.getAction_Supplier());

			elements.put(SupplierTriggers_4028,
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getSupplier_Triggers());

			elements.put(SupplierReadmodels_4029,
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getSupplier_Readmodels());

			elements.put(DomainEventReadmodel_4030,
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getDomainEvent_Readmodel());

			elements.put(ConstraintPinTriggers_4031,
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getConstraintPin_Triggers());
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
			KNOWN_ELEMENT_TYPES.add(CommandAction_2051);
			KNOWN_ELEMENT_TYPES.add(Aggregate_2052);
			KNOWN_ELEMENT_TYPES.add(QueryAction_2053);
			KNOWN_ELEMENT_TYPES.add(ValueObject_2054);
			KNOWN_ELEMENT_TYPES.add(Entity_2055);
			KNOWN_ELEMENT_TYPES.add(ExternalSystem_2056);
			KNOWN_ELEMENT_TYPES.add(ConstraintPin_2057);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2058);
			KNOWN_ELEMENT_TYPES.add(ForkNode_2059);
			KNOWN_ELEMENT_TYPES.add(JoinNode_2060);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_2061);
			KNOWN_ELEMENT_TYPES.add(MergeNode_2062);
			KNOWN_ELEMENT_TYPES.add(FinalNode_2063);
			KNOWN_ELEMENT_TYPES.add(DomainObject_2064);
			KNOWN_ELEMENT_TYPES.add(ReadModel_2065);
			KNOWN_ELEMENT_TYPES.add(DomainEvent_2066);
			KNOWN_ELEMENT_TYPES.add(ControlNode_2067);
			KNOWN_ELEMENT_TYPES.add(Actor_2068);
			KNOWN_ELEMENT_TYPES.add(System_2069);
			KNOWN_ELEMENT_TYPES.add(ActivityPartition_2070);
			KNOWN_ELEMENT_TYPES.add(ConstraintPin_3026);
			KNOWN_ELEMENT_TYPES.add(ValueObject_3027);
			KNOWN_ELEMENT_TYPES.add(Entity_3028);
			KNOWN_ELEMENT_TYPES.add(DomainObject_3029);
			KNOWN_ELEMENT_TYPES.add(CommandAction_3030);
			KNOWN_ELEMENT_TYPES.add(Aggregate_3031);
			KNOWN_ELEMENT_TYPES.add(QueryAction_3032);
			KNOWN_ELEMENT_TYPES.add(ValueObject_3033);
			KNOWN_ELEMENT_TYPES.add(Entity_3034);
			KNOWN_ELEMENT_TYPES.add(ExternalSystem_3035);
			KNOWN_ELEMENT_TYPES.add(ConstraintPin_3036);
			KNOWN_ELEMENT_TYPES.add(InitialNode_3037);
			KNOWN_ELEMENT_TYPES.add(ForkNode_3038);
			KNOWN_ELEMENT_TYPES.add(JoinNode_3039);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_3040);
			KNOWN_ELEMENT_TYPES.add(MergeNode_3041);
			KNOWN_ELEMENT_TYPES.add(FinalNode_3042);
			KNOWN_ELEMENT_TYPES.add(DomainObject_3043);
			KNOWN_ELEMENT_TYPES.add(ReadModel_3044);
			KNOWN_ELEMENT_TYPES.add(DomainEvent_3045);
			KNOWN_ELEMENT_TYPES.add(ControlNode_3046);
			KNOWN_ELEMENT_TYPES.add(ObjectFlow_4021);
			KNOWN_ELEMENT_TYPES.add(ObjectFlow_4022);
			KNOWN_ELEMENT_TYPES.add(ControlFlow_4023);
			KNOWN_ELEMENT_TYPES.add(ControlFlow_4024);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4025);
			KNOWN_ELEMENT_TYPES.add(ActivityEdge_4026);
			KNOWN_ELEMENT_TYPES.add(ActionSupplier_4027);
			KNOWN_ELEMENT_TYPES.add(SupplierTriggers_4028);
			KNOWN_ELEMENT_TYPES.add(SupplierReadmodels_4029);
			KNOWN_ELEMENT_TYPES.add(DomainEventReadmodel_4030);
			KNOWN_ELEMENT_TYPES.add(ConstraintPinTriggers_4031);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ActivityStorming.diagram.edit.parts.ActivityDiagramEditPart.VISUAL_ID:
			return ActivityDiagram_1000;
		case ActivityStorming.diagram.edit.parts.CommandActionEditPart.VISUAL_ID:
			return CommandAction_2051;
		case ActivityStorming.diagram.edit.parts.AggregateEditPart.VISUAL_ID:
			return Aggregate_2052;
		case ActivityStorming.diagram.edit.parts.QueryActionEditPart.VISUAL_ID:
			return QueryAction_2053;
		case ActivityStorming.diagram.edit.parts.ValueObjectEditPart.VISUAL_ID:
			return ValueObject_2054;
		case ActivityStorming.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return Entity_2055;
		case ActivityStorming.diagram.edit.parts.ExternalSystemEditPart.VISUAL_ID:
			return ExternalSystem_2056;
		case ActivityStorming.diagram.edit.parts.ConstraintPinEditPart.VISUAL_ID:
			return ConstraintPin_2057;
		case ActivityStorming.diagram.edit.parts.InitialNodeEditPart.VISUAL_ID:
			return InitialNode_2058;
		case ActivityStorming.diagram.edit.parts.ForkNodeEditPart.VISUAL_ID:
			return ForkNode_2059;
		case ActivityStorming.diagram.edit.parts.JoinNodeEditPart.VISUAL_ID:
			return JoinNode_2060;
		case ActivityStorming.diagram.edit.parts.DecisionNodeEditPart.VISUAL_ID:
			return DecisionNode_2061;
		case ActivityStorming.diagram.edit.parts.MergeNodeEditPart.VISUAL_ID:
			return MergeNode_2062;
		case ActivityStorming.diagram.edit.parts.FinalNodeEditPart.VISUAL_ID:
			return FinalNode_2063;
		case ActivityStorming.diagram.edit.parts.DomainObjectEditPart.VISUAL_ID:
			return DomainObject_2064;
		case ActivityStorming.diagram.edit.parts.ReadModelEditPart.VISUAL_ID:
			return ReadModel_2065;
		case ActivityStorming.diagram.edit.parts.DomainEventEditPart.VISUAL_ID:
			return DomainEvent_2066;
		case ActivityStorming.diagram.edit.parts.ControlNodeEditPart.VISUAL_ID:
			return ControlNode_2067;
		case ActivityStorming.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return Actor_2068;
		case ActivityStorming.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return System_2069;
		case ActivityStorming.diagram.edit.parts.ActivityPartitionEditPart.VISUAL_ID:
			return ActivityPartition_2070;
		case ActivityStorming.diagram.edit.parts.ConstraintPin2EditPart.VISUAL_ID:
			return ConstraintPin_3026;
		case ActivityStorming.diagram.edit.parts.ValueObject2EditPart.VISUAL_ID:
			return ValueObject_3027;
		case ActivityStorming.diagram.edit.parts.Entity2EditPart.VISUAL_ID:
			return Entity_3028;
		case ActivityStorming.diagram.edit.parts.DomainObject2EditPart.VISUAL_ID:
			return DomainObject_3029;
		case ActivityStorming.diagram.edit.parts.CommandAction2EditPart.VISUAL_ID:
			return CommandAction_3030;
		case ActivityStorming.diagram.edit.parts.Aggregate2EditPart.VISUAL_ID:
			return Aggregate_3031;
		case ActivityStorming.diagram.edit.parts.QueryAction2EditPart.VISUAL_ID:
			return QueryAction_3032;
		case ActivityStorming.diagram.edit.parts.ValueObject3EditPart.VISUAL_ID:
			return ValueObject_3033;
		case ActivityStorming.diagram.edit.parts.Entity3EditPart.VISUAL_ID:
			return Entity_3034;
		case ActivityStorming.diagram.edit.parts.ExternalSystem2EditPart.VISUAL_ID:
			return ExternalSystem_3035;
		case ActivityStorming.diagram.edit.parts.ConstraintPin3EditPart.VISUAL_ID:
			return ConstraintPin_3036;
		case ActivityStorming.diagram.edit.parts.InitialNode2EditPart.VISUAL_ID:
			return InitialNode_3037;
		case ActivityStorming.diagram.edit.parts.ForkNode2EditPart.VISUAL_ID:
			return ForkNode_3038;
		case ActivityStorming.diagram.edit.parts.JoinNode2EditPart.VISUAL_ID:
			return JoinNode_3039;
		case ActivityStorming.diagram.edit.parts.DecisionNode2EditPart.VISUAL_ID:
			return DecisionNode_3040;
		case ActivityStorming.diagram.edit.parts.MergeNode2EditPart.VISUAL_ID:
			return MergeNode_3041;
		case ActivityStorming.diagram.edit.parts.FinalNode2EditPart.VISUAL_ID:
			return FinalNode_3042;
		case ActivityStorming.diagram.edit.parts.DomainObject3EditPart.VISUAL_ID:
			return DomainObject_3043;
		case ActivityStorming.diagram.edit.parts.ReadModel2EditPart.VISUAL_ID:
			return ReadModel_3044;
		case ActivityStorming.diagram.edit.parts.DomainEvent2EditPart.VISUAL_ID:
			return DomainEvent_3045;
		case ActivityStorming.diagram.edit.parts.ControlNode2EditPart.VISUAL_ID:
			return ControlNode_3046;
		case ActivityStorming.diagram.edit.parts.ObjectFlowEditPart.VISUAL_ID:
			return ObjectFlow_4021;
		case ActivityStorming.diagram.edit.parts.ObjectFlow2EditPart.VISUAL_ID:
			return ObjectFlow_4022;
		case ActivityStorming.diagram.edit.parts.ControlFlowEditPart.VISUAL_ID:
			return ControlFlow_4023;
		case ActivityStorming.diagram.edit.parts.ControlFlow2EditPart.VISUAL_ID:
			return ControlFlow_4024;
		case ActivityStorming.diagram.edit.parts.ActivityEdgeEditPart.VISUAL_ID:
			return ActivityEdge_4025;
		case ActivityStorming.diagram.edit.parts.ActivityEdge2EditPart.VISUAL_ID:
			return ActivityEdge_4026;
		case ActivityStorming.diagram.edit.parts.ActionSupplierEditPart.VISUAL_ID:
			return ActionSupplier_4027;
		case ActivityStorming.diagram.edit.parts.SupplierTriggersEditPart.VISUAL_ID:
			return SupplierTriggers_4028;
		case ActivityStorming.diagram.edit.parts.SupplierReadmodelsEditPart.VISUAL_ID:
			return SupplierReadmodels_4029;
		case ActivityStorming.diagram.edit.parts.DomainEventReadmodelEditPart.VISUAL_ID:
			return DomainEventReadmodel_4030;
		case ActivityStorming.diagram.edit.parts.ConstraintPinTriggersEditPart.VISUAL_ID:
			return ConstraintPinTriggers_4031;
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
			return ActivityStorming.diagram.providers.ActivityStormingElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return ActivityStorming.diagram.providers.ActivityStormingElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return ActivityStorming.diagram.providers.ActivityStormingElementTypes.getElement(elementTypeAdapter);
		}
	};

}
