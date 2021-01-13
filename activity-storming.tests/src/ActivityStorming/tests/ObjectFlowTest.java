/**
 */
package ActivityStorming.tests;

import ActivityStorming.ActivityStormingFactory;
import ActivityStorming.ObjectFlow;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectFlowTest extends ActivityEdgeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectFlowTest.class);
	}

	/**
	 * Constructs a new Object Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObjectFlow getFixture() {
		return (ObjectFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivityStormingFactory.eINSTANCE.createObjectFlow());
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

} //ObjectFlowTest
