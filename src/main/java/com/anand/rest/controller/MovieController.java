package com.anand.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anand.rest.model.Movie;
import com.anand.rest.service.MovieService;


@RestController
@RequestMapping(path="movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	
	@RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@RequestMapping(method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie createMovie(@RequestBody Movie movie){
		return movieService.createMovie(movie);	
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "{movieId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie getMovieById(@PathVariable("movieId") String  movieId){
		return movieService.getMovieById(movieId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "{movieId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie updateMovie(@PathVariable("movieId") String  movieId, @RequestBody Movie movie){
		return movieService.updateMovie(movieId, movie);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "{movieId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteMovie(@PathVariable("movieId") String  movieId){
		movieService.deleteMovie(movieId);
	}
	
	
}
