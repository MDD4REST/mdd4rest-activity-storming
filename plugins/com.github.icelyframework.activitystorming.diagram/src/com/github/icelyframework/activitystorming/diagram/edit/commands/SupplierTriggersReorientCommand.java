/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import com.github.icelyframework.activitystorming.DomainEvent;
import com.github.icelyframework.activitystorming.Supplier;
import com.github.icelyframework.activitystorming.diagram.edit.policies.ActivitystormingBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SupplierTriggersReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public SupplierTriggersReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof Supplier) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof DomainEvent && newEnd instanceof Supplier)) {
			return false;
		}
		return ActivitystormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSupplierTriggers_4008(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DomainEvent && newEnd instanceof DomainEvent)) {
			return false;
		}
		return ActivitystormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSupplierTriggers_4008(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getTriggers().remove(getOldTarget());
		getNewSource().getTriggers().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getTriggers().remove(getOldTarget());
		getOldSource().getTriggers().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected Supplier getOldSource() {
		return (Supplier) referenceOwner;
	}

	/**
	* @generated
	*/
	protected Supplier getNewSource() {
		return (Supplier) newEnd;
	}

	/**
	* @generated
	*/
	protected DomainEvent getOldTarget() {
		return (DomainEvent) oldEnd;
	}

	/**
	* @generated
	*/
	protected DomainEvent getNewTarget() {
		return (DomainEvent) newEnd;
	}
}
