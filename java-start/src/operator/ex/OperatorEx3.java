package operator.ex;

public class OperatorEx3 {
    public static void main(String[] args) {
        int score = 80;
        boolean result = (80 <= score) && (score <= 100);
        System.out.println("score가 80점 이상, 100점 이하인가요? " + result);
    }
}
