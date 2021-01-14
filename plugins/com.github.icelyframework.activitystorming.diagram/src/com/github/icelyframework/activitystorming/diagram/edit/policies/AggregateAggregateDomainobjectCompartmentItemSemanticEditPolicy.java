/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import com.github.icelyframework.activitystorming.diagram.edit.commands.DomainObject2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.Entity2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.edit.commands.ValueObject2CreateCommand;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;

/**
 * @generated
 */
public class AggregateAggregateDomainobjectCompartmentItemSemanticEditPolicy
		extends ActivitystormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AggregateAggregateDomainobjectCompartmentItemSemanticEditPolicy() {
		super(ActivitystormingElementTypes.Aggregate_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ActivitystormingElementTypes.ValueObject_3002 == req.getElementType()) {
			return getGEFWrapper(new ValueObject2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.Entity_3003 == req.getElementType()) {
			return getGEFWrapper(new Entity2CreateCommand(req));
		}
		if (ActivitystormingElementTypes.DomainObject_3004 == req.getElementType()) {
			return getGEFWrapper(new DomainObject2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
