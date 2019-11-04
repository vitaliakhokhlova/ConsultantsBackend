package com.vitalia.khokhlova.entities;

import java.util.List;
import java.util.Set;

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
public class CompetencesConsultant extends GenericCompetenceLine<CompetenceItem> {
	
	private int niveau;	

	public int getNiveau() {
		return niveau;
	}
	
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
		
}
