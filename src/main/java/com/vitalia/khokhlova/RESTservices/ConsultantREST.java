package com.vitalia.khokhlova.RESTservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vitalia.khokhlova.entities.CompetenceGroup;
import com.vitalia.khokhlova.entities.CompetenceItem;
import com.vitalia.khokhlova.entities.CompetencesConsultant;
import com.vitalia.khokhlova.entities.Consultant;
import com.vitalia.khokhlova.queries.ConsultantRepository;
import com.vitalia.khokhlova.queries.GenericRepository;


@Path("/consultant")
public class ConsultantREST extends GenericREST<Consultant> {
	
	private ConsultantRepository repository;
	
	public ConsultantREST() {
		super(Consultant.class);
		this.repository = new ConsultantRepository();
	}
	
	@GET
	@Path("/{id}/grouped_competences")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CompetenceGroup> getGroupedCompetences(@PathParam("id") int id) {
		List<CompetenceGroup> tList = repository.getGroupedCompetences(id);
		System.out.println("Got database response");
		return tList;
	}
	
//	@GET
//	@Path("/{id}/grouped_empty_competences")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<CompetenceGroup> getGroupedEmptyCompetences(@PathParam("id") int id) {
//		List<CompetenceGroup> tList = repository.getGroupedEmptyCompetences(id);
//		System.out.println("Got database response");
//		return tList;
//	}
	
	@GET
	@Path("/{id}/competences")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CompetencesConsultant> getExistingCompetences(@PathParam("id") int id) {
		return repository.getExistingCompetences(id);
	}

}
