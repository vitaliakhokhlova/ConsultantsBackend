package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public class GenericParentWithName<T> extends GenericEntityWithName {

	@OneToMany(mappedBy="item", fetch = FetchType.LAZY)
	protected List<T> items;

}
