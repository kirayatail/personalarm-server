package edu.chl.wmax.personalarm.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.chl.wmax.personalarm.exception.ResourceNotFoundException;

public abstract class AbstractDao<T, ID extends Serializable> implements
		EntityDao<T, ID> {

	@PersistenceContext
	protected EntityManager entityManager;
	private Class<T> clazz;

	public AbstractDao(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public void create(T t) {
		entityManager.persist(t);
	}

	@Override
	public void delete(T t) {
		entityManager.remove(t);
	}

	@Override
	public void delete(ID id) {
		T t = find(id);
		entityManager.remove(t);
	}

	@Override
	public T find(ID id) {
		T t = entityManager.find(clazz, id);
		if (t == null) {
			throw new ResourceNotFoundException();
		}
		return t;
	}

	@Override
	public List<T> findAll() {
		return entityManager
				.createQuery("from " + clazz.getSimpleName(), clazz)
				.getResultList();
	}

	@Override
	public void update(T t) {
		entityManager.merge(t);
	}
}