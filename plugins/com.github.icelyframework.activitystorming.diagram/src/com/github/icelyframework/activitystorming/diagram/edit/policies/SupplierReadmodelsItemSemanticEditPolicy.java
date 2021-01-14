/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;

/**
 * @generated
 */
public class SupplierReadmodelsItemSemanticEditPolicy extends ActivitystormingBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SupplierReadmodelsItemSemanticEditPolicy() {
		super(ActivitystormingElementTypes.SupplierReadmodels_4009);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
