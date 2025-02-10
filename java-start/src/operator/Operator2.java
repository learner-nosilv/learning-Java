package operator;

public class Operator2 {
    public static void main(String[] args) {
        // String + String (1)
        String result1 = "hello " + "world";    // "hello world"
        System.out.println(result1);

        // String + String (2)
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;           // "string1string2"
        System.out.println(result2);

        // String + numberLiteral | Type Auto-changing : number -> String
        String result3 = "a + b = " + 10;    // 10 -> "10"
        System.out.println(result3);

        // String + numberVariable | Type Auto-changing : number -> String
        int num = 20;
        String exp = "a + b = ";
        String result4 = exp + num;     // "a + b = " + 20 -> "a + b = " + "20" -> "a + b = 20"
        System.out.println(result4);
    }
}
