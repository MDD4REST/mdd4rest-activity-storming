/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import com.github.icelyframework.activitystorming.diagram.part.ActivitystormingVisualIDRegistry;

/**
 * @generated
 */
public class ActivitystormingNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7007;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7006;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ActivitystormingNavigatorItem) {
			ActivitystormingNavigatorItem item = (ActivitystormingNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ActivitystormingVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
