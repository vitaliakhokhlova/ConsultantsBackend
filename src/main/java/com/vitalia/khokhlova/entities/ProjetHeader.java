package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="projet_headers")
public class ProjetHeader  extends GenericHeaderEntity<ProjetDetail> {

	private static final long serialVersionUID = 1L;
	
}
