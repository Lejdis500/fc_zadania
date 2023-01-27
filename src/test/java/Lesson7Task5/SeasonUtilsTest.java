package Lesson7Task5;

import org.junit.jupiter.api.Test;

import java.time.Month;

import static java.time.Month.*;
import static org.junit.jupiter.api.Assertions.*;

class SeasonUtilsTest {
    @Test
    void shouldGetSeason_Winter() {
        assertEquals(Season.WINTER, SeasonUtils.getSeaon(DECEMBER));
        assertEquals(Season.WINTER, SeasonUtils.getSeaon(JANUARY));
        assertEquals(Season.WINTER, SeasonUtils.getSeaon(FEBRUARY));
    }

    @Test
    void shouldGetSeason_Spring() {
        assertEquals(Season.SPRING, SeasonUtils.getSeaon(Month.MARCH));
        assertEquals(Season.SPRING, SeasonUtils.getSeaon(Month.APRIL));
        assertEquals(Season.SPRING, SeasonUtils.getSeaon(Month.MAY));
    }

    @Test
    void shouldGetSeason_Summer() {
        assertEquals(Season.SUMMER, SeasonUtils.getSeaon(Month.JUNE));
        assertEquals(Season.SUMMER, SeasonUtils.getSeaon(Month.JULY));
        assertEquals(Season.SUMMER, SeasonUtils.getSeaon(Month.AUGUST));
    }

    @Test
    void shouldGetSeason_Autumn() {
        assertEquals(Season.AUTUMN, SeasonUtils.getSeaon(Month.SEPTEMBER));
        assertEquals(Season.AUTUMN, SeasonUtils.getSeaon(Month.OCTOBER));
        assertEquals(Season.AUTUMN, SeasonUtils.getSeaon(Month.NOVEMBER));
    }

    @Test
    void shouldGetSeasonNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            SeasonUtils.getSeaon(null);
        });
    }
}