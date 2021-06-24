import config.Configuration;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public abstract class Base {
    protected static Configuration configuration;

//    @Before
//    public void beforeAllTests() {
//        configuration = ConfigurationManager.getConfiguration();
//        baseURI = configuration.baseURI();
//        basePath = configuration.basePath();
//        new RequestSpecBuilder().
////                setBaseUri("https://api.weatherbit.io/v2.0").
//        build();
//    }

    public static RequestSpecification createRequestSpecification() {
//        configuration = ConfigurationManager.getConfiguration();
//        baseURI = configuration.baseURI();
        return new RequestSpecBuilder().
                setBaseUri("https://api.weatherbit.io/v2.0").
                build();
    }

    public static ResponseSpecification createResponseSpecification() {
        return new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).
                build();
    }
}
