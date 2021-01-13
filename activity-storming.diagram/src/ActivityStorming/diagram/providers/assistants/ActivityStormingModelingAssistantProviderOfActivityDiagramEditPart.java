/*
 * 
 */
package ActivityStorming.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ActivityStormingModelingAssistantProviderOfActivityDiagramEditPart
		extends ActivityStorming.diagram.providers.ActivityStormingModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(20);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_2051);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_2053);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_2054);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_2055);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_2056);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_2057);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_2058);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_2059);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_2060);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_2061);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_2062);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_2063);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_2064);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_2065);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_2066);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_2067);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Actor_2068);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.System_2069);
		types.add(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityPartition_2070);
		return types;
	}

}
