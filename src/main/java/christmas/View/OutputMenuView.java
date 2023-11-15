package christmas.View;


import christmas.Model.Menu;
import christmas.Model.Order;
import christmas.Util.Rule;

import java.util.Arrays;
import java.util.List;

public class OutputMenuView {
    public static void printMenu(List<Order> menus) {
        System.out.println(Rule.ORIGINALPRICE_MESSAGE);
        for(Order order : menus) {
            System.out.println(order.getMenu().getName());
        }
     }

}
