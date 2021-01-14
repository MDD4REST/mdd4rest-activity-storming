/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityPartitionNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActorNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.AggregateNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandActionName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.CommandActionNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinName3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ConstraintPinNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNodeName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DecisionNodeNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEventName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainEventNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObjectName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObjectName3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.DomainObjectNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.EntityName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.EntityName3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.EntityNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ExternalSystemName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ExternalSystemNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.QueryActionName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.QueryActionNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModelName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ReadModelNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.SystemNameEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectName2EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectName3EditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ValueObjectNameEditPart;
import com.github.icelyframework.activitystorming.diagram.parsers.MessageFormatParser;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry;

/**
 * @generated
 */
public class ActivitystormingParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser commandActionName_5001Parser;

	/**
	* @generated
	*/
	private IParser getCommandActionName_5001Parser() {
		if (commandActionName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getAction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandActionName_5001Parser = parser;
		}
		return commandActionName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregateName_5006Parser;

	/**
	* @generated
	*/
	private IParser getAggregateName_5006Parser() {
		if (aggregateName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregateName_5006Parser = parser;
		}
		return aggregateName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser queryActionName_5007Parser;

	/**
	* @generated
	*/
	private IParser getQueryActionName_5007Parser() {
		if (queryActionName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getAction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			queryActionName_5007Parser = parser;
		}
		return queryActionName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser valueObjectName_5008Parser;

	/**
	* @generated
	*/
	private IParser getValueObjectName_5008Parser() {
		if (valueObjectName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueObjectName_5008Parser = parser;
		}
		return valueObjectName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser entityName_5009Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5009Parser() {
		if (entityName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5009Parser = parser;
		}
		return entityName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser externalSystemName_5010Parser;

	/**
	* @generated
	*/
	private IParser getExternalSystemName_5010Parser() {
		if (externalSystemName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalSystemName_5010Parser = parser;
		}
		return externalSystemName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser constraintPinName_5011Parser;

	/**
	* @generated
	*/
	private IParser getConstraintPinName_5011Parser() {
		if (constraintPinName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constraintPinName_5011Parser = parser;
		}
		return constraintPinName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser decisionNodeName_5012Parser;

	/**
	* @generated
	*/
	private IParser getDecisionNodeName_5012Parser() {
		if (decisionNodeName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getDecisionNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			decisionNodeName_5012Parser = parser;
		}
		return decisionNodeName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser domainObjectName_5013Parser;

	/**
	* @generated
	*/
	private IParser getDomainObjectName_5013Parser() {
		if (domainObjectName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainObjectName_5013Parser = parser;
		}
		return domainObjectName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser readModelName_5014Parser;

	/**
	* @generated
	*/
	private IParser getReadModelName_5014Parser() {
		if (readModelName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readModelName_5014Parser = parser;
		}
		return readModelName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser domainEventName_5015Parser;

	/**
	* @generated
	*/
	private IParser getDomainEventName_5015Parser() {
		if (domainEventName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainEventName_5015Parser = parser;
		}
		return domainEventName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser actorName_5027Parser;

	/**
	* @generated
	*/
	private IParser getActorName_5027Parser() {
		if (actorName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getActivityPartition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5027Parser = parser;
		}
		return actorName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser systemName_5028Parser;

	/**
	* @generated
	*/
	private IParser getSystemName_5028Parser() {
		if (systemName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getActivityPartition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			systemName_5028Parser = parser;
		}
		return systemName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser activityPartitionName_5029Parser;

	/**
	* @generated
	*/
	private IParser getActivityPartitionName_5029Parser() {
		if (activityPartitionName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getActivityPartition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityPartitionName_5029Parser = parser;
		}
		return activityPartitionName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser constraintPinName_5002Parser;

	/**
	* @generated
	*/
	private IParser getConstraintPinName_5002Parser() {
		if (constraintPinName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constraintPinName_5002Parser = parser;
		}
		return constraintPinName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser valueObjectName_5003Parser;

	/**
	* @generated
	*/
	private IParser getValueObjectName_5003Parser() {
		if (valueObjectName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueObjectName_5003Parser = parser;
		}
		return valueObjectName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser entityName_5004Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5004Parser() {
		if (entityName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5004Parser = parser;
		}
		return entityName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser domainObjectName_5005Parser;

	/**
	* @generated
	*/
	private IParser getDomainObjectName_5005Parser() {
		if (domainObjectName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainObjectName_5005Parser = parser;
		}
		return domainObjectName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser commandActionName_5016Parser;

	/**
	* @generated
	*/
	private IParser getCommandActionName_5016Parser() {
		if (commandActionName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getAction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandActionName_5016Parser = parser;
		}
		return commandActionName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregateName_5017Parser;

	/**
	* @generated
	*/
	private IParser getAggregateName_5017Parser() {
		if (aggregateName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregateName_5017Parser = parser;
		}
		return aggregateName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser queryActionName_5018Parser;

	/**
	* @generated
	*/
	private IParser getQueryActionName_5018Parser() {
		if (queryActionName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getAction_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			queryActionName_5018Parser = parser;
		}
		return queryActionName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser valueObjectName_5019Parser;

	/**
	* @generated
	*/
	private IParser getValueObjectName_5019Parser() {
		if (valueObjectName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueObjectName_5019Parser = parser;
		}
		return valueObjectName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser entityName_5020Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5020Parser() {
		if (entityName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5020Parser = parser;
		}
		return entityName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser externalSystemName_5021Parser;

	/**
	* @generated
	*/
	private IParser getExternalSystemName_5021Parser() {
		if (externalSystemName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalSystemName_5021Parser = parser;
		}
		return externalSystemName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser constraintPinName_5022Parser;

	/**
	* @generated
	*/
	private IParser getConstraintPinName_5022Parser() {
		if (constraintPinName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constraintPinName_5022Parser = parser;
		}
		return constraintPinName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser decisionNodeName_5023Parser;

	/**
	* @generated
	*/
	private IParser getDecisionNodeName_5023Parser() {
		if (decisionNodeName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getDecisionNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			decisionNodeName_5023Parser = parser;
		}
		return decisionNodeName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser domainObjectName_5024Parser;

	/**
	* @generated
	*/
	private IParser getDomainObjectName_5024Parser() {
		if (domainObjectName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainObjectName_5024Parser = parser;
		}
		return domainObjectName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser readModelName_5025Parser;

	/**
	* @generated
	*/
	private IParser getReadModelName_5025Parser() {
		if (readModelName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readModelName_5025Parser = parser;
		}
		return readModelName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser domainEventName_5026Parser;

	/**
	* @generated
	*/
	private IParser getDomainEventName_5026Parser() {
		if (domainEventName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { ActivitystormingPackage.eINSTANCE.getObjectNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainEventName_5026Parser = parser;
		}
		return domainEventName_5026Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CommandActionNameEditPart.VISUAL_ID:
			return getCommandActionName_5001Parser();
		case AggregateNameEditPart.VISUAL_ID:
			return getAggregateName_5006Parser();
		case QueryActionNameEditPart.VISUAL_ID:
			return getQueryActionName_5007Parser();
		case ValueObjectNameEditPart.VISUAL_ID:
			return getValueObjectName_5008Parser();
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5009Parser();
		case ExternalSystemNameEditPart.VISUAL_ID:
			return getExternalSystemName_5010Parser();
		case ConstraintPinNameEditPart.VISUAL_ID:
			return getConstraintPinName_5011Parser();
		case DecisionNodeNameEditPart.VISUAL_ID:
			return getDecisionNodeName_5012Parser();
		case DomainObjectNameEditPart.VISUAL_ID:
			return getDomainObjectName_5013Parser();
		case ReadModelNameEditPart.VISUAL_ID:
			return getReadModelName_5014Parser();
		case DomainEventNameEditPart.VISUAL_ID:
			return getDomainEventName_5015Parser();
		case ActorNameEditPart.VISUAL_ID:
			return getActorName_5027Parser();
		case SystemNameEditPart.VISUAL_ID:
			return getSystemName_5028Parser();
		case ActivityPartitionNameEditPart.VISUAL_ID:
			return getActivityPartitionName_5029Parser();
		case ConstraintPinName2EditPart.VISUAL_ID:
			return getConstraintPinName_5002Parser();
		case ValueObjectName2EditPart.VISUAL_ID:
			return getValueObjectName_5003Parser();
		case EntityName2EditPart.VISUAL_ID:
			return getEntityName_5004Parser();
		case DomainObjectName2EditPart.VISUAL_ID:
			return getDomainObjectName_5005Parser();
		case CommandActionName2EditPart.VISUAL_ID:
			return getCommandActionName_5016Parser();
		case AggregateName2EditPart.VISUAL_ID:
			return getAggregateName_5017Parser();
		case QueryActionName2EditPart.VISUAL_ID:
			return getQueryActionName_5018Parser();
		case ValueObjectName3EditPart.VISUAL_ID:
			return getValueObjectName_5019Parser();
		case EntityName3EditPart.VISUAL_ID:
			return getEntityName_5020Parser();
		case ExternalSystemName2EditPart.VISUAL_ID:
			return getExternalSystemName_5021Parser();
		case ConstraintPinName3EditPart.VISUAL_ID:
			return getConstraintPinName_5022Parser();
		case DecisionNodeName2EditPart.VISUAL_ID:
			return getDecisionNodeName_5023Parser();
		case DomainObjectName3EditPart.VISUAL_ID:
			return getDomainObjectName_5024Parser();
		case ReadModelName2EditPart.VISUAL_ID:
			return getReadModelName_5025Parser();
		case DomainEventName2EditPart.VISUAL_ID:
			return getDomainEventName_5026Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ActivitystormingVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ActivitystormingVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ActivitystormingElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
