package christmas.View;


import christmas.Model.Menu;

public class OutputMenuView {
    public static void printMenuList(Menu menu) {
        Menu.getMenus().forEach(System.out::println);
        System.out.println();
    }

}
