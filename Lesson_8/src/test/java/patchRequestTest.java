import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class patchRequestTest {

    @Test
    public void patchRequestTest_thenStatus200(){
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain").body( "This is expected to be sent back as part of response body.")
                .when().patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .log().body();
    }
}
