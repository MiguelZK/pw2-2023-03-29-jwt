package pw2.roberto;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/conversor")
// @Path("/conversor/{valor}")
// @ApplicationPath("/conversor") // ñ funciona

public class Conversor {

	/*
	 * Nós para quilometro por hora (1=1.852) – esse método deve consumir dados
	 * por GET e produzir dados em JSON.
	 */
	@Path("/nos/{valor}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Conversao nosParaKm(@PathParam("valor") double valor) {

		var conversao = new Conversao();

		conversao.setValorEmNos(valor);
		conversao.setValorEmKm(valor * 1.852);

		return conversao;
	}

	/*
	 * Quilômetro por hora para milhas por hora (1=0.621371) – esse método deve
	 * consumir por POST e produzir dados em texto.
	 */
	/*
	 * Teste
	 * quarkus-resteasy-reactive-jackson
	 */
	@Path("/km")
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String kmParaMilhas(@FormParam("valor") double valor) {

		double resultado = valor * 0.621371;

		return String.valueOf(Math.round(resultado));
	}

}
