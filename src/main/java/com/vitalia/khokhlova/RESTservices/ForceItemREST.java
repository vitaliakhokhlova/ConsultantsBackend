package com.vitalia.khokhlova.RESTservices;

import javax.ws.rs.Path;

import com.vitalia.khokhlova.entities.ForceItem;

@Path("/force")
public class ForceItemREST  extends GenericREST<ForceItem> {

	public ForceItemREST() {
		super(ForceItem.class);
	}
}
