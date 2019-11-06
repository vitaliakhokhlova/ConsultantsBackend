package com.vitalia.khokhlova.entities;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public class GenericChild<T> extends GenericEntity {
	
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="parent_id")  
    @JsonIgnore
	protected T parent;

//	public T getParent() {
//		return parent;
//	}
//
//	@JsonIgnore
//	public void setParent(T parent) {
//		this.parent = parent;
//	}
//	
	
}
