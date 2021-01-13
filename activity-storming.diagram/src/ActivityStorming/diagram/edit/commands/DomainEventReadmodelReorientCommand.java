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
		if (false == referenceOwner instanceof ActivityStorming.DomainEvent) {
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
		if (!(oldEnd instanceof ActivityStorming.ReadModel && newEnd instanceof ActivityStorming.DomainEvent)) {
			return false;
		}
		return ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDomainEventReadmodel_4030(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ActivityStorming.ReadModel && newEnd instanceof ActivityStorming.ReadModel)) {
			return false;
		}
		return ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDomainEventReadmodel_4030(getOldSource(), getNewTarget());
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
	protected ActivityStorming.DomainEvent getOldSource() {
		return (ActivityStorming.DomainEvent) referenceOwner;
	}

	/**
	* @generated
	*/
	protected ActivityStorming.DomainEvent getNewSource() {
		return (ActivityStorming.DomainEvent) newEnd;
	}

	/**
	* @generated
	*/
	protected ActivityStorming.ReadModel getOldTarget() {
		return (ActivityStorming.ReadModel) oldEnd;
	}

	/**
	* @generated
	*/
	protected ActivityStorming.ReadModel getNewTarget() {
		return (ActivityStorming.ReadModel) newEnd;
	}
}
