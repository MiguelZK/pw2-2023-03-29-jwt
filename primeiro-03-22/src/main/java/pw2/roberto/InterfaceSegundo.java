package pw2.roberto;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "http://localhost:8082/segundo")
public interface InterfaceSegundo {

    @GET
    @Path("/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    int soma(@PathParam("a") int a, @PathParam("b") int b);
    
}