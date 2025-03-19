package extends1.ex;

public class Item {
    private String name;    // 상품명
    private int price;      // 가격

    protected Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected void print() {
        System.out.println("이름: " + this.name + ", 가격: " + this.price);
    }

    public int getPrice() {
        return this.price;
    }
}