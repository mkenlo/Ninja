import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();

        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

        System.out.println("----- Order Total Test-----");
        double[] lineItems = { 3.5, 1.5, 4.0, 4.5 };
        System.out.printf("Order total: %s \n\n", appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        appTest.addCustomer(customers);

        System.out.println("\n----- Price Chart-----");
        appTest.printPriceChart("Columbian Coffee Grounds", 15.0, 3);

        System.out.println("----- Display Menu with prices Test-----");

        ArrayList<Double> prices = new ArrayList<>(Arrays.asList(15.0, 10.0, 8.5, 10.0));

        appTest.displayMenu(menu, prices);
    }
}
