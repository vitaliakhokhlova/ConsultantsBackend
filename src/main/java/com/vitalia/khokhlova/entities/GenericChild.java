package com.vitalia.khokhlova.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@MappedSuperclass 
public class GenericChild<T> extends GenericEntity {
		
    @ManyToOne()
	@JoinColumn(name="parent_id") 
    @JsonIdentityReference(alwaysAsId=true) 
	protected T parent;

	public T getParent() {
		return parent;
	}

	public void setParent(T parent) {
		this.parent = parent;
	}

}
