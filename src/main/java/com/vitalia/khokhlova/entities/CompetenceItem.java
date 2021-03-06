package com.vitalia.khokhlova.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.vitalia.khokhlova.entities.generics.GenericEntity;
import com.vitalia.khokhlova.entities.generics.GenericParentWithName;

@Entity
@Table(name="competences_item")
public class CompetenceItem extends GenericParentWithName<CompetencesConsultant> {
	
    @ManyToOne()
    @JoinColumn(name="group_id", foreignKey=@ForeignKey(name="group_id_fk")) 
    protected CompetenceGroup parent2;

	public CompetenceGroup getParent2() {
		return parent2;
	}
	

	public void setParent2(CompetenceGroup parent2) {
		this.parent2 = parent2;
	}
	
}
