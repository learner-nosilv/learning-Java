package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;
    private int totalPrice;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = price * quantity;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
}