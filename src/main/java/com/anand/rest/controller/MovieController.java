package com.anand.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anand.rest.model.Movie;
import com.anand.rest.service.MovieService;


@RestController
@RequestMapping(path="movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie createCast(@RequestBody Movie movie){
		return movieService.createMovie(movie);	
	}
	

}
