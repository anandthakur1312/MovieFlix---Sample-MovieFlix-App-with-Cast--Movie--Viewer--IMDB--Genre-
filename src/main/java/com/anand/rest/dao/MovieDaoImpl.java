package com.anand.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@Override
	public List<Movie> getAllMovies() {
		Query query = em.createQuery("SELECT m FROM Movie m");
		return query.getResultList();
	}

	@Override
	public Movie getMovieById(String movieId) {
		return em.find(Movie.class, movieId);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMovie(Movie existing) {
		em.remove(existing);
	}



}
