package com.vitalia.khokhlova.entities.generics;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass 
public abstract class GenericChildWithName<T> extends GenericChild<T> {
	
	@Column(nullable=false)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}  

}
