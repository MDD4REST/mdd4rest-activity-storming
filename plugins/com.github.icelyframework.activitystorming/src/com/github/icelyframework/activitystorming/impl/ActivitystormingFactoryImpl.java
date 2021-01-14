/**
 */
package com.github.icelyframework.activitystorming.impl;

import com.github.icelyframework.activitystorming.Action;
import com.github.icelyframework.activitystorming.ActivityDiagram;
import com.github.icelyframework.activitystorming.ActivityEdge;
import com.github.icelyframework.activitystorming.ActivityNode;
import com.github.icelyframework.activitystorming.ActivityParameterNode;
import com.github.icelyframework.activitystorming.ActivityPartition;
import com.github.icelyframework.activitystorming.ActivitystormingFactory;
import com.github.icelyframework.activitystorming.ActivitystormingPackage;
import com.github.icelyframework.activitystorming.Actor;
import com.github.icelyframework.activitystorming.Aggregate;
import com.github.icelyframework.activitystorming.CallAction;
import com.github.icelyframework.activitystorming.CallActivityAction;
import com.github.icelyframework.activitystorming.CallBehaviorAction;
import com.github.icelyframework.activitystorming.CallOperationAction;
import com.github.icelyframework.activitystorming.CommandAction;
import com.github.icelyframework.activitystorming.ConstraintPin;
import com.github.icelyframework.activitystorming.ControlFlow;
import com.github.icelyframework.activitystorming.ControlNode;
import com.github.icelyframework.activitystorming.DecisionNode;
import com.github.icelyframework.activitystorming.DomainEvent;
import com.github.icelyframework.activitystorming.DomainObject;
import com.github.icelyframework.activitystorming.Entity;
import com.github.icelyframework.activitystorming.ExecutableNode;
import com.github.icelyframework.activitystorming.ExternalSystem;
import com.github.icelyframework.activitystorming.FinalNode;
import com.github.icelyframework.activitystorming.ForkNode;
import com.github.icelyframework.activitystorming.InitialNode;
import com.github.icelyframework.activitystorming.InputPin;
import com.github.icelyframework.activitystorming.JoinNode;
import com.github.icelyframework.activitystorming.MergeNode;
import com.github.icelyframework.activitystorming.ObjectAction;
import com.github.icelyframework.activitystorming.ObjectActionKind;
import com.github.icelyframework.activitystorming.ObjectFlow;
import com.github.icelyframework.activitystorming.ObjectNode;
import com.github.icelyframework.activitystorming.ObjectNodeOrderingKind;
import com.github.icelyframework.activitystorming.OutputPin;
import com.github.icelyframework.activitystorming.Pin;
import com.github.icelyframework.activitystorming.QueryAction;
import com.github.icelyframework.activitystorming.ReadModel;
import com.github.icelyframework.activitystorming.StartObjectBehaviorAction;
import com.github.icelyframework.activitystorming.ValueObject;
import com.github.icelyframework.activitystorming.ValueSpecification;
import com.github.icelyframework.activitystorming.Variable;

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
public class ActivitystormingFactoryImpl extends EFactoryImpl implements ActivitystormingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivitystormingFactory init() {
		try {
			ActivitystormingFactory theActivitystormingFactory = (ActivitystormingFactory)EPackage.Registry.INSTANCE.getEFactory(ActivitystormingPackage.eNS_URI);
			if (theActivitystormingFactory != null) {
				return theActivitystormingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivitystormingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitystormingFactoryImpl() {
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
			case ActivitystormingPackage.ACTIVITY_DIAGRAM: return createActivityDiagram();
			case ActivitystormingPackage.ACTIVITY_NODE: return createActivityNode();
			case ActivitystormingPackage.ACTIVITY_EDGE: return createActivityEdge();
			case ActivitystormingPackage.OBJECT_FLOW: return createObjectFlow();
			case ActivitystormingPackage.CONTROL_FLOW: return createControlFlow();
			case ActivitystormingPackage.CONTROL_NODE: return createControlNode();
			case ActivitystormingPackage.EXECUTABLE_NODE: return createExecutableNode();
			case ActivitystormingPackage.INITIAL_NODE: return createInitialNode();
			case ActivitystormingPackage.FORK_NODE: return createForkNode();
			case ActivitystormingPackage.JOIN_NODE: return createJoinNode();
			case ActivitystormingPackage.DECISION_NODE: return createDecisionNode();
			case ActivitystormingPackage.MERGE_NODE: return createMergeNode();
			case ActivitystormingPackage.FINAL_NODE: return createFinalNode();
			case ActivitystormingPackage.INPUT_PIN: return createInputPin();
			case ActivitystormingPackage.OUTPUT_PIN: return createOutputPin();
			case ActivitystormingPackage.PIN: return createPin();
			case ActivitystormingPackage.OBJECT_NODE: return createObjectNode();
			case ActivitystormingPackage.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
			case ActivitystormingPackage.VARIABLE: return createVariable();
			case ActivitystormingPackage.VALUE_SPECIFICATION: return createValueSpecification();
			case ActivitystormingPackage.ACTION: return createAction();
			case ActivitystormingPackage.CALL_ACTION: return createCallAction();
			case ActivitystormingPackage.START_OBJECT_BEHAVIOR_ACTION: return createStartObjectBehaviorAction();
			case ActivitystormingPackage.OBJECT_ACTION: return createObjectAction();
			case ActivitystormingPackage.CALL_BEHAVIOR_ACTION: return createCallBehaviorAction();
			case ActivitystormingPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
			case ActivitystormingPackage.CALL_ACTIVITY_ACTION: return createCallActivityAction();
			case ActivitystormingPackage.ACTIVITY_PARTITION: return createActivityPartition();
			case ActivitystormingPackage.COMMAND_ACTION: return createCommandAction();
			case ActivitystormingPackage.AGGREGATE: return createAggregate();
			case ActivitystormingPackage.QUERY_ACTION: return createQueryAction();
			case ActivitystormingPackage.DOMAIN_OBJECT: return createDomainObject();
			case ActivitystormingPackage.VALUE_OBJECT: return createValueObject();
			case ActivitystormingPackage.ENTITY: return createEntity();
			case ActivitystormingPackage.ACTOR: return createActor();
			case ActivitystormingPackage.SYSTEM: return createSystem();
			case ActivitystormingPackage.EXTERNAL_SYSTEM: return createExternalSystem();
			case ActivitystormingPackage.READ_MODEL: return createReadModel();
			case ActivitystormingPackage.DOMAIN_EVENT: return createDomainEvent();
			case ActivitystormingPackage.CONSTRAINT_PIN: return createConstraintPin();
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
			case ActivitystormingPackage.OBJECT_NODE_ORDERING_KIND:
				return createObjectNodeOrderingKindFromString(eDataType, initialValue);
			case ActivitystormingPackage.OBJECT_ACTION_KIND:
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
			case ActivitystormingPackage.OBJECT_NODE_ORDERING_KIND:
				return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
			case ActivitystormingPackage.OBJECT_ACTION_KIND:
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
	public com.github.icelyframework.activitystorming.System createSystem() {
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
	public ActivitystormingPackage getActivitystormingPackage() {
		return (ActivitystormingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivitystormingPackage getPackage() {
		return ActivitystormingPackage.eINSTANCE;
	}

} //ActivitystormingFactoryImpl
