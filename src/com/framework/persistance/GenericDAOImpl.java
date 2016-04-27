package com.framework.persistance;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.restful.domain.Person;

public class GenericDAOImpl<T> /*extends SharedEntityManagerBean */implements GenericDAO<T> {
    
	@PersistenceContext
	protected EntityManager entityManager;
	
    private Class<T> type;
 
    public GenericDAOImpl() {
        // TODO Auto-generated constructor stub
 
    }
 
    public GenericDAOImpl(Class<T> type) {
        // TODO Auto-generated constructor stub
 
        this.type = type;
    }
    
    @Override
    public T save(T emp) {
        // TODO Auto-generated method stub
        entityManager.persist(emp);
//        entityManager.merge(emp);
        entityManager.flush();
        return emp;
    }
 
    @Override
    public Boolean delete(T emp) {
        // TODO Auto-generated method stub
        try {
             entityManager.remove(emp);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
 
    @Override
    public T edit(T emp) {
        // TODO Auto-generated method stub
        try{
           return entityManager.merge(emp);
        } catch(Exception ex) {
            return null;
        }
    }
 
    @Override
    public T find(Integer empId) {
    	System.out.println(entityManager);
        // TODO Auto-generated method stub
        return (T) entityManager.find(Person.class, empId);
    }	
}