package com.vitalia.khokhlova.entities.generics;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericDetail<T extends GenericHistoryEntityWithDetails> extends GenericChildWithName<T> {
	
}
