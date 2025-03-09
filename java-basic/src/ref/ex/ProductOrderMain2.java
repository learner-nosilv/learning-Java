package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // ProductOrder 객체를 원소로 하는 배열 orderArray 생성 및 초기화
        ProductOrder[] orderArray = new ProductOrder[]{
                createOrder("Kimchi", 10000, 5),
                createOrder("Dooboo", 1000, 10),
                createOrder("Spam", 3000, 3),
        };
//
//        ProductOrder kimchi = new ProductOrder();
//        kimchi.productName = "Kimchi";
//        kimchi.price = 10000;
//        kimchi.quantity = 5;
//
//        ProductOrder dooboo = new ProductOrder();
//        dooboo.productName = "Dooboo";
//        dooboo.price = 1000;
//        dooboo.quantity = 10;
//
//        ProductOrder spam = new ProductOrder();
//        spam.productName = "Spam";
//        spam.price = 3000;
//        spam.quantity = 3;
//
//        ProductOrder[] januaryOrder = new ProductOrder[]{kimchi, dooboo, spam};

        // orderArray 배열의 원소 ProductOrder 객체들의 값을 전부 출력
        printOrders(orderArray);

        // orderArray 배열의 원소 ProductOrder 객체들의 총 결제금액을 출력
        System.out.println("총 결제 금액: " + getTotalAmount(orderArray));
//        int totalAmount = 0;
//        for (ProductOrder order : januaryOrder) {
//            int price = order.price;
//            int quantity = order.quantity;
//            System.out.println("상품명: " + order.productName + ", 가격: " + quantity + ", 수량: " + price);
//            totalAmount += quantity * price;
//        }
//        System.out.println("총 결제 금액: " + totalAmount);
    }

    // ProductOrder 객체를 생성한 후 매개변수값으로 초기화하고 반환
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder tempOrder = new ProductOrder();
        tempOrder.productName = productName;
        tempOrder.price = price;
        tempOrder.quantity = quantity;
        return tempOrder;   // 객체전달X [객체의 참조값 전달]
    }

    // 배열을 받아서 배열에 들어있는 모든 ProductOrder의 필드들 출력
    static void printOrders(ProductOrder[] orderArray) {
        for (ProductOrder order : orderArray) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    // 배열을 받아서 배열에 들어있는 productOrder의 총 결제금액을 계산하여 반환
    static int getTotalAmount(ProductOrder[] orderArray) {
        int total=0;
        for (ProductOrder order : orderArray) {
            total += (order.price * order.quantity);
        }
        return total;
    }
}