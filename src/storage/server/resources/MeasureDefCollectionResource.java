package storage.server.resources;

import introsde.assignment.soap.People;
import introsde.assignment.soap.PeopleService;
import introsde.assignment.soap.*;

import java.io.IOException;
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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Stateless // will work only inside a Java EE application
@LocalBean // will work only inside a Java EE application
@Path("/measureTypes")
public class MeasureDefCollectionResource {
    // Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;

    // will work only inside a Java EE application
    @PersistenceUnit(unitName="introsde-jpa") // where to store data. persistence.xml file in web contetn folder
    EntityManager entityManager;

    // will work only inside a Java EE application
    @PersistenceContext(unitName = "introsde-jpa",type=PersistenceContextType.TRANSACTION)
    private EntityManagerFactory entityManagerFactory;
    
    
    // Return the list of measure types to the user in the browser
    @GET
    @Produces({MediaType.TEXT_XML,  MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
    public Response getMeasureDefBrowser() {
    	PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		CustomMeasureDefinition def = people.readMeasureTypes();
		System.out.println("Measure Types" + def.getMeasureType());

		if (def == null)
			return Response.status(404).build();
		
		return Response.ok(def.getMeasureType()).build();
    }
    


    // Defines that the next path parameter after the base url is
    // treated as a parameter and passed to the MeasureDefResource
    // Allows to type http://localhost:599/base_url/1
    // 1 will be treaded as parameter todo and passed to MeasureDefResource
    @Path("{idMeasureDef}")
    public MeasureDefResource getMeasureDefinition(@PathParam("idMeasureDef") int id) {
        return new MeasureDefResource(uriInfo, request, id);
    }
    
    
}
