package Lesson7Task5;

import org.junit.jupiter.api.Test;

import java.time.Month;

import static java.time.Month.*;
import static org.junit.jupiter.api.Assertions.*;

class SeasonUtilsTest {
    @Test
    void shouldGetSeasonWinter() {
        assertEquals(Season.WINTER, SeasonUtils.getSeason(DECEMBER));
        assertEquals(Season.WINTER, SeasonUtils.getSeason(JANUARY));
        assertEquals(Season.WINTER, SeasonUtils.getSeason(FEBRUARY));
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
    void shouldGetSeason_Autumn() {
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.SEPTEMBER));
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.OCTOBER));
        assertEquals(Season.AUTUMN, SeasonUtils.getSeason(Month.NOVEMBER));
    }

    @Test
    void shouldGetSeasonNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            SeasonUtils.getSeason(null);
        });
    }
}