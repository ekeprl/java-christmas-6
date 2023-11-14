package christmas.Util;

import christmas.View.InputDateView;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Weekdays {
    private final int YEAR = 2023;
    private final Month MONTH = Month.DECEMBER;

    public boolean isWeekday(int day) {
        String dayStr = String.format("%02d", day);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        LocalDate date = LocalDate.parse(YEAR + "-" + MONTH.getValue() + "-" + dayStr, formatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }
}

