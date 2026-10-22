import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class postRawText {

    @Test
    public void postRawText_thenStatus200(){
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json").body( "This is expected to be sent back as part of response body.")
                .when().post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .log().body();


    }

}
