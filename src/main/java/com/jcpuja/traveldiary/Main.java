package com.jcpuja.traveldiary;

import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
        ResourceConfig config = new MyResourceConfig();
        HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);

        System.out.println("Server started at " + server.getAddress());
    }
}
