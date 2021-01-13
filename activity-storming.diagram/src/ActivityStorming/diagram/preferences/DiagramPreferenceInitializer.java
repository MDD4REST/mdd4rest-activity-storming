/*
 * 
 */
package ActivityStorming.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ActivityStorming.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		ActivityStorming.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		ActivityStorming.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		ActivityStorming.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		ActivityStorming.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
