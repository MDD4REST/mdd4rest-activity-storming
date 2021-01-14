/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.providers;

import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ActivitystormingDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ActivitystormingDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
