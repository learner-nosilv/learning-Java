package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int even = 2;
        int i = 0;
        while (i < 10) {
            System.out.println(even);
            even += 2;
            i++;
        }
    }
}
