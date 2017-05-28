package com.anand.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anand.rest.model.Cast;

@Repository
public class CastDaoImpl implements CastDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Cast> getAllCast() {
	TypedQuery<Cast> query = em.createQuery("SELECT c FROM Cast c", Cast.class);
		return query.getResultList();
	}

	@Override
	public List<Cast> createCast(List<Cast> castlist) {
		for(Cast cast: castlist){
			em.persist(cast);
		}
		return castlist;
	}

	@Override
	public Cast getCastById(String id) {
		
		return em.find(Cast.class, id);
	}

	@Override
	public Cast updateCast(Cast cast) {
		em.merge(cast);
		return cast;
	}

	@Override
	public void deleteCast(Cast existing) {
		em.remove(existing);
	}

}
