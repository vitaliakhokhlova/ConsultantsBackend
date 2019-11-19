package com.vitalia.khokhlova.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@MappedSuperclass
public class GenericParentWithName<T> extends GenericEntity {
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}  
	
	@OrderBy("id")
	@OneToMany(mappedBy="parent2", orphanRemoval=true, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	protected Set<T> items;
	
}
