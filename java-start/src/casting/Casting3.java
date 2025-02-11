package casting;

public class Casting3 {
    public static void main(String[] args) {
//        long maxIntValue = Integer.MAX_VALUE;
        long maxIntValue = 2147483647;  // int 범위의 최대값
        System.out.println("maxIntValue = " + maxIntValue);
        long maxIntAddOne = 2147483648L;
        System.out.println("maxIntAddOne = " + maxIntAddOne);

        int intValue = 0;
        // int 범위 내에 있는 long 값을 int로 명시적 형변환 하는 과정
        intValue = (int) maxIntValue;   // 문제없음
        System.out.println("intValue = " + intValue);   // 정상
        // int 범위 "밖"에 있는 long 값을 int로 명시적 형변환 하는 과정
        intValue = (int) maxIntAddOne;  // 문제발생 -2147483648

        System.out.println("intValue(OVER) = " + intValue); // -2147483648
    }
}
