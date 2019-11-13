package com.vitalia.khokhlova.RESTservices;

import javax.ws.rs.Path;

import com.vitalia.khokhlova.entities.ForceItem;

@Path("/force")
public class ForceREST  extends GenericREST<ForceItem> {

	public ForceREST() {
		super(ForceItem.class);
	}
}
