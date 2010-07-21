/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.ui.labeling;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.BAtExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralType;
import org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Builder;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class BeeLangLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public BeeLangLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	/*
	 * //Labels and icons can be computed like this:
	 * 
	 * String text(MyModel ele) {
	 * return "my "+ele.getName();
	 * }
	 * 
	 * String image(MyModel ele) {
	 * return "MyModel.gif";
	 * }
	 */
	private String safeClassToString(Object o) {
		return o == null
				? "null"
				: o.getClass().getName();
	}

	/*
	 * String image(MyModel ele) {
	 * return "MyModel.gif";
	 * }
	 */
	private String safeToString(Object o) {
		return (o == null)
				? "null"
				: o.toString();
	}

	String text(B3FunctionType ele) {
		StringBuffer buf = new StringBuffer();
		buf.append("type: (");
		int counter = 0;
		for(Type t : ele.getParameterTypes()) {
			if(counter++ > 0)
				buf.append(", ");
			buf.append(t);
		}
		buf.append(")=>");
		buf.append(safeToString(ele.getReturnType()));
		return buf.toString();
	}

	String text(B3ParameterizedType ele) {
		Type t = ele.getRawType();
		return "type: " + safeToString(t);
	}

	String text(BAtExpression ele) {
		return "[n]";
	}

	String text(BChainedExpression ele) {
		return "{ ... }";
	}

	String text(BeeModel ele) {
		String s = ele.eResource().getURI().lastSegment();
		return Strings.isEmpty(s)
				? "resource"
				: s;
	}

	String text(BFunction ele) {
		return "function: " + ele.getName() + " => " + safeToString(ele.getReturnType());
	}

	String text(BLiteralExpression ele) {
		return "literal<" + safeClassToString(ele.getValue()) + ">" + safeToString(ele.getValue());
	}

	String text(BLiteralListExpression ele) {
		return "list: <" + safeToString(ele.getEntryType()) + ">";
	}

	String text(BLiteralMapExpression ele) {
		return "list: <" + safeToString(ele.getKeyType()) + ", " + safeToString(ele.getValueType()) + ">";
	}

	String text(BLiteralType ele) {
		return "literal type:";
	}

	String text(BRegularExpression ele) {
		return "regexp: " + safeToString(ele.getPattern());
	}

	String text(Builder ele) {
		return "builder: " + ele.getName();
	}

	String text(BuildUnit ele) {
		return "unit: " + ele.getName();
	}

	String text(BVariableExpression ele) {
		return "value of: " + ele.getNamedValue().getName();
	}
}
