package christmas.Model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    private void validate(List<String> menus) {
        validateInclude(menus);
    }

    private void validateInclude(List<String> menus) {
        Set<String> Notmenus = new HashSet<>(menus);

    }

}
