package christmas.Model;


import christmas.Util.Rule;
import christmas.View.InputDateView;

public class SaleBefore {

    private int date;

    public int calculateSaleBefore(Order order, SaleBasic saleBasic) {
        InputDateView inputDateView = new InputDateView();
        date = inputDateView.getValue();
        Menu menu = order.getMenu();
        validate(date);

        if(validate(date) == true) {
            return (menu.getPrice() * order.getCount()) - saleBasic.calcSaleForDay(date) ;
        }
        return (menu.getPrice() * order.getCount());
    }

    private boolean validate(int date){
        if(date < Rule.END_DATE) {
            return true;
        }
        return false;
    }
}
