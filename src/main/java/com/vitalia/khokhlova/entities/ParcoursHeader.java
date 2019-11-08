package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="parcours_headers")
public class ParcoursHeader  extends GenericHistoryEntity {
	
	@OneToMany(mappedBy="parent", orphanRemoval=true, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	protected List<ParcoursDetail> details;

	public List<ParcoursDetail> getDetails() {
		return details;
	}
	
	public void setDetails(List<ParcoursDetail> details) {
		this.details = details;
		for(ParcoursDetail detail : this.details)
		{
			detail.parent = this;
		}
	}
		
}