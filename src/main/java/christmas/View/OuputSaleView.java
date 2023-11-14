package christmas.View;

import christmas.Model.Sale;
import christmas.Util.Rule;

public class OuputSaleView {


    public static void printSale(Sale sale) {
        System.out.println(Rule.SERVICE_MESSAGE);
        System.out.println(sale.getTotalSale() + "원" );
    }

}
