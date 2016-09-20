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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.CustomCategory;
import org.eclipse.b3.aggregator.Feature;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;

public class AggregatorToTycho {

	private Aggregation agg;
	private Set<String> enabledRepoLocations = new HashSet<>();

	public AggregatorToTycho(Aggregation agg) {
		this.agg = agg;
	}
	
	public Map<IPath, String> createTychoFiles() {
		this.enabledRepoLocations.clear();
		StringBuilder tychoRepoBuilder = new StringBuilder();
		StringBuilder categoriesBuilder = new StringBuilder();
		StringBuilder unitsBuilder = new StringBuilder();
		for (CustomCategory category : agg.getCustomCategories()) {
			addCategory(category, categoriesBuilder);
		}
		for (Contribution contribution : agg.getAllContributions(false)) {
			for (MappedRepository repo : contribution.getRepositories()) {
				addTychoRepo(repo, tychoRepoBuilder);
				for (MappedUnit unit : repo.getUnits(false)) {
					addUnit(unit, unitsBuilder, agg.getCustomCategories());
				}
			}
		}
		
		Map<IPath, String> res = new HashMap<>();
		try (
			InputStream pomStream = getClass().getResourceAsStream("templatePom.xml");
			BufferedReader pomReader = new BufferedReader(new InputStreamReader(pomStream));
		) {
			String line = null;
			StringBuilder pomXmlContent = new StringBuilder();
			while ((line = pomReader.readLine()) != null) {
				String newLine = line.replaceAll("__tychoRepositories__", tychoRepoBuilder.toString());
				newLine = newLine.replaceAll("__aggregationFileName__", agg.getLabel());
				pomXmlContent.append(newLine);
				pomXmlContent.append('\n');
			}
			res.put(Path.fromOSString("pom.xml"), pomXmlContent.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (
			InputStream categoryStream = getClass().getResourceAsStream("templateCategory.xml");
			BufferedReader categoryTemplateReader = new BufferedReader(new InputStreamReader(categoryStream));
		) {
			String line = null;
			StringBuilder pomXmlContent = new StringBuilder();
			while ((line = categoryTemplateReader.readLine()) != null) {
				String newLine = line.replaceAll("__categories__", categoriesBuilder.toString());
				newLine = newLine.replaceAll("__units__", unitsBuilder.toString());
				newLine = newLine.replaceAll("__fileName__", agg.getLabel());
				newLine = newLine.replaceAll("__description__", agg.getDescription());
				pomXmlContent.append(newLine);
				pomXmlContent.append('\n');
			}
			res.put(Path.fromOSString("category.xml"), pomXmlContent.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return res;
	}

	private void addUnit(MappedUnit unit, final StringBuilder unitsBuilder, List<CustomCategory> allCategories) {
		String type = "bundle";
		String id = unit.getName();
		if (unit instanceof Feature) {
			type = "feature";
			id = id.substring(0, id.length() - ".feature.group".length());
		}
		unitsBuilder.append("<").append(type).append(" id=\"");
		unitsBuilder.append(id);
		unitsBuilder.append("\" version=\"");
		unitsBuilder.append(toVersion(unit.getVersionRange()));
		unitsBuilder.append("\">\n");
		allCategories.stream().filter(category -> category.getFeatures().contains(unit)).forEach(category -> {
			unitsBuilder.append("  <category name=\"");
			unitsBuilder.append(category.getIdentifier());
			unitsBuilder.append("\"/>\n");
		});
		unitsBuilder.append("</").append(type).append(">\n");
	}

	private String toVersion(VersionRange versionRange) {
		try {
			if (Version.parseVersion(versionRange.toString()) != null) {
				return versionRange.toString();
			}
		} catch (IllegalArgumentException ex) {
			// nothing
		}
		if (versionRange.getMinimum().equals(versionRange.getMaximum())) {
			return versionRange.getMinimum().toString();
		}
		// TODO log better => dialog?
		System.err.println("Version ranges ( " + versionRange + " ) are not allowed in category.xml.");
		return "0.0.0";
	}

	private void addCategory(CustomCategory category, StringBuilder categoriesBuilder) {
		 categoriesBuilder.append("<category-def name=\"");
		 categoriesBuilder.append(category.getIdentifier());
		 categoriesBuilder.append("\" label=\"");
		 categoriesBuilder.append(category.getLabel());
		 categoriesBuilder.append("\">\n");
		 categoriesBuilder.append("  <description>\n");
		 categoriesBuilder.append(category.getDescription());
		 categoriesBuilder.append("\n  </description>\n");
	     categoriesBuilder.append("</category-def>\n");
	}

	private void addTychoRepo(MappedRepository repo, StringBuilder tychoRepoBuilder) {
		if (this.enabledRepoLocations.contains(repo.getLocation())) {
			return;
		}
		if (!repo.isEnabled()) {
			tychoRepoBuilder.append("<!--\n");
		}
		tychoRepoBuilder.append("<repository>\n");
		tychoRepoBuilder.append("	<id>");
		tychoRepoBuilder.append(makeId(repo.getLocation()));
		tychoRepoBuilder.append("	</id>\n");
		tychoRepoBuilder.append("	<url>");
		tychoRepoBuilder.append(repo.getLocation());
		tychoRepoBuilder.append("	</url>\n");
		tychoRepoBuilder.append("	<layout>p2</layout>\n");
		tychoRepoBuilder.append("</repository>\n");
		if (!repo.isEnabled()) {
			tychoRepoBuilder.append("-->\n");
		} else {
			this.enabledRepoLocations.add(repo.getLocation());
		}
	}

	private String makeId(String url) {
		return URI.create(url).getPath().replaceAll("/", "_");
	}
}
