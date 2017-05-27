package com.anand.rest.service;

import java.util.List;

import com.anand.rest.model.Viewer;

public interface ViewerService {
	public Viewer createViewer(Viewer viewer);

	public List<Viewer> getAllViewers();

	public Viewer getViewer(String userName, String password);

	public Viewer updateViewer(String id, Viewer viewer);

	public Viewer getViewerById(String id);

	public void deleteViewer(String id);

}
