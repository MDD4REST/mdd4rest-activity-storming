/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import com.github.icelyframework.activitystorming.diagram.edit.commands.ActivityPartitionCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ActorCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.AggregateCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.CommandActionCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ConstraintPinCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ControlNodeCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.DecisionNodeCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.DomainEventCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.DomainObjectCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.EntityCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ExternalSystemCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.FinalNodeCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ForkNodeCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.InitialNodeCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.JoinNodeCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.MergeNodeCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.QueryActionCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ReadModelCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.SystemCreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ValueObjectCreateCommand;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;

/**
 * @generated
 */
public class ActivityDiagramItemSemanticEditPolicy extends ActivitystormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ActivityDiagramItemSemanticEditPolicy() {
		super(ActivitystormingElementTypes.ActivityDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ActivitystormingElementTypes.CommandAction_2001 == req.getElementType()) {
			return getGEFWrapper(new CommandActionCreateCommand(req));
		}
		if (ActivitystormingElementTypes.Aggregate_2002 == req.getElementType()) {
			return getGEFWrapper(new AggregateCreateCommand(req));
		}
		if (ActivitystormingElementTypes.QueryAction_2003 == req.getElementType()) {
			return getGEFWrapper(new QueryActionCreateCommand(req));
		}
		if (ActivitystormingElementTypes.ValueObject_2004 == req.getElementType()) {
			return getGEFWrapper(new ValueObjectCreateCommand(req));
		}
		if (ActivitystormingElementTypes.Entity_2005 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		if (ActivitystormingElementTypes.ExternalSystem_2006 == req.getElementType()) {
			return getGEFWrapper(new ExternalSystemCreateCommand(req));
		}
		if (ActivitystormingElementTypes.ConstraintPin_2007 == req.getElementType()) {
			return getGEFWrapper(new ConstraintPinCreateCommand(req));
		}
		if (ActivitystormingElementTypes.InitialNode_2008 == req.getElementType()) {
			return getGEFWrapper(new InitialNodeCreateCommand(req));
		}
		if (ActivitystormingElementTypes.ForkNode_2009 == req.getElementType()) {
			return getGEFWrapper(new ForkNodeCreateCommand(req));
		}
		if (ActivitystormingElementTypes.JoinNode_2010 == req.getElementType()) {
			return getGEFWrapper(new JoinNodeCreateCommand(req));
		}
		if (ActivitystormingElementTypes.DecisionNode_2011 == req.getElementType()) {
			return getGEFWrapper(new DecisionNodeCreateCommand(req));
		}
		if (ActivitystormingElementTypes.MergeNode_2012 == req.getElementType()) {
			return getGEFWrapper(new MergeNodeCreateCommand(req));
		}
		if (ActivitystormingElementTypes.FinalNode_2013 == req.getElementType()) {
			return getGEFWrapper(new FinalNodeCreateCommand(req));
		}
		if (ActivitystormingElementTypes.DomainObject_2014 == req.getElementType()) {
			return getGEFWrapper(new DomainObjectCreateCommand(req));
		}
		if (ActivitystormingElementTypes.ReadModel_2015 == req.getElementType()) {
			return getGEFWrapper(new ReadModelCreateCommand(req));
		}
		if (ActivitystormingElementTypes.DomainEvent_2016 == req.getElementType()) {
			return getGEFWrapper(new DomainEventCreateCommand(req));
		}
		if (ActivitystormingElementTypes.ControlNode_2017 == req.getElementType()) {
			return getGEFWrapper(new ControlNodeCreateCommand(req));
		}
		if (ActivitystormingElementTypes.Actor_2018 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		if (ActivitystormingElementTypes.System_2019 == req.getElementType()) {
			return getGEFWrapper(new SystemCreateCommand(req));
		}
		if (ActivitystormingElementTypes.ActivityPartition_2020 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
