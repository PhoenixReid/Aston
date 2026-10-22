import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class postFormData {

    @Test
    public void postFormData_thenStatus200(){
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/x-www-form-urlencoded")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when().post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .log().body();

    }
}
