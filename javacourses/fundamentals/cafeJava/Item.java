public class Item {
    String name;
    double price;
    int quantity;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updateQuantity(int quantity){
        this.quantity += quantity;
    }

    @Override
    public String toString() {
        return "(" + "name='" + name + ", price=" + price + ", quantity="+quantity+ ')';
    }
}
