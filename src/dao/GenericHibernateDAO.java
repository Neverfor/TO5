package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import java.lang.reflect.ParameterizedType;

public abstract class GenericHibernateDAO<T, ID extends Serializable>
		implements GenericDAO<T, ID> {

	private Class<T> persistentClass;

	@SessionTarget
	Session hSession;
	
	@TransactionTarget
	Transaction hTransaction;
	
	@SuppressWarnings("unchecked")
	public GenericHibernateDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
	}



	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	@SuppressWarnings({ "unchecked"})
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

	public void makeTransient(T entity) {
		hSession.delete(entity);
	}

	/**
	 * Use this inside subclasses as a convenience method.
	 */
	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion... criterion) {
		Criteria crit = hSession.createCriteria(getPersistentClass());
		//if(criterion != null && criterion.length > 0){
			for (Criterion c : criterion) {
				crit.add(c);
			}
		//}
		return crit.list();
	}

}
