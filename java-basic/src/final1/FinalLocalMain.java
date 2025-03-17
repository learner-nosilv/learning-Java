package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역변수
        final int data1;
        data1 = 10;  // 최초 1회만 할당 가능
//        data1= 20;  // 최초 1회만 할당 가능, 따라서 컴파일 오류
        // java: variable data1 might already have been assigned

        // final 지역변수2
        final int data2 = 10;
//        data2 = 20; // 컴파일 오류
        // java: cannot assign a value to final variable data2

        method(10);
    }

    static void method(final int parameter){
        // parameter 의 값을 바꿀 수 없음
//        parameter=20;
        // java: final parameter parameter may not be assigned
    }

}
