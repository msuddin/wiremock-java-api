package com.thetestroom;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {

    @LocalServerPort
    private int port;

    @Before
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    public void shouldGetValidResponseFromWiremock() {
        given()
            .get("/valid")
        .then()
            .body("message", is("valid message"));
    }

    @Test
    public void shouldGetDelayResponseFromWiremock() {
        given()
            .get("/delay")
        .then()
            .body("message", is("delay message"));
    }

    @Test
    public void shouldGetChunkResponseFromWiremock() {
        given()
            .get("/chunk")
        .then()
            .body("message", is("chunk message"));
    }

    @Test
    public void shouldGetEmptyResponseFromWiremock() {
        given()
            .get("/empty")
        .then()
            .statusCode(500)
            .header("connection", "close");
    }

    @Test
    public void shouldGetMalformedResponseFromWiremock() {
        given()
            .get("/malformed")
        .then()
            .statusCode(500)
            .header("connection", "close");
    }

    @Test
    public void shouldGetRandomClosedConnectionResponseFromWiremock() {
        given()
            .get("/random")
        .then()
            .statusCode(500)
            .header("connection", "close");
    }

    @Test
    public void shouldGetClosedConnectionResponseFromWiremock() {
        given()
            .get("/close")
        .then()
            .statusCode(500)
            .header("connection", "close");
    }
}
