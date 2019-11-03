package com.vitalia.khokhlova.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="competences_group")
public class CompetenceGroup extends GenericEntity {

	private String description;

	CompetenceGroup(){};

	@OneToMany(mappedBy="group", fetch = FetchType.LAZY)
	private List<CompetenceItem> items;

	@JsonInclude()
	@Transient
	@OneToMany(mappedBy="group", fetch = FetchType.LAZY)
	private List<CompetencesConsultant> competences;

	public List<CompetencesConsultant> getCompetences() {
		List<CompetencesConsultant> competences = new ArrayList<>();
		for(CompetenceItem i : this.getItems()) {
			for(CompetencesConsultant c : i.getCompetences()) {
				competences.add(c);
			}
		}
		return competences;
	}

	public void setCompetences(List<CompetencesConsultant> competences) {
		this.competences = competences;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void addItem (CompetenceItem item) {
		this.items.add(item);
	}

	public List<CompetenceItem> getItems() {
		return items;
	}
	//
	//	public void setItems(List<CompetenceItem> items) {
	//		this.items = items;
	//	}

}
