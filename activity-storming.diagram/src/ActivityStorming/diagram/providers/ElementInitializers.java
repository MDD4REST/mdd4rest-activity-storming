/*
 * 
 */
package ActivityStorming.diagram.providers;

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
		ElementInitializers cached = ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ActivityStorming.diagram.part.ActivityStormingDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
