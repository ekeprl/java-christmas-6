package christmas.Controller;

import christmas.Model.*;
import christmas.Util.Rule;
import christmas.Util.Weekdays;
import christmas.View.InputDateView;
import christmas.View.InputMenuView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static christmas.View.OuputSaleCountView.printDday;
import static christmas.View.OuputSaleCountView.printSaleResult;
import static christmas.View.OutputDateView.printDate;
import static christmas.View.OutputMenuView.printMenu;
import static christmas.View.OutputSalBefore.printSale;
import static christmas.View.OuputServiceView.printService;



public class ChristmasController {

    public void run() {


        Date date = getDate();
        printDate(date);

        int day = date.date;

        Weekdays weekdays = Weekdays.getInstance();
        boolean isWeekday = weekdays.isWeekday(day);

        List<Order> menu = getMenu();
        printMenu(menu);


        int sale = Sale.calcTotalSale(menu);
        printSale(sale);
        printService(sale);

        int Dday = SaleBasic.calcSaleForDay(day);

        int weekSale = 0;
        for (Order order : menu) {
            if (!isWeekday) {
                weekSale += SaleBasic.calcWeekendSale(order) ;
            } else {
                weekSale += SaleBasic.calcWeekdaysSale(order) ;
            }
        }

        boolean isSpecialDay = false;
        int[] specialDays = {3,10,17,24,25,31};
        if(Arrays.stream(specialDays).filter(idx -> idx == day).toArray().length > 0){
            isSpecialDay = true;
        };
        printSaleResult(Dday ,weekSale,isWeekday,isSpecialDay, sale);


    }

    private Date getDate() {
        InputDateView inputDateView = new InputDateView();
        int date = inputDateView.getValue();
        return new Date(date);
    }


    private List<Order> getMenu() {
        InputMenuView inputMenuView = new InputMenuView();
        List<String> inputValue = inputMenuView.getValue();
        ArrayList<Order> menuList = new ArrayList();
        for (String menuData : inputValue) {
            Menu menu = Menu.getMenu(menuData.split("-")[0]);
            Order order = new Order(menu, Integer.parseInt(menuData.split("-")[1]));
            menuList.add(order);
        }
        return menuList;
    }

    private int getSaleBefore(Order order, SaleBasic saleBasic) {
        Menu menu = order.getMenu();
        InputDateView inputDateView = new InputDateView();
        int date = inputDateView.getValue();
        if (date > Rule.END_DATE) {
            return menu.getPrice() * order.getCount();
        }
        return (menu.getPrice() * order.getCount()) - saleBasic.calcSaleForDay(date);
    }


}
