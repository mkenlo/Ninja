import java.text.NumberFormat;
import java.util.HashMap;

public class Order {
    private String customerName;
    private double total;
    private boolean isReady;
    private HashMap<Item, Integer> items;

    public Order() {
        this.items = new HashMap<>();
        this.isReady = false;
        this.total = 0;
        this.customerName = "Unnamed";
    }

    public Order(String customerName) {
        this.items = new HashMap<>();
        this.isReady = false;
        this.total = 0;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotal() {
        return total;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public HashMap<Item, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<Item, Integer> items) {
        this.items = items;
    }

    public void addItemToOrder(Item item, int quantity){
        int n = this.items.getOrDefault(item, 0);
       this.items.putIfAbsent(item, n+quantity);


        this.total += item.getPrice() * quantity;

    }

    @Override
    public String toString() {
        NumberFormat currencyFormatter =
                NumberFormat.getCurrencyInstance();
        return String.format("Customer: %s, \nItems: %s \nTotal: %s", customerName, displayItemsList(), currencyFormatter.format(getOrderTotal()));
    }

    private String displayItemsList(){
        NumberFormat currencyFormatter =
                NumberFormat.getCurrencyInstance();
        StringBuilder strBuilder = new StringBuilder("\n");
        for(Item item: items.keySet()){
            strBuilder.append(item.getName());
            strBuilder.append(" * ");
            strBuilder.append(this.items.get(item));
            strBuilder.append(" = ");
            strBuilder.append(currencyFormatter.format(item.getPrice()*this.items.get(item)));
            strBuilder.append("\n");
        }
        strBuilder.deleteCharAt(strBuilder.length() -1);

        return strBuilder.toString();
    }

    public String getStatusMessage(){
        return (isReady) ? "Your order is ready" : "Your order will be ready shortly";
    }

    public double getOrderTotal(){
        double sum = 0;
        for(Item item: items.keySet()) {
            sum += item.getPrice() * this.items.get(item);
        }
        return sum;
    }
}
