package utils;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestParams {
    private static Stream<Arguments> postalCodeData() {
        return Stream.of(
                arguments(2026, "Bondi Beach"),
                arguments(2095, "Manly Beach")
        );
    }
}
