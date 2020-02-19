package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="force_items")
public class ForceItem extends GenericParentWithName<ForcesConsultant> {
	
}
