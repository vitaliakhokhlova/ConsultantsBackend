package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="projet_details")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id", scope = ProjetDetail.class)
public class ProjetDetail extends GenericDetail<ProjetHeader>{
	
	
}
