package com.vitalia.khokhlova.RESTservices;


import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/hello")
public class Hello {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Ca marche!";
    }

    @GET
    @Path("/{s}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getHello(@PathParam("s") String s) {
    	String output = "Jersey say : " + s;
        return Response.status(200).entity(output).build();
    }
   
}