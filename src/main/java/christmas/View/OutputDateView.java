package christmas.View;

import christmas.Model.Date;
import christmas.Util.Rule;

public class OutputDateView {

    public static void printDate(Date date) {
    System.out.println("12월 " + date.getDate() + Rule.DATE_MESSAGE);
    }
}
