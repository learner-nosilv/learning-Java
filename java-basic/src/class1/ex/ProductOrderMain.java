package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "Kimchi";
        kimchi.price = 10000;
        kimchi.quantity = 5;

        ProductOrder dooboo = new ProductOrder();
        dooboo.productName = "Dooboo";
        dooboo.price = 1000;
        dooboo.quantity = 10;

        ProductOrder spam = new ProductOrder();
        spam.productName = "Spam";
        spam.price = 3000;
        spam.quantity = 3;

        ProductOrder[] januaryOrder = new ProductOrder[]{kimchi, dooboo, spam};

        int totalAmount = 0;
        for (ProductOrder order : januaryOrder) {
            int price = order.price;
            int quantity = order.quantity;
            System.out.println("상품명: " + order.productName + ", 가격: " + quantity + ", 수량: " + price);
            totalAmount += quantity * price;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}
