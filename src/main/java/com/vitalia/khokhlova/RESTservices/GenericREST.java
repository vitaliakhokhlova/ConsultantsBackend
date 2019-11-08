package com.vitalia.khokhlova.RESTservices;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.vitalia.khokhlova.queries.GenericRepository;

public class GenericREST<Entity> {
	
    protected Class<Entity> entityClass;
    protected GenericRepository<Entity> repository;

    public GenericREST(Class<Entity> entityClass){
        this.entityClass = entityClass;
        this.repository = new GenericRepository<Entity>(this.entityClass);
    }
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Entity> getAll() {
		return repository.getAll();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Entity getById(@PathParam("id") int id) {
		return repository.getById(id);
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") int id) {
		Response response;
		Entity entity = repository.getById(id);
		if (entity == null) {
			response = Response.ok("entity with id=" + id + " does not exist").build();
		} else {
			repository.delete(id);
			response = Response.ok("entity " + entity + " is deleted").build();
		}

		return response;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Entity create(Entity entity) {
		repository.create(entity);
		return entity;
	}

	@PUT	
	@Consumes(MediaType.APPLICATION_JSON)
	public Entity update(Entity entity) {
		repository.update(entity);
		return entity;
	}

}
