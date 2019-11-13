package com.vitalia.khokhlova.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="competences_item")
public class CompetenceItem extends GenericParentWithName<CompetencesConsultant> {
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="group_id")
    private CompetenceGroup parent2;
    
//    @LazyCollection(LazyCollectionOption.FALSE)
//	public Set<CompetencesConsultant> getItems() {
//		return items;
//	}

//	public void setItems(Set<CompetencesConsultant> items) {
//		this.items = items;
//	}

	@Override
	public String toString() {
		return "CompetenceItem [parent2=" + parent2 + ", items=" + items + "]";
	}

	public CompetenceGroup getParent2() {
		return parent2;
	}

//	public void setParent2(CompetenceGroup parent2) {
//		this.parent2 = parent2;
//	}
}
