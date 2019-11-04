package com.vitalia.khokhlova.entities;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public class GenericItemEntity<T> extends GenericEntity {

	private String item;	

	@OneToMany(mappedBy="item", fetch = FetchType.LAZY)
	private List<T> items;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
