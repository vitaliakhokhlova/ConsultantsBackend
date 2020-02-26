package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.vitalia.khokhlova.entities.generics.GenericHistoryEntityWithDetails;

@Entity
@Table(name="projet_headers")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="deep_id", scope = ProjetHeader.class)
public class ProjetHeader  extends GenericHistoryEntityWithDetails<ProjetDetail> {


	
}
