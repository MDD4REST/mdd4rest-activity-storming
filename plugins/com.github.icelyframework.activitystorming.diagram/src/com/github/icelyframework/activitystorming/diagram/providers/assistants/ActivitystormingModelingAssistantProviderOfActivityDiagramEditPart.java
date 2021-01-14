/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingModelingAssistantProvider;

/**
 * @generated
 */
public class ActivitystormingModelingAssistantProviderOfActivityDiagramEditPart
		extends ActivitystormingModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(20);
		types.add(ActivitystormingElementTypes.CommandAction_2001);
		types.add(ActivitystormingElementTypes.Aggregate_2002);
		types.add(ActivitystormingElementTypes.QueryAction_2003);
		types.add(ActivitystormingElementTypes.ValueObject_2004);
		types.add(ActivitystormingElementTypes.Entity_2005);
		types.add(ActivitystormingElementTypes.ExternalSystem_2006);
		types.add(ActivitystormingElementTypes.ConstraintPin_2007);
		types.add(ActivitystormingElementTypes.InitialNode_2008);
		types.add(ActivitystormingElementTypes.ForkNode_2009);
		types.add(ActivitystormingElementTypes.JoinNode_2010);
		types.add(ActivitystormingElementTypes.DecisionNode_2011);
		types.add(ActivitystormingElementTypes.MergeNode_2012);
		types.add(ActivitystormingElementTypes.FinalNode_2013);
		types.add(ActivitystormingElementTypes.DomainObject_2014);
		types.add(ActivitystormingElementTypes.ReadModel_2015);
		types.add(ActivitystormingElementTypes.DomainEvent_2016);
		types.add(ActivitystormingElementTypes.ControlNode_2017);
		types.add(ActivitystormingElementTypes.Actor_2018);
		types.add(ActivitystormingElementTypes.System_2019);
		types.add(ActivitystormingElementTypes.ActivityPartition_2020);
		return types;
	}

}
