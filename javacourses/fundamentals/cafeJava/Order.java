import java.util.HashMap;

public class Order {
    String customerName;
    double total;
    boolean isReady;
    HashMap<String,Item> items;

    public Order() {
        this.items = new HashMap<>();
        this.isReady = false;
        this.total = 0;
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


    public void addItemToOrder(Item item, int quantity){
        this.items.putIfAbsent(item.name, item);
        this.items.get(item.name).updateQuantity(quantity);
       this.total += item.getPrice()*quantity;
    }

    @Override
    public String toString() {
        return String.format("{ Customer: %s, \n Items: %s, \n isOrderReady: %s, \n total: %f \n}", customerName, displayItemsList(), isReady, total);
    }

    private String displayItemsList(){
        StringBuilder strBuilder = new StringBuilder("[");
        for(Item item: items.values()){
            strBuilder.append(item.toString());
        }
        strBuilder.append("]");
        return strBuilder.toString();
    }

}
