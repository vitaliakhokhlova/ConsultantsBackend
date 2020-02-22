package com.vitalia.khokhlova.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	
	  private static EntityManager em = null;
	    private static EntityManagerFactory emf = null;

	    private EntityManagerFactorySingleton() {}

	    public static EntityManagerFactory getEntityManagerFactory() {
	        if(emf == null) {
	            emf = Persistence.createEntityManagerFactory("RESTful");
	        }
	        return emf;
	    }

	    public static EntityManager getEntityManager() {
	        if(em == null) {
	            em = getEntityManagerFactory().createEntityManager();
	        }
	        return em;
	    }

}
