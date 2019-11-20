package com.vitalia.khokhlova.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="forces",
uniqueConstraints=
@UniqueConstraint(columnNames = {"parent_id", "parent2_id"}))

public class ForcesConsultant extends GenericChild<Consultant> {

	private int position;
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
    @ManyToOne()
    @JoinColumn(name="parent2_id")
    private ForceItem parent2;

	
    public ForceItem getParent2() {
		return parent2;
	}

	public void setParent2(ForceItem parent2) {
		this.parent2 = parent2;
	}
}
