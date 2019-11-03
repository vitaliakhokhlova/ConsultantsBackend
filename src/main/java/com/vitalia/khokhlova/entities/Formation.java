package com.vitalia.khokhlova.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="formations")
public class Formation<ProjetDetail> extends GenericHistoryEntity {
	
	Formation(){
		super();
	}
}