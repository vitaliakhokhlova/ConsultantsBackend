package com.vitalia.khokhlova.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

@Entity
@Table(name="personal_info")
public class Consultant extends ConsultantHeader {
		
	@OneToMany(mappedBy="parent",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Formation> formations;
	
	@OneToMany(mappedBy="parent", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@OrderBy("position")
	private List<ForcesConsultant> forces;
	
	@OneToMany(mappedBy="parent", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<ParcoursHeader> parcours;
	
	@OneToMany(mappedBy="parent", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<ProjetHeader> projets;
	
	@OneToMany(mappedBy="parent", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<CompetencesConsultant> competences;
	
	@OneToMany(mappedBy="parent", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<LanguesConsultant> langues;

	public List<LanguesConsultant> getLangues() {
		return langues;
	}

	public void setLangues(List<LanguesConsultant> langues) {
		this.langues = langues;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {	
		this.formations = formations;
		for(Formation f : this.formations)
		{
			f.parent = this;
		}
	}

	public List<ParcoursHeader> getParcours() {
		return parcours;
	}

	public void setParcours(List<ParcoursHeader> parcours) {
		this.parcours = parcours;
	}

	public List<ProjetHeader> getProjets() {
		return projets;
	}

	public void setProjets(List<ProjetHeader> projets) {
		this.projets = projets;
	}



	public List<ForcesConsultant> getForces() {
		return forces;
	}

	public void setForces(List<ForcesConsultant> forces) {
		this.forces = forces;
	}
	
	public List<CompetencesConsultant> getCompetences() {
		return competences;
	}
	
//	public void setCompetences(List<CompetencesConsultant> competences) {
//		this.competences = competences;
//	}
	
}