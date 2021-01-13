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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ControlFlowReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

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
	public ControlFlowReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ActivityStorming.ControlFlow) {
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
		if (!(oldEnd instanceof ActivityStorming.ActivityNode && newEnd instanceof ActivityStorming.ActivityNode)) {
			return false;
		}
		ActivityStorming.ActivityNode target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ActivityStorming.ActivityDiagram)) {
			return false;
		}
		ActivityStorming.ActivityDiagram container = (ActivityStorming.ActivityDiagram) getLink().eContainer();
		return ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistControlFlow_4023(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ActivityStorming.ActivityNode && newEnd instanceof ActivityStorming.ActivityNode)) {
			return false;
		}
		ActivityStorming.ActivityNode source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ActivityStorming.ActivityDiagram)) {
			return false;
		}
		ActivityStorming.ActivityDiagram container = (ActivityStorming.ActivityDiagram) getLink().eContainer();
		return ActivityStorming.diagram.edit.policies.ActivityStormingBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistControlFlow_4023(container, getLink(), source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected ActivityStorming.ControlFlow getLink() {
		return (ActivityStorming.ControlFlow) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ActivityStorming.ActivityNode getOldSource() {
		return (ActivityStorming.ActivityNode) oldEnd;
	}

	/**
	* @generated
	*/
	protected ActivityStorming.ActivityNode getNewSource() {
		return (ActivityStorming.ActivityNode) newEnd;
	}

	/**
	* @generated
	*/
	protected ActivityStorming.ActivityNode getOldTarget() {
		return (ActivityStorming.ActivityNode) oldEnd;
	}

	/**
	* @generated
	*/
	protected ActivityStorming.ActivityNode getNewTarget() {
		return (ActivityStorming.ActivityNode) newEnd;
	}
}
