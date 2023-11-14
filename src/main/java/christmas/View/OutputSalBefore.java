package christmas.View;

import christmas.Model.Menu;
import christmas.Model.SaleBefore;

public class OutputSalBefore {

    private int noSale;
    public static void printbeforeSale(SaleBefore order) {
        Menu menu = order.getMenu();
        int noSale = menu.getPrice() * order.getCount();

        System.out.println(noSale + "원");
    }
}
