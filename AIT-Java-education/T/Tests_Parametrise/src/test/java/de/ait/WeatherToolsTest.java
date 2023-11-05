package de.ait;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class WeatherToolsTest {
    @Nested
    @DisplayName("getWindTests")
    class WeatherTools {
        @ParameterizedTest
        @CsvSource({

                "0.1, true, 'Calm 0.1 km'",
                "0.9, false, 'Calm 0.9 km'",
                "5, true,'Gusty Light Air with speed of 5.0 km'",
                "5, false,'Light Air with speed of 5.0 km'",
                "11, true,'Gusty Light Breeze with speed of 11.0 km'",
                "11, false,'Light Breeze with speed of 11.0 km'",
                "19, true,'Gusty Gentle Breeze with speed of 19.0 km'",
                "19, false,'Gentle Breeze with speed of 19.0 km'",
                "28, true,'Gusty Moderate Breeze with speed of 28.0 km'",
                "28, false,'Moderate Breeze speed of 28.0 km'",
                "38, true,'Gusty Fresh Breeze with speed of 38.0 km'",
                "38, false,'Fresh Breeze with speed of 38.0 km'"})
        public void getRectangleArea_test1(double a, boolean b, String message) {
            assertEquals(
                    message,
                    de.ait.WeatherTools.getWindDescription(a, b)
            );
        }
    }
}