/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 */
package org.eclipse.b3.aggregator.p2.provider;

import org.eclipse.b3.aggregator.util.CapabilityNamespaceImageProvider;
import org.eclipse.b3.p2.ProvidedCapability;
import org.eclipse.emf.common.notify.AdapterFactory;

public class ProvidedCapabilityItemProvider extends org.eclipse.b3.p2.provider.ProvidedCapabilityItemProvider {
	public ProvidedCapabilityItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		ProvidedCapability pc = (ProvidedCapability) object;

		Object image = CapabilityNamespaceImageProvider.getImage(pc.getNamespace());
		if(image == null)
			image = getResourceLocator().getImage("full/obj16/ProvidedCapability");

		return overlayImage(object, image);
	}
}
