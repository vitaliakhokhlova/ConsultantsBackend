package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vitalia.khokhlova.entities.generics.GenericJoinEntity;

@Entity
@Table(name="forces",
uniqueConstraints=
@UniqueConstraint(columnNames = {"parent_id", "parent2_id"}))
public class ForcesConsultant extends GenericJoinEntity<ForceItem> {

	private int position;
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
   
}
