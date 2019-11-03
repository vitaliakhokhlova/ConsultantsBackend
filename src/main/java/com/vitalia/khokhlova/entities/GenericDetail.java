package com.vitalia.khokhlova.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericDetail<T> extends GenericEntity {
	
	private static final long serialVersionUID = 1L;

    private String description;  
    
    @ManyToOne
    @JoinColumn(name="header_id")
    private T header;
    
    public GenericDetail() {}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}
