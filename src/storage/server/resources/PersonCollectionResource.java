
package storage.server.resources;

import introsde.assignment.soap.AchivedGoal;
import introsde.assignment.soap.People;
import introsde.assignment.soap.PeopleService;



import java.io.IOException;
import java.util.List;

import introsde.assignment.soap.*;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
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

@Stateless
// will work only inside a Java EE application
@LocalBean
// will work only inside a Java EE application
@Path("/person")
public class PersonCollectionResource {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	// will work only inside a Java EE application
	@PersistenceUnit(unitName = "introsde-jpa")
	// where to store data. persistence.xml file in web contetn folder
	EntityManager entityManager;

	// will work only inside a Java EE application
	@PersistenceContext(unitName = "introsde-jpa", type = PersistenceContextType.TRANSACTION)
	private EntityManagerFactory entityManagerFactory;

	// Return the list of people to the user in the browser
	@GET
	@Produces({ MediaType.APPLICATION_JSON,	MediaType.APPLICATION_XML })
	public Response getPersons() {
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		List<Person> pList = people.readPersonList();
		
		System.out.println("storage service - All persons listed, length: " + pList.size());
		for(int i = 0; i < pList.size(); i++){
			System.out.println(pList.get(i).getIdPerson());
		}
		return Response.ok(pList).build();
	}




	
	/*@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Person newPerson(Person person) throws IOException {
		
		System.err.println("in post person");
                
        int len = person.getLifeStatus().size();
        if(len != 0){
        	for(int i = 0; i < len; i++){
        		person.getLifeStatus().get(i).setPerson(person);
        	}
        	
        }else{
        	System.err.println("len is null");
        }
        
        return Person.savePerson(person);
	}
	
*/

	// Defines that the next path parameter after the base url is
	// treated as a parameter and passed to the PersonResources
	// Allows to type http://localhost:599/base_url/1
	// 1 will be treaded as parameter todo and passed to PersonResource
	@Path("{personId}")
	public PersonResource getPerson(@PathParam("personId") int id) {
		return new PersonResource(uriInfo, request, id);
	}
}
