package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="competences_item")
public class CompetenceItem extends GenericParentWithName<CompetencesConsultant> {
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="group_id")
    private CompetenceGroup item;
    
	public CompetenceGroup getItem() {
		return item;
	}

	public void setItem(CompetenceGroup item) {
		this.item = item;
	}

}
