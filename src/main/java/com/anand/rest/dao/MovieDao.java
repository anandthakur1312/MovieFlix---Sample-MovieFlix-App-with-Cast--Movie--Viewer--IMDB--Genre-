package com.anand.rest.dao;

import java.util.List;



import com.anand.rest.model.Movie;

public interface MovieDao {

	Movie createMovie(Movie movie);

	List<Movie> getAllMovies();

	Movie getMovieById(String movieId);

	Movie updateMovie(Movie movie);

	void deleteMovie(Movie existing);

}
