package christmas;

import christmas.Controller.ChristmasController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            ChristmasController christmasController = new ChristmasController();
            christmasController.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
