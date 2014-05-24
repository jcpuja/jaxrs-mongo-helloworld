package com.jcpuja.traveldiary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("helloworld")
public class HelloWorldResource {

    @Inject
    protected HelloService helloService;

    @GET
    @Produces("text/plain")
    public Response getHello() {
        String message = helloService.provideClichedMessage();
        return Response.ok(message).build();
    }
}
