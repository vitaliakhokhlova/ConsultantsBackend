package com.vitalia.khokhlova.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericDetail<T extends GenericHeaderEntity> extends GenericEntityWithName {
		
    @ManyToOne
    @JoinColumn(name="header_id")
    private T header;
    
}
