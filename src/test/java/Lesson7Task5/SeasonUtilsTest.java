package Lesson7Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.EnumOptions;

import java.time.Month;

import static java.time.Month.*;
import static org.junit.jupiter.api.Assertions.*;

class SeasonUtilsTest {
    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"DECEMBER", "JANUARY", "FEBRUARY"})
    void shouldGetSeasonWinter(Month month) {
        assertEquals(Season.WINTER, SeasonUtils.getSeason(month));
    }

    @Test
    void shouldGetSeasonSpring() {
        assertEquals(Season.SPRING, SeasonUtils.getSeason(Month.MARCH));
        assertEquals(Season.SPRING, SeasonUtils.getSeason(Month.APRIL));
        assertEquals(Season.SPRING, SeasonUtils.getSeason(Month.MAY));
    }

    @Test
    void shouldGetSeasonSummer() {
        assertEquals(Season.SUMMER, SeasonUtils.getSeason(Month.JUNE));
        assertEquals(Season.SUMMER, SeasonUtils.getSeason(Month.JULY));
        assertEquals(Season.SUMMER, SeasonUtils.getSeason(Month.AUGUST));
    }

    @Test
    void shouldGetSeasonAutumn() {
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.SEPTEMBER));
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.OCTOBER));
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.NOVEMBER));
    }

    @Test
    void shouldGetExceptionWhenInputIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            SeasonUtils.getSeason(null);
        });

        Assertions.assertEquals("Month cannot be null", exception.getMessage());
    }
}