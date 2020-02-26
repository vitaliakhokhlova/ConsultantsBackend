package com.vitalia.khokhlova.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;

@Entity
@Table(name="personal_info")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="deep_id", scope=ConsultantLists.class) 
public class ConsultantLists extends ConsultantHeader {
		
	public ConsultantLists() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<CompetencesConsultant> getCompetences() {
		return competences;
	}

	public void setCompetences(List<CompetencesConsultant> competences) {
		this.competences = competences;
		for(CompetencesConsultant item : this.competences)
		{
			item.parent = this;
		}
	}

	@OneToMany(mappedBy="parent", orphanRemoval=true, cascade = CascadeType.ALL)
	private List<Formation> formations;
	
	@OneToMany(mappedBy="parent", orphanRemoval=true, cascade = CascadeType.ALL)
	@OrderBy("position")
	private List<ForcesConsultant> forces;
	
	@OneToMany(mappedBy="parent", orphanRemoval=true, cascade = CascadeType.ALL)
	private List<ParcoursHeader> parcours;
	
	@OneToMany(mappedBy="parent", orphanRemoval=true,cascade = CascadeType.ALL)
	private List<ProjetHeader> projets;

	@OneToMany(mappedBy="parent", orphanRemoval=true,cascade = CascadeType.ALL)
	private List<CompetencesConsultant> competences;
	
	@OneToMany(mappedBy="parent", orphanRemoval=true, cascade = CascadeType.ALL)
	private List<LanguesConsultant> langues;

	public List<LanguesConsultant> getLangues() {
		return langues;
	}

	public void setLangues(List<LanguesConsultant> langues) {
		this.langues = langues;
		for(LanguesConsultant item : this.langues)
		{
			item.parent = this;
		}
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
		for(ParcoursHeader f : this.parcours)
		{
			f.parent = this;
		}
	}

	public List<ProjetHeader> getProjets() {
		return projets;
	}

	public void setProjets(List<ProjetHeader> projets) {
		this.projets = projets;
		for(ProjetHeader item : this.projets)
		{
			item.parent = this;
		}
	}

	public List<ForcesConsultant> getForces() {
		return forces;
	}

	public void setForces(List<ForcesConsultant> forces) {
		this.forces = forces;
		for(ForcesConsultant item : this.forces)
		{
			item.parent = this;
		}
	}	
	
}