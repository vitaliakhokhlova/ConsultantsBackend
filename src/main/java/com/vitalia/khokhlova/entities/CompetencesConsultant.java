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
public class CompetencesConsultant extends GenericEntity {
	
	private int niveau;
	private int experience;
	private int annee;
	private String contexte;
	private String interet;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cons_id")
    private Consultant consultant;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="comp_item_id")
    private CompetenceItem competence;

	public int getNiveau() {
		return niveau;
	}
	
	@JsonInclude()
	@Transient
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id")
	private CompetenceGroup group;

	public CompetenceGroup getGroup() {
		CompetenceGroup group = this.getCompetence().getGroup();
		return group;
	}

//	public void setGroup(CompetenceGroup group) {
//		this.group = group;
//	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

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

	public CompetenceItem getCompetence() {
		return competence;
	}

	public void setCompetence(CompetenceItem competence) {
		this.competence = competence;
	}
    	
}
