package com.vitalia.khokhlova.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="competences_item")
public class CompetenceItem extends GenericEntity {
	
	private String item;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="group_id")
    private CompetenceGroup group;
    
	@OneToMany(mappedBy="competence", fetch = FetchType.LAZY)
	private List<CompetencesConsultant> competences;
	
	public CompetenceItem() {
		super();
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public CompetenceGroup getGroup() {
		return group;
	}

	@Override
	public String toString() {
		return "CompetenceItem [item=" + item + "]";
	}

	public List<CompetencesConsultant> getCompetences() {
		return competences;
	}

}
