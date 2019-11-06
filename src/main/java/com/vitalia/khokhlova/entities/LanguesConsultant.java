package com.vitalia.khokhlova.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="langues")
public class LanguesConsultant extends GenericCompetenceLine {
	
	@Column(length=20)
	private String niveau;
	
	
	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="parent2_id")
	private LangueItem parent2;


	public LangueItem getParent2() {
		return parent2;
	}

	public void setParent2(LangueItem parent2) {
		this.parent2 = parent2;
	}

  
}
