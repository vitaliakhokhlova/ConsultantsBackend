package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.vitalia.khokhlova.entities.GenericEntity;
import com.vitalia.khokhlova.entities.LanguesConsultant;

@Entity
@Table(name="langue_items")
public class LangueItem extends GenericItemEntity<LanguesConsultant> {		
	
}
