package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        int max = 100;
        int result = 0;
        for (int i = 1; i <= max; i++) {
            result += i;
        }
        System.out.println(result);
        System.out.println(max*(max+1)/2);
    }
}
