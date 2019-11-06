package com.vitalia.khokhlova.entities;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class GenericIntermediateEntity<T extends GenericParentWithName> extends GenericChild<Consultant> {
	
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="parent2_id")
    private T parent2;

	
    public T getParent2() {
		return parent2;
	}

	public void setParent2(T parent2) {
		this.parent2 = parent2;
	}

}
