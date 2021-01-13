/**
 */
package ActivityStorming.provider;


import ActivityStorming.ActivityDiagram;
import ActivityStorming.ActivityStormingFactory;
import ActivityStorming.ActivityStormingPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ActivityStorming.ActivityDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addPreconditionPropertyDescriptor(object);
			addPostconditionPropertyDescriptor(object);
			addIsReadOnlyPropertyDescriptor(object);
			addIsSingleExecutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDiagram_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDiagram_name_feature", "_UI_ActivityDiagram_type"),
				 ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Precondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDiagram_precondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDiagram_precondition_feature", "_UI_ActivityDiagram_type"),
				 ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__PRECONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Postcondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDiagram_postcondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDiagram_postcondition_feature", "_UI_ActivityDiagram_type"),
				 ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__POSTCONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDiagram_isReadOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDiagram_isReadOnly_feature", "_UI_ActivityDiagram_type"),
				 ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__IS_READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Single Execution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSingleExecutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDiagram_isSingleExecution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDiagram_isSingleExecution_feature", "_UI_ActivityDiagram_type"),
				 ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYEDGE);
			childrenFeatures.add(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE);
			childrenFeatures.add(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__VARIABLE);
			childrenFeatures.add(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYPARTITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ActivityDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActivityDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ActivityDiagram_type") :
			getString("_UI_ActivityDiagram_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ActivityDiagram.class)) {
			case ActivityStormingPackage.ACTIVITY_DIAGRAM__NAME:
			case ActivityStormingPackage.ACTIVITY_DIAGRAM__PRECONDITION:
			case ActivityStormingPackage.ACTIVITY_DIAGRAM__POSTCONDITION:
			case ActivityStormingPackage.ACTIVITY_DIAGRAM__IS_READ_ONLY:
			case ActivityStormingPackage.ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ActivityStormingPackage.ACTIVITY_DIAGRAM__ACTIVITYEDGE:
			case ActivityStormingPackage.ACTIVITY_DIAGRAM__ACTIVITYNODE:
			case ActivityStormingPackage.ACTIVITY_DIAGRAM__VARIABLE:
			case ActivityStormingPackage.ACTIVITY_DIAGRAM__ACTIVITYPARTITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYEDGE,
				 ActivityStormingFactory.eINSTANCE.createActivityEdge()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYEDGE,
				 ActivityStormingFactory.eINSTANCE.createObjectFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYEDGE,
				 ActivityStormingFactory.eINSTANCE.createControlFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createControlNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createExecutableNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createObjectNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createPin()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createInputPin()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createOutputPin()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createActivityParameterNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createStartObjectBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createCallActivityAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createCommandAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createAggregate()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createQueryAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createDomainObject()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createValueObject()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createExternalSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createReadModel()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createDomainEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYNODE,
				 ActivityStormingFactory.eINSTANCE.createConstraintPin()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__VARIABLE,
				 ActivityStormingFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYPARTITION,
				 ActivityStormingFactory.eINSTANCE.createActivityPartition()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYPARTITION,
				 ActivityStormingFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityStormingPackage.Literals.ACTIVITY_DIAGRAM__ACTIVITYPARTITION,
				 ActivityStormingFactory.eINSTANCE.createSystem()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ActivityStormingEditPlugin.INSTANCE;
	}

}
