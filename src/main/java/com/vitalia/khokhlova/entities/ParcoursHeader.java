package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="parcours_headers")
public class ParcoursHeader  extends GenericHistoryEntity {
	private static final long serialVersionUID = 1L;  
	
	@OneToMany(mappedBy="header")
	private List<ParcoursDetail> details;

	public List<ParcoursDetail> getDetails() {
		return details;
	}

	public void setDetails(List<ParcoursDetail> details) {
		this.details = details;
	}
	
}