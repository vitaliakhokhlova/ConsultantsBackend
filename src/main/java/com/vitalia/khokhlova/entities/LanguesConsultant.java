package com.vitalia.khokhlova.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="langues",
uniqueConstraints=
@UniqueConstraint(columnNames = {"parent_id", "parent2_id"}))
public class LanguesConsultant extends GenericCompetenceLine {
	
	@Column(length=20)
	private String niveau;
	
	
	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	@ManyToOne()
	@JoinColumn(name="parent2_id")
	private LangueItem parent2;


	public LangueItem getParent2() {
		return parent2;
	}

	public void setParent2(LangueItem parent2) {
		this.parent2 = parent2;
	}
 
}
