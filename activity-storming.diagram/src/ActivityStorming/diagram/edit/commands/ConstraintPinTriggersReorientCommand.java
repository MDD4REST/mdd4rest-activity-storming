/*
 * 
 */
package ActivityStorming.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ConstraintPinTriggersReorientCommand extends EditElementCommand {

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
	public ConstraintPinTriggersReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof ActivityStorming.ConstraintPin) {
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
		if (!(oldEnd instanceof ActivityStorming.DomainEvent && newEnd instanceof ActivityStorming.ConstraintPin)) {
			return false;
		}
		return ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConstraintPinTriggers_4031(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ActivityStorming.DomainEvent && newEnd instanceof ActivityStorming.DomainEvent)) {
			return false;
		}
		return ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConstraintPinTriggers_4031(getOldSource(), getNewTarget());
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
	protected ActivityStorming.ConstraintPin getOldSource() {
		return (ActivityStorming.ConstraintPin) referenceOwner;
	}

	/**
	* @generated
	*/
	protected ActivityStorming.ConstraintPin getNewSource() {
		return (ActivityStorming.ConstraintPin) newEnd;
	}

	/**
	* @generated
	*/
	protected ActivityStorming.DomainEvent getOldTarget() {
		return (ActivityStorming.DomainEvent) oldEnd;
	}

	/**
	* @generated
	*/
	protected ActivityStorming.DomainEvent getNewTarget() {
		return (ActivityStorming.DomainEvent) newEnd;
	}
}
