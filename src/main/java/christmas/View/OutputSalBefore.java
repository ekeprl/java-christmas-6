package christmas.View;

import christmas.Model.Menu;
import christmas.Model.SaleBefore;
import christmas.Util.Rule;

public class OutputSalBefore {

    private int noSale;
    public static void printSale(int noSale) {
                System.out.println(Rule.SERVICE_MESSAGE + "\n" + noSale + "원");
    }
}
