package storage.server.resources;

import introsde.assignment.soap.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElementWrapper;

import org.apache.http.message.BasicNameValuePair;

@Stateless
@LocalBean
@Path("person/{personID}/{measureType}")
public class HistoryCollectionResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@PersistenceUnit(unitName = "introsde-jpa")
	EntityManager entityManager;

	@PersistenceContext(unitName = "introsde-jpa", type = PersistenceContextType.TRANSACTION)
	private EntityManagerFactory entityManagerFactory;

	@GET
	@Produces({ MediaType.TEXT_XML, MediaType.APPLICATION_JSON,
			MediaType.APPLICATION_XML })
	public Response getHistoryByMeasureType(
			@PathParam("measureType") String type,
			@PathParam("personID") int personId) {
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		System.out.println("History");
		System.out.println("With person ID: " + personId + ", measure type: "
				+ type);

		List<HealthMeasureHistory> his = people.readPersonHisotry(personId,
				type);
		return Response.ok(his).build();
	}

	@GET
	@Path("{mid}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getHistory(@PathParam("personID") int personId,
			@PathParam("measureType") String measureType,
			@PathParam("mid") int mid) {
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		System.out.println("person id: " + personId);
		HealthMeasureHistory p = people.readPersonMeasure(personId,
				measureType, mid);
		if (p == null)
			return Response.status(404).build();

		return Response.ok(p).build();
	}

	/*
	 * @Path("{mid}") public HistoryResource getHistory(@PathParam("mid") int
	 * id) { System.out.println("Creating history resource"); return new
	 * HistoryResource(uriInfo, request, id); }
	 */
	

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN })
	public Response newStatus(@PathParam("personID") int personID,
			@PathParam("measureType") String measureType,
			String postedValue) throws IOException {
		
		
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		System.out.println("Creating new lifeStatus (measure) ");

		LifeStatus ls = new LifeStatus();
		MeasureDefinition def = new MeasureDefinition();
		
		//def.setIdMeasureDef(1);
		def.setName(measureType);
		ls.setMeasureType(def);
		
		
		//int len = p.getHealthProfile().getLifeStatus().size();
		//String oldValue = p.getHealthProfile().getLifeStatus().get(len - 1)
		//		.getValue();
		//int intValue = Integer.parseInt(oldValue) + 1;
		//String newValue = Integer.toString(intValue);
		ls.setValue(postedValue);
		// ls.setDateRegistered("2015-13-03");

		Person updated = people.savePersonMeasure(personID, ls);

		System.out.println("After saving new life status");
		Person updatedPerson = people.readPerson(personID);
		
		return Response.ok(updatedPerson).build();
	}

}
