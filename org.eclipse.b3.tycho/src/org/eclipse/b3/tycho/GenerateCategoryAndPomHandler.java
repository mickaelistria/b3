/*******************************************************************************
 * Copyright (c) 2016 Red Hat Inc. and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mickael Istria (Red Hat Inc.) - 501424 - initial API and implementation
 *******************************************************************************/
package org.eclipse.b3.tycho;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map.Entry;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateCategoryAndPomHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection sel = HandlerUtil.getCurrentStructuredSelection(event);
		Object o = sel.getFirstElement();
		if (! (o instanceof Aggregation)) {
			return null;
		}
		Aggregation agg = (Aggregation)o;
		IEditorInput input = HandlerUtil.getActiveEditorInput(event);
		IContainer container = null;
		if (input instanceof IFileEditorInput) {
			container = ((IFileEditorInput) input).getFile().getParent();
		}
		try {
			for (Entry<IPath, String> content : new AggregatorToTycho(agg).createTychoFiles().entrySet()) {
				ByteArrayInputStream source = new ByteArrayInputStream(content.getValue().getBytes());
				IFile file = container.getFile(content.getKey());
				if (!file.exists()) {
					file.create(source, false, new NullProgressMonitor());
				} else {
					file.setContents(source, false, true, new NullProgressMonitor());
				}
				source.close();
			}
		} catch (IOException | CoreException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
