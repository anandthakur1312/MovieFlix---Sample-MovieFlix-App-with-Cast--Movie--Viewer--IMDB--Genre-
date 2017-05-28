package com.anand.rest.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.anand.rest.model.Movie;

public interface MovieDao {

	Movie createMovie(Movie movie);

}
