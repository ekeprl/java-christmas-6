package christmas.Controller;

import christmas.Model.Date;
import christmas.View.InputDateView;

import static christmas.View.OutputDateView.printDate;

public class ChristmasController {

    public void run(){
        Date date = getDate();
        printDate(date);





    }

    private Date getDate() {
        InputDateView inputDateView = new InputDateView();
        int date = inputDateView.getValue();
        return new Date(date);

    }
}
