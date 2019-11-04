package com.vitalia.khokhlova.entities;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class GenericIntermediateEntity<V extends GenericEntity, T extends GenericParentWithName> extends GenericEntity {
	
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="item_id")
    private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private V parent;

}
