package storage.server.resources;

import introsde.assignment.soap.AchivedGoal;
import introsde.assignment.soap.Goal;
import introsde.assignment.soap.People;
import introsde.assignment.soap.PeopleService;
import introsde.assignment.soap.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
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

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

@Stateless
@LocalBean
@Path("/goals")
public class GoalResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getGoals() {
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		List<Goal> pList = people.readGoalList();

		return Response.ok(pList).build();
	}

	@GET
	@Path("/person/{personId}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getPersonsGoals(@PathParam("personId") int id) {
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();

		List<AchivedGoal> list = people.readAchivedGoalList(id);

		return Response.ok(list).build();

	}

	@POST
	@Path("person/{personId}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response saveAchivedGoal(@PathParam("personId") int id, 
			AchivedGoal newAchivement) throws IOException {
		System.err.println("in post goal");
		
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		//Person person = people.readPerson(id);

		Person updatedPerson = people.saveAchivedGoal(id, newAchivement);
        
        return Response.ok(updatedPerson).build();
	}

	@GET
	@Path("/pic")
	@Produces({ MediaType.TEXT_PLAIN })
	public Response getPicture() throws ClientProtocolException, IOException {

		String externalService = "http://10.218.223.84:5701/sdelab/pic";

		String jsonResponse;

		DefaultHttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(externalService);
		HttpResponse response = client.execute(request);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response
				.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		// JSONObject o = new JSONObject(result.toString());

		if (response.getStatusLine().getStatusCode() == 200) {
			System.out.println("Pic url - standard res: " + result.toString());
			return Response.ok(result.toString()).build();
		} else {
			return Response.status(404).build();
		}

	}

}
