package com.vitalia.khokhlova.entities.generics;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.vitalia.khokhlova.entities.ConsultantLists;
import com.vitalia.khokhlova.entities.ProjetDetail;
import com.vitalia.khokhlova.entities.generics.*;

@MappedSuperclass
public abstract class GenericHistoryEntity extends GenericChildWithName<ConsultantLists> {
	
    private String institution;
    private String place;    
    private String dates;
	
	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}
   
}
