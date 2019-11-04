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
public class LanguesConsultant extends GenericCompetenceLine<LangueItem> {
	
	@Column(length=20)
	private String niveau;
	
	
	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
}
