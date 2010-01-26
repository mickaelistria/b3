/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2view.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.b3.aggregator.p2view.util.P2viewAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class P2viewItemProviderAdapterFactory extends P2viewAdapterFactory implements ComposeableAdapterFactory,
		IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.b3.aggregator.p2view.MetadataRepositoryStructuredView} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MetadataRepositoryStructuredViewItemProvider metadataRepositoryStructuredViewItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.InstallableUnits}
	 * instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstallableUnitsItemProvider installableUnitsItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Categories} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CategoriesItemProvider categoriesItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Features} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FeaturesItemProvider featuresItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Products} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProductsItemProvider productsItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Bundles} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BundlesItemProvider bundlesItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Miscellaneous}
	 * instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MiscellaneousItemProvider miscellaneousItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Category} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CategoryItemProvider categoryItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Feature} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Product} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Bundle} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BundleItemProvider bundleItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.OtherIU} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OtherIUItemProvider otherIUItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Properties} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PropertiesItemProvider propertiesItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Fragment} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FragmentItemProvider fragmentItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Fragments} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FragmentsItemProvider fragmentsItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.RequiredCapabilities}
	 * instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected RequiredCapabilitiesItemProvider requiredCapabilitiesItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.ProvidedCapabilities}
	 * instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProvidedCapabilitiesItemProvider providedCapabilitiesItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.Touchpoints} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TouchpointsItemProvider touchpointsItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.p2view.IUDetails} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IUDetailsItemProvider iuDetailsItemProvider;

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.b3.aggregator.p2view.RequiredCapabilityWrapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RequiredCapabilityWrapperItemProvider requiredCapabilityWrapperItemProvider;

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.b3.aggregator.p2view.ProvidedCapabilityWrapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProvidedCapabilityWrapperItemProvider providedCapabilityWrapperItemProvider;

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public P2viewItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemColorProvider.class);
		supportedTypes.add(IItemFontProvider.class);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if(isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if(!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Bundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createBundleAdapter() {
		if(bundleItemProvider == null) {
			bundleItemProvider = new BundleItemProvider(this);
		}

		return bundleItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Bundles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createBundlesAdapter() {
		if(bundlesItemProvider == null) {
			bundlesItemProvider = new BundlesItemProvider(this);
		}

		return bundlesItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Categories}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCategoriesAdapter() {
		if(categoriesItemProvider == null) {
			categoriesItemProvider = new CategoriesItemProvider(this);
		}

		return categoriesItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCategoryAdapter() {
		if(categoryItemProvider == null) {
			categoryItemProvider = new CategoryItemProvider(this);
		}

		return categoryItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createFeatureAdapter() {
		if(featureItemProvider == null) {
			featureItemProvider = new FeatureItemProvider(this);
		}

		return featureItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Features}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createFeaturesAdapter() {
		if(featuresItemProvider == null) {
			featuresItemProvider = new FeaturesItemProvider(this);
		}

		return featuresItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Fragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createFragmentAdapter() {
		if(fragmentItemProvider == null) {
			fragmentItemProvider = new FragmentItemProvider(this);
		}

		return fragmentItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Fragments}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createFragmentsAdapter() {
		if(fragmentsItemProvider == null) {
			fragmentsItemProvider = new FragmentsItemProvider(this);
		}

		return fragmentsItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.InstallableUnits}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createInstallableUnitsAdapter() {
		if(installableUnitsItemProvider == null) {
			installableUnitsItemProvider = new InstallableUnitsItemProvider(this);
		}

		return installableUnitsItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.IUDetails}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createIUDetailsAdapter() {
		if(iuDetailsItemProvider == null) {
			iuDetailsItemProvider = new IUDetailsItemProvider(this);
		}

		return iuDetailsItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.MetadataRepositoryStructuredView}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMetadataRepositoryStructuredViewAdapter() {
		if(metadataRepositoryStructuredViewItemProvider == null) {
			metadataRepositoryStructuredViewItemProvider = new MetadataRepositoryStructuredViewItemProvider(this);
		}

		return metadataRepositoryStructuredViewItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Miscellaneous}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMiscellaneousAdapter() {
		if(miscellaneousItemProvider == null) {
			miscellaneousItemProvider = new MiscellaneousItemProvider(this);
		}

		return miscellaneousItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.OtherIU}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createOtherIUAdapter() {
		if(otherIUItemProvider == null) {
			otherIUItemProvider = new OtherIUItemProvider(this);
		}

		return otherIUItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if(productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Products}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createProductsAdapter() {
		if(productsItemProvider == null) {
			productsItemProvider = new ProductsItemProvider(this);
		}

		return productsItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Properties}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createPropertiesAdapter() {
		if(propertiesItemProvider == null) {
			propertiesItemProvider = new PropertiesItemProvider(this);
		}

		return propertiesItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.ProvidedCapabilities}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createProvidedCapabilitiesAdapter() {
		if(providedCapabilitiesItemProvider == null) {
			providedCapabilitiesItemProvider = new ProvidedCapabilitiesItemProvider(this);
		}

		return providedCapabilitiesItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.ProvidedCapabilityWrapper}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createProvidedCapabilityWrapperAdapter() {
		if(providedCapabilityWrapperItemProvider == null) {
			providedCapabilityWrapperItemProvider = new ProvidedCapabilityWrapperItemProvider(this);
		}

		return providedCapabilityWrapperItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.RequiredCapabilities}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createRequiredCapabilitiesAdapter() {
		if(requiredCapabilitiesItemProvider == null) {
			requiredCapabilitiesItemProvider = new RequiredCapabilitiesItemProvider(this);
		}

		return requiredCapabilitiesItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.RequiredCapabilityWrapper}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createRequiredCapabilityWrapperAdapter() {
		if(requiredCapabilityWrapperItemProvider == null) {
			requiredCapabilityWrapperItemProvider = new RequiredCapabilityWrapperItemProvider(this);
		}

		return requiredCapabilityWrapperItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.p2view.Touchpoints}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTouchpointsAdapter() {
		if(touchpointsItemProvider == null) {
			touchpointsItemProvider = new TouchpointsItemProvider(this);
		}

		return touchpointsItemProvider;
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		if(metadataRepositoryStructuredViewItemProvider != null)
			metadataRepositoryStructuredViewItemProvider.dispose();
		if(installableUnitsItemProvider != null)
			installableUnitsItemProvider.dispose();
		if(categoriesItemProvider != null)
			categoriesItemProvider.dispose();
		if(featuresItemProvider != null)
			featuresItemProvider.dispose();
		if(productsItemProvider != null)
			productsItemProvider.dispose();
		if(bundlesItemProvider != null)
			bundlesItemProvider.dispose();
		if(fragmentsItemProvider != null)
			fragmentsItemProvider.dispose();
		if(miscellaneousItemProvider != null)
			miscellaneousItemProvider.dispose();
		if(categoryItemProvider != null)
			categoryItemProvider.dispose();
		if(featureItemProvider != null)
			featureItemProvider.dispose();
		if(productItemProvider != null)
			productItemProvider.dispose();
		if(bundleItemProvider != null)
			bundleItemProvider.dispose();
		if(fragmentItemProvider != null)
			fragmentItemProvider.dispose();
		if(otherIUItemProvider != null)
			otherIUItemProvider.dispose();
		if(propertiesItemProvider != null)
			propertiesItemProvider.dispose();
		if(requiredCapabilitiesItemProvider != null)
			requiredCapabilitiesItemProvider.dispose();
		if(providedCapabilitiesItemProvider != null)
			providedCapabilitiesItemProvider.dispose();
		if(touchpointsItemProvider != null)
			touchpointsItemProvider.dispose();
		if(iuDetailsItemProvider != null)
			iuDetailsItemProvider.dispose();
		if(requiredCapabilityWrapperItemProvider != null)
			requiredCapabilityWrapperItemProvider.dispose();
		if(providedCapabilityWrapperItemProvider != null)
			providedCapabilityWrapperItemProvider.dispose();
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if(parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null
				? this
				: parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

}