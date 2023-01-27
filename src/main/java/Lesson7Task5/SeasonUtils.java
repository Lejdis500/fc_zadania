package Lesson7Task5;

import java.time.Month;

public class SeasonUtils {
    public static Season getSeaon(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }
        if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            return Season.WINTER;
        } else if (month == Month.MARCH || month == Month.APRIL || month == Month.MAY) {
            return Season.SUMMER;
        } else if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            return Season.SUMMER;
        } else {
            return Season.AUTUMN;
        }
    }
}