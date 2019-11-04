package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="force_items")
public class Force extends GenericEntity {
	
	@Column(length=50)
	private String force;
	
	@OneToMany(mappedBy="force", fetch = FetchType.LAZY)
	private List<ForcesConsultant> forces;
	
	public String getForce() {
		return force;
	}

	public void setForce(String force) {
		this.force = force;
	}
	
}
