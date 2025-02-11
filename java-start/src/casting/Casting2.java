package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue;

        // int -> double
//        intValue = doubleValue;
        intValue = (int) doubleValue;   // 명시적 형변환
        System.out.println(intValue);   // 1.5 -> 1

        System.out.println(10.5);
        System.out.println((int)10.5);  // double -> int 명시적 형변환
    }
}
