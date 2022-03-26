package com.components.shoppingcartserver;

import com.components.shoppingcartserver.config.DatabaseConnection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    DatabaseConnection db = new DatabaseConnection();
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}