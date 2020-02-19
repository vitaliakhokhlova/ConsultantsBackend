package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="parcours_headers")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id", scope = ParcoursHeader.class)
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