package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="parcours_headers")
public class ParcoursHeader  extends GenericHeaderEntity<ParcoursDetail> {

	private static final long serialVersionUID = 1L;
		
}