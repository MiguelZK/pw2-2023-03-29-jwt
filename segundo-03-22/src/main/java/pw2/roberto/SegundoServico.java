package pw2.roberto;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/segundo")
public class SegundoServico {

    @GET
    @Path("/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int soma(@PathParam("a") int a, @PathParam("b") int b) {

        System.out.println("String na classe SegundoServico");
        return a + b;
    }
}
