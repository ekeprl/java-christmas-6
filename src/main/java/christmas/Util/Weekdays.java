package christmas.Util;

import christmas.View.InputDateView;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Weekdays {
    private final int YEAR = 2023;
    private final Month MONTH = Month.DECEMBER;

    public static Weekdays instance;
    public static Weekdays getInstance(){
        if(instance == null){
            instance = new Weekdays();
        }

        return instance;
    }

    public boolean isWeekday(int day) {
        String dayStr = String.format("%02d", day);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        LocalDate date = LocalDate.parse(YEAR + "-" + MONTH + "-" + dayStr, formatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.FRIDAY || dayOfWeek == DayOfWeek.SATURDAY) {
            return false;
        } else {
            return true;
        }
    }
}

