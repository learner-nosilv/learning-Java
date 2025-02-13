package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number);    // double -> int [ERROR 자동 형변환 불가]
        printNumber((int)number);   // (int)double : 1.5 -> 1 로 [명시적 형변환]
    }

    public static void printNumber(int n){
        System.out.println( "숫자: "+ n);
    }
}
