package com.macedon.almagest.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by philip on 12/21/15.
 */

@Path("/hello")
public class HelloWorldResource {

    @GET
    public String sayHello() {
        return "hello";
    }


}
