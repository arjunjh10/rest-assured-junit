import config.Configuration;
import config.ConfigurationManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public abstract class Base {
    protected static Configuration configuration;

    @BeforeAll
    public static void beforeAllTests() {
        configuration = ConfigurationManager.getConfiguration();
        baseURI = configuration.baseURI();
        basePath = configuration.basePath();
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Testing has finished");
    }

    public static RequestSpecification createRequestSpecification() {
        return new RequestSpecBuilder().build();
    }

    public static ResponseSpecification createResponseSpecification() {
        return new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).
                build();
    }
}
