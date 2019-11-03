package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="parcours_details")
public class ParcoursDetail extends GenericDetail<ParcoursHeader> {
	
}
