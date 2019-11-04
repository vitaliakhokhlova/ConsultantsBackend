package com.vitalia.khokhlova.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericEntityWithName extends GenericEntity {
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}  

}
