import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Extractor {
    private String apiKey;
    public Extractor(String apiKey) {
        this.apiKey = apiKey;
    }

    public Response getForeCastForNext16Days() {
        return
                given().
                        spec(Base.createRequestSpecification()).
                        queryParam("postal_code", 2016).queryParam("key", apiKey).
                        when().
                        get("forecast/daily").
                        then().
//                        log().body().
        spec(Base.createResponseSpecification()).
                        extract().response();
    }
}
