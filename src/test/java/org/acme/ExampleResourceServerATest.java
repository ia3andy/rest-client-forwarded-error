package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

@QuarkusTest
public class ExampleResourceServerATest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/a/hello")
          .then()
            .log().all()
            .body(not(containsString("Supersonic Subatomic Java")));
    }

}