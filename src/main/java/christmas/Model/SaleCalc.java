package christmas.Model;

import christmas.Util.Rule;

public class SaleCalc {

    final int Start = 100;

    public int calcSaleForDay(int date) {
        if(!(Rule.MIN_DATE <= date && date <= Rule.MAX_DATE)) {
            throw new IllegalArgumentException(Rule.LOTTO_NUM_RANGE);
        }
        return Start + (date - 1) * 100;
    }

    public int calcWeekdaysSale(int date, int Weekdaysale) {
        if()
    }

}
