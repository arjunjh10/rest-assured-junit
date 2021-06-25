import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import models.ForecastData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Utilities;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SampleTest extends Base {
    private static Requests requests;
    private static Utilities utilities;

    @ParameterizedTest
    @MethodSource("utils.TestParams#postalCodeData")
    public void testWeatherApi(Integer postalCode, String beachName) throws ParseException {
        requests = new Requests(configuration.apiKey());
        Response response = requests.getForeCastForNext16Days();
        ResponseBody responseBody = response.getBody();
        List<models.ForecastData> forecasts  = response.jsonPath().getList("data", models.ForecastData.class);

        List<String> validDates = forecasts.stream().map(f -> f.getValidDate()).collect(Collectors.toList());
        List<Float> uvForecast = forecasts.stream().map(f -> f.getUv()).collect(Collectors.toList());
        List<Float> temperatureForecast = forecasts.stream().map(f -> f.getTemp()).collect(Collectors.toList());
        List<Float> precipitation = forecasts.stream().map(f -> f.getPrecip()).collect(Collectors.toList());

        responseBody.as(models.Response.class);
        int forecastDataSize = forecasts.size();
        assertEquals(uvForecast.size(), forecastDataSize);
        assertEquals(temperatureForecast.size(), forecastDataSize);
        assertEquals(precipitation.size(), forecastDataSize);


        Map<String, List<String>> dateToDateBreakdowns = utilities.mapDayToDateBreakDowns(validDates);
        System.out.println("Total number of Thursdays for Beach Named:" + beachName +  " with postal code: " + postalCode + " over the next 16 days of weather forecast are: " + dateToDateBreakdowns.get("Thursday").size());
        System.out.println("Total number of Fridays for Beach Named:" + beachName + " with postal code: " + postalCode + " over the next 16 days of weather forecast are: " + dateToDateBreakdowns.get("Friday").size());

        List<ForecastData> forecastForMondays = forecasts.stream()
                .filter(f -> dateToDateBreakdowns.get("Monday").stream().collect(Collectors.toSet()).contains(f.getValidDate()))
                .collect(Collectors.toList());
        List<ForecastData> forecastForFridays = forecasts.stream()
                .filter(f -> dateToDateBreakdowns.get("Friday").stream().collect(Collectors.toSet()).contains(f.getValidDate()))
                .collect(Collectors.toList());

        for(ForecastData forecastMonday: forecastForMondays) {
            assertTrue(forecastMonday.getUv() < 11);
            assertTrue(forecastMonday.getTemp() < 20);
        };

        for(ForecastData forecastFriday: forecastForFridays) {
            assertTrue(forecastFriday.getUv() < 11);
            assertTrue(forecastFriday.getTemp() < 20);
        };

    }
}