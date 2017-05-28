package com.anand.rest.service;

import java.util.List;

import com.anand.rest.model.Movie;

public interface MovieService {

	Movie createMovie(Movie movie);

	List<Movie> getAllMovies();

	Movie getMovieById(String movieId);

	Movie updateMovie(String movieId, Movie movie);

	void deleteMovie(String movieId);

}
