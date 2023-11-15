package christmas.Model;

import java.util.List;

public class Sale {
    private static int totalSale = 0;

    public Sale(List<Order> Menus) {
        this.totalSale = calcTotalSale(Menus);
    }

    public static int calcTotalSale(List<Order> Menus) {
      int result = 0;

      for(Order order : Menus) {
          result += order.getMenu().getPrice() * order.getCount();
      }
      return result;
    }

    public static int getTotalSale() {
        return totalSale;
    }

}