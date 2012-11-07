package dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T, ID extends Serializable> {
	 
    T findById(ID id);
 
    List<T> findAll();
 
    List<T> findByExample(T exampleInstance);
 
    T makePersistent(T entity);
    
    T makePersistentMerge(T entity);
 
    void makeTransient(T entity);
}
