package pw2.roberto;

import java.util.Arrays;
import java.util.HashSet;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;
import jakarta.annotation.security.PermitAll;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/identity")
public class Identity {

    @GET
    @Path("/jwt")
    @PermitAll
    @Produces(MediaType.TEXT_PLAIN)
    public String generate() {
        return Jwt.issuer("GeradoPeloProjetoIdentity")
                .upn("rodrigo@rpmhub.dev")
                .groups(new HashSet<>(Arrays.asList("User", "Admin")))
                .claim(Claims.full_name, "Rodrigo Prestes Machado")
                .sign();
    }

}
