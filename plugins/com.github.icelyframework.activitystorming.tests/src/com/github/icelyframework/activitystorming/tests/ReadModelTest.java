/**
 */
package com.github.icelyframework.activitystorming.tests;

import com.github.icelyframework.activitystorming.ActivitystormingFactory;
import com.github.icelyframework.activitystorming.ReadModel;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Read Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReadModelTest extends ObjectNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReadModelTest.class);
	}

	/**
	 * Constructs a new Read Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Read Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReadModel getFixture() {
		return (ReadModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ActivitystormingFactory.eINSTANCE.createReadModel());
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

} //ReadModelTest
