package operator;

public class Operator1 {
    public static void main(String[] args) {
        // Variable initialize
        int a = 5;
        int b = 2;

        // addition
        int sum = a + b;
        System.out.println("a + b = " + sum);   //  print a + b = 7

        // subtraction
        int diff = a - b;
        System.out.println("a - b = " + diff);  // print a - b = 3

        // multiplication
        int multi = a * b;
        System.out.println("a * b = " + multi);  // print a * b = 10

        // division
        int div = a / b;                        // 5 나누기 2는 2.5 인데 int 형으로 나오므로 0.5가 버려짐
        System.out.println("a / b = " + div);   // print a / b = 2

        // modulus ( division & remainder )
        int mod = a % b;                        // 5 / 2 = 몫: 2, 나머지: 1
        System.out.println("a % b = " + mod);   // print a % b = 1
    }
}
