package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 100;
        int result = 0;
        int i = 1;
        while (i <= max) {
            result += i;
            i++;
        }
        System.out.println(result);
        System.out.println(max*(max+1)/2);
    }
}
