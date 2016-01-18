package storage.server.resources;

import introsde.assignment.soap.*;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


public class MeasureDefResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	int id;

	EntityManager entityManager; // only used if the application is deployed

	public MeasureDefResource(UriInfo uriInfo, Request request, int id,
			EntityManager em) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		this.entityManager = em;
	}

	public MeasureDefResource(UriInfo uriInfo, Request request, int id) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
	}

	// Application integration
	@GET
	@Path("/person/{personId}/{measureType}/{mid}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getMeasureDefinition(@PathParam("personID") int personID,
			@PathParam("measureType") String measureType) {
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();

		HealthMeasureHistory his = people.readPersonMeasure(personID,
				measureType, id);
		System.out.println("A persons's measure with mid: " + id);
		if(his == null)
			return Response.status(404).build();
		
		return Response.ok(his).build();
	}

}
