package com.vitalia.khokhlova.queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class GenericRepository<T> {

    protected Class<T> entityClass;

    public GenericRepository(Class<T> entityClass){
        this.entityClass = entityClass;
    } 

	private EntityManager em = EntityManagerFactorySingleton.getEntityManager();

//	public List<T> getAll(){
//		System.out.println("Class name" + entityClass.getName());
//		String queryString ="select item from "+entityClass.getName()+" item";
//		TypedQuery<T> query = em.createQuery(queryString, entityClass);
//		List<T> tList= query.getResultList();
//		return tList;
//	}

	/**
	 * @param id
	 * @return
	 */
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
		}
	}

	public void update(T t) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(em.merge(t));
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> findByQuery(String query) {  
		Query q = this.em.createQuery(query);  
		return (List<T>) q.getResultList();  
	}  
}
