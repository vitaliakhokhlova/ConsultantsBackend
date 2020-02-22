package com.vitalia.khokhlova.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

public class GenericRepository<T> {

    private Class<T> entityClass;

    public GenericRepository(Class<T> entityClass){
        this.entityClass = entityClass;
    } 

	protected EntityManager em = EntityManagerFactorySingleton.getEntityManager();

	public List<T> getAll(){
		System.out.println("Class name" + entityClass.getName());
		String queryString ="select item from "+entityClass.getName()+" item order by item.id";
		TypedQuery<T> query = em.createQuery(queryString, entityClass);
		List<T> tList= query.getResultList();
		return tList;
	}
	
	public List<T> getAllOrdered(String column){
		String queryString ="select c from " + entityClass.getName() + " c order by c."+column;
		Query query = em.createQuery(queryString);
		List<T> tList= query.getResultList();
		return tList;
	}
	
	public List<T> getByProperty(String property, String value){
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> q = cb.createQuery(entityClass);
		Root<T> root = q.from(entityClass);
		
		q.select(root).where(cb.like(cb.lower(root.get(property)), "%"+value.toLowerCase()+"%"));
		TypedQuery<T> query = em.createQuery(q);
		List<T> tList= query.getResultList();
		return tList;
	}

	public T getById(int id) {
		return em.find(entityClass, id);
	}
	
	public void delete(int id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		T b = em.find(entityClass, id);
		if (b != null) {
			em.remove(b);
		}
		tx.commit();
	}

	public void create(T t) {
		
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(t);
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
			System.out.println("Creating error");
		}
	}

	public T update(T t) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			t = em.merge(t);
			em.flush();
			tx.commit();
			
		}
		catch (Exception e) {
			tx.rollback();
			System.out.println("Updating error: "+e);
		}   
		return t;  
	}
	

	@SuppressWarnings("unchecked")
	public List<T> findByQuery(String query) {  
		Query q = this.em.createQuery(query);  
		return (List<T>) q.getResultList();  
	}  
}
