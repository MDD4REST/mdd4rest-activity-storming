/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.icelyframework.activitystorming.diagram.edit.commands.Aggregate2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.CommandAction2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ConstraintPin3CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ControlNode2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.DecisionNode2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.DomainEvent2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.DomainObject3CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.Entity3CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ExternalSystem2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.FinalNode2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ForkNode2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.InitialNode2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.JoinNode2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.MergeNode2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.QueryAction2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ReadModel2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ValueObject3CreateCommand;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;

/**
 * @generated
 */
public class SystemSystemActivitynodeCompartmentItemSemanticEditPolicy
		extends ActivitystormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SystemSystemActivitynodeCompartmentItemSemanticEditPolicy() {
		super(ActivitystormingElementTypes.System_2019);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ActivitystormingElementTypes.CommandAction_3005 == req.getElementType()) {
			return getGEFWrapper(new CommandAction2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.Aggregate_3006 == req.getElementType()) {
			return getGEFWrapper(new Aggregate2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.QueryAction_3007 == req.getElementType()) {
			return getGEFWrapper(new QueryAction2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.ValueObject_3008 == req.getElementType()) {
			return getGEFWrapper(new ValueObject3CreateCommand(req));
		}
		if (ActivitystormingElementTypes.Entity_3009 == req.getElementType()) {
			return getGEFWrapper(new Entity3CreateCommand(req));
		}
		if (ActivitystormingElementTypes.ExternalSystem_3010 == req.getElementType()) {
			return getGEFWrapper(new ExternalSystem2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.ConstraintPin_3011 == req.getElementType()) {
			return getGEFWrapper(new ConstraintPin3CreateCommand(req));
		}
		if (ActivitystormingElementTypes.InitialNode_3012 == req.getElementType()) {
			return getGEFWrapper(new InitialNode2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.ForkNode_3013 == req.getElementType()) {
			return getGEFWrapper(new ForkNode2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.JoinNode_3014 == req.getElementType()) {
			return getGEFWrapper(new JoinNode2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.DecisionNode_3015 == req.getElementType()) {
			return getGEFWrapper(new DecisionNode2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.MergeNode_3016 == req.getElementType()) {
			return getGEFWrapper(new MergeNode2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.FinalNode_3017 == req.getElementType()) {
			return getGEFWrapper(new FinalNode2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.DomainObject_3018 == req.getElementType()) {
			return getGEFWrapper(new DomainObject3CreateCommand(req));
		}
		if (ActivitystormingElementTypes.ReadModel_3019 == req.getElementType()) {
			return getGEFWrapper(new ReadModel2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.DomainEvent_3020 == req.getElementType()) {
			return getGEFWrapper(new DomainEvent2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.ControlNode_3021 == req.getElementType()) {
			return getGEFWrapper(new ControlNode2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
