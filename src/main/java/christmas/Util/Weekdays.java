package christmas.Util;

import christmas.View.InputDateView;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Weekdays {
    private final int YEAR = 2023;
    private final Month MONTH = Month.DECEMBER;

    public boolean isWeekday(int day) {
        LocalDate date = LocalDate.of(YEAR, MONTH, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }

}