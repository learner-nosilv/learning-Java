package access.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
//        DefaultClass1 defaultClass1 = new DefaultClass1();
//        DefaultClass2 defaultClass2 = new DefaultClass2();
        // 다른 패키지이므로 Default 클래스 사용불가능
        /**
         * java: access.a.DefaultClass1 is not public in access.a; cannot be accessed from outside package
         */
    }
}
