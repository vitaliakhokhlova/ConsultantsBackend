package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="projet_details")
public class ProjetDetail extends GenericDetail<ProjetHeader>{
	
}
