package com.vitalia.khokhlova.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public class GenericParentWithName<T> extends GenericEntity {
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}  
	
	@OneToMany(mappedBy="parent2", cascade = CascadeType.ALL)
	protected Set<T> items;
	

}
