package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
        for (int dan = 1; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + dan * i);
            }
        }
    }
}