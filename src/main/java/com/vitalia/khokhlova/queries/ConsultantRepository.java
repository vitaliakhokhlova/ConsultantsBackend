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
		
	public List<CompetencesConsultant> getExistingCompetences(int id){
		String queryString ="select comp from CompetencesConsultant comp WHERE comp.parent.id="+id;
		Query query = em.createQuery(queryString);
		List tList= query.getResultList();
		return tList;
	}
}
