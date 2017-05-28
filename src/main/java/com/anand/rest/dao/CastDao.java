package com.anand.rest.dao;

import java.util.List;

import com.anand.rest.model.Cast;

public interface CastDao {

	List<Cast> getAllCast();

	List<Cast> createCast(List<Cast> castlist);

	Cast getCastById(String id);

	Cast updateCast(Cast existing);

	void deleteCast(Cast existing);

}
