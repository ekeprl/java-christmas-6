package christmas.Model;

import java.util.List;

public class Sale {
    private final int totalSale;

    public Sale(List<Menu> Menus) {
        this.totalSale = calcTotalSale(Menus);
    }

    private int calcTotalSale(List<Menu> Menus) {
      int result = 0;

      for(Menu menu : Menus) {
          result += menu.getPrice();
      }
      return result;
    }

    public int getTotalSale() {
        return totalSale;
    }
}
