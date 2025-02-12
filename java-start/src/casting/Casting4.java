package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3/2;             // (*) 예상: 1 (묵시적형변환 예상) -> 실제: 1 (형변환 안 일어남)
        double div2 = 3 / 2;        // (*) 예상: 1.5 -> 실제: 1.0
        double div3 = 3.0 /2;       // 예상: 1.5 -> 실제: 1.5
        double div4 = (double)3 /2; // 예상: 1.5 -> 실제: 1.5
        System.out.println("div1 = " + div1);
        System.out.println("div2 = " + div2);
        System.out.println("div3 = " + div3);
        System.out.println("div4 = " + div4);

        /* 연산에서의 datatype 대원칙
            -1. 같은 타입 간 연산 -> 같은 타입의 결과
            -2. 다른 타입 간 연산 -> 더 큰 타입의 결과
         */
        int intA = 3;
        int intB = 2;
        // 1. [같은 타입 간 연산] int + int = int -> int 할당
        int intResult = intA / intB;
        System.out.println("intResult = " + intResult);

        // 2. [같은 타입 간 연산] int + int = int -> 자동형변환 double -> double 할당
        double doubleResult = intA / intB; // intA(3) / intB(2) = int(1) -> 자동형변환 double(1.0)
        System.out.println("result = " + doubleResult);

        // 3, 4. [다른 타입 간 연산] double + int = double -> double 할당
        doubleResult = (double)intA / intB; // 명시적형변환 double(3.0) / intB(2) -> 자동형변환 double(2.0) = double(1.5)
        System.out.println("result = " + doubleResult);
    }
}
