/**
 */
package com.github.icelyframework.activitystorming.tests;

import com.github.icelyframework.activitystorming.ActivitystormingFactory;
import com.github.icelyframework.activitystorming.StartObjectBehaviorAction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start Object Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StartObjectBehaviorActionTest extends CallActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartObjectBehaviorActionTest.class);
	}

	/**
	 * Constructs a new Start Object Behavior Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartObjectBehaviorActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Start Object Behavior Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StartObjectBehaviorAction getFixture() {
		return (StartObjectBehaviorAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivitystormingFactory.eINSTANCE.createStartObjectBehaviorAction());
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

} //StartObjectBehaviorActionTest
