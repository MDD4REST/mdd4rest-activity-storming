/*
* 
*/
package ActivityStorming.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ActivityStormingNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7013;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7012;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem) {
			ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem item = (ActivityStorming.diagram.navigator.ActivityStormingNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ActivityStorming.diagram.part.ActivityStormingVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
