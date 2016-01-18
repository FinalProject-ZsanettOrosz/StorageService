package storage.server.resources;

import introsde.assignment.soap.*;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.ws.Holder;

@Stateless
// only used if the the application is deployed in a Java EE container
@LocalBean
// only used if the the application is deployed in a Java EE container
public class PersonResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	int id;

	EntityManager entityManager; // only used if the application is deployed in
									// a Java EE container

	public PersonResource(UriInfo uriInfo, Request request, int id,
			EntityManager em) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		this.entityManager = em;
	}

	public PersonResource(UriInfo uriInfo, Request request, int id) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
	}

	// Application integration
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getPerson() {
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		Person p = people.readPerson(id);

		if (p == null)
			return Response.status(404).build();

		System.out.println("Person with given ID: " + id);
		return Response.ok(p).build();

	}
	
	

	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response putPerson(Person person) {
		System.out.println("--> Updating Person... " + this.id);

		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		Person p = people.readPerson(id);
		if (p == null)
			return Response.status(404).build();

		p.setFirstname(p.getFirstname() + "Update");
		// p.setFirstname("Chuck");
		Holder<Person> hp = new Holder<Person>(p);
		people.updatePerson(hp);
		Person updatedPerson = people.readPerson(id);
		return Response.ok(updatedPerson).build();
	}

}