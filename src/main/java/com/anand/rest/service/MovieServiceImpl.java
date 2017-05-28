package com.anand.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anand.rest.dao.MovieDao;
import com.anand.rest.exception.ResourceNotFoundException;
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

	@Override
	public List<Movie> getAllMovies() {
		return movieDao.getAllMovies();
	}

	@Override
	public Movie getMovieById(String movieId) {
		Movie existing = movieDao.getMovieById(movieId);
		if(existing==null) throw new ResourceNotFoundException("No movie for id: "+ movieId);
		return existing;
	}

	@Override
	@Transactional
	public Movie updateMovie(String movieId, Movie movie) {
		Movie existing = movieDao.getMovieById(movieId);
		if(existing==null) throw new ResourceNotFoundException("No movie for id: "+ movieId);
		return movieDao.updateMovie(movie);
	}

	@Override
	@Transactional
	public void deleteMovie(String movieId) {
		Movie existing = movieDao.getMovieById(movieId);
		if(existing==null) throw new ResourceNotFoundException("No movie for id: "+ movieId);
		movieDao.deleteMovie(existing);
	}

}
