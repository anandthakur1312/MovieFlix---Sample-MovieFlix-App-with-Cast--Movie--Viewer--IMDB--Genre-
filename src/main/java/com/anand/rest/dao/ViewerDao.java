package com.anand.rest.dao;

import java.util.List;

import com.anand.rest.model.Viewer;

public interface ViewerDao {
	public Viewer createViewer(Viewer viewer);

	public List<Viewer> getAllViewers();

}
