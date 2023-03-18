package pw2.roberto;

//#region
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//#endregion
@Path("/segundo")
public class Segundo {
	@GET
	@Path("/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public int somaSegundo(@PathParam("a") int a, @PathParam("b") int b) {
		return a + b;
	}
}
