/*
* 
*/
package com.github.icelyframework.activitystorming.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ActivitystormingNavigatorItem extends ActivitystormingAbstractNavigatorItem {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof com.github.icelyframework.activitystorming.diagram.navigator.ActivitystormingNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((com.github.icelyframework.activitystorming.diagram.navigator.ActivitystormingNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, com.github.icelyframework.activitystorming.diagram.navigator.ActivitystormingNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private View myView;

	/**
	* @generated
	*/
	private boolean myLeaf = false;

	/**
	* @generated
	*/
	public ActivitystormingNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	* @generated
	*/
	public View getView() {
		return myView;
	}

	/**
	* @generated
	*/
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	* @generated
	*/
	public boolean equals(Object obj) {
		if (obj instanceof com.github.icelyframework.activitystorming.diagram.navigator.ActivitystormingNavigatorItem) {
			return EcoreUtil.getURI(getView()).equals(EcoreUtil.getURI(
					((com.github.icelyframework.activitystorming.diagram.navigator.ActivitystormingNavigatorItem) obj)
							.getView()));
		}
		return super.equals(obj);
	}

	/**
	* @generated
	*/
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
