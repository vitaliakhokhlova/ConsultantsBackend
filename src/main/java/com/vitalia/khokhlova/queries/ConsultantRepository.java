package com.vitalia.khokhlova.queries;

import java.util.List;

import javax.persistence.Query;

import com.vitalia.khokhlova.entities.*;

public class ConsultantRepository extends GenericRepository<Consultant>{
	
    public ConsultantRepository() {
    	super(Consultant.class);  
    }
	
	public List<CompetenceGroup> getGroupedCompetences(int id){
		String queryString ="select distinct g from CompetenceGroup g JOIN fetch g.items i JOIN fetch i.items c WHERE c.parent.id="+id;
		Query query = em.createQuery(queryString);
		List tList= query.getResultList();
		return tList;
	}
		
	
//	public List<CompetenceGroup> getGroupedEmptyCompetences(int id){
//		String queryString ="select distinct g from CompetenceGroup as g";
//		Query query = em.createQuery(queryString).setParameter("id", id);
//		List tList= query.getResultList();
//		
//		Consultant consultant=em.find(Consultant.class, id);
//		for(CompetencesConsultant i : consultant.competences) {
//			
//		}
//		return tList;
//	}
	
	
//	public List<CompetenceGroup> getGroupedEmptyCompetences(int id){
//		String queryString ="select distinct g from CompetenceGroup g JOIN g.items i FULL JOIN i.items c WHERE c.parent.id="+id;
//		Query query = em.createQuery(queryString);
//		List tList= query.getResultList();
//		return tList;
//	}
	
//	public List<CompetenceGroup> getGroupedCompetences(int id){
//		String queryString ="select distinct g from CompetencesConsultant comp JOIN comp.parent2 i JOIN i.parent2 g WHERE comp.id is not null and comp.parent.id="+id;
//		Query query = em.createQuery(queryString);
//		List tList= query.getResultList();
//		return tList;
//	}
	
	public List<CompetencesConsultant> getExistingCompetences(int id){
		String queryString ="select comp from CompetencesConsultant comp WHERE comp.parent.id="+id;
		Query query = em.createQuery(queryString);
		List tList= query.getResultList();
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
