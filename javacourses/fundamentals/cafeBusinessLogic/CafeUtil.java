import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int streak = 0;
        for (int i = 1; i <= 10; i++)
            streak += i;
        return streak;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }

        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++)
            System.out.println(i + " " + menuItems.get(i));
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name (type 'q' when finish):");
        String username = System.console().readLine();
        while (!username.equals("q")) {
            System.out.println("Hello, " + username);
            System.out.println("There are " + customers.size() + " people in front of you");
            customers.add(username);
            System.out.println("Please enter your name (type 'q' when finish):");
            username = System.console().readLine();
        }

    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.println(i + " - $" + price * i);
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        for (int i = 0; i < menuItems.size(); i++)
            System.out.println(i + " " + menuItems.get(i) + " -- " + prices.get(i).toString());
        return true;
    }
}
