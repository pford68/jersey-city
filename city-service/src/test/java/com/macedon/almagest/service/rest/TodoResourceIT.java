package com.macedon.almagest.service.rest;

import com.jayway.restassured.RestAssured;

import static com.jayway.restassured.RestAssured.expect;

import com.jayway.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class TodoResourceIT {

    @Before
    public void setUp() {
        RestAssured.baseURI = "http://localhost:8080/almagest-service";
        RestAssured.basePath = "/rest";
    }

    @Test
    public void getOne() {
        expect().statusCode(200)
                .contentType(ContentType.JSON)
                .when()
                .get("/todo");
    }
}
