package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastData {
    private Integer moonriseTs;
    private String windCdir;
    private Integer rh;
    private Float pres;
    private Float highTemp;
    private Integer sunsetTs;
    private Float ozone;
    private Float moonPhase;
    private Float windGustGpd;
    private Integer snowDepth;
    private Integer clouds;
    private Integer ts;
    private Integer sunriseTs;
    private Integer appMinTemp;
    private Float windSpd;
    private Integer pop;
    private String windCdirFull;
    private Float slp;
    private Float moonPhaseLunation;
    private String validDate;
    private Float appMaxTemp;
    private Float vis;
    private Float dewpt;
    private Integer snow;
    private Float uv;
    private Weather weather;
    private Integer windDir;
    private Integer maxDhi;
    private Integer cloudsHi;
    private Float precip;
    private Float lowTemp;
    private Float maxTemp;
    private Integer moonsetTs;
    private String datetime;
    private Float temp;
    private Float minTemp;
    private Integer cloudsMid;

    @JsonProperty("moonrise_ts")
    public Integer getMoonriseTs() {
        return moonriseTs;
    }

    @JsonProperty("moonrise_ts")
    public void setMoonriseTs(Integer moonriseTs) {
        this.moonriseTs = moonriseTs;
    }

    @JsonProperty("wind_cdir")
    public String getWindCdir() {
        return windCdir;
    }

    @JsonProperty("wind_cdir")
    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    public Integer getRh() {
        return rh;
    }

    public void setRh(Integer rh) {
        this.rh = rh;
    }

    public Float getPres() {
        return pres;
    }

    public void setPres(Float pres) {
        this.pres = pres;
    }

    @JsonProperty("high_temp")
    public Float getHighTemp() {
        return highTemp;
    }

    @JsonProperty("high_temp")
    public void setHighTemp(Float highTemp) {
        this.highTemp = highTemp;
    }

    @JsonProperty("sunset_ts")
    public Integer getSunsetTs() {
        return sunsetTs;
    }

    @JsonProperty("sunset_ts")
    public void setSunsetTs(Integer sunsetTs) {
        this.sunsetTs = sunsetTs;
    }

    public Float getOzone() {
        return ozone;
    }

    public void setOzone(Float ozone) {
        this.ozone = ozone;
    }

    @JsonProperty("moon_phase")
    public Float getMoonPhase() {
        return moonPhase;
    }

    @JsonProperty("moon_phase")
    public void setMoonPhase(Float moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonProperty("wind_gust_spd")
    public Float getWindGustGpd() {
        return windGustGpd;
    }

    @JsonProperty("wind_gust_spd")
    public void setWindGustGpd(Float windGustGpd) {
        this.windGustGpd = windGustGpd;
    }

    @JsonProperty("snow_depth")
    public Integer getSnowDepth() {
        return snowDepth;
    }

    @JsonProperty("snow_depth")
    public void setSnowDepth(Integer snowDepth) {
        this.snowDepth = snowDepth;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
    }

    @JsonProperty("sunrise_ts")
    public Integer getSunriseTs() {
        return sunriseTs;
    }

    @JsonProperty("sunrise_ts")
    public void setSunriseTs(Integer sunriseTs) {
        this.sunriseTs = sunriseTs;
    }

    @JsonProperty("app_min_temp")
    public Integer getAppMinTemp() {
        return appMinTemp;
    }

    @JsonProperty("app_min_temp")
    public void setAppMinTemp(Integer appMinTemp) {
        this.appMinTemp = appMinTemp;
    }

    @JsonProperty("wind_spd")
    public Float getWindSpd() {
        return windSpd;
    }

    @JsonProperty("wind_spd")
    public void setWindSpd(Float windSpd) {
        this.windSpd = windSpd;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    @JsonProperty("wind_cdir_full")
    public String getWindCdirFull() {
        return windCdirFull;
    }

    @JsonProperty("wind_cdir_full")
    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    public Float getSlp() {
        return slp;
    }

    public void setSlp(Float slp) {
        this.slp = slp;
    }

    @JsonProperty("moon_phase_lunation")
    public Float getMoonPhaseLunation() {
        return moonPhaseLunation;
    }

    @JsonProperty("moon_phase_lunation")
    public void setMoonPhaseLunation(Float moonPhaseLunation) {
        this.moonPhaseLunation = moonPhaseLunation;
    }

    @JsonProperty("valid_date")
    public String getValidDate() {
        return validDate;
    }

    @JsonProperty("valid_date")
    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    @JsonProperty("app_max_temp")
    public Float getAppMaxTemp() {
        return appMaxTemp;
    }

    @JsonProperty("app_max_temp")
    public void setAppMaxTemp(Float appMaxTemp) {
        this.appMaxTemp = appMaxTemp;
    }

    public Float getVis() {
        return vis;
    }

    public void setVis(Float vis) {
        this.vis = vis;
    }

    public Float getDewpt() {
        return dewpt;
    }

    public void setDewpt(Float dewpt) {
        this.dewpt = dewpt;
    }

    public Integer getSnow() {
        return snow;
    }

    public void setSnow(Integer snow) {
        this.snow = snow;
    }

    public Float getUv() {
        return uv;
    }

    public void setUv(Float uv) {
        this.uv = uv;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @JsonProperty("wind_dir")
    public Integer getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(Integer windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("max_dhi")
    public Integer getMaxDhi() {
        return maxDhi;
    }

    @JsonProperty("max_dhi")
    public void setMaxDhi(Integer maxDhi) {
        this.maxDhi = maxDhi;
    }

    @JsonProperty("clouds_hi")
    public Integer getCloudsHi() {
        return cloudsHi;
    }

    @JsonProperty("clouds_hi")
    public void setCloudsHi(Integer cloudsHi) {
        this.cloudsHi = cloudsHi;
    }

    public Float getPrecip() {
        return precip;
    }

    public void setPrecip(Float precip) {
        this.precip = precip;
    }

    @JsonProperty("low_temp")
    public Float getLowTemp() {
        return lowTemp;
    }

    @JsonProperty("low_temp")
    public void setLowTemp(Float lowTemp) {
        this.lowTemp = lowTemp;
    }

    @JsonProperty("max_temp")
    public Float getMaxTemp() {
        return maxTemp;
    }

    @JsonProperty("max_temp")
    public void setMaxTemp(Float maxTemp) {
        this.maxTemp = maxTemp;
    }

    @JsonProperty("moonset_ts")
    public Integer getMoonsetTs() {
        return moonsetTs;
    }

    @JsonProperty("moonset_ts")
    public void setMoonsetTs(Integer moonsetTs) {
        this.moonsetTs = moonsetTs;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    @JsonProperty("min_temp")
    public Float getMinTemp() {
        return minTemp;
    }

    @JsonProperty("min_temp")
    public void setMinTemp(Float minTemp) {
        this.minTemp = minTemp;
    }

    @JsonProperty("clouds_mid")
    public Integer getCloudsMid() {
        return cloudsMid;
    }

    @JsonProperty("clouds_mid")
    public void setCloudsMid(Integer cloudsMid) {
        this.cloudsMid = cloudsMid;
    }
}
