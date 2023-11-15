package christmas.View;

import christmas.Util.Rule;

public class OutputSalBefore {

    private int noSale;

    public static void printSale(int noSale) {
        System.out.println("\n" + Rule.SERVICE_MESSAGE + "\n" + noSale + "원\n");
    }
}
