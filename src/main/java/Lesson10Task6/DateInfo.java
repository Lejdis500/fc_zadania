package Lesson10Task6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class DateInfo {
    LocalDate date= LocalDate.of(1997, 01, 11);
     DateInfo.setWeekDayOfBirth(date.getDayOfWeek());
        DateInfo.setYears(Period.between(date, LocalDate.now()).getYears());
}
    public int years;
    public int weekOfYear;
    public DayOfWeek weekDayOfBirth;



