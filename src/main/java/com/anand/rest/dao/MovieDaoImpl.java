package com.anand.rest.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.anand.rest.model.Movie;

@Repository
public class MovieDaoImpl implements MovieDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Movie createMovie(Movie movie) {
		em.persist(movie);
		return movie;
	}

}
