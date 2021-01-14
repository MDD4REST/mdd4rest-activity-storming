/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.edit.parts;

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

import com.github.icelyframework.activitystorming.diagram.edit.policies.SystemSystemActivitynodeCompartmentCanonicalEditPolicy;
import com.github.icelyframework.activitystorming.diagram.edit.policies.SystemSystemActivitynodeCompartmentItemSemanticEditPolicy;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry;
import com.github.icelyframework.activitystorming.diagram.part.Messages;
import com.github.icelyframework.activitystorming.diagram.providers.ActivitystormingElementTypes;

/**
 * @generated
 */
public class SystemSystemActivitynodeCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7004;

	/**
	* @generated
	*/
	public SystemSystemActivitynodeCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.SystemSystemActivitynodeCompartmentEditPart_title;
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
				new SystemSystemActivitynodeCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(ActivitystormingVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new SystemSystemActivitynodeCompartmentCanonicalEditPolicy());
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
			if (type == ActivitystormingElementTypes.CommandAction_3005) {
				return this;
			}
			if (type == ActivitystormingElementTypes.Aggregate_3006) {
				return this;
			}
			if (type == ActivitystormingElementTypes.QueryAction_3007) {
				return this;
			}
			if (type == ActivitystormingElementTypes.ValueObject_3008) {
				return this;
			}
			if (type == ActivitystormingElementTypes.Entity_3009) {
				return this;
			}
			if (type == ActivitystormingElementTypes.ExternalSystem_3010) {
				return this;
			}
			if (type == ActivitystormingElementTypes.ConstraintPin_3011) {
				return this;
			}
			if (type == ActivitystormingElementTypes.InitialNode_3012) {
				return this;
			}
			if (type == ActivitystormingElementTypes.ForkNode_3013) {
				return this;
			}
			if (type == ActivitystormingElementTypes.JoinNode_3014) {
				return this;
			}
			if (type == ActivitystormingElementTypes.DecisionNode_3015) {
				return this;
			}
			if (type == ActivitystormingElementTypes.MergeNode_3016) {
				return this;
			}
			if (type == ActivitystormingElementTypes.FinalNode_3017) {
				return this;
			}
			if (type == ActivitystormingElementTypes.DomainObject_3018) {
				return this;
			}
			if (type == ActivitystormingElementTypes.ReadModel_3019) {
				return this;
			}
			if (type == ActivitystormingElementTypes.DomainEvent_3020) {
				return this;
			}
			if (type == ActivitystormingElementTypes.ControlNode_3021) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(ActivitystormingElementTypes.ObjectFlow_4001)
								|| elementType.equals(ActivitystormingElementTypes.ObjectFlow_4002)
								|| elementType.equals(ActivitystormingElementTypes.ControlFlow_4003)
								|| elementType.equals(ActivitystormingElementTypes.ControlFlow_4004)
								|| elementType.equals(ActivitystormingElementTypes.ActivityEdge_4005)
								|| elementType.equals(ActivitystormingElementTypes.ActivityEdge_4006)
								|| elementType.equals(ActivitystormingElementTypes.ActionSupplier_4007)
								|| elementType.equals(ActivitystormingElementTypes.SupplierTriggers_4008)
								|| elementType.equals(ActivitystormingElementTypes.SupplierReadmodels_4009)
								|| elementType.equals(ActivitystormingElementTypes.DomainEventReadmodel_4010)
								|| elementType.equals(ActivitystormingElementTypes.ConstraintPinTriggers_4011))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
