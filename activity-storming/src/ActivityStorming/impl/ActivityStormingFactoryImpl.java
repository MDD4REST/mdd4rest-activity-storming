/**
 */
package ActivityStorming.impl;

import ActivityStorming.Action;
import ActivityStorming.ActivityDiagram;
import ActivityStorming.ActivityEdge;
import ActivityStorming.ActivityNode;
import ActivityStorming.ActivityParameterNode;
import ActivityStorming.ActivityPartition;
import ActivityStorming.ActivityStormingFactory;
import ActivityStorming.ActivityStormingPackage;
import ActivityStorming.Actor;
import ActivityStorming.Aggregate;
import ActivityStorming.CallAction;
import ActivityStorming.CallActivityAction;
import ActivityStorming.CallBehaviorAction;
import ActivityStorming.CallOperationAction;
import ActivityStorming.CommandAction;
import ActivityStorming.ConstraintPin;
import ActivityStorming.ControlFlow;
import ActivityStorming.ControlNode;
import ActivityStorming.DecisionNode;
import ActivityStorming.DomainEvent;
import ActivityStorming.DomainObject;
import ActivityStorming.Entity;
import ActivityStorming.ExecutableNode;
import ActivityStorming.ExternalSystem;
import ActivityStorming.FinalNode;
import ActivityStorming.ForkNode;
import ActivityStorming.InitialNode;
import ActivityStorming.InputPin;
import ActivityStorming.JoinNode;
import ActivityStorming.MergeNode;
import ActivityStorming.ObjectAction;
import ActivityStorming.ObjectActionKind;
import ActivityStorming.ObjectFlow;
import ActivityStorming.ObjectNode;
import ActivityStorming.ObjectNodeOrderingKind;
import ActivityStorming.OutputPin;
import ActivityStorming.Pin;
import ActivityStorming.QueryAction;
import ActivityStorming.ReadModel;
import ActivityStorming.StartObjectBehaviorAction;
import ActivityStorming.ValueObject;
import ActivityStorming.ValueSpecification;
import ActivityStorming.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityStormingFactoryImpl extends EFactoryImpl implements ActivityStormingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityStormingFactory init() {
		try {
			ActivityStormingFactory theActivityStormingFactory = (ActivityStormingFactory)EPackage.Registry.INSTANCE.getEFactory(ActivityStormingPackage.eNS_URI);
			if (theActivityStormingFactory != null) {
				return theActivityStormingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivityStormingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityStormingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActivityStormingPackage.ACTIVITY_DIAGRAM: return createActivityDiagram();
			case ActivityStormingPackage.ACTIVITY_NODE: return createActivityNode();
			case ActivityStormingPackage.ACTIVITY_EDGE: return createActivityEdge();
			case ActivityStormingPackage.OBJECT_FLOW: return createObjectFlow();
			case ActivityStormingPackage.CONTROL_FLOW: return createControlFlow();
			case ActivityStormingPackage.CONTROL_NODE: return createControlNode();
			case ActivityStormingPackage.EXECUTABLE_NODE: return createExecutableNode();
			case ActivityStormingPackage.INITIAL_NODE: return createInitialNode();
			case ActivityStormingPackage.FORK_NODE: return createForkNode();
			case ActivityStormingPackage.JOIN_NODE: return createJoinNode();
			case ActivityStormingPackage.DECISION_NODE: return createDecisionNode();
			case ActivityStormingPackage.MERGE_NODE: return createMergeNode();
			case ActivityStormingPackage.FINAL_NODE: return createFinalNode();
			case ActivityStormingPackage.INPUT_PIN: return createInputPin();
			case ActivityStormingPackage.OUTPUT_PIN: return createOutputPin();
			case ActivityStormingPackage.PIN: return createPin();
			case ActivityStormingPackage.OBJECT_NODE: return createObjectNode();
			case ActivityStormingPackage.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
			case ActivityStormingPackage.VARIABLE: return createVariable();
			case ActivityStormingPackage.VALUE_SPECIFICATION: return createValueSpecification();
			case ActivityStormingPackage.ACTION: return createAction();
			case ActivityStormingPackage.CALL_ACTION: return createCallAction();
			case ActivityStormingPackage.START_OBJECT_BEHAVIOR_ACTION: return createStartObjectBehaviorAction();
			case ActivityStormingPackage.OBJECT_ACTION: return createObjectAction();
			case ActivityStormingPackage.CALL_BEHAVIOR_ACTION: return createCallBehaviorAction();
			case ActivityStormingPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
			case ActivityStormingPackage.CALL_ACTIVITY_ACTION: return createCallActivityAction();
			case ActivityStormingPackage.ACTIVITY_PARTITION: return createActivityPartition();
			case ActivityStormingPackage.COMMAND_ACTION: return createCommandAction();
			case ActivityStormingPackage.AGGREGATE: return createAggregate();
			case ActivityStormingPackage.QUERY_ACTION: return createQueryAction();
			case ActivityStormingPackage.DOMAIN_OBJECT: return createDomainObject();
			case ActivityStormingPackage.VALUE_OBJECT: return createValueObject();
			case ActivityStormingPackage.ENTITY: return createEntity();
			case ActivityStormingPackage.ACTOR: return createActor();
			case ActivityStormingPackage.SYSTEM: return createSystem();
			case ActivityStormingPackage.EXTERNAL_SYSTEM: return createExternalSystem();
			case ActivityStormingPackage.READ_MODEL: return createReadModel();
			case ActivityStormingPackage.DOMAIN_EVENT: return createDomainEvent();
			case ActivityStormingPackage.CONSTRAINT_PIN: return createConstraintPin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ActivityStormingPackage.OBJECT_NODE_ORDERING_KIND:
				return createObjectNodeOrderingKindFromString(eDataType, initialValue);
			case ActivityStormingPackage.OBJECT_ACTION_KIND:
				return createObjectActionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ActivityStormingPackage.OBJECT_NODE_ORDERING_KIND:
				return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
			case ActivityStormingPackage.OBJECT_ACTION_KIND:
				return convertObjectActionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDiagram createActivityDiagram() {
		ActivityDiagramImpl activityDiagram = new ActivityDiagramImpl();
		return activityDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityNode createActivityNode() {
		ActivityNodeImpl activityNode = new ActivityNodeImpl();
		return activityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityEdge createActivityEdge() {
		ActivityEdgeImpl activityEdge = new ActivityEdgeImpl();
		return activityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectFlow createObjectFlow() {
		ObjectFlowImpl objectFlow = new ObjectFlowImpl();
		return objectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlNode createControlNode() {
		ControlNodeImpl controlNode = new ControlNodeImpl();
		return controlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutableNode createExecutableNode() {
		ExecutableNodeImpl executableNode = new ExecutableNodeImpl();
		return executableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalNode createFinalNode() {
		FinalNodeImpl finalNode = new FinalNodeImpl();
		return finalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPin createInputPin() {
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputPin createOutputPin() {
		OutputPinImpl outputPin = new OutputPinImpl();
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectNode createObjectNode() {
		ObjectNodeImpl objectNode = new ObjectNodeImpl();
		return objectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityParameterNode createActivityParameterNode() {
		ActivityParameterNodeImpl activityParameterNode = new ActivityParameterNodeImpl();
		return activityParameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification createValueSpecification() {
		ValueSpecificationImpl valueSpecification = new ValueSpecificationImpl();
		return valueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallAction createCallAction() {
		CallActionImpl callAction = new CallActionImpl();
		return callAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartObjectBehaviorAction createStartObjectBehaviorAction() {
		StartObjectBehaviorActionImpl startObjectBehaviorAction = new StartObjectBehaviorActionImpl();
		return startObjectBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectAction createObjectAction() {
		ObjectActionImpl objectAction = new ObjectActionImpl();
		return objectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallBehaviorAction createCallBehaviorAction() {
		CallBehaviorActionImpl callBehaviorAction = new CallBehaviorActionImpl();
		return callBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallOperationAction createCallOperationAction() {
		CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
		return callOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallActivityAction createCallActivityAction() {
		CallActivityActionImpl callActivityAction = new CallActivityActionImpl();
		return callActivityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityPartition createActivityPartition() {
		ActivityPartitionImpl activityPartition = new ActivityPartitionImpl();
		return activityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandAction createCommandAction() {
		CommandActionImpl commandAction = new CommandActionImpl();
		return commandAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate createAggregate() {
		AggregateImpl aggregate = new AggregateImpl();
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryAction createQueryAction() {
		QueryActionImpl queryAction = new QueryActionImpl();
		return queryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject createDomainObject() {
		DomainObjectImpl domainObject = new DomainObjectImpl();
		return domainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueObject createValueObject() {
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityStorming.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalSystem createExternalSystem() {
		ExternalSystemImpl externalSystem = new ExternalSystemImpl();
		return externalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReadModel createReadModel() {
		ReadModelImpl readModel = new ReadModelImpl();
		return readModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainEvent createDomainEvent() {
		DomainEventImpl domainEvent = new DomainEventImpl();
		return domainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintPin createConstraintPin() {
		ConstraintPinImpl constraintPin = new ConstraintPinImpl();
		return constraintPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind createObjectNodeOrderingKindFromString(EDataType eDataType, String initialValue) {
		ObjectNodeOrderingKind result = ObjectNodeOrderingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNodeOrderingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectActionKind createObjectActionKindFromString(EDataType eDataType, String initialValue) {
		ObjectActionKind result = ObjectActionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectActionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityStormingPackage getActivityStormingPackage() {
		return (ActivityStormingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivityStormingPackage getPackage() {
		return ActivityStormingPackage.eINSTANCE;
	}

} //ActivityStormingFactoryImpl
