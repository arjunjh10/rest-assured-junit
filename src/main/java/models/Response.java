package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private List<ForecastData> data;
    private String cityName;
    private Float lon;
    private Float lat;
    private String countryCode;
    private String stateCode;

    public List<ForecastData> getData() {
        return data;
    }

    public void setData(List<ForecastData> data) {
        this.data = data;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("status_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("status_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
}
