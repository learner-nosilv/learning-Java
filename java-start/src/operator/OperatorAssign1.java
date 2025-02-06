package operator;

public class OperatorAssign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3;     // a + 3 -> 5 + 3 -> 8 -> a 에 할당 | a = a + 3
        a -= 10;    // a - 10 -> 8 - 10 -> -2 -> a 에 할당 | a = a - 10
        a *= 10;    // a * 10 -> -2 * 10 -> -20 -> a 에 할당 | a = a * 4
        a /= 3;     // a / 3 -> -20 / 3 -> -6.... -> -6 -> a 에 할당 | a = a / 3
        a %= 5;     // a % 5 -> -6 / 5 -> 몫(-1) 나머지(-1) -> a 에 할당 | a = a % 5
        System.out.println(a);
    }
}
