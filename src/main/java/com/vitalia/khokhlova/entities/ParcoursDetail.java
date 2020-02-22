package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.vitalia.khokhlova.entities.generics.GenericDetail;

@Entity
@Table(name="parcours_details")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id", scope = ParcoursDetail.class)
public class ParcoursDetail extends GenericDetail<ParcoursHeader> {
	
}
