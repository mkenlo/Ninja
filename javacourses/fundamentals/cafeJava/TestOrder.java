import java.util.ArrayList;

public class TestOrder {
public static void main(String[] args){
    Item cappuccino = new Item("cappuccino", 4.99);
    Item mocha = new Item("mocha", 3.59);
    Item latte = new Item("latte", 3.49);
    Item dripCoffee = new Item("drip coffee", 3.99);

    Order order1 = new Order("Cindhuri");
    Order order2 = new Order("Jimmy");
    Order order3 = new Order();
    Order order4 = new Order();

    order3.setCustomerName("Noah");
    order4.setCustomerName("Sam");

    order1.addItemToOrder(dripCoffee, 1);
    order1.addItemToOrder(mocha, 2);
    System.out.println("Order 1 Recap: ");
    System.out.println(order1.toString());
    System.out.println("\n**************************************************\n");
    order2.addItemToOrder(mocha, 1);
    System.out.println("Order 2 Recap: ");
    System.out.println(order2.toString());
    System.out.println("\n**************************************************\n");
    order3.addItemToOrder(cappuccino, 1);
    System.out.println("Order 3 Recap: ");
    System.out.println(order3.toString());
    System.out.println("\n**************************************************\n");
    order4.addItemToOrder(latte, 1);
    System.out.println("Order 4 Recap: ");
    System.out.println(order4.toString());
    System.out.println("\n**************************************************\n");
    System.out.println("--- Now preparing Cindhuri's order");
    order1.setReady(true);
    System.out.println(order1.getStatusMessage());
    System.out.println("Order 1 Recap: ");
    System.out.println(order1.toString());
    System.out.println("\n**************************************************\n");
    System.out.println("--- Sam ordered 2 more latte");
    order4.addItemToOrder(latte, 2);
    System.out.println("Order 4 Recap: ");
    System.out.println(order4.toString());
    System.out.println("\n**************************************************\n");
    System.out.println("--- Now preparing Jimmy's order");
    order2.setReady(true);
    System.out.println(order2.getStatusMessage());
    System.out.println("Order 2 Recap: ");
    System.out.println(order2.toString());


}

}
