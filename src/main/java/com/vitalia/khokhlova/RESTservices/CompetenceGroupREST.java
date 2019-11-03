package com.vitalia.khokhlova.RESTservices;

import javax.ws.rs.Path;

import com.vitalia.khokhlova.entities.CompetenceGroup;

@Path("/group")
public class CompetenceGroupREST extends GenericREST<CompetenceGroup> {
		
	public CompetenceGroupREST() {
		super(CompetenceGroup.class);
	}

}
