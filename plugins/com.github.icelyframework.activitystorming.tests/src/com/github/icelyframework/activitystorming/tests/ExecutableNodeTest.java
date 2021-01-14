/**
 */
package com.github.icelyframework.activitystorming.tests;

import com.github.icelyframework.activitystorming.ActivitystormingFactory;
import com.github.icelyframework.activitystorming.ExecutableNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutableNodeTest extends ActivityNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExecutableNodeTest.class);
	}

	/**
	 * Constructs a new Executable Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Executable Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExecutableNode getFixture() {
		return (ExecutableNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivitystormingFactory.eINSTANCE.createExecutableNode());
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

} //ExecutableNodeTest
