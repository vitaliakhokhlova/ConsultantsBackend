package com.vitalia.khokhlova.queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.vitalia.khokhlova.entities.*;

public class ConsultantRepository extends GenericRepository<Consultant>{
	
    public ConsultantRepository() {
    	super(Consultant.class);  
    }
    
	private EntityManager em = EntityManagerFactorySingleton.getEntityManager();

	public List<Consultant> getAll(){
		String queryString ="select c from Consultant c order by c.lastname";
		Query query = em.createQuery(queryString);
		List<Consultant> tList= query.getResultList();
		return tList;
	}

    
//	public Consultant getById(int id) {
//		String queryString ="select c from Consultant c join c.competence where c.id="+id;
//		TypedQuery<Consultant> query = em.createQuery(queryString, Consultant.class);
//		Consultant consultant= (Consultant) query.getResultList();
//		return consultant;
//	}
////
//    public List<Consultant> searchByLastname(String lastname) {
//        String queryString = "select b from Consultant b where upper(b.lastname) LIKE '%" + lastname.toUpperCase()  + "%' ORDER BY b.id";
//        List<Consultant> consultantList = findByQuery(queryString);
//        return consultantList;
//    }
}
