package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public abstract class GenericHeaderEntity<T extends GenericDetail> extends GenericHistoryEntity {
	
	GenericHeaderEntity(){
    	super();
    }
	
	@OneToMany(mappedBy="header", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<T> details;

	public List<T> getDetails() {
		return details;
	}

	public void setDetails(List<T> details) {
		this.details = details;
	}

}
