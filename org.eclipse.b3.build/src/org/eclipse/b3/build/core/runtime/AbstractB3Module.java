/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core.runtime;

import org.eclipse.b3.backend.core.runtime.B3BackendModelProvider;
import org.eclipse.emf.ecore.EClass;

import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.name.Names;

/**
 * This Abstract Guice Module for B3 provides two convenience methods for binding to
 * a guice Provider for the B3 Backend and Build models called {@link #backendModelProvider(Class, EClass)} and
 * {@link #buildModelProvider(Class, EClass)}. To bind to the equivalence of calling <code>B3backendFactory.eINSTANCE.createXXX()</code> where XXX is
 * the name of the class to create, use <code>backendModelProvider(XXX.class, B3backendPackage.Literals.XXX)</code>.
 * 
 * <p>
 * As an example, a binding done in the configure method could look like this: <br/>
 * <code>
 * 		bind(IBuildUnitRepository.class).annotatedWith(Named.class).toProvider(
 * 			buildModelProvider(IBuildUnitRepository.class, B3BuildPackage.Literals.UNIT_REPOSITORY_DESCRIPTION));
 * </code>
 * <p/>
 * <p>
 * Which means that if a request is made to create an instance of IBuildUnitRepository and the request is made with an attribute annotation of
 * 
 * @Named("*"), and there is no other binding for a particular name, then this binding will be used. See Guice documentation for more information.
 *          </p>
 */
public class AbstractB3Module extends AbstractModule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		ThreadScope threadScope = new ThreadScope();
		SharedScope resolutionScope = new SharedScope();

		// tell Guice about the ResolutionScoped scope
		bindScope(ResolutionScoped.class, resolutionScope);

		// TODO: there is currently no Annotation bound to the ThreadScope

		// make the new scopes instance injectable
		bind(ThreadScope.class).annotatedWith(Names.named("thread")).toInstance(threadScope);
		bind(SharedScope.class).annotatedWith(Names.named("resolution")).toInstance(resolutionScope);

	}

	<T> Provider<T> backendModelProvider(Class<T> type, EClass eclass) {
		return new B3BackendModelProvider<T>(type, eclass);
	}

	<T> Provider<T> buildModelProvider(Class<T> type, EClass eclass) {
		return new B3BuildModelProvider<T>(type, eclass);
	}
}
