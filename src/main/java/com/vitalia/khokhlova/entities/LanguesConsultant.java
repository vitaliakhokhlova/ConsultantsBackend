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
public class LanguesConsultant extends GenericEntity {
	
	@Column(length=20)
	private String niveau;
	private int experience;
	private int annee;
	private String contexte;
	private String interet;	

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="cons_id")
    private Consultant consultant;

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getContexte() {
		return contexte;
	}

	public void setContexte(String contexte) {
		this.contexte = contexte;
	}

	public String getInteret() {
		return interet;
	}

	public void setInteret(String interet) {
		this.interet = interet;
	}
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="item_id")
    private LangueItem item;

	public LangueItem getItem() {
		return item;
	}

	public void setItem(LangueItem item) {
		this.item = item;
	}
	
	
}
