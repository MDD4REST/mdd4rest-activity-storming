/*
 * 
 */
package ActivityStorming.diagram.providers;

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

/**
 * @generated
 */
public class ActivityStormingParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser commandActionName_5042Parser;

	/**
	* @generated
	*/
	private IParser getCommandActionName_5042Parser() {
		if (commandActionName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getAction_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			commandActionName_5042Parser = parser;
		}
		return commandActionName_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregateName_5047Parser;

	/**
	* @generated
	*/
	private IParser getAggregateName_5047Parser() {
		if (aggregateName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			aggregateName_5047Parser = parser;
		}
		return aggregateName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser queryActionName_5048Parser;

	/**
	* @generated
	*/
	private IParser getQueryActionName_5048Parser() {
		if (queryActionName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getAction_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			queryActionName_5048Parser = parser;
		}
		return queryActionName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser valueObjectName_5049Parser;

	/**
	* @generated
	*/
	private IParser getValueObjectName_5049Parser() {
		if (valueObjectName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			valueObjectName_5049Parser = parser;
		}
		return valueObjectName_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser entityName_5050Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5050Parser() {
		if (entityName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			entityName_5050Parser = parser;
		}
		return entityName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser externalSystemName_5051Parser;

	/**
	* @generated
	*/
	private IParser getExternalSystemName_5051Parser() {
		if (externalSystemName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			externalSystemName_5051Parser = parser;
		}
		return externalSystemName_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser constraintPinName_5052Parser;

	/**
	* @generated
	*/
	private IParser getConstraintPinName_5052Parser() {
		if (constraintPinName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			constraintPinName_5052Parser = parser;
		}
		return constraintPinName_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser decisionNodeName_5053Parser;

	/**
	* @generated
	*/
	private IParser getDecisionNodeName_5053Parser() {
		if (decisionNodeName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getDecisionNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			decisionNodeName_5053Parser = parser;
		}
		return decisionNodeName_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser domainObjectName_5054Parser;

	/**
	* @generated
	*/
	private IParser getDomainObjectName_5054Parser() {
		if (domainObjectName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			domainObjectName_5054Parser = parser;
		}
		return domainObjectName_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser readModelName_5055Parser;

	/**
	* @generated
	*/
	private IParser getReadModelName_5055Parser() {
		if (readModelName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			readModelName_5055Parser = parser;
		}
		return readModelName_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser domainEventName_5056Parser;

	/**
	* @generated
	*/
	private IParser getDomainEventName_5056Parser() {
		if (domainEventName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			domainEventName_5056Parser = parser;
		}
		return domainEventName_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser actorName_5068Parser;

	/**
	* @generated
	*/
	private IParser getActorName_5068Parser() {
		if (actorName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityPartition_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			actorName_5068Parser = parser;
		}
		return actorName_5068Parser;
	}

	/**
	* @generated
	*/
	private IParser systemName_5069Parser;

	/**
	* @generated
	*/
	private IParser getSystemName_5069Parser() {
		if (systemName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityPartition_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			systemName_5069Parser = parser;
		}
		return systemName_5069Parser;
	}

	/**
	* @generated
	*/
	private IParser activityPartitionName_5070Parser;

	/**
	* @generated
	*/
	private IParser getActivityPartitionName_5070Parser() {
		if (activityPartitionName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getActivityPartition_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			activityPartitionName_5070Parser = parser;
		}
		return activityPartitionName_5070Parser;
	}

	/**
	* @generated
	*/
	private IParser constraintPinName_5043Parser;

	/**
	* @generated
	*/
	private IParser getConstraintPinName_5043Parser() {
		if (constraintPinName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			constraintPinName_5043Parser = parser;
		}
		return constraintPinName_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser valueObjectName_5044Parser;

	/**
	* @generated
	*/
	private IParser getValueObjectName_5044Parser() {
		if (valueObjectName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			valueObjectName_5044Parser = parser;
		}
		return valueObjectName_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser entityName_5045Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5045Parser() {
		if (entityName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			entityName_5045Parser = parser;
		}
		return entityName_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser domainObjectName_5046Parser;

	/**
	* @generated
	*/
	private IParser getDomainObjectName_5046Parser() {
		if (domainObjectName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			domainObjectName_5046Parser = parser;
		}
		return domainObjectName_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser commandActionName_5057Parser;

	/**
	* @generated
	*/
	private IParser getCommandActionName_5057Parser() {
		if (commandActionName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getAction_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			commandActionName_5057Parser = parser;
		}
		return commandActionName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregateName_5058Parser;

	/**
	* @generated
	*/
	private IParser getAggregateName_5058Parser() {
		if (aggregateName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			aggregateName_5058Parser = parser;
		}
		return aggregateName_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser queryActionName_5059Parser;

	/**
	* @generated
	*/
	private IParser getQueryActionName_5059Parser() {
		if (queryActionName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getAction_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			queryActionName_5059Parser = parser;
		}
		return queryActionName_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser valueObjectName_5060Parser;

	/**
	* @generated
	*/
	private IParser getValueObjectName_5060Parser() {
		if (valueObjectName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			valueObjectName_5060Parser = parser;
		}
		return valueObjectName_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser entityName_5061Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5061Parser() {
		if (entityName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			entityName_5061Parser = parser;
		}
		return entityName_5061Parser;
	}

	/**
	* @generated
	*/
	private IParser externalSystemName_5062Parser;

	/**
	* @generated
	*/
	private IParser getExternalSystemName_5062Parser() {
		if (externalSystemName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			externalSystemName_5062Parser = parser;
		}
		return externalSystemName_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser constraintPinName_5063Parser;

	/**
	* @generated
	*/
	private IParser getConstraintPinName_5063Parser() {
		if (constraintPinName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			constraintPinName_5063Parser = parser;
		}
		return constraintPinName_5063Parser;
	}

	/**
	* @generated
	*/
	private IParser decisionNodeName_5064Parser;

	/**
	* @generated
	*/
	private IParser getDecisionNodeName_5064Parser() {
		if (decisionNodeName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getDecisionNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			decisionNodeName_5064Parser = parser;
		}
		return decisionNodeName_5064Parser;
	}

	/**
	* @generated
	*/
	private IParser domainObjectName_5065Parser;

	/**
	* @generated
	*/
	private IParser getDomainObjectName_5065Parser() {
		if (domainObjectName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			domainObjectName_5065Parser = parser;
		}
		return domainObjectName_5065Parser;
	}

	/**
	* @generated
	*/
	private IParser readModelName_5066Parser;

	/**
	* @generated
	*/
	private IParser getReadModelName_5066Parser() {
		if (readModelName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			readModelName_5066Parser = parser;
		}
		return readModelName_5066Parser;
	}

	/**
	* @generated
	*/
	private IParser domainEventName_5067Parser;

	/**
	* @generated
	*/
	private IParser getDomainEventName_5067Parser() {
		if (domainEventName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ActivityStorming.ActivityStormingPackage.eINSTANCE.getObjectNode_Name() };
			ActivityStorming.diagram.parsers.MessageFormatParser parser = new ActivityStorming.diagram.parsers.MessageFormatParser(
					features);
			domainEventName_5067Parser = parser;
		}
		return domainEventName_5067Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActivityStorming.diagram.edit.parts.CommandActionNameEditPart.VISUAL_ID:
			return getCommandActionName_5042Parser();
		case ActivityStorming.diagram.edit.parts.AggregateNameEditPart.VISUAL_ID:
			return getAggregateName_5047Parser();
		case ActivityStorming.diagram.edit.parts.QueryActionNameEditPart.VISUAL_ID:
			return getQueryActionName_5048Parser();
		case ActivityStorming.diagram.edit.parts.ValueObjectNameEditPart.VISUAL_ID:
			return getValueObjectName_5049Parser();
		case ActivityStorming.diagram.edit.parts.EntityNameEditPart.VISUAL_ID:
			return getEntityName_5050Parser();
		case ActivityStorming.diagram.edit.parts.ExternalSystemNameEditPart.VISUAL_ID:
			return getExternalSystemName_5051Parser();
		case ActivityStorming.diagram.edit.parts.ConstraintPinNameEditPart.VISUAL_ID:
			return getConstraintPinName_5052Parser();
		case ActivityStorming.diagram.edit.parts.DecisionNodeNameEditPart.VISUAL_ID:
			return getDecisionNodeName_5053Parser();
		case ActivityStorming.diagram.edit.parts.DomainObjectNameEditPart.VISUAL_ID:
			return getDomainObjectName_5054Parser();
		case ActivityStorming.diagram.edit.parts.ReadModelNameEditPart.VISUAL_ID:
			return getReadModelName_5055Parser();
		case ActivityStorming.diagram.edit.parts.DomainEventNameEditPart.VISUAL_ID:
			return getDomainEventName_5056Parser();
		case ActivityStorming.diagram.edit.parts.ActorNameEditPart.VISUAL_ID:
			return getActorName_5068Parser();
		case ActivityStorming.diagram.edit.parts.SystemNameEditPart.VISUAL_ID:
			return getSystemName_5069Parser();
		case ActivityStorming.diagram.edit.parts.ActivityPartitionNameEditPart.VISUAL_ID:
			return getActivityPartitionName_5070Parser();
		case ActivityStorming.diagram.edit.parts.ConstraintPinName2EditPart.VISUAL_ID:
			return getConstraintPinName_5043Parser();
		case ActivityStorming.diagram.edit.parts.ValueObjectName2EditPart.VISUAL_ID:
			return getValueObjectName_5044Parser();
		case ActivityStorming.diagram.edit.parts.EntityName2EditPart.VISUAL_ID:
			return getEntityName_5045Parser();
		case ActivityStorming.diagram.edit.parts.DomainObjectName2EditPart.VISUAL_ID:
			return getDomainObjectName_5046Parser();
		case ActivityStorming.diagram.edit.parts.CommandActionName2EditPart.VISUAL_ID:
			return getCommandActionName_5057Parser();
		case ActivityStorming.diagram.edit.parts.AggregateName2EditPart.VISUAL_ID:
			return getAggregateName_5058Parser();
		case ActivityStorming.diagram.edit.parts.QueryActionName2EditPart.VISUAL_ID:
			return getQueryActionName_5059Parser();
		case ActivityStorming.diagram.edit.parts.ValueObjectName3EditPart.VISUAL_ID:
			return getValueObjectName_5060Parser();
		case ActivityStorming.diagram.edit.parts.EntityName3EditPart.VISUAL_ID:
			return getEntityName_5061Parser();
		case ActivityStorming.diagram.edit.parts.ExternalSystemName2EditPart.VISUAL_ID:
			return getExternalSystemName_5062Parser();
		case ActivityStorming.diagram.edit.parts.ConstraintPinName3EditPart.VISUAL_ID:
			return getConstraintPinName_5063Parser();
		case ActivityStorming.diagram.edit.parts.DecisionNodeName2EditPart.VISUAL_ID:
			return getDecisionNodeName_5064Parser();
		case ActivityStorming.diagram.edit.parts.DomainObjectName3EditPart.VISUAL_ID:
			return getDomainObjectName_5065Parser();
		case ActivityStorming.diagram.edit.parts.ReadModelName2EditPart.VISUAL_ID:
			return getReadModelName_5066Parser();
		case ActivityStorming.diagram.edit.parts.DomainEventName2EditPart.VISUAL_ID:
			return getDomainEventName_5067Parser();
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
			return getParser(ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ActivityStorming.diagram.providers.ActivityStormingElementTypes.getElement(hint) == null) {
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
