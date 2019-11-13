package com.vitalia.khokhlova.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="competences_group")
public class CompetenceGroup extends GenericParentWithName<CompetenceItem> {
	
	
	@LazyCollection(LazyCollectionOption.FALSE)
	public Set<CompetenceItem> getItems() {
		return items;
	}

	public void setItems(Set<CompetenceItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "CompetenceGroup [items=" + items + "]";
	}	

}
