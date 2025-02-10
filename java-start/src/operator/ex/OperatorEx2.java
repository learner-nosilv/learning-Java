package operator.ex;

public class OperatorEx2 {
    public static void main(String[] args) {
        double num1 = 1.5;
        double num2 = 2.5;
        double num3 = 3.5;
        System.out.println("Sum: " + (num1 + num2 + num3));
        System.out.println("Avg: " + (num1 + num2 + num3)/3);   // 위에서 했던 계산을 또 해야하니 변수를 만드는게 좋겠다.

        double sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + (sum/3));
    }
}
