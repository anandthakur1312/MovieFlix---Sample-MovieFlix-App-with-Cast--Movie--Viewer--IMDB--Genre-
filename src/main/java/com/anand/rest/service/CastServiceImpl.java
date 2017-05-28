package com.anand.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anand.rest.dao.CastDao;
import com.anand.rest.exception.ResourceNotFoundException;
import com.anand.rest.model.Cast;
import com.anand.rest.model.Viewer;

@Service
public class CastServiceImpl implements CastService {
	@Autowired
	private CastDao castDao;
	
	@Override
	public List<Cast> getAllCast() {	
		return castDao.getAllCast();
	}

	@Override
	@Transactional
	public List<Cast> createCast(List<Cast> castlist) {
		
		return castDao.createCast(castlist);
	}

	@Override
	public Cast getCastById(String id) {
		return castDao.getCastById(id);
	}

	@Override
	@Transactional
	public Cast updateCast(String id, Cast cast) {
		Cast existing = castDao.getCastById(id);
		if(existing==null){
			throw new ResourceNotFoundException("-------No cast found for id: " +id);
		}
		return castDao.updateCast(cast);
		
	}

	@Override
	@Transactional
	public void deleteCast(String id) {
		Cast existing = castDao.getCastById(id);
		if(existing==null){
			throw new ResourceNotFoundException("-------No cast found for id: " +id);
		}
		castDao.deleteCast(existing);
	}

}
