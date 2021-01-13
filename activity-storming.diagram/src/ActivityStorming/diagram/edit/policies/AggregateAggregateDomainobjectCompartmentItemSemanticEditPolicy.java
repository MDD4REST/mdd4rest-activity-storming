/*
* 
*/
package ActivityStorming.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AggregateAggregateDomainobjectCompartmentItemSemanticEditPolicy
		extends ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AggregateAggregateDomainobjectCompartmentItemSemanticEditPolicy() {
		super(ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_2052);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3027 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.ValueObject2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3028 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.Entity2CreateCommand(req));
		}
		if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3029 == req.getElementType()) {
			return getGEFWrapper(new ActivityStorming.diagram.edit.commands.DomainObject2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
