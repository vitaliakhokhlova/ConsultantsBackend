	package com.vitalia.khokhlova.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="competences",
uniqueConstraints=
@UniqueConstraint(columnNames = {"parent_id", "parent2_id"}))
public class CompetencesConsultant extends GenericCompetenceLine {

	private int niveau;	

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="parent2_id") 
	private CompetenceItem parent2;

	public CompetenceItem getParent2() {
		return parent2;	}
	
    public void setParent2(CompetenceItem parent2) {
		this.parent2 = parent2;
	}    	
}
