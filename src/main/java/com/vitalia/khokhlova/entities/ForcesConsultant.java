package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="forces")
public class ForcesConsultant extends GenericEntity {

	private int position;
	@JsonInclude()
	@Transient
	private String name;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cons_id")
    private Consultant consultant;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="force_item_id")
    private Force force;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public Force getForce() {
		return force;
	}

	public void setForce(Force force) {
		this.force = force;
	}

	public String getName() {
		return this.getForce().getForce();
	}

	public void setName(String name) {
		this.name = name;
	}

}
