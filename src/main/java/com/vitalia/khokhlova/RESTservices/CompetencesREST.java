package com.vitalia.khokhlova.RESTservices;

import javax.ws.rs.Path;

import com.vitalia.khokhlova.entities.CompetenceItem;
import com.vitalia.khokhlova.entities.CompetencesConsultant;

@Path("/competence")
public class CompetencesREST extends GenericREST<CompetencesConsultant> {
	
	public CompetencesREST(){
		super(CompetencesConsultant.class);
	}

}
