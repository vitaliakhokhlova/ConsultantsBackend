package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="force_items")
public class Force extends GenericEntity {
	
	
	private String force;
	
	@OneToMany(mappedBy="force", fetch = FetchType.LAZY)
	private List<ForcesConsultant> forces;
	
	public String getForce() {
		return force;
	}

	
}
