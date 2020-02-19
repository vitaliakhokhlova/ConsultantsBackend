package com.vitalia.khokhlova.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericHistoryEntity extends GenericChild<Consultant> {
	
    private String institution;
    private String description;
    private String place;    
    private String dates;
    private String pictogram;

	public String getPictogram() {
		return pictogram;
	}

	public void setPictogram(String pictogram) {
		this.pictogram = pictogram;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
