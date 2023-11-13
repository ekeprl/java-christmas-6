package christmas.View;

import christmas.Model.Sale;

public class OuputSaleView {

    public static void printSale(Sale sale) {
        System.out.println(sale.getTotalSale() + "원" );
    }

}
