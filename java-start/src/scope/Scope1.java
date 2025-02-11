package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;     // m 생존 시작 | 생존구역 main{}
        System.out.println("main : m start");// x 생존 종료
        if (true) {
            int x = 20; // x 생존 시작 | 생존구역 if{}
            System.out.println("if : x start");// x 생존 종료
            System.out.println("if : m = " + m);
            System.out.println("if : x = " + x);
            System.out.println("if : x died");// x 생존 종료
        }
//        System.out.println("main : x = " + x);
        System.out.println("main : m = " + m);
        System.out.println("main : m died ");
    }   // m 생존 종료
}
