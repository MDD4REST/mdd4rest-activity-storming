/**
 */
package com.github.icelyframework.activitystorming.tests;

import com.github.icelyframework.activitystorming.ActivitystormingFactory;
import com.github.icelyframework.activitystorming.InitialNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initial Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitialNodeTest extends ControlNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitialNodeTest.class);
	}

	/**
	 * Constructs a new Initial Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Initial Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InitialNode getFixture() {
		return (InitialNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivitystormingFactory.eINSTANCE.createInitialNode());
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

} //InitialNodeTest
