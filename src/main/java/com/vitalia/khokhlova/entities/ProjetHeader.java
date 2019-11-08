package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="projet_headers")
public class ProjetHeader  extends GenericHistoryEntity {

	@OneToMany(mappedBy="parent", orphanRemoval=true, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	protected List<ProjetDetail> details;

	public List<ProjetDetail> getDetails() {
		return details;
	}
	
	public void setDetails(List<ProjetDetail> details) {
		this.details = details;
		for(ProjetDetail detail : this.details)
		{
			detail.parent = this;
		}
	}
	
}
