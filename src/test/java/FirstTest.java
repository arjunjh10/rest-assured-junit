import utils.Utilities;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import models.ForecastData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RunWith(DataProviderRunner.class)
public class FirstTest {
    private static Extractor extractor;
    private static Utilities utilities;

    @DataProvider
    public static Object[][] postalCodes() {
        return new Object[][] {
                { 2026 }
        };
    }

    @Test
    @UseDataProvider("postalCodes")
    public void requestZipCodesFromCollection_checkPlaceNameInResponseBody_expectSpecifiedPlaceName(Integer postalCode) throws ParseException, JsonProcessingException {
        extractor = new Extractor("8fb67e70af094ead83109d38d6d9460f");
        Response response = extractor.getForeCastForNext16Days();
        ResponseBody responseBody = response.getBody();
        List<models.ForecastData> forecasts  = response.jsonPath().getList("data", models.ForecastData.class);

        List<String> validDates = forecasts.stream().map(f -> f.getValidDate()).collect(Collectors.toList());
        List<Float> uvForecast = forecasts.stream().map(f -> f.getUv()).collect(Collectors.toList());
        List<Float> temperatureForecast = forecasts.stream().map(f -> f.getTemp()).collect(Collectors.toList());
        List<Float> precipitation = forecasts.stream().map(f -> f.getPrecip()).collect(Collectors.toList());

        responseBody.as(models.Response.class);
        int forecastDataSize = forecasts.size();
        Assert.assertEquals(uvForecast.size(), forecastDataSize);
        Assert.assertEquals(temperatureForecast.size(), forecastDataSize);
        Assert.assertEquals(precipitation.size(), forecastDataSize);


        Map<String, List<String>> dateToDateBreakdowns = utilities.mapDayToDateBreakDowns(validDates);
        System.out.println("Total number of Thursdays over the next 16 days of weather forecast are: " + dateToDateBreakdowns.get("Thursday").size());
        System.out.println("Total number of Fridays over the next 16 days of weather forecast are: " + dateToDateBreakdowns.get("Friday").size());

        List<ForecastData> forecastForMondays = forecasts.stream()
                .filter(f -> dateToDateBreakdowns.get("Monday").stream().collect(Collectors.toSet()).contains(f.getValidDate()))
                .collect(Collectors.toList());
        List<ForecastData> forecastForFridays = forecasts.stream()
                .filter(f -> dateToDateBreakdowns.get("Friday").stream().collect(Collectors.toSet()).contains(f.getValidDate()))
                .collect(Collectors.toList());

        for(ForecastData forecastMonday: forecastForMondays) {
            Assert.assertTrue(forecastMonday.getUv() < 11);
            Assert.assertTrue(forecastMonday.getTemp() < 20);
        };

        for(ForecastData forecastFriday: forecastForFridays) {
            Assert.assertTrue(forecastFriday.getUv() < 11);
            Assert.assertTrue(forecastFriday.getTemp() < 20);
        };

    }
}