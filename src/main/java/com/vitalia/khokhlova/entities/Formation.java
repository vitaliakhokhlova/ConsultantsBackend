package com.vitalia.khokhlova.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.vitalia.khokhlova.entities.generics.GenericHistoryEntity;

@Entity
@Table(name="formations")
public class Formation extends GenericHistoryEntity {
	
}