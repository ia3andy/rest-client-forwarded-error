package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/b/hello")
public class ExampleResourceServerB {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello() {
        return Response.seeOther(URI.create("https://quarkus.io")).build();
    }
}