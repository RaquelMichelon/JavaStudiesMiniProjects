package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

class MainTest {
  private Main application;
  
  @BeforeEach
  void before() {
    application = new Main();
    application.start();
  }
  
  @AfterEach
  void teardown() {
    application.stop();
  }
  
  
  @Test
  @Displayname("Test basic get")
  void testHelloWorld() {
    when()
      .get("/")
      .then()
      .statusCode(200)
      .body(equalTo("Hello World from javalin"));
  }
  
  @Test
  @DisplayName("Test get json value")
  void testGetJson() {
    when()
      .get("/json")
      .then()
      .statusCode(200)
      .contentType("application/json")
      .body("text", equalTo("Hello World"));
  }
  
  @Test
  @DisplayName("Test post json value")
  void testPostJson() {
    given()
      .body("{\"text\": \"Hello from test\"\n}")
      .contentType("application/json")
      .when()
      .post("/json")
      .then()
      .statusCode(200)
      .contentType("text/plain")
      .body(equalTo("Got post of hello from test"));
  }
  
  
}
