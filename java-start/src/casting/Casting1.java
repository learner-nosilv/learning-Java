package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;  // 4 Byte 정수
        long longValue;     // 8 Byte 정수
        double doubleValue; // 8 Byte 실수

        // int -> long
        longValue = intValue;
        System.out.println("longValue = " + longValue);

        // int -> double
        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        // long -> double
        doubleValue = 20L;
        System.out.println("doubleValue(l>d) = " + doubleValue);
    }
}
