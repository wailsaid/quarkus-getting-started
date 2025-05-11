package com.saidwail;

import java.util.List;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/list")
public class TodoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Todo> getTodos() {
        var t = new Todo(12L, "null", "still");
        return List.of(t);
    }

}
