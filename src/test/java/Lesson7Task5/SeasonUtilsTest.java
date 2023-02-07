package Lesson7Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class SeasonUtilsTest {
    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"DECEMBER", "JANUARY", "FEBRUARY"})
    void shouldGetSeasonWinter(Month month) {
        assertEquals(Season.WINTER, SeasonUtils.getSeason(month));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"MARCH", "APRIL", "MAY"})
    void shouldGetSeasonSpring(Month month) {
        assertEquals(Season.SPRING, SeasonUtils.getSeason(month));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JUNE", "JULY", "AUGUST"})
    void shouldGetSeasonSummer(Month month) {
        assertEquals(Season.SUMMER, SeasonUtils.getSeason(month));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"SEPTEMBER", "OCTOBER", "NOVEMBER"})
    void shouldGetSeasonAutumn(Month month) {
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(month));
    }

    @Test
    void shouldGetExceptionWhenInputIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            SeasonUtils.getSeason(null);
        });

        Assertions.assertEquals("Month cannot be null", exception.getMessage());
    }
}
