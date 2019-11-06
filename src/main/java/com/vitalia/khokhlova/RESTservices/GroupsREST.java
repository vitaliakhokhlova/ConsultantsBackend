package com.vitalia.khokhlova.RESTservices;

import javax.ws.rs.Path;

import com.vitalia.khokhlova.entities.CompetenceGroup;

@Path("/group")
public class GroupsREST extends GenericREST<CompetenceGroup> {
	
	public GroupsREST() {
		super(CompetenceGroup.class);
	}

}
