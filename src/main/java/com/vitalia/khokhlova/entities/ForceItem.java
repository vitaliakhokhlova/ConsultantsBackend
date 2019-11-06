package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="force_items")
public class ForceItem extends GenericParentWithName<ForcesConsultant> {
	
}
