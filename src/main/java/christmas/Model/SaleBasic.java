package christmas.Model;

import christmas.Util.Rule;
import christmas.Util.Weekdays;

public class SaleBasic {

    final int Start = 1000;

    public int calcSaleForDay(int date) {
        if(!(Rule.MIN_DATE <= date && date <= Rule.MAX_DATE)) {
            throw new IllegalArgumentException(Rule.LOTTO_NUM_RANGE);
        }
        return Start + (date - 1) * 100;
    }

    public int calcWeekdaysSale(int dd, Order order) {
        Weekdays weekdays = Weekdays.getInstance();
        Menu menu = order.getMenu();
        if(weekdays.isWeekday(dd)) {
            if(menu.getCategory() == Category.DESSERT) {
                return (menu.getPrice() - Rule.WEEKDAYS_SALE) * order.getCount();
            } else {
                return (menu.getPrice()) * order.getCount();
            }
        } else {
            if(menu.getCategory() == Category.MAIN){
                return (menu.getPrice() - Rule.WEEKEND_SALE) * order.getCount();
            } else {
                return (menu.getPrice()) * order.getCount();
            }
        }
    }
}
