package method;

public class Overloading4 {
    public static void main(String[] args) {
        System.out.println("1: " + add (1, 2));         // int -> double 자동형변환
        System.out.println("2: " + add (1.2, 2.5));
    }

//    public static int add(int a, int b) {
//        System.out.println("1번 int add 호출");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("2번 double add 호출");
        return a + b;
    }
}
