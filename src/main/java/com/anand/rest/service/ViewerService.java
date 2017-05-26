package com.anand.rest.service;

import java.util.List;

import com.anand.rest.model.Viewer;

public interface ViewerService {
	public Viewer createViewer(Viewer viewer);

	public List<Viewer> getAllViewers();

	public Viewer getViewer(String userName, String password);

}
