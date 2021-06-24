package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:test:properties"})
public interface Configuration extends Config {
    @Key("api.forecast.url")
    String basePath();

    @Key("api.base.uri")
    String baseURI();
}
