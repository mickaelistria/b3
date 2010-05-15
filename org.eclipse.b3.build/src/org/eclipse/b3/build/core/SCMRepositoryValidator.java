/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

public class SCMRepositoryValidator extends AbstractRepositoryValidator {

	public SCMRepositoryValidator() {
		this.addResolverOption("path", String.class);
	}

}