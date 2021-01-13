/**
 */
package ActivityStorming.provider;

import ActivityStorming.util.ActivityStormingAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityStormingItemProviderAdapterFactory extends ActivityStormingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityStormingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ActivityDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramItemProvider activityDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ActivityDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityDiagramAdapter() {
		if (activityDiagramItemProvider == null) {
			activityDiagramItemProvider = new ActivityDiagramItemProvider(this);
		}

		return activityDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ActivityNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeItemProvider activityNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityNodeAdapter() {
		if (activityNodeItemProvider == null) {
			activityNodeItemProvider = new ActivityNodeItemProvider(this);
		}

		return activityNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ActivityEdge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeItemProvider activityEdgeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityEdgeAdapter() {
		if (activityEdgeItemProvider == null) {
			activityEdgeItemProvider = new ActivityEdgeItemProvider(this);
		}

		return activityEdgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ObjectFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFlowItemProvider objectFlowItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ObjectFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectFlowAdapter() {
		if (objectFlowItemProvider == null) {
			objectFlowItemProvider = new ObjectFlowItemProvider(this);
		}

		return objectFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ControlFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowItemProvider controlFlowItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ControlFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlFlowAdapter() {
		if (controlFlowItemProvider == null) {
			controlFlowItemProvider = new ControlFlowItemProvider(this);
		}

		return controlFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ControlNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlNodeItemProvider controlNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ControlNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlNodeAdapter() {
		if (controlNodeItemProvider == null) {
			controlNodeItemProvider = new ControlNodeItemProvider(this);
		}

		return controlNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ExecutableNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableNodeItemProvider executableNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutableNodeAdapter() {
		if (executableNodeItemProvider == null) {
			executableNodeItemProvider = new ExecutableNodeItemProvider(this);
		}

		return executableNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.InitialNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialNodeItemProvider initialNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.InitialNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialNodeAdapter() {
		if (initialNodeItemProvider == null) {
			initialNodeItemProvider = new InitialNodeItemProvider(this);
		}

		return initialNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ForkNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkNodeItemProvider forkNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ForkNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkNodeAdapter() {
		if (forkNodeItemProvider == null) {
			forkNodeItemProvider = new ForkNodeItemProvider(this);
		}

		return forkNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.JoinNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeItemProvider joinNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.JoinNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinNodeAdapter() {
		if (joinNodeItemProvider == null) {
			joinNodeItemProvider = new JoinNodeItemProvider(this);
		}

		return joinNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.DecisionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeItemProvider decisionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.DecisionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecisionNodeAdapter() {
		if (decisionNodeItemProvider == null) {
			decisionNodeItemProvider = new DecisionNodeItemProvider(this);
		}

		return decisionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.MergeNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeNodeItemProvider mergeNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.MergeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMergeNodeAdapter() {
		if (mergeNodeItemProvider == null) {
			mergeNodeItemProvider = new MergeNodeItemProvider(this);
		}

		return mergeNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.FinalNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalNodeItemProvider finalNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.FinalNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalNodeAdapter() {
		if (finalNodeItemProvider == null) {
			finalNodeItemProvider = new FinalNodeItemProvider(this);
		}

		return finalNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.InputPin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPinItemProvider inputPinItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputPinAdapter() {
		if (inputPinItemProvider == null) {
			inputPinItemProvider = new InputPinItemProvider(this);
		}

		return inputPinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.OutputPin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPinItemProvider outputPinItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputPinAdapter() {
		if (outputPinItemProvider == null) {
			outputPinItemProvider = new OutputPinItemProvider(this);
		}

		return outputPinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.Pin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinItemProvider pinItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.Pin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPinAdapter() {
		if (pinItemProvider == null) {
			pinItemProvider = new PinItemProvider(this);
		}

		return pinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ObjectNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeItemProvider objectNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ObjectNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectNodeAdapter() {
		if (objectNodeItemProvider == null) {
			objectNodeItemProvider = new ObjectNodeItemProvider(this);
		}

		return objectNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ActivityParameterNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityParameterNodeItemProvider activityParameterNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ActivityParameterNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityParameterNodeAdapter() {
		if (activityParameterNodeItemProvider == null) {
			activityParameterNodeItemProvider = new ActivityParameterNodeItemProvider(this);
		}

		return activityParameterNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ValueSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationItemProvider valueSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueSpecificationAdapter() {
		if (valueSpecificationItemProvider == null) {
			valueSpecificationItemProvider = new ValueSpecificationItemProvider(this);
		}

		return valueSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.CallAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActionItemProvider callActionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.CallAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallActionAdapter() {
		if (callActionItemProvider == null) {
			callActionItemProvider = new CallActionItemProvider(this);
		}

		return callActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.StartObjectBehaviorAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartObjectBehaviorActionItemProvider startObjectBehaviorActionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.StartObjectBehaviorAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartObjectBehaviorActionAdapter() {
		if (startObjectBehaviorActionItemProvider == null) {
			startObjectBehaviorActionItemProvider = new StartObjectBehaviorActionItemProvider(this);
		}

		return startObjectBehaviorActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ObjectAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectActionItemProvider objectActionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ObjectAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectActionAdapter() {
		if (objectActionItemProvider == null) {
			objectActionItemProvider = new ObjectActionItemProvider(this);
		}

		return objectActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.CallBehaviorAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBehaviorActionItemProvider callBehaviorActionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.CallBehaviorAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallBehaviorActionAdapter() {
		if (callBehaviorActionItemProvider == null) {
			callBehaviorActionItemProvider = new CallBehaviorActionItemProvider(this);
		}

		return callBehaviorActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.CallOperationAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallOperationActionItemProvider callOperationActionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.CallOperationAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallOperationActionAdapter() {
		if (callOperationActionItemProvider == null) {
			callOperationActionItemProvider = new CallOperationActionItemProvider(this);
		}

		return callOperationActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.CallActivityAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActivityActionItemProvider callActivityActionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.CallActivityAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallActivityActionAdapter() {
		if (callActivityActionItemProvider == null) {
			callActivityActionItemProvider = new CallActivityActionItemProvider(this);
		}

		return callActivityActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ActivityPartition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionItemProvider activityPartitionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityPartitionAdapter() {
		if (activityPartitionItemProvider == null) {
			activityPartitionItemProvider = new ActivityPartitionItemProvider(this);
		}

		return activityPartitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.CommandAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandActionItemProvider commandActionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.CommandAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandActionAdapter() {
		if (commandActionItemProvider == null) {
			commandActionItemProvider = new CommandActionItemProvider(this);
		}

		return commandActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.Aggregate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateItemProvider aggregateItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.Aggregate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAggregateAdapter() {
		if (aggregateItemProvider == null) {
			aggregateItemProvider = new AggregateItemProvider(this);
		}

		return aggregateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.QueryAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryActionItemProvider queryActionItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.QueryAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryActionAdapter() {
		if (queryActionItemProvider == null) {
			queryActionItemProvider = new QueryActionItemProvider(this);
		}

		return queryActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.DomainObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectItemProvider domainObjectItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.DomainObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainObjectAdapter() {
		if (domainObjectItemProvider == null) {
			domainObjectItemProvider = new DomainObjectItemProvider(this);
		}

		return domainObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ValueObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueObjectItemProvider valueObjectItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueObjectAdapter() {
		if (valueObjectItemProvider == null) {
			valueObjectItemProvider = new ValueObjectItemProvider(this);
		}

		return valueObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.Actor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorItemProvider actorItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActorAdapter() {
		if (actorItemProvider == null) {
			actorItemProvider = new ActorItemProvider(this);
		}

		return actorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ExternalSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalSystemItemProvider externalSystemItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ExternalSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalSystemAdapter() {
		if (externalSystemItemProvider == null) {
			externalSystemItemProvider = new ExternalSystemItemProvider(this);
		}

		return externalSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ReadModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadModelItemProvider readModelItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ReadModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadModelAdapter() {
		if (readModelItemProvider == null) {
			readModelItemProvider = new ReadModelItemProvider(this);
		}

		return readModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.DomainEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainEventItemProvider domainEventItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.DomainEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainEventAdapter() {
		if (domainEventItemProvider == null) {
			domainEventItemProvider = new DomainEventItemProvider(this);
		}

		return domainEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ActivityStorming.ConstraintPin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintPinItemProvider constraintPinItemProvider;

	/**
	 * This creates an adapter for a {@link ActivityStorming.ConstraintPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintPinAdapter() {
		if (constraintPinItemProvider == null) {
			constraintPinItemProvider = new ConstraintPinItemProvider(this);
		}

		return constraintPinItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (activityDiagramItemProvider != null) activityDiagramItemProvider.dispose();
		if (activityNodeItemProvider != null) activityNodeItemProvider.dispose();
		if (activityEdgeItemProvider != null) activityEdgeItemProvider.dispose();
		if (objectFlowItemProvider != null) objectFlowItemProvider.dispose();
		if (controlFlowItemProvider != null) controlFlowItemProvider.dispose();
		if (controlNodeItemProvider != null) controlNodeItemProvider.dispose();
		if (executableNodeItemProvider != null) executableNodeItemProvider.dispose();
		if (initialNodeItemProvider != null) initialNodeItemProvider.dispose();
		if (forkNodeItemProvider != null) forkNodeItemProvider.dispose();
		if (joinNodeItemProvider != null) joinNodeItemProvider.dispose();
		if (decisionNodeItemProvider != null) decisionNodeItemProvider.dispose();
		if (mergeNodeItemProvider != null) mergeNodeItemProvider.dispose();
		if (finalNodeItemProvider != null) finalNodeItemProvider.dispose();
		if (inputPinItemProvider != null) inputPinItemProvider.dispose();
		if (outputPinItemProvider != null) outputPinItemProvider.dispose();
		if (pinItemProvider != null) pinItemProvider.dispose();
		if (objectNodeItemProvider != null) objectNodeItemProvider.dispose();
		if (activityParameterNodeItemProvider != null) activityParameterNodeItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (valueSpecificationItemProvider != null) valueSpecificationItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (callActionItemProvider != null) callActionItemProvider.dispose();
		if (startObjectBehaviorActionItemProvider != null) startObjectBehaviorActionItemProvider.dispose();
		if (objectActionItemProvider != null) objectActionItemProvider.dispose();
		if (callBehaviorActionItemProvider != null) callBehaviorActionItemProvider.dispose();
		if (callOperationActionItemProvider != null) callOperationActionItemProvider.dispose();
		if (callActivityActionItemProvider != null) callActivityActionItemProvider.dispose();
		if (activityPartitionItemProvider != null) activityPartitionItemProvider.dispose();
		if (commandActionItemProvider != null) commandActionItemProvider.dispose();
		if (aggregateItemProvider != null) aggregateItemProvider.dispose();
		if (queryActionItemProvider != null) queryActionItemProvider.dispose();
		if (domainObjectItemProvider != null) domainObjectItemProvider.dispose();
		if (valueObjectItemProvider != null) valueObjectItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (actorItemProvider != null) actorItemProvider.dispose();
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (externalSystemItemProvider != null) externalSystemItemProvider.dispose();
		if (readModelItemProvider != null) readModelItemProvider.dispose();
		if (domainEventItemProvider != null) domainEventItemProvider.dispose();
		if (constraintPinItemProvider != null) constraintPinItemProvider.dispose();
	}

}
