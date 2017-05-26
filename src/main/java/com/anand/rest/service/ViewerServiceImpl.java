package com.anand.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anand.rest.dao.ViewerDao;
import com.anand.rest.exception.ResourceNotFoundException;
import com.anand.rest.model.Viewer;

@Service
public class ViewerServiceImpl implements ViewerService{
	
	@Autowired
	
	private ViewerDao viewerDao;
	
	@Override
	@Transactional
	public Viewer createViewer(Viewer viewer) {
		
		return viewerDao.createViewer(viewer);
	}

	@Override

	public List<Viewer> getAllViewers() {
		
		return viewerDao.getAllViewers();
	}

	
	@Override
	public Viewer getViewer(String userName, String password) {
		Viewer existing = viewerDao.getViewer(userName,password);
		if(existing == null)
			throw new ResourceNotFoundException("----------------------------------");
		return existing;
		
	}
}
