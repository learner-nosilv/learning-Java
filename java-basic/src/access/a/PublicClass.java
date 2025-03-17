package access.a;

// 하나의 클래스 파일에 3개의 클래스를 만들 수 있다
// 대신에 public 클래스명 = 파일명
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1{

}

class DefaultClass2{

}
