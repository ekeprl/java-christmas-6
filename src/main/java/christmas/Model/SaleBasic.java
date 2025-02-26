package christmas.Model;

import christmas.Util.Rule;

public class SaleBasic {

    static final int Start = 1000;

    public static int calcSaleForDay(int day) {
        if (!(Rule.MIN_DATE <= day && day <= Rule.MAX_DATE)) {
            throw new IllegalArgumentException(Rule.DATE_RANGE);
        }
        return Start + (day - 1) * 100;
    }

   /* public boolean calcStar(int date) {
        Weekdays weekdays = Weekdays.getInstance();
        if(weekdays.isWeekday() == )
    }*/

    /**
     * 평일 할인 계산
     */
    public static int calcWeekdaysSale(Order order) {
        Menu menu = order.getMenu();
        if (menu.getCategory() == Category.DESSERT) {
            return (Rule.WEEKDAYS_SALE) * order.getCount();
        }
        return 0;
    }

    /**
     * 주말 할인 계산
     */
    public static int calcWeekendSale(Order order) {
        Menu menu = order.getMenu();
        if (menu.getCategory() == Category.MAIN) {
            return (Rule.WEEKEND_SALE) * order.getCount();
        }
        return 0;
    }
}
