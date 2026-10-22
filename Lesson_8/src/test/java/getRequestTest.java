import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class getRequestTest {
    @Test
    public void getRequestTest_thenStatus200(){
        given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
