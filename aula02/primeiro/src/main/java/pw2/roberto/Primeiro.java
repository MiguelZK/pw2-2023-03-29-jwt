package pw2.roberto;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/primeiro")
public class Primeiro {

	@Inject
	@RestClient
	SegundoRemoto remoto;

	@GET
	@Path("/{a}/{b}")
	public int somaPrimeiro(@PathParam("a") int a, @PathParam("b") int b) {

		remoto.somaNaInterface(a, b);

		return a + b;
	}
}
