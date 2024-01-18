import java.util.ArrayList;

public class CoffeeKiosk {
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void displayMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(String.format("%s   %s", i, menu.get(i).toString()));
        }
    }

    public void addMenuItem(String itemName, double itemPrice) {
        menu.add(new Item(itemName, itemPrice));
    }

    public void newOrder() {

        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        Order order = new Order(name);
        displayMenu();

        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        while (!itemNumber.equalsIgnoreCase("q")) {
            order.addItemToOrder(menu.get(Integer.valueOf(itemNumber)), 1);

            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }

        orders.add(order);
        System.out.println(order.toString());

    }
}
