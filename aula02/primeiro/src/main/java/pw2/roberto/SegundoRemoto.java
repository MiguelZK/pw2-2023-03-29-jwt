package pw2.roberto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8082/segundo")

public interface SegundoRemoto {

	@GET
	@Path("/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public int somaNaInterface(@PathParam("a") int a, @PathParam("b") int b);

}
