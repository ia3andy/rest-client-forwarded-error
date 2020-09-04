package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "http://localhost:8080")
@Path("/b/hello")
public interface ExampleResourceClientB {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String hello();
}