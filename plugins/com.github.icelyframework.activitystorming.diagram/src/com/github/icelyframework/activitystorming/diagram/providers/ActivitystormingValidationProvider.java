/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityDiagramEditPart;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingDiagramEditorPlugin;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry;

/**
 * @generated
 */
public class ActivitystormingValidationProvider {

	/**
	* @generated
	*/
	private static boolean constraintsActive = false;

	/**
	* @generated
	*/
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	* @generated
	*/
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				ActivitystormingDiagramEditorPlugin.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	* @generated
	*/
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive && ActivityDiagramEditPart.MODEL_ID
					.equals(ActivitystormingVisualIDRegistry.getModelID((View) object));
		}
		return true;
	}

}
