package com.anand.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.anand.rest.model.Viewer;

@Repository
public class ViewerDaoImpl implements ViewerDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Viewer createViewer(Viewer viewer) {
		viewer.setRole("USER");
		em.persist(viewer);
		return viewer;
	}

	@Override
	public List<Viewer> getAllViewers() {
		Query query = em.createQuery("From Viewer");
		return query.getResultList();
	}

}
