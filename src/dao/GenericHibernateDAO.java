package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;

import utils.HibernateUtil;

import java.lang.reflect.ParameterizedType;

public abstract class GenericHibernateDAO<T, ID extends Serializable>
		implements GenericDAO<T, ID> {

	private Class<T> persistentClass;

	protected Session hSession = HibernateUtil.getSessionFactory()
			.getCurrentSession();

	@SuppressWarnings("unchecked")
	public GenericHibernateDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	@SuppressWarnings({ "unchecked" })
	public T findById(ID id) {
		return (T) hSession.load(getPersistentClass(), id);

	}

	public List<T> findAll() {
		return findByCriteria();
	}

	@SuppressWarnings("unchecked")
	public List<T> findByExample(T exampleInstance) {
		Criteria crit = hSession.createCriteria(getPersistentClass());
		Example example = Example.create(exampleInstance);
		crit.add(example);
		return crit.list();
	}

	public T makePersistent(T entity) {
		hSession.saveOrUpdate(entity);
		return entity;
	}
	
	public T makePersistentMerge(T entity){
		hSession.merge(entity);
		return entity;
	}

	public void makeTransient(T entity) {
		hSession.delete(entity);
	}

	/**
	 * Use this inside subclasses as a convenience method.
	 */
	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion... criterion) {
		Criteria crit = hSession.createCriteria(getPersistentClass());
		for (Criterion c : criterion) {
			crit.add(c);
		}
		return crit.list();
	}

}
