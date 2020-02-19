package com.vitalia.khokhlova.queries;

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

public class ConsultantRepository extends GenericRepository<Consultant>{
	
    public ConsultantRepository() {
    	super(Consultant.class);  
    }
	
	public List<CompetenceGroup> getGroupedCompetenceItems(int id){
		String queryString ="select distinct g from CompetenceGroup g JOIN g.items i JOIN i.items c WHERE c.parent.id=:id";
		Query query = em.createQuery(queryString).setParameter("id", id);	
//		String nativeQueryString=
//			"with ii as "+
//					" (select i.group_id "+
//					" from competences_item i "+
//					" join competences c "+
//					" on c.parent2_id=i.id "+
//					" where c.parent_id=:id)" + 
//			" select * from competences_group g " + 
//			" join ii " + 
//			" on ii.group_id=g.id";
//		Query query = em.createNativeQuery(nativeQueryString, CompetenceGroup.class).setParameter("id", id);
		List<CompetenceGroup> gList= query.getResultList();
		System.out.println(gList);
//		List<CompetenceItem> cList = getNonGroupedCompetenceItems(id);
//		for(CompetenceGroup g : gList) {
//			Set<CompetenceItem> items = g.getItems();
//			Iterator<CompetenceItem> i = items.iterator();
//			while (i.hasNext()) {
//			   String s = i.next(); 
//					   i.remove();
//			}
//		}
		System.out.println(gList);
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
	
	public List<Consultant> getByCompetence(String value){
		Class<Consultant> entityClass = Consultant.class;
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Consultant> q = cb.createQuery(entityClass);
		Root<Consultant> consultant = q.from(entityClass);
		Join<Consultant, CompetencesConsultant> competences = consultant.join("competences");
		Join<CompetencesConsultant, CompetenceItem> item = competences.join("parent2");
		
		q.select(consultant).where(cb.like(cb.lower(item.get("description")), "%"+value.toLowerCase()+"%"));
		
//		String queryString ="select item from "+entityClass.getName()+" item where lower(item."+property+") like :value order by item.id";
		TypedQuery<Consultant> query = em.createQuery(q);
		List<Consultant> tList= query.getResultList();
		return tList;
	}
}
