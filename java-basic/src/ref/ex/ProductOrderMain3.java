package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        // 입력 준비
        Scanner sc = new Scanner(System.in);

        // 주문 수량 입력 받기
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderCount = sc.nextInt();      // 버퍼에 개행 찌꺼기가 남음
        sc.nextLine();                      // 개행 찌꺼기 처리

        // 입력받은 주문 수량값만큼 ProductOrder 객체를 원소로 하는 배열 orderArray 생성
        ProductOrder[] orderArray = new ProductOrder[orderCount];

        // 배열 orderArray의 ProductOrder형 원소들에 관한 값을 입력받고 전부 초기화
        for(int i=0; i<orderCount; i++) {
            System.out.println( (i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();              // 찌꺼기 처리
            orderArray[i] = createOrder(productName, price, quantity);
        }

        // orderArray 배열의 원소 ProductOrder 객체들의 값을 전부 출력
        printOrders(orderArray);

        // orderArray 배열의 원소 ProductOrder 객체들의 총 결제금액을 출력
        System.out.println("총 결제 금액: " + getTotalAmount(orderArray));
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