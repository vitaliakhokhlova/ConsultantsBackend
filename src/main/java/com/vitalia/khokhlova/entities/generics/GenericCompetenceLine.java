package com.vitalia.khokhlova.entities.generics;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.vitalia.khokhlova.entities.CompetenceItem;
import com.vitalia.khokhlova.entities.ConsultantLists;

@MappedSuperclass
public class GenericCompetenceLine<T extends GenericParentWithName> extends GenericJoinEntity<T>{
	
	private int experience;
	private int annee;
	private String contexte;
	private String interet;	

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getContexte() {
		return contexte;
	}

	public void setContexte(String contexte) {
		this.contexte = contexte;
	}

	public String getInteret() {
		return interet;
	}

	public void setInteret(String interet) {
		this.interet = interet;
	}
		
}
