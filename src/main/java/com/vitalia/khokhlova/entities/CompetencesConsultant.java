	package com.vitalia.khokhlova.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="competences")
public class CompetencesConsultant extends GenericCompetenceLine {

	private int niveau;	

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="parent2_id")
	private CompetenceItem parent2;

	public CompetenceItem getParent2() {
		return parent2;	}

	
    public void setParent2(CompetenceItem parent2) {
		this.parent2 = parent2;
	}

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="parent_id")
	protected Consultant parent;
    
//
//	public void setParent2(CompetenceItem parent2) {
//		this.parent2 = parent2;
//	}
//	
	
}
