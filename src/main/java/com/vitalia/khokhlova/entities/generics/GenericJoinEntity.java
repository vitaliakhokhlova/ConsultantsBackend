package com.vitalia.khokhlova.entities.generics;

import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.vitalia.khokhlova.entities.ConsultantLists;
import com.vitalia.khokhlova.entities.generics.GenericParentWithName;

@MappedSuperclass
public abstract class GenericJoinEntity<T extends GenericParentWithName> extends GenericChild<ConsultantLists> {
	 	
	@ManyToOne()
    @JoinColumn(name="parent2_id", foreignKey=@ForeignKey(name="parent2_id_fk"))
    private T parent2;
	
    public T getParent2() {
		return parent2;
	}

	public void setParent2(T parent2) {
		this.parent2 = parent2;
	}

}
