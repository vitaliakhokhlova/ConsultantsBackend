package com.vitalia.khokhlova.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@MappedSuperclass
@JsonIgnoreProperties 
public abstract class GenericEntity implements Serializable {  
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;
	
	GenericEntity(){}

	public Integer getId() {  
		return this.id;  
	}  
	public void setId(Integer id) {  
		this.id = id;  
	}  
	
	@JsonIgnore
	public boolean isNew() {
		return false;
		
	}

}  