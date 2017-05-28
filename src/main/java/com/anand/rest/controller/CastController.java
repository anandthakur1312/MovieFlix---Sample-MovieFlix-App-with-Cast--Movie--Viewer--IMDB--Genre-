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

import com.anand.rest.model.Cast;
import com.anand.rest.model.Viewer;
import com.anand.rest.service.CastService;

@RestController
@RequestMapping(path="cast")
public class CastController {
	
	@Autowired
	private CastService castService;
	
	
	@RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Cast> getAllCast(){
		return castService.getAllCast();
	}
	
	@RequestMapping(path="{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Cast getCastById(@PathVariable("id") String id){
		return castService.getCastById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Cast> createCast(@RequestBody List<Cast> castlist){
		return castService.createCast(castlist);	
	}
	
	@RequestMapping(path="{id}", method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Cast updateViewer(@PathVariable("id") String id, @RequestBody Cast cast){
		return castService.updateCast(id, cast);	
	}
	
	@RequestMapping(path="{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteViewer(@PathVariable("id") String id){
		 castService.deleteCast(id);	
	}

	
}
