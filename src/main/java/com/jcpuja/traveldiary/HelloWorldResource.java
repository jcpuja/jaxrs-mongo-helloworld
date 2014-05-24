package com.jcpuja.traveldiary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("helloworld")
public class HelloWorldResource {

    @Inject
    protected HelloService helloService;

    @GET
    @Produces("text/plain")
    public String getHello() {
        return helloService.provideClichedMessage();
    }
}
