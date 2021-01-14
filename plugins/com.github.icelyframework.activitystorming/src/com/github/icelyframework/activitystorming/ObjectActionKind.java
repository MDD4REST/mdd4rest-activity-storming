/**
 */
package com.github.icelyframework.activitystorming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Action Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.icelyframework.activitystorming.ActivitystormingPackage#getObjectActionKind()
 * @model
 * @generated
 */
public enum ObjectActionKind implements Enumerator {
	/**
	 * The '<em><b>Create Object Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_OBJECT_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_OBJECT_ACTION(0, "createObjectAction", "createObjectAction"),

	/**
	 * The '<em><b>Destroy Object Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROY_OBJECT_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	DESTROY_OBJECT_ACTION(1, "destroyObjectAction", "destroyObjectAction"),

	/**
	 * The '<em><b>Test Identity Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_IDENTITY_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_IDENTITY_ACTION(2, "testIdentityAction", "testIdentityAction"),

	/**
	 * The '<em><b>Read Self Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_SELF_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	READ_SELF_ACTION(3, "readSelfAction", "readSelfAction"),

	/**
	 * The '<em><b>Value Specification Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_SPECIFICATION_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_SPECIFICATION_ACTION(4, "valueSpecificationAction", "valueSpecificationAction");

	/**
	 * The '<em><b>Create Object Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_OBJECT_ACTION
	 * @model name="createObjectAction"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_OBJECT_ACTION_VALUE = 0;

	/**
	 * The '<em><b>Destroy Object Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROY_OBJECT_ACTION
	 * @model name="destroyObjectAction"
	 * @generated
	 * @ordered
	 */
	public static final int DESTROY_OBJECT_ACTION_VALUE = 1;

	/**
	 * The '<em><b>Test Identity Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_IDENTITY_ACTION
	 * @model name="testIdentityAction"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_IDENTITY_ACTION_VALUE = 2;

	/**
	 * The '<em><b>Read Self Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_SELF_ACTION
	 * @model name="readSelfAction"
	 * @generated
	 * @ordered
	 */
	public static final int READ_SELF_ACTION_VALUE = 3;

	/**
	 * The '<em><b>Value Specification Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_SPECIFICATION_ACTION
	 * @model name="valueSpecificationAction"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_SPECIFICATION_ACTION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Object Action Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectActionKind[] VALUES_ARRAY =
		new ObjectActionKind[] {
			CREATE_OBJECT_ACTION,
			DESTROY_OBJECT_ACTION,
			TEST_IDENTITY_ACTION,
			READ_SELF_ACTION,
			VALUE_SPECIFICATION_ACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Action Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectActionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Action Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectActionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectActionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Action Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectActionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectActionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Action Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectActionKind get(int value) {
		switch (value) {
			case CREATE_OBJECT_ACTION_VALUE: return CREATE_OBJECT_ACTION;
			case DESTROY_OBJECT_ACTION_VALUE: return DESTROY_OBJECT_ACTION;
			case TEST_IDENTITY_ACTION_VALUE: return TEST_IDENTITY_ACTION;
			case READ_SELF_ACTION_VALUE: return READ_SELF_ACTION;
			case VALUE_SPECIFICATION_ACTION_VALUE: return VALUE_SPECIFICATION_ACTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ObjectActionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ObjectActionKind
