package com.anand.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anand.rest.dao.MovieDao;
import com.anand.rest.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	
	@Override
	@Transactional
	public Movie createMovie(Movie movie) {
	
		return movieDao.createMovie(movie);
	}

}
