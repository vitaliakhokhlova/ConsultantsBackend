package com.vitalia.khokhlova.RESTservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vitalia.khokhlova.entities.LangueItem;

@Path("/langue")
public class LangueREST extends GenericREST<LangueItem> {
	
	public LangueREST() {
		super(LangueItem.class);
	}
}