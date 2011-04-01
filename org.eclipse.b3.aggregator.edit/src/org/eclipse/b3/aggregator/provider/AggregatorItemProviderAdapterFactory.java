/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.b3.aggregator.util.AggregatorAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.Disposable;
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
public class AggregatorItemProviderAdapterFactory extends AggregatorAdapterFactory implements
		ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	 * This keeps track of all the item providers created, so that they can be {@link #dispose disposed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Disposable disposable = new Disposable();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Aggregator} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AggregatorItemProvider aggregatorItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.MappedRepository} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MappedRepositoryItemProvider mappedRepositoryItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Configuration} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConfigurationItemProvider configurationItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Contribution} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ContributionItemProvider contributionItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Contact} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ContactItemProvider contactItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Feature} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Bundle} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BundleItemProvider bundleItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Product} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Property} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Category} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CategoryItemProvider categoryItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.CustomCategory} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CustomCategoryItemProvider customCategoryItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.ExclusionRule} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExclusionRuleItemProvider exclusionRuleItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.ValidConfigurationsRule} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValidConfigurationsRuleItemProvider validConfigurationsRuleItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.MetadataRepositoryReference} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected MetadataRepositoryReferenceItemProvider metadataRepositoryReferenceItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.MavenMapping} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MavenMappingItemProvider mavenMappingItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.MavenItem} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MavenItemItemProvider mavenItemItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.DescriptionProvider} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DescriptionProviderItemProvider descriptionProviderItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Status} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StatusItemProvider statusItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.AvailableVersion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AvailableVersionItemProvider availableVersionItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.AvailableVersionsHeader} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AvailableVersionsHeaderItemProvider availableVersionsHeaderItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.ContributionView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ContributionViewItemProvider contributionViewItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.b3.aggregator.Aggregate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AggregateItemProvider aggregateItemProvider;

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public AggregatorItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemColorProvider.class);
		supportedTypes.add(IItemFontProvider.class);
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
	 * Associates an adapter with a notifier via the base implementation, then records it to ensure it will be disposed.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void associate(Adapter adapter, Notifier target) {
		super.associate(adapter, target);
		if(adapter != null) {
			disposable.add(adapter);
		}
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Aggregate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAggregateAdapter() {
		if(aggregateItemProvider == null) {
			aggregateItemProvider = new AggregateItemProvider(this);
		}

		return aggregateItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Aggregator}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAggregatorAdapter() {
		if(aggregatorItemProvider == null) {
			aggregatorItemProvider = new AggregatorItemProvider(this);
		}

		return aggregatorItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.AggregatorResourceView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAggregatorResourceViewAdapter() {
		return new AggregatorResourceViewItemProvider(this);
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.AvailableVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAvailableVersionAdapter() {
		if(availableVersionItemProvider == null) {
			availableVersionItemProvider = new AvailableVersionItemProvider(this);
		}

		return availableVersionItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.AvailableVersionsHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAvailableVersionsHeaderAdapter() {
		if(availableVersionsHeaderItemProvider == null) {
			availableVersionsHeaderItemProvider = new AvailableVersionsHeaderItemProvider(this);
		}

		return availableVersionsHeaderItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Bundle}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Category}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createConfigurationAdapter() {
		if(configurationItemProvider == null) {
			configurationItemProvider = new ConfigurationItemProvider(this);
		}

		return configurationItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Contact}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createContactAdapter() {
		if(contactItemProvider == null) {
			contactItemProvider = new ContactItemProvider(this);
		}

		return contactItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Contribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createContributionAdapter() {
		if(contributionItemProvider == null) {
			contributionItemProvider = new ContributionItemProvider(this);
		}

		return contributionItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.ContributionView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createContributionViewAdapter() {
		if(contributionViewItemProvider == null) {
			contributionViewItemProvider = new ContributionViewItemProvider(this);
		}

		return contributionViewItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.CustomCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCustomCategoryAdapter() {
		if(customCategoryItemProvider == null) {
			customCategoryItemProvider = new CustomCategoryItemProvider(this);
		}

		return customCategoryItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.DescriptionProvider}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createDescriptionProviderAdapter() {
		if(descriptionProviderItemProvider == null) {
			descriptionProviderItemProvider = new DescriptionProviderItemProvider(this);
		}

		return descriptionProviderItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.ExclusionRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createExclusionRuleAdapter() {
		if(exclusionRuleItemProvider == null) {
			exclusionRuleItemProvider = new ExclusionRuleItemProvider(this);
		}

		return exclusionRuleItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Feature}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.MappedRepository}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMappedRepositoryAdapter() {
		if(mappedRepositoryItemProvider == null) {
			mappedRepositoryItemProvider = new MappedRepositoryItemProvider(this);
		}

		return mappedRepositoryItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.MavenItem}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMavenItemAdapter() {
		if(mavenItemItemProvider == null) {
			mavenItemItemProvider = new MavenItemItemProvider(this);
		}

		return mavenItemItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.MavenMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMavenMappingAdapter() {
		if(mavenMappingItemProvider == null) {
			mavenMappingItemProvider = new MavenMappingItemProvider(this);
		}

		return mavenMappingItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.MetadataRepositoryReference}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMetadataRepositoryReferenceAdapter() {
		if(metadataRepositoryReferenceItemProvider == null) {
			metadataRepositoryReferenceItemProvider = new MetadataRepositoryReferenceItemProvider(this);
		}

		return metadataRepositoryReferenceItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Product}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Property}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if(propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.Status}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createStatusAdapter() {
		if(statusItemProvider == null) {
			statusItemProvider = new StatusItemProvider(this);
		}

		return statusItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.b3.aggregator.ValidConfigurationsRule}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValidConfigurationsRuleAdapter() {
		if(validConfigurationsRuleItemProvider == null) {
			validConfigurationsRuleItemProvider = new ValidConfigurationsRuleItemProvider(this);
		}

		return validConfigurationsRuleItemProvider;
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		disposable.dispose();
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
