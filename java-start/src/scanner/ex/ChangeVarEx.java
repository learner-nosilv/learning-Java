package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int temp = a;   // 임시보관
        a = b;
        b = temp;
        System.out.println("a = " + a + "\nb = " + b);
    }
}
