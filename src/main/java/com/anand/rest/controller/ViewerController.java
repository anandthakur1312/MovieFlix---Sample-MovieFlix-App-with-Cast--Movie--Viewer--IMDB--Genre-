package com.anand.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anand.rest.model.Viewer;
import com.anand.rest.service.ViewerService;

@RestController
@RequestMapping(path="viewers")
public class ViewerController {
	
	@Autowired
	private ViewerService viewerService;
	
	@RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Viewer> getAllViewers(){
		return viewerService.getAllViewers();	
	}
	

	@RequestMapping(method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Viewer createViewer(@RequestBody Viewer viewer){
		return viewerService.createViewer(viewer);	
	}
	

}