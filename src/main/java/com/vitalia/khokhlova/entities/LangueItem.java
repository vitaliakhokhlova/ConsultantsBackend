package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.vitalia.khokhlova.entities.LanguesConsultant;
import com.vitalia.khokhlova.entities.generics.GenericEntity;
import com.vitalia.khokhlova.entities.generics.GenericParentWithName;

@Entity
@Table(name="langue_items")
public class LangueItem extends GenericParentWithName<LanguesConsultant> {	
	
}
