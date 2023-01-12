package Lesson4Task7;

import java.time.DayOfWeek;

public class NameDayOfWeek {
    public static String getDayOfWeekName (DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return "Poniedzialek" ;
            case TUESDAY:
                return "Wtorek" ;
            case WEDNESDAY:
                return "Sroda";
            case THURSDAY:
                return "Czwartek";
            case FRIDAY:
                return "Piatek";
            case SATURDAY:
                return "Sobota";
            case SUNDAY:
                return "Niedziela";
            default:
                return "Nieznany dzien tygodnia";


        }
    }
}
