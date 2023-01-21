package Lesson7Task5;

import java.time.Month;

class SeasonTest {
    @Test
    void shouldGetSeason_Winter() {
        assertEquals(Season.WINTER, SeasonUtils.getSeaon(Month.DECEMBER));
        assertEquals(Season.WINTER, SeasonUtils.getSeaon(Month.JANUARY));
        assertEquals(Season.WINTER, SeasonUtils.getSeaon(Month.FEBRUARY));
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
    void shouldGetSeason_nullInput() {
        assertThrows(IllegalArgumentException.clas, () - {
    SeasonUtils.getSeason(null);
    });
    }}