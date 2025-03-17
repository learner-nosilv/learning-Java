package pack.com.helloshop.order;

// import 에 유의하기
import pack.com.helloshop.product.Product;
import pack.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    // public 이 붙어야 다른 패키지에서 해당 생성자 사용가능
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
