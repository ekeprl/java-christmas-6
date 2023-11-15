package christmas.Controller;

import christmas.Model.*;
import christmas.Model.Date;
import christmas.Util.Rule;
import christmas.Util.Weekdays;
import christmas.View.InputDateView;
import christmas.View.InputMenuView;

import java.util.*;

import static christmas.View.OuputSaleCountView.printSaleResult;
import static christmas.View.OuputServiceView.printService;
import static christmas.View.OutputDateView.printDate;
import static christmas.View.OutputMenuView.printMenu;
import static christmas.View.OutputSalBefore.printSale;


public class ChristmasController {

    public void run() {
        Date date = getDate();

        int day = date.date;

        Weekdays weekdays = Weekdays.getInstance();
        boolean isWeekday = weekdays.isWeekday(day);

        List<Order> menu = getMenu();
        printDate(date);
        printMenu(menu);

        int sale = Sale.calcTotalSale(menu);

        printSale(sale);
        printService(sale);

        int Dday = SaleBasic.calcSaleForDay(day);

        int weekSale = 0;
        for (Order order : menu) {
            if (!isWeekday) {
                weekSale += SaleBasic.calcWeekendSale(order);
            } else {
                weekSale += SaleBasic.calcWeekdaysSale(order);
            }
        }

        boolean isSpecialDay = false;
        int[] specialDays = {3, 10, 17, 24, 25, 31};
        if (Arrays.stream(specialDays).filter(idx -> idx == day).toArray().length > 0) {
            isSpecialDay = true;
        }
        ;
        int sum = 0;
        printSaleResult(Dday, weekSale, isWeekday, isSpecialDay, sale);


    }

    private Date getDate() {
        InputDateView inputDateView = new InputDateView();
        int date = inputDateView.getValue();
        return new Date(date);
    }


    private List<Order> getMenu() {
        InputMenuView inputMenuView = new InputMenuView();
        List<String> inputValue = inputMenuView.getValue();
        Set<String> uniqueMenuNames = new HashSet<>();
        ArrayList<Order> menuList = new ArrayList<>();
        int totalSum = 0;
        for (String menuData : inputValue) {
            String[] menuInfo = menuData.split("-");
            String menuName = menuInfo[0].trim();
            int quantity = Integer.parseInt(menuInfo[1].trim());
            if (!uniqueMenuNames.add(menuName)) {
                throw new IllegalArgumentException(Rule.DUPLICATEMENU_ERROR);
            }
            Menu menu = Menu.getMenu(menuName);
            Order order = new Order(menu, quantity);
            menuList.add(order);
            totalSum += quantity;
            if (totalSum > 20) {
                throw new IllegalArgumentException(Rule.OVER20_ERROR);
            }
        }
        return menuList;
    }


}
