/**
 */
package ActivityStorming.tests;

import ActivityStorming.ActivityParameterNode;
import ActivityStorming.ActivityStormingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityParameterNodeTest extends ObjectNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityParameterNodeTest.class);
	}

	/**
	 * Constructs a new Activity Parameter Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity Parameter Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActivityParameterNode getFixture() {
		return (ActivityParameterNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivityStormingFactory.eINSTANCE.createActivityParameterNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ActivityParameterNodeTest
