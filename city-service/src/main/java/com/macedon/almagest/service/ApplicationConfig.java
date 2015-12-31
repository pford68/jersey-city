package com.macedon.almagest.service;

import com.macedon.almagest.service.dao.TodoDao;
import com.macedon.almagest.service.dao.impl.TodoDaoImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.jackson1.Jackson1Feature;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * Created by philip on 12/21/15.
 */
public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {
        // Setting on JSON serialization
        register(Jackson1Feature.class);

        // Setting up dependency injection on an interface-by-interface basis:
        // mapping an impl to an interface.
        register(new AbstractBinder(){
            @Override
            public void configure() {
                bind(TodoDaoImpl.class).to(TodoDao.class);
            }
        });
    }
}

