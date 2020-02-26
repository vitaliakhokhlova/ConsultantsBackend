package com.vitalia.khokhlova.entities.generics;

import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@MappedSuperclass 
public abstract class GenericChild<T> extends GenericEntity {
		
    @ManyToOne()
	@JoinColumn(name="parent_id", foreignKey=@ForeignKey(name="parent_id_fk")) 
    @JsonIdentityReference(alwaysAsId=true)
	public T parent;

	public T getParent() {
		return parent;
	}

	public void setParent(T parent) {
		this.parent = parent;
	}

}
