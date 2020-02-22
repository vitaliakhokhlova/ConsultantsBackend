package com.vitalia.khokhlova.RESTservices;

import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vitalia.khokhlova.entities.CompetenceGroup;
import com.vitalia.khokhlova.entities.CompetenceItem;
import com.vitalia.khokhlova.entities.CompetencesConsultant;
import com.vitalia.khokhlova.entities.ConsultantLists;
import com.vitalia.khokhlova.repositories.ConsultantRepository;
import com.vitalia.khokhlova.repositories.GenericRepository;


@Path("/consultant")
public class ConsultantREST extends GenericREST<ConsultantLists> {
	
	private ConsultantRepository repository;
	
	public ConsultantREST() {
		super(ConsultantLists.class);
		this.repository = new ConsultantRepository();
	}
	
	@GET
	@Path("/{id}/grouped_competences")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CompetenceGroup> getGroupedCompetences(@PathParam("id") int id) {
		return repository.getGroupedCompetenceItems(id);
	}
	
	@GET
	@Path("/{id}/nongrouped_competences")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CompetenceItem> getNonGroupedCompetenceItems(@PathParam("id") int id) {
		return repository.getNonGroupedCompetenceItems(id);
	}
	
	@GET
	@Path("/{id}/competences")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CompetencesConsultant> getExistingCompetences(@PathParam("id") int id) {
		return repository.getConsultantCompetences(id);
	}
	
	@GET
	@Path("/{id}/all_competences")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CompetenceItem> getAllCompetences(@PathParam("id") int id) {
		return repository.getAllCompetences(id);
	}
	
	@GET
	@Path("/search_by_competence/{value}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ConsultantLists> getByCompetence(@PathParam("value") String value) {
		return repository.getByCompetence(value);
	}

}
