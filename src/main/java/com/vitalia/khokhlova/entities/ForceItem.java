package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.vitalia.khokhlova.entities.generics.GenericParentWithName;

@Entity
@Table(name="force_items")
public class ForceItem extends GenericParentWithName<ForcesConsultant> {
	
}
