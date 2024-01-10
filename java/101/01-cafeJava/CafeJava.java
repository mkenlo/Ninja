import java.util.Random;

public class CafeJava {
    public static void main(String[] args) {
        Random rand = new Random();
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.19;
        double lattePrice = 3.99;
        double cappucinoPrice = 3.99;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = rand.nextBoolean();
        boolean isReadyOrder2 = rand.nextBoolean();
        boolean isReadyOrder3 = rand.nextBoolean();
        boolean isReadyOrder4 = rand.nextBoolean();

        // APP INTERACTION SIMULATION
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

        if (isReadyOrder1) {
            System.out.println("Item: Coffee * 1" + readyMessage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        } else
            System.out.println(pendingMessage);

        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Cindhuri"

        if (isReadyOrder4) {
            System.out.println("Item: Cappuccino * 1" + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
        } else {
            System.out.println(pendingMessage);

        }

        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println("Item: Latte * 2" + readyMessage);
            double total = lattePrice * 2;
            System.out.println(displayTotalMessage + total);
        } else {
            System.out.println(pendingMessage);
        }

        System.out.println(generalGreeting + customer3);
        System.out.println("Order changed. " + displayTotalMessage + (dripCoffeePrice - lattePrice));
    }
}
