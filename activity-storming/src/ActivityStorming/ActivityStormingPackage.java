/**
 */
package ActivityStorming;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ActivityStorming.ActivityStormingFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface ActivityStormingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ActivityStorming";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "metamodel/ActivityStorming.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "icely";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityStormingPackage eINSTANCE = ActivityStorming.impl.ActivityStormingPackageImpl.init();

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ActivityDiagramImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityDiagram()
	 * @generated
	 */
	int ACTIVITY_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__POSTCONDITION = 2;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__IS_READ_ONLY = 3;

	/**
	 * The feature id for the '<em><b>Is Single Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION = 4;

	/**
	 * The feature id for the '<em><b>Activityedge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ACTIVITYEDGE = 5;

	/**
	 * The feature id for the '<em><b>Activitynode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ACTIVITYNODE = 6;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ACTIVITYPARTITION = 8;

	/**
	 * The number of structural features of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ActivityNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 1;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INCOMMING = 0;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OUTCOMMING = 1;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ACTIVITYPARTITION = 2;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ActivityEdgeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__GUARD = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__WEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__ACTIVITYPARTITION = 5;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ObjectFlowImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectFlow()
	 * @generated
	 */
	int OBJECT_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__GUARD = ACTIVITY_EDGE__GUARD;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__WEIGHT = ACTIVITY_EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__ACTIVITYPARTITION = ACTIVITY_EDGE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Object Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ControlFlowImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__GUARD = ACTIVITY_EDGE__GUARD;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__WEIGHT = ACTIVITY_EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__ACTIVITYPARTITION = ACTIVITY_EDGE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ControlNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 5;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__INCOMMING = ACTIVITY_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OUTCOMMING = ACTIVITY_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__ACTIVITYPARTITION = ACTIVITY_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ExecutableNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 6;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMMING = ACTIVITY_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTCOMMING = ACTIVITY_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__ACTIVITYPARTITION = ACTIVITY_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.InitialNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 7;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ForkNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 8;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.JoinNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 9;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.DecisionNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 10;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Objectnode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OBJECTNODE = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__NAME = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.MergeNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 11;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.FinalNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 12;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ObjectNodeImpl <em>Object Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ObjectNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectNode()
	 * @generated
	 */
	int OBJECT_NODE = 16;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__INCOMMING = ACTIVITY_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OUTCOMMING = ACTIVITY_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ACTIVITYPARTITION = ACTIVITY_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__NAME = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__UPPER_BOUND = ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IS_CONTROL_TYPE = ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ORDER = ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__VARIABLES = ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.PinImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 15;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__INCOMMING = OBJECT_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OUTCOMMING = OBJECT_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ACTIVITYPARTITION = OBJECT_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ORDER = OBJECT_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__VARIABLES = OBJECT_NODE__VARIABLES;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.InputPinImpl <em>Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.InputPinImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getInputPin()
	 * @generated
	 */
	int INPUT_PIN = 13;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__INCOMMING = PIN__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OUTCOMMING = PIN__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ACTIVITYPARTITION = PIN__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__UPPER_BOUND = PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IS_CONTROL_TYPE = PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ORDER = PIN__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__VARIABLES = PIN__VARIABLES;

	/**
	 * The number of structural features of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.OutputPinImpl <em>Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.OutputPinImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 14;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__INCOMMING = PIN__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OUTCOMMING = PIN__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ACTIVITYPARTITION = PIN__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__UPPER_BOUND = PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IS_CONTROL_TYPE = PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ORDER = PIN__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__VARIABLES = PIN__VARIABLES;

	/**
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ActivityParameterNodeImpl <em>Activity Parameter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ActivityParameterNodeImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityParameterNode()
	 * @generated
	 */
	int ACTIVITY_PARAMETER_NODE = 17;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__INCOMMING = OBJECT_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__OUTCOMMING = OBJECT_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__ACTIVITYPARTITION = OBJECT_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__ORDER = OBJECT_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__VARIABLES = OBJECT_NODE__VARIABLES;

	/**
	 * The number of structural features of the '<em>Activity Parameter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.VariableImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UPPER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LOWER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ValueSpecificationImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 19;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ActionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 20;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMMING = EXECUTABLE_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTCOMMING = EXECUTABLE_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVITYPARTITION = EXECUTABLE_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INPUTPIN = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTPUTPIN = EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SUPPLIER = EXECUTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Callactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CALLACTIONS = EXECUTABLE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.CallActionImpl <em>Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.CallActionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCallAction()
	 * @generated
	 */
	int CALL_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INCOMMING = ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OUTCOMMING = ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ACTIVITYPARTITION = ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INPUTPIN = ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OUTPUTPIN = ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__SUPPLIER = ACTION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Callactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__CALLACTIONS = ACTION__CALLACTIONS;

	/**
	 * The number of structural features of the '<em>Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.StartObjectBehaviorActionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getStartObjectBehaviorAction()
	 * @generated
	 */
	int START_OBJECT_BEHAVIOR_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__SUPPLIER = CALL_ACTION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Callactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__CALLACTIONS = CALL_ACTION__CALLACTIONS;

	/**
	 * The number of structural features of the '<em>Start Object Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ObjectActionImpl <em>Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ObjectActionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectAction()
	 * @generated
	 */
	int OBJECT_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__SUPPLIER = CALL_ACTION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Callactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__CALLACTIONS = CALL_ACTION__CALLACTIONS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__KIND = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.CallBehaviorActionImpl <em>Call Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.CallBehaviorActionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCallBehaviorAction()
	 * @generated
	 */
	int CALL_BEHAVIOR_ACTION = 24;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__SUPPLIER = CALL_ACTION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Callactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__CALLACTIONS = CALL_ACTION__CALLACTIONS;

	/**
	 * The number of structural features of the '<em>Call Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.CallOperationActionImpl <em>Call Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.CallOperationActionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCallOperationAction()
	 * @generated
	 */
	int CALL_OPERATION_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__SUPPLIER = CALL_ACTION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Callactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__CALLACTIONS = CALL_ACTION__CALLACTIONS;

	/**
	 * The number of structural features of the '<em>Call Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.CallActivityActionImpl <em>Call Activity Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.CallActivityActionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCallActivityAction()
	 * @generated
	 */
	int CALL_ACTIVITY_ACTION = 26;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__SUPPLIER = CALL_ACTION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Callactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__CALLACTIONS = CALL_ACTION__CALLACTIONS;

	/**
	 * The feature id for the '<em><b>Activitydiagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Activity Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ActivityPartitionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityPartition()
	 * @generated
	 */
	int ACTIVITY_PARTITION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subpartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUBPARTITION = 1;

	/**
	 * The feature id for the '<em><b>Activityedge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__ACTIVITYEDGE = 2;

	/**
	 * The feature id for the '<em><b>Activitynode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__ACTIVITYNODE = 3;

	/**
	 * The number of structural features of the '<em>Activity Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.CommandActionImpl <em>Command Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.CommandActionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCommandAction()
	 * @generated
	 */
	int COMMAND_ACTION = 28;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__INCOMMING = ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__OUTCOMMING = ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__ACTIVITYPARTITION = ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__INPUTPIN = ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__OUTPUTPIN = ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__SUPPLIER = ACTION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Callactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__CALLACTIONS = ACTION__CALLACTIONS;

	/**
	 * The number of structural features of the '<em>Command Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.SupplierImpl <em>Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.SupplierImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getSupplier()
	 * @generated
	 */
	int SUPPLIER = 38;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__INCOMMING = OBJECT_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__OUTCOMMING = OBJECT_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ACTIVITYPARTITION = OBJECT_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ORDER = OBJECT_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__VARIABLES = OBJECT_NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ACTION = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__TRIGGERS = OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Readmodels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__READMODELS = OBJECT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__CONSTRAINTS = OBJECT_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.AggregateImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 29;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__INCOMMING = SUPPLIER__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__OUTCOMMING = SUPPLIER__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__ACTIVITYPARTITION = SUPPLIER__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__NAME = SUPPLIER__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__UPPER_BOUND = SUPPLIER__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__IS_CONTROL_TYPE = SUPPLIER__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__ORDER = SUPPLIER__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__VARIABLES = SUPPLIER__VARIABLES;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__ACTION = SUPPLIER__ACTION;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__TRIGGERS = SUPPLIER__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Readmodels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__READMODELS = SUPPLIER__READMODELS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__CONSTRAINTS = SUPPLIER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Domainobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__DOMAINOBJECT = SUPPLIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = SUPPLIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.QueryActionImpl <em>Query Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.QueryActionImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getQueryAction()
	 * @generated
	 */
	int QUERY_ACTION = 30;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__INCOMMING = ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__OUTCOMMING = ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__ACTIVITYPARTITION = ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__INPUTPIN = ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__OUTPUTPIN = ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__SUPPLIER = ACTION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Callactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__CALLACTIONS = ACTION__CALLACTIONS;

	/**
	 * The number of structural features of the '<em>Query Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.DomainObjectImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getDomainObject()
	 * @generated
	 */
	int DOMAIN_OBJECT = 31;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__INCOMMING = OBJECT_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__OUTCOMMING = OBJECT_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__ACTIVITYPARTITION = OBJECT_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__ORDER = OBJECT_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__VARIABLES = OBJECT_NODE__VARIABLES;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ValueObjectImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 32;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__INCOMMING = DOMAIN_OBJECT__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__OUTCOMMING = DOMAIN_OBJECT__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__ACTIVITYPARTITION = DOMAIN_OBJECT__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__UPPER_BOUND = DOMAIN_OBJECT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__IS_CONTROL_TYPE = DOMAIN_OBJECT__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__ORDER = DOMAIN_OBJECT__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__VARIABLES = DOMAIN_OBJECT__VARIABLES;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.EntityImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 33;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INCOMMING = DOMAIN_OBJECT__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OUTCOMMING = DOMAIN_OBJECT__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ACTIVITYPARTITION = DOMAIN_OBJECT__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__UPPER_BOUND = DOMAIN_OBJECT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_CONTROL_TYPE = DOMAIN_OBJECT__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ORDER = DOMAIN_OBJECT__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VARIABLES = DOMAIN_OBJECT__VARIABLES;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ActorImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = ACTIVITY_PARTITION__NAME;

	/**
	 * The feature id for the '<em><b>Subpartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUBPARTITION = ACTIVITY_PARTITION__SUBPARTITION;

	/**
	 * The feature id for the '<em><b>Activityedge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTIVITYEDGE = ACTIVITY_PARTITION__ACTIVITYEDGE;

	/**
	 * The feature id for the '<em><b>Activitynode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTIVITYNODE = ACTIVITY_PARTITION__ACTIVITYNODE;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ACTIVITY_PARTITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.SystemImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = ACTIVITY_PARTITION__NAME;

	/**
	 * The feature id for the '<em><b>Subpartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUBPARTITION = ACTIVITY_PARTITION__SUBPARTITION;

	/**
	 * The feature id for the '<em><b>Activityedge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ACTIVITYEDGE = ACTIVITY_PARTITION__ACTIVITYEDGE;

	/**
	 * The feature id for the '<em><b>Activitynode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ACTIVITYNODE = ACTIVITY_PARTITION__ACTIVITYNODE;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = ACTIVITY_PARTITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ExternalSystemImpl <em>External System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ExternalSystemImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getExternalSystem()
	 * @generated
	 */
	int EXTERNAL_SYSTEM = 36;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__INCOMMING = SUPPLIER__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__OUTCOMMING = SUPPLIER__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__ACTIVITYPARTITION = SUPPLIER__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__NAME = SUPPLIER__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__UPPER_BOUND = SUPPLIER__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__IS_CONTROL_TYPE = SUPPLIER__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__ORDER = SUPPLIER__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__VARIABLES = SUPPLIER__VARIABLES;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__ACTION = SUPPLIER__ACTION;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__TRIGGERS = SUPPLIER__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Readmodels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__READMODELS = SUPPLIER__READMODELS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM__CONSTRAINTS = SUPPLIER__CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>External System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SYSTEM_FEATURE_COUNT = SUPPLIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ReadModelImpl <em>Read Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ReadModelImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getReadModel()
	 * @generated
	 */
	int READ_MODEL = 37;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__INCOMMING = OBJECT_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__OUTCOMMING = OBJECT_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__ACTIVITYPARTITION = OBJECT_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__ORDER = OBJECT_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__VARIABLES = OBJECT_NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__SUPPLIER = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL__EVENT = OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Read Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_MODEL_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.DomainEventImpl <em>Domain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.DomainEventImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getDomainEvent()
	 * @generated
	 */
	int DOMAIN_EVENT = 39;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__INCOMMING = OBJECT_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__OUTCOMMING = OBJECT_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__ACTIVITYPARTITION = OBJECT_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__ORDER = OBJECT_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__VARIABLES = OBJECT_NODE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Readmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__READMODEL = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__SUPPLIER = OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__CONSTRAINT = OBJECT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ActivityStorming.impl.ConstraintPinImpl <em>Constraint Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.impl.ConstraintPinImpl
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getConstraintPin()
	 * @generated
	 */
	int CONSTRAINT_PIN = 40;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__INCOMMING = PIN__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__OUTCOMMING = PIN__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__ACTIVITYPARTITION = PIN__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__UPPER_BOUND = PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__IS_CONTROL_TYPE = PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__ORDER = PIN__ORDER;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__VARIABLES = PIN__VARIABLES;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__SUPPLIER = PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__TRIGGERS = PIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN__DESCRIPTION = PIN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ActivityStorming.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.ObjectNodeOrderingKind
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectNodeOrderingKind()
	 * @generated
	 */
	int OBJECT_NODE_ORDERING_KIND = 41;

	/**
	 * The meta object id for the '{@link ActivityStorming.ObjectActionKind <em>Object Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityStorming.ObjectActionKind
	 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectActionKind()
	 * @generated
	 */
	int OBJECT_ACTION_KIND = 42;


	/**
	 * Returns the meta object for class '{@link ActivityStorming.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Diagram</em>'.
	 * @see ActivityStorming.ActivityDiagram
	 * @generated
	 */
	EClass getActivityDiagram();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ActivityDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityStorming.ActivityDiagram#getName()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ActivityDiagram#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see ActivityStorming.ActivityDiagram#getPrecondition()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ActivityDiagram#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcondition</em>'.
	 * @see ActivityStorming.ActivityDiagram#getPostcondition()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_Postcondition();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ActivityDiagram#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see ActivityStorming.ActivityDiagram#isIsReadOnly()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ActivityDiagram#isIsSingleExecution <em>Is Single Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Single Execution</em>'.
	 * @see ActivityStorming.ActivityDiagram#isIsSingleExecution()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_IsSingleExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.ActivityDiagram#getActivityedge <em>Activityedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activityedge</em>'.
	 * @see ActivityStorming.ActivityDiagram#getActivityedge()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Activityedge();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.ActivityDiagram#getActivitynode <em>Activitynode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitynode</em>'.
	 * @see ActivityStorming.ActivityDiagram#getActivitynode()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Activitynode();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.ActivityDiagram#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see ActivityStorming.ActivityDiagram#getVariable()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.ActivityDiagram#getActivitypartition <em>Activitypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitypartition</em>'.
	 * @see ActivityStorming.ActivityDiagram#getActivitypartition()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Activitypartition();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see ActivityStorming.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link ActivityStorming.ActivityNode#getIncomming <em>Incomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomming</em>'.
	 * @see ActivityStorming.ActivityNode#getIncomming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incomming();

	/**
	 * Returns the meta object for the reference list '{@link ActivityStorming.ActivityNode#getOutcomming <em>Outcomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outcomming</em>'.
	 * @see ActivityStorming.ActivityNode#getOutcomming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outcomming();

	/**
	 * Returns the meta object for the container reference '{@link ActivityStorming.ActivityNode#getActivitypartition <em>Activitypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activitypartition</em>'.
	 * @see ActivityStorming.ActivityNode#getActivitypartition()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Activitypartition();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see ActivityStorming.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ActivityEdge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityStorming.ActivityEdge#getName()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EAttribute getActivityEdge_Name();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ActivityEdge#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see ActivityStorming.ActivityEdge#getGuard()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EAttribute getActivityEdge_Guard();

	/**
	 * Returns the meta object for the reference '{@link ActivityStorming.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ActivityStorming.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link ActivityStorming.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ActivityStorming.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.ActivityEdge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weight</em>'.
	 * @see ActivityStorming.ActivityEdge#getWeight()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Weight();

	/**
	 * Returns the meta object for the container reference '{@link ActivityStorming.ActivityEdge#getActivitypartition <em>Activitypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activitypartition</em>'.
	 * @see ActivityStorming.ActivityEdge#getActivitypartition()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Activitypartition();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ObjectFlow <em>Object Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Flow</em>'.
	 * @see ActivityStorming.ObjectFlow
	 * @generated
	 */
	EClass getObjectFlow();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see ActivityStorming.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see ActivityStorming.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see ActivityStorming.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see ActivityStorming.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see ActivityStorming.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see ActivityStorming.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see ActivityStorming.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for the reference list '{@link ActivityStorming.DecisionNode#getObjectnode <em>Objectnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objectnode</em>'.
	 * @see ActivityStorming.DecisionNode#getObjectnode()
	 * @see #getDecisionNode()
	 * @generated
	 */
	EReference getDecisionNode_Objectnode();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.DecisionNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityStorming.DecisionNode#getName()
	 * @see #getDecisionNode()
	 * @generated
	 */
	EAttribute getDecisionNode_Name();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see ActivityStorming.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see ActivityStorming.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pin</em>'.
	 * @see ActivityStorming.InputPin
	 * @generated
	 */
	EClass getInputPin();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin</em>'.
	 * @see ActivityStorming.OutputPin
	 * @generated
	 */
	EClass getOutputPin();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see ActivityStorming.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Node</em>'.
	 * @see ActivityStorming.ObjectNode
	 * @generated
	 */
	EClass getObjectNode();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ObjectNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityStorming.ObjectNode#getName()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ActivityStorming.ObjectNode#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see ActivityStorming.ObjectNode#getUpperBound()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ObjectNode#isIsControlType <em>Is Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Control Type</em>'.
	 * @see ActivityStorming.ObjectNode#isIsControlType()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_IsControlType();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ObjectNode#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see ActivityStorming.ObjectNode#getOrder()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_Order();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.ObjectNode#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ActivityStorming.ObjectNode#getVariables()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_Variables();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ActivityParameterNode <em>Activity Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Parameter Node</em>'.
	 * @see ActivityStorming.ActivityParameterNode
	 * @generated
	 */
	EClass getActivityParameterNode();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ActivityStorming.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.Variable#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see ActivityStorming.Variable#getUpperBound()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.Variable#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see ActivityStorming.Variable#getLowerBound()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityStorming.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see ActivityStorming.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ActivityStorming.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityStorming.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.Action#getInputpin <em>Inputpin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputpin</em>'.
	 * @see ActivityStorming.Action#getInputpin()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Inputpin();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.Action#getOutputpin <em>Outputpin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputpin</em>'.
	 * @see ActivityStorming.Action#getOutputpin()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Outputpin();

	/**
	 * Returns the meta object for the reference '{@link ActivityStorming.Action#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see ActivityStorming.Action#getSupplier()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Supplier();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.Action#getCallactions <em>Callactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Callactions</em>'.
	 * @see ActivityStorming.Action#getCallactions()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Callactions();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action</em>'.
	 * @see ActivityStorming.CallAction
	 * @generated
	 */
	EClass getCallAction();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.StartObjectBehaviorAction <em>Start Object Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Object Behavior Action</em>'.
	 * @see ActivityStorming.StartObjectBehaviorAction
	 * @generated
	 */
	EClass getStartObjectBehaviorAction();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ObjectAction <em>Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Action</em>'.
	 * @see ActivityStorming.ObjectAction
	 * @generated
	 */
	EClass getObjectAction();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ObjectAction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ActivityStorming.ObjectAction#getKind()
	 * @see #getObjectAction()
	 * @generated
	 */
	EAttribute getObjectAction_Kind();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Behavior Action</em>'.
	 * @see ActivityStorming.CallBehaviorAction
	 * @generated
	 */
	EClass getCallBehaviorAction();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Operation Action</em>'.
	 * @see ActivityStorming.CallOperationAction
	 * @generated
	 */
	EClass getCallOperationAction();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.CallActivityAction <em>Call Activity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Activity Action</em>'.
	 * @see ActivityStorming.CallActivityAction
	 * @generated
	 */
	EClass getCallActivityAction();

	/**
	 * Returns the meta object for the containment reference '{@link ActivityStorming.CallActivityAction#getActivitydiagram <em>Activitydiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activitydiagram</em>'.
	 * @see ActivityStorming.CallActivityAction#getActivitydiagram()
	 * @see #getCallActivityAction()
	 * @generated
	 */
	EReference getCallActivityAction_Activitydiagram();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ActivityPartition <em>Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Partition</em>'.
	 * @see ActivityStorming.ActivityPartition
	 * @generated
	 */
	EClass getActivityPartition();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ActivityPartition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityStorming.ActivityPartition#getName()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EAttribute getActivityPartition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.ActivityPartition#getSubpartition <em>Subpartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpartition</em>'.
	 * @see ActivityStorming.ActivityPartition#getSubpartition()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Subpartition();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.ActivityPartition#getActivityedge <em>Activityedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activityedge</em>'.
	 * @see ActivityStorming.ActivityPartition#getActivityedge()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Activityedge();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.ActivityPartition#getActivitynode <em>Activitynode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitynode</em>'.
	 * @see ActivityStorming.ActivityPartition#getActivitynode()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Activitynode();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.CommandAction <em>Command Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Action</em>'.
	 * @see ActivityStorming.CommandAction
	 * @generated
	 */
	EClass getCommandAction();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see ActivityStorming.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.Aggregate#getDomainobject <em>Domainobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainobject</em>'.
	 * @see ActivityStorming.Aggregate#getDomainobject()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Domainobject();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.QueryAction <em>Query Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Action</em>'.
	 * @see ActivityStorming.QueryAction
	 * @generated
	 */
	EClass getQueryAction();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see ActivityStorming.DomainObject
	 * @generated
	 */
	EClass getDomainObject();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see ActivityStorming.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see ActivityStorming.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see ActivityStorming.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see ActivityStorming.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ExternalSystem <em>External System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External System</em>'.
	 * @see ActivityStorming.ExternalSystem
	 * @generated
	 */
	EClass getExternalSystem();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ReadModel <em>Read Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Model</em>'.
	 * @see ActivityStorming.ReadModel
	 * @generated
	 */
	EClass getReadModel();

	/**
	 * Returns the meta object for the reference '{@link ActivityStorming.ReadModel#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see ActivityStorming.ReadModel#getSupplier()
	 * @see #getReadModel()
	 * @generated
	 */
	EReference getReadModel_Supplier();

	/**
	 * Returns the meta object for the reference '{@link ActivityStorming.ReadModel#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see ActivityStorming.ReadModel#getEvent()
	 * @see #getReadModel()
	 * @generated
	 */
	EReference getReadModel_Event();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier</em>'.
	 * @see ActivityStorming.Supplier
	 * @generated
	 */
	EClass getSupplier();

	/**
	 * Returns the meta object for the reference '{@link ActivityStorming.Supplier#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see ActivityStorming.Supplier#getAction()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_Action();

	/**
	 * Returns the meta object for the reference list '{@link ActivityStorming.Supplier#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggers</em>'.
	 * @see ActivityStorming.Supplier#getTriggers()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_Triggers();

	/**
	 * Returns the meta object for the reference list '{@link ActivityStorming.Supplier#getReadmodels <em>Readmodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readmodels</em>'.
	 * @see ActivityStorming.Supplier#getReadmodels()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_Readmodels();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityStorming.Supplier#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see ActivityStorming.Supplier#getConstraints()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_Constraints();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Event</em>'.
	 * @see ActivityStorming.DomainEvent
	 * @generated
	 */
	EClass getDomainEvent();

	/**
	 * Returns the meta object for the reference '{@link ActivityStorming.DomainEvent#getReadmodel <em>Readmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Readmodel</em>'.
	 * @see ActivityStorming.DomainEvent#getReadmodel()
	 * @see #getDomainEvent()
	 * @generated
	 */
	EReference getDomainEvent_Readmodel();

	/**
	 * Returns the meta object for the reference '{@link ActivityStorming.DomainEvent#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see ActivityStorming.DomainEvent#getSupplier()
	 * @see #getDomainEvent()
	 * @generated
	 */
	EReference getDomainEvent_Supplier();

	/**
	 * Returns the meta object for the reference '{@link ActivityStorming.DomainEvent#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint</em>'.
	 * @see ActivityStorming.DomainEvent#getConstraint()
	 * @see #getDomainEvent()
	 * @generated
	 */
	EReference getDomainEvent_Constraint();

	/**
	 * Returns the meta object for class '{@link ActivityStorming.ConstraintPin <em>Constraint Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Pin</em>'.
	 * @see ActivityStorming.ConstraintPin
	 * @generated
	 */
	EClass getConstraintPin();

	/**
	 * Returns the meta object for the container reference '{@link ActivityStorming.ConstraintPin#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supplier</em>'.
	 * @see ActivityStorming.ConstraintPin#getSupplier()
	 * @see #getConstraintPin()
	 * @generated
	 */
	EReference getConstraintPin_Supplier();

	/**
	 * Returns the meta object for the reference list '{@link ActivityStorming.ConstraintPin#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggers</em>'.
	 * @see ActivityStorming.ConstraintPin#getTriggers()
	 * @see #getConstraintPin()
	 * @generated
	 */
	EReference getConstraintPin_Triggers();

	/**
	 * Returns the meta object for the attribute '{@link ActivityStorming.ConstraintPin#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ActivityStorming.ConstraintPin#getDescription()
	 * @see #getConstraintPin()
	 * @generated
	 */
	EAttribute getConstraintPin_Description();

	/**
	 * Returns the meta object for enum '{@link ActivityStorming.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Node Ordering Kind</em>'.
	 * @see ActivityStorming.ObjectNodeOrderingKind
	 * @generated
	 */
	EEnum getObjectNodeOrderingKind();

	/**
	 * Returns the meta object for enum '{@link ActivityStorming.ObjectActionKind <em>Object Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Action Kind</em>'.
	 * @see ActivityStorming.ObjectActionKind
	 * @generated
	 */
	EEnum getObjectActionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityStormingFactory getActivityStormingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ActivityDiagramImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityDiagram()
		 * @generated
		 */
		EClass ACTIVITY_DIAGRAM = eINSTANCE.getActivityDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__NAME = eINSTANCE.getActivityDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__PRECONDITION = eINSTANCE.getActivityDiagram_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__POSTCONDITION = eINSTANCE.getActivityDiagram_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__IS_READ_ONLY = eINSTANCE.getActivityDiagram_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Single Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION = eINSTANCE.getActivityDiagram_IsSingleExecution();

		/**
		 * The meta object literal for the '<em><b>Activityedge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ACTIVITYEDGE = eINSTANCE.getActivityDiagram_Activityedge();

		/**
		 * The meta object literal for the '<em><b>Activitynode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ACTIVITYNODE = eINSTANCE.getActivityDiagram_Activitynode();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__VARIABLE = eINSTANCE.getActivityDiagram_Variable();

		/**
		 * The meta object literal for the '<em><b>Activitypartition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ACTIVITYPARTITION = eINSTANCE.getActivityDiagram_Activitypartition();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ActivityNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Incomming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INCOMMING = eINSTANCE.getActivityNode_Incomming();

		/**
		 * The meta object literal for the '<em><b>Outcomming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OUTCOMMING = eINSTANCE.getActivityNode_Outcomming();

		/**
		 * The meta object literal for the '<em><b>Activitypartition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__ACTIVITYPARTITION = eINSTANCE.getActivityNode_Activitypartition();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ActivityEdgeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EDGE__NAME = eINSTANCE.getActivityEdge_Name();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EDGE__GUARD = eINSTANCE.getActivityEdge_Guard();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__WEIGHT = eINSTANCE.getActivityEdge_Weight();

		/**
		 * The meta object literal for the '<em><b>Activitypartition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__ACTIVITYPARTITION = eINSTANCE.getActivityEdge_Activitypartition();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ObjectFlowImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectFlow()
		 * @generated
		 */
		EClass OBJECT_FLOW = eINSTANCE.getObjectFlow();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ControlFlowImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ControlNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ExecutableNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.InitialNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ForkNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.JoinNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.DecisionNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '<em><b>Objectnode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_NODE__OBJECTNODE = eINSTANCE.getDecisionNode_Objectnode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_NODE__NAME = eINSTANCE.getDecisionNode_Name();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.MergeNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.FinalNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.InputPinImpl <em>Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.InputPinImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getInputPin()
		 * @generated
		 */
		EClass INPUT_PIN = eINSTANCE.getInputPin();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.OutputPinImpl <em>Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.OutputPinImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getOutputPin()
		 * @generated
		 */
		EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.PinImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ObjectNodeImpl <em>Object Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ObjectNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectNode()
		 * @generated
		 */
		EClass OBJECT_NODE = eINSTANCE.getObjectNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__NAME = eINSTANCE.getObjectNode_Name();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__UPPER_BOUND = eINSTANCE.getObjectNode_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Is Control Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__IS_CONTROL_TYPE = eINSTANCE.getObjectNode_IsControlType();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__ORDER = eINSTANCE.getObjectNode_Order();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__VARIABLES = eINSTANCE.getObjectNode_Variables();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ActivityParameterNodeImpl <em>Activity Parameter Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ActivityParameterNodeImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityParameterNode()
		 * @generated
		 */
		EClass ACTIVITY_PARAMETER_NODE = eINSTANCE.getActivityParameterNode();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.VariableImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__UPPER_BOUND = eINSTANCE.getVariable_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LOWER_BOUND = eINSTANCE.getVariable_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ValueSpecificationImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ActionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Inputpin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INPUTPIN = eINSTANCE.getAction_Inputpin();

		/**
		 * The meta object literal for the '<em><b>Outputpin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OUTPUTPIN = eINSTANCE.getAction_Outputpin();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SUPPLIER = eINSTANCE.getAction_Supplier();

		/**
		 * The meta object literal for the '<em><b>Callactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CALLACTIONS = eINSTANCE.getAction_Callactions();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.CallActionImpl <em>Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.CallActionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCallAction()
		 * @generated
		 */
		EClass CALL_ACTION = eINSTANCE.getCallAction();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.StartObjectBehaviorActionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getStartObjectBehaviorAction()
		 * @generated
		 */
		EClass START_OBJECT_BEHAVIOR_ACTION = eINSTANCE.getStartObjectBehaviorAction();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ObjectActionImpl <em>Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ObjectActionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectAction()
		 * @generated
		 */
		EClass OBJECT_ACTION = eINSTANCE.getObjectAction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_ACTION__KIND = eINSTANCE.getObjectAction_Kind();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.CallBehaviorActionImpl <em>Call Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.CallBehaviorActionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCallBehaviorAction()
		 * @generated
		 */
		EClass CALL_BEHAVIOR_ACTION = eINSTANCE.getCallBehaviorAction();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.CallOperationActionImpl <em>Call Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.CallOperationActionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCallOperationAction()
		 * @generated
		 */
		EClass CALL_OPERATION_ACTION = eINSTANCE.getCallOperationAction();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.CallActivityActionImpl <em>Call Activity Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.CallActivityActionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCallActivityAction()
		 * @generated
		 */
		EClass CALL_ACTIVITY_ACTION = eINSTANCE.getCallActivityAction();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM = eINSTANCE.getCallActivityAction_Activitydiagram();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ActivityPartitionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActivityPartition()
		 * @generated
		 */
		EClass ACTIVITY_PARTITION = eINSTANCE.getActivityPartition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PARTITION__NAME = eINSTANCE.getActivityPartition_Name();

		/**
		 * The meta object literal for the '<em><b>Subpartition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__SUBPARTITION = eINSTANCE.getActivityPartition_Subpartition();

		/**
		 * The meta object literal for the '<em><b>Activityedge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__ACTIVITYEDGE = eINSTANCE.getActivityPartition_Activityedge();

		/**
		 * The meta object literal for the '<em><b>Activitynode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__ACTIVITYNODE = eINSTANCE.getActivityPartition_Activitynode();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.CommandActionImpl <em>Command Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.CommandActionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getCommandAction()
		 * @generated
		 */
		EClass COMMAND_ACTION = eINSTANCE.getCommandAction();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.AggregateImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '<em><b>Domainobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__DOMAINOBJECT = eINSTANCE.getAggregate_Domainobject();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.QueryActionImpl <em>Query Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.QueryActionImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getQueryAction()
		 * @generated
		 */
		EClass QUERY_ACTION = eINSTANCE.getQueryAction();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.DomainObjectImpl <em>Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.DomainObjectImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getDomainObject()
		 * @generated
		 */
		EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ValueObjectImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.EntityImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ActorImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.SystemImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ExternalSystemImpl <em>External System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ExternalSystemImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getExternalSystem()
		 * @generated
		 */
		EClass EXTERNAL_SYSTEM = eINSTANCE.getExternalSystem();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ReadModelImpl <em>Read Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ReadModelImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getReadModel()
		 * @generated
		 */
		EClass READ_MODEL = eINSTANCE.getReadModel();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_MODEL__SUPPLIER = eINSTANCE.getReadModel_Supplier();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_MODEL__EVENT = eINSTANCE.getReadModel_Event();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.SupplierImpl <em>Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.SupplierImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getSupplier()
		 * @generated
		 */
		EClass SUPPLIER = eINSTANCE.getSupplier();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__ACTION = eINSTANCE.getSupplier_Action();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__TRIGGERS = eINSTANCE.getSupplier_Triggers();

		/**
		 * The meta object literal for the '<em><b>Readmodels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__READMODELS = eINSTANCE.getSupplier_Readmodels();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__CONSTRAINTS = eINSTANCE.getSupplier_Constraints();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.DomainEventImpl <em>Domain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.DomainEventImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getDomainEvent()
		 * @generated
		 */
		EClass DOMAIN_EVENT = eINSTANCE.getDomainEvent();

		/**
		 * The meta object literal for the '<em><b>Readmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_EVENT__READMODEL = eINSTANCE.getDomainEvent_Readmodel();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_EVENT__SUPPLIER = eINSTANCE.getDomainEvent_Supplier();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_EVENT__CONSTRAINT = eINSTANCE.getDomainEvent_Constraint();

		/**
		 * The meta object literal for the '{@link ActivityStorming.impl.ConstraintPinImpl <em>Constraint Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.impl.ConstraintPinImpl
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getConstraintPin()
		 * @generated
		 */
		EClass CONSTRAINT_PIN = eINSTANCE.getConstraintPin();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_PIN__SUPPLIER = eINSTANCE.getConstraintPin_Supplier();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_PIN__TRIGGERS = eINSTANCE.getConstraintPin_Triggers();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_PIN__DESCRIPTION = eINSTANCE.getConstraintPin_Description();

		/**
		 * The meta object literal for the '{@link ActivityStorming.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.ObjectNodeOrderingKind
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectNodeOrderingKind()
		 * @generated
		 */
		EEnum OBJECT_NODE_ORDERING_KIND = eINSTANCE.getObjectNodeOrderingKind();

		/**
		 * The meta object literal for the '{@link ActivityStorming.ObjectActionKind <em>Object Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityStorming.ObjectActionKind
		 * @see ActivityStorming.impl.ActivityStormingPackageImpl#getObjectActionKind()
		 * @generated
		 */
		EEnum OBJECT_ACTION_KIND = eINSTANCE.getObjectActionKind();

	}

} //ActivityStormingPackage
