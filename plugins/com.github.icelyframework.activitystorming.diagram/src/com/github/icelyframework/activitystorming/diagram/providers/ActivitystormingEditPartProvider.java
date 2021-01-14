/*
 * 
 */
package com.github.icelyframework.activitystorming.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivityDiagramEditPart;
import com.github.icelyframework.activitystorming.diagram.edit.parts.ActivitystormingEditPartFactory;
import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry;

/**
 * @generated
 */
public class ActivitystormingEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ActivitystormingEditPartProvider() {
		super(new ActivitystormingEditPartFactory(), ActivitystormingVisualIDRegistry.TYPED_INSTANCE,
				ActivityDiagramEditPart.MODEL_ID);
	}

}
