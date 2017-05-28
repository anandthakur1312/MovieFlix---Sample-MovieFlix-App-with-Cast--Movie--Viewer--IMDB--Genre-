package com.anand.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
		//We dont have do do casting in TypedQuery
		TypedQuery<Viewer> query = em.createNamedQuery("Viewer.getAll", Viewer.class);
		query.setParameter("pRole", "USER");
		return query.getResultList();
	}

	@Override
	public Viewer getViewer(String userName, String password) {
		TypedQuery<Viewer> query = em.createNamedQuery("Viewer.getExisting", Viewer.class);
		query.setParameter("pUserName", userName);
		query.setParameter("pPassword", password);
		query.setParameter("pRole", "USER");
		return query.getSingleResult();
	}

	@Override
	public Viewer getViewerById(String id) {
		Viewer existing = em.find(Viewer.class, id);
		return existing;
	}

	@Override
	public Viewer updateViewer(Viewer viewer) {
		em.merge(viewer);
		return viewer;
	}

	@Override
	public void deleteViewer(Viewer existing) {
		em.remove(existing);
	}

}
