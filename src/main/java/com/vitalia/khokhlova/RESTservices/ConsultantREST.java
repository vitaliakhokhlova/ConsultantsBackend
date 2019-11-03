package com.vitalia.khokhlova.RESTservices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vitalia.khokhlova.entities.Consultant;
import com.vitalia.khokhlova.entities.ConsultantHeader;
import com.vitalia.khokhlova.queries.ConsultantRepository;
import com.vitalia.khokhlova.queries.GenericRepository;

@Path("/consultant")
public class ConsultantREST extends GenericREST<Consultant> {
	
	public ConsultantREST() {
		super(Consultant.class);
	}
	
	ConsultantRepository repository = new ConsultantRepository();
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Consultant> getAll() {
		return this.repository.getAll();
	}

}
