package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.CompoundFirstFoundRepository;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;

public class B3BuildEngine extends B3Engine {

	protected BuildContext buildContext;

	public B3BuildEngine() {
		super();
		buildContext = B3BuildFactory.eINSTANCE.createBuildContext();
		buildContext.setParentContext(invocationContext);

		defineRepositoryTypes();

		defineDefaultRepositories();
	}

	/**
	 * Define the value '@repositories' to refer to the default repositories configuration to use
	 * when resolving requirements.
	 */
	private void defineDefaultRepositories() {
		CompoundFirstFoundRepository firstFound = B3BuildFactory.eINSTANCE.createCompoundFirstFoundRepository();
		EList<IBuildUnitRepository> repos = firstFound.getRepositories();
		repos.add(B3BuildFactory.eINSTANCE.createExecutionStackRepository());
		try {
			buildContext.defineVariableValue(B3BuildConstants.B3ENGINE_VAR_REPOSITORIES, firstFound,
					CompoundFirstFoundRepository.class);
		}
		catch(B3EngineException e) {
			throw new B3InternalError("Could not create default repositories configuration due to exception.", e);
		}

	}

	/**
	 * Get repository scheme to repository class mappings, and define all as context values using
	 * a special prefix.
	 */
	private void defineRepositoryTypes() {
		IConfigurationElement[] ceDecl = Platform.getExtensionRegistry().getConfigurationElementsFor(
				B3BuildConstants.REPOSITORIES_EXT_ID);
		for(int i = 0; i < ceDecl.length; i++) {
			IConfigurationElement ce = ceDecl[i];
			String repoClass = ce.getAttribute(B3BuildConstants.REPOSITORIES_EXTATTR_REPOCLASS);
			String scheme = ce.getAttribute(B3BuildConstants.REPOSITORIES_EXTATTR_SCHEME);
			B3JavaImport javaImport = B3backendFactory.eINSTANCE.createB3JavaImport();
			javaImport.setQualifiedName(repoClass);
			javaImport.setName(B3BuildConstants.B3ENGINE_VAR_REPOSCHEMECLASS + "." + scheme);

			Class<?> x = TypeUtils.getRaw(javaImport);
			B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
			metaClass.setInstanceClass(x);
			try {
				buildContext.defineValue((javaImport).getName(), x, metaClass);
			}
			catch(B3EngineException e) {
				throw new B3InternalError("Defining repository schemes failed", e);
			}
		}
	}

	public BuildContext getBuildContext() {
		return buildContext;
	}

	/**
	 * Returns the build context parented by the invocation context.
	 */
	@Override
	public BExecutionContext getContext() {
		return buildContext;
	}
}
