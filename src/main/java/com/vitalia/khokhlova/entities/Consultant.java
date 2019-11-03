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

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

@Entity
@Table(name="personal_info")
public class Consultant extends ConsultantHeader {
		
	@OneToMany(mappedBy="consultant", fetch = FetchType.LAZY)
	private List<Formation> formations;
	
	@OneToMany(mappedBy="consultant", fetch = FetchType.LAZY)
	@OrderBy("position ASC")
	private List<ForcesConsultant> forces;
	
	@OneToMany(mappedBy="consultant", fetch = FetchType.LAZY)
	private List<ParcoursHeader> parcours;
	
	@OneToMany(mappedBy="consultant", fetch = FetchType.LAZY)
	private List<ProjetHeader> projets;
	
	@OneToMany(mappedBy="consultant", fetch = FetchType.LAZY)
	private List<CompetencesConsultant> competences;

	@JsonInclude()
	@Transient
	@Column(updatable=false)
	private Set<CompetenceGroup> groups;
	
	public Set<CompetenceGroup> getGroups() {
		List<CompetencesConsultant> competences = this.getCompetences();
		Set<CompetenceGroup> groups = new HashSet<CompetenceGroup>();
		for(CompetencesConsultant c : competences) {
			CompetenceItem i = c.getCompetence();
			CompetenceGroup g = c.getGroup();
			groups.add(g);
		}
		return groups;
	}

	@Transient
	public void setGroups(Set<CompetenceGroup> groups) {
		this.groups = groups;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
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

	public List<CompetencesConsultant> getCompetences() {
		return competences;
	}

	public List<ForcesConsultant> getForces() {
		return forces;
	}

	public void setForces(List<ForcesConsultant> forces) {
		this.forces = forces;
	}
//	public void setCompetences(List<CompetencesConsultant> competences) {
//		this.competences = competences;
//	}
	
}