package com.vitalia.khokhlova.entities.generics;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@MappedSuperclass
public abstract class GenericParentWithName<T> extends GenericEntity {
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}  
	
	@OrderBy("id")
	@OneToMany(mappedBy="parent2", orphanRemoval=true, cascade = CascadeType.ALL)
	protected Set<T> items;
	
}
