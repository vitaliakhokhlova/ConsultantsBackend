package com.vitalia.khokhlova.repositories;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import com.vitalia.khokhlova.entities.*;

public class ConsultantRepository extends GenericRepository<ConsultantLists>{
	
    public ConsultantRepository() {
    	super(ConsultantLists.class);  
    }
	
	public List<CompetenceGroup> getGroupedCompetenceItems(int id){
		String queryString ="select distinct g from CompetenceGroup g JOIN g.items i JOIN i.items c WHERE c.parent.id=:id";
		Query query = em.createQuery(queryString).setParameter("id", id);	
		List<CompetenceGroup> gList= query.getResultList();
		return gList;
	}
		
	public List<CompetencesConsultant> getConsultantCompetences(int id){
		String queryString ="select comp from CompetencesConsultant comp WHERE comp.parent.id="+id;
		Query query = em.createQuery(queryString);
		List<CompetencesConsultant> tList= query.getResultList();
		return tList;
	}
	
	public List<CompetenceItem> getNonGroupedCompetenceItems(int id){
		String queryString ="select distinct i from CompetenceItem i JOIN fetch i.items c WHERE c.parent.id="+id;
		Query query = em.createQuery(queryString);
		List<CompetenceItem> tList= query.getResultList();
		return tList;
	}
	
	public List<CompetenceItem> getAllCompetences(int id){
		String queryString ="SELECT i FROM CompetenceItem AS i LEFT JOIN i.items AS c where c.parent.id=:id o";
		Query query = em.createQuery(queryString).setParameter("id", id);
		List<CompetenceItem> tList= query.getResultList();
		return tList;
	}
	
	public List<ConsultantLists> getByCompetence(String value){
		Class<ConsultantLists> entityClass = ConsultantLists.class;
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<ConsultantLists> q = cb.createQuery(entityClass);
		Root<ConsultantLists> consultant = q.from(entityClass);
		Join<ConsultantLists, CompetencesConsultant> competences = consultant.join("competences");
		Join<CompetencesConsultant, CompetenceItem> item = competences.join("parent2");
		
		q.select(consultant).where(cb.like(cb.lower(item.get("description")), value.toLowerCase()));
		
		TypedQuery<ConsultantLists> query = em.createQuery(q);
		List<ConsultantLists> tList= query.getResultList();
		return tList;
	}
}
