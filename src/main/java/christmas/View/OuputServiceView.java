package christmas.View;

import christmas.Model.Menu;
import christmas.Util.Rule;

public class OuputServiceView {

    public static void printService(int sum) {
        System.out.println(Rule.ALLSALE_MESSAGE);
        String gift = "없음";
        if (sum > Rule.SERVICE_MIN) {
            gift = Menu.CHAMPAGNE.getName() + " 1개";
        }
        System.out.println(gift);
    }
}
