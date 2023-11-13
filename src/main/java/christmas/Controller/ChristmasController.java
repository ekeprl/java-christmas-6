package christmas.Controller;

import christmas.Model.Date;
import christmas.Model.Menu;
import christmas.Model.Order;
import christmas.Model.Sale;
import christmas.View.InputDateView;
import christmas.View.InputMenuView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static christmas.View.OuputSaleView.printSale;
import static christmas.View.OutputDateView.printDate;
import static christmas.View.OutputMenuView.printMenu;

public class ChristmasController {

    public void run(){
        Date date = getDate();
        printDate(date);

        List<Order> menu = getMenu();
        printMenu(menu);

        Sale sale = getSale();
        printSale(sale);


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
        for(String menuData : inputValue) {
            Menu menu = Menu.getMenu(menuData.split("-")[0]);
            Order order = new Order(menu, Integer.parseInt(menuData.split("-")[1]));
            menuList.add(order);
        }
        return menuList;
    }

    private Sale getSale(List<Menu> Menus) {
        totalSale = Sale.get

    }
}
