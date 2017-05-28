package com.anand.rest.service;

import java.util.List;

import com.anand.rest.model.Cast;
import com.anand.rest.model.Viewer;

public interface CastService {

	List<Cast> getAllCast();

	List<Cast> createCast(List<Cast> castlist);

	Cast getCastById(String id);

	Cast updateCast(String id, Cast cast);

	void deleteCast(String id);

}
