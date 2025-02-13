package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        tellAvg(1, 2, 3);
        tellAvg(15, 25, 35);
    }

    public static void tellAvg(int a, int b, int c) {
        System.out.println("평균값: " + (a + b + c) / 3.0);
    }
}