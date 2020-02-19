package com.vitalia.khokhlova.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="competences_group")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id", scope=Consultant.class) 
public class CompetenceGroup extends GenericParentWithName<CompetenceItem> {
	
	@JsonIgnoreProperties("parent2")
	
	public void addItem(CompetenceItem item) {
		this.items.add(item);
	}
	
	@LazyCollection(LazyCollectionOption.FALSE)
	public Set<CompetenceItem> getItems() {
		return items;
	}

	public void setItems(Set<CompetenceItem> items) {
		this.items = items;
		for(CompetenceItem item : this.items)
		{
			item.parent2 = this;
		}
	}

	@Override
	public String toString() {
		return "CompetenceGroup [items=" + items + "]";
	}	

}
