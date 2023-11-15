package christmas.View;

import christmas.Util.Rule;

public class OuputSaleCountView {
    static int ddaySale = 0;
    static int weekTotalSale = 0;
    static int specialSale = 0;
    static int serviceSale = 0;

    public static void printSaleResult(int date, int weekSale, boolean isWeekday, boolean isSpecialDay, int sum) {
        System.out.println("\n" + Rule.AFTERSALE_MESSAGE);

        printDday(date);
        printWeekSale(weekSale, isWeekday);
        printSpecial(isSpecialDay);
        printServicePrice(sum);
        printAllSumPrince(ddaySale + weekTotalSale + specialSale + serviceSale);
        printResultPrice(sum, ddaySale + weekTotalSale + specialSale);
        printBadge(sum - (ddaySale + weekTotalSale + specialSale));
    }


    public static void printDday(int date) {
        System.out.println(Rule.AFTERSALE_MESSAGE1 + "-" + date + "원");
        ddaySale = date;
    }

    public static void printWeekSale(int weekSale, boolean isWeekday) {
        if (isWeekday) {
            System.out.println(Rule.AFTERSALE_MESSAGE3 + "-" + weekSale + "원");
        } else {
            System.out.println(Rule.AFTERSALE_MESSAGE2 + "-" + weekSale + "원");
        }
        weekTotalSale = weekSale;
    }

    private static void printSpecial(boolean isSpecialDay) {
        if (isSpecialDay) {
            System.out.println(Rule.AFTERSALE_MESSAGE4 + "-" + Rule.SPECIAL_SALE);
            specialSale = Rule.SPECIAL_SALE;
        } else {
            System.out.println(Rule.AFTERSALE_MESSAGE4 + "없음");
        }

    }

    public static void printServicePrice(int sum) {
        String gift = "없음";
        if (sum > Rule.SERVICE_MIN) {
            serviceSale = 25000;
            gift = "25000원";
        }
        System.out.println(Rule.AFTERSALE_MESSAGE5 + "-" + gift + "\n");
    }

    private static void printAllSumPrince(int allsum) {
        System.out.println(Rule.AFTERSALERESULT_MESSAGE5 + "\n" + "-" + allsum + "원\n");
    }

    private static void printResultPrice(int sum, int allsum) {
        System.out.println(Rule.WILLPAY_MESSAGE + "\n" + (sum - allsum) + "원\n");
    }

    private static void printBadge(int sale) {
        if (sale < Rule.BADGE_MIN) {
            System.out.println(Rule.BADGE_MIN_MESSAGE);
            return;
        }
        if (Rule.BADGE_MIN < sale && sale < Rule.BADGE_MID) {
            System.out.println(Rule.BADGE_MID_MESSAGE);
            return;
        }
        System.out.println(Rule.BADGE_MESSAGE + "\n" + Rule.BADGE_MAX_MESSAGE);
    }

}
