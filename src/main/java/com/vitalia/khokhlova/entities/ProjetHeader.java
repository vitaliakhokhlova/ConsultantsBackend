package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="projet_headers")
public class ProjetHeader  extends GenericHistoryEntity {
	private static final long serialVersionUID = 1L;  
	
	@OneToMany(mappedBy="header")
	private List<ProjetDetail> details;

	public List<ProjetDetail> getDetails() {
		return details;
	}

	public void setDetails(List<ProjetDetail> details) {
		this.details = details;
	}
	
}
