/*
 * 
 */
package ActivityStorming.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class ActorActorActivitynodeCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7008;

	/**
	* @generated
	*/
	public ActorActorActivitynodeCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return ActivityStorming.diagram.part.Messages.ActorActorActivitynodeCompartmentEditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ActivityStorming.diagram.edit.policies.ActorActorActivitynodeCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ActivityStorming.diagram.edit.policies.ActorActorActivitynodeCompartmentCanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.CommandAction_3030) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.Aggregate_3031) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.QueryAction_3032) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ValueObject_3033) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.Entity_3034) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ExternalSystem_3035) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPin_3036) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.InitialNode_3037) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ForkNode_3038) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.JoinNode_3039) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.DecisionNode_3040) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.MergeNode_3041) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.FinalNode_3042) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainObject_3043) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ReadModel_3044) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEvent_3045) {
				return this;
			}
			if (type == ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlNode_3046) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType
								.equals(ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4021)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.ObjectFlow_4022)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4023)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.ControlFlow_4024)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4025)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActivityEdge_4026)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.ActionSupplier_4027)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierTriggers_4028)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.SupplierReadmodels_4029)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.DomainEventReadmodel_4030)
								|| elementType.equals(
										ActivityStorming.diagram.providers.ActivityStormingElementTypes.ConstraintPinTriggers_4031))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
