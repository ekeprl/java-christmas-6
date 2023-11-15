package christmas.View;

import christmas.Model.Menu;
import christmas.Model.Order;
import christmas.Model.SaleBasic;
import christmas.Util.Rule;

public class OuputSaleCountView {
    static int ddaySale = 0;
    static int weekTotalSale = 0;
    static int specialSale = 0;
    static int serviceSale = 0;
    public static void printSaleResult(int date, int weekSale, boolean isWeekday, boolean isSpecialDay,int sum) {
        System.out.println(Rule.AFTERSALE_MESSAGE);

        printDday(date);
        printWeekSale(weekSale, isWeekday);
        printSpecial(isSpecialDay);
        printServicePrice(sum);
        printAllSumPrince(ddaySale + weekTotalSale + specialSale + serviceSale);
        printResultPrice(ddaySale + weekTotalSale + specialSale);
    }


    public static void printDday(int date) {
        System.out.println(date + "원");
        ddaySale = date;
    }

    public static void printWeekSale(int weekSale, boolean isWeekday) {
        if (isWeekday) {
            System.out.println("주말할인" + weekSale + "원");
        } else {
            System.out.println("평일할인" + weekSale + "원");
        }
        weekTotalSale = weekSale;
    }

    private static void printSpecial(boolean isSpecialDay) {
        if (isSpecialDay) {
            System.out.println(Rule.SPECIAL_SALE);
            specialSale = Rule.SPECIAL_SALE;
        } else {
            System.out.println("없음");
        }

    }
    public static void printServicePrice(int sum) {
        System.out.println(Rule.ALLSALE_MESSAGE);
        String gift = "없음";
        if (sum > Rule.SERVICE_MIN) {
            serviceSale = 25000;
            gift = "-25000원";
        }
        System.out.println(gift);
    }

    private static void printAllSumPrince(int i) {
        System.out.println(i);
    }

    private static void printResultPrice(int i) {
        System.out.println(i);
    }


}
