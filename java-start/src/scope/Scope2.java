package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m=10;   // m 주기 : main
        System.out.println("main : m born");
        System.out.println("for : i born");
        for(int i=0; i<2; i++) { // i 주기 : for
            System.out.println("for : m = " + m);   // 외부블록main의 변수도 내부블록에서 사용가능
            System.out.println("for : i = " + i);
        } // for문 종료 = i 생존 종료
        System.out.println("for : i died");
        System.out.println("main : m died");
    }   // main함수 종료 = m 생존 종료
}
