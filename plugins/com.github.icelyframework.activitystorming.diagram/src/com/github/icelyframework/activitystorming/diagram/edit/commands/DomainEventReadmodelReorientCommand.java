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
import com.github.icelyframework.activitystorming.ReadModel;
import com.github.icelyframework.activitystorming.diagram.edit.policies.ActivitystormingBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class DomainEventReadmodelReorientCommand extends EditElementCommand {

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
	public DomainEventReadmodelReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof DomainEvent) {
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
		if (!(oldEnd instanceof ReadModel && newEnd instanceof DomainEvent)) {
			return false;
		}
		return ActivitystormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDomainEventReadmodel_4010(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ReadModel && newEnd instanceof ReadModel)) {
			return false;
		}
		return ActivitystormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDomainEventReadmodel_4010(getOldSource(), getNewTarget());
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
		getOldSource().setReadmodel(null);
		getNewSource().setReadmodel(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setReadmodel(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DomainEvent getOldSource() {
		return (DomainEvent) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DomainEvent getNewSource() {
		return (DomainEvent) newEnd;
	}

	/**
	* @generated
	*/
	protected ReadModel getOldTarget() {
		return (ReadModel) oldEnd;
	}

	/**
	* @generated
	*/
	protected ReadModel getNewTarget() {
		return (ReadModel) newEnd;
	}
}
