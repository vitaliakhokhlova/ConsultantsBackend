package com.vitalia.khokhlova.RESTservices;

import javax.ws.rs.Path;

import com.vitalia.khokhlova.entities.CompetenceItem;

@Path("/competence_item")
public class CompetencesREST extends GenericREST<CompetenceItem> {
	
	public CompetencesREST(){
		super(CompetenceItem.class);
	}

}
