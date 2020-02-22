package com.vitalia.khokhlova.entities.generics;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public abstract class GenericHistoryEntityWithDetails<T extends GenericDetail> extends GenericHistoryEntity {
	
    private String pictogram;
	
	@OneToMany(mappedBy="parent", orphanRemoval=true, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	protected List<T> details;

	public String getPictogram() {
		return pictogram;
	}

	public void setPictogram(String pictogram) {
		this.pictogram = pictogram;
	}

	public List<T> getDetails() {
		return details;
	}
	
	public void setDetails(List<T> details) {
		this.details = details;
		for(T detail : this.details)
		{
			detail.parent = this;
		}
	}

}
