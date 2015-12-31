package com.macedon.almagest.service.rest;

import com.macedon.almagest.service.dao.TodoDao;
import com.macedon.almagest.service.model.Todo;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todo")
public class TodoResource {

    @Inject
    TodoDao dao;

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Todo test() {
        return dao.getOne();
    }

}
