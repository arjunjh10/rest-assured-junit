package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(Config.LoadType.MERGE)
@Sources({
        "classpath:test.properties"})
public interface Configuration extends Config {
    @Key("api.forecast.url")
    String basePath();

    @Key("api.base.uri")
    String baseURI();

    @Key("apiKey")
    String apiKey();
}
