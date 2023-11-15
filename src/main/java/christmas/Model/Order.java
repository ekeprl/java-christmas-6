package christmas.Model;

public class Order {

    private Menu menu;
    private int count;

    public Menu getMenu() {
        return menu;
    }

    public int getCount() {
        return count;
    }

    public Order(Menu menu, int count) {
        this.menu = menu;
        this.count = count;
    }

}
