package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("Programming is now running");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter(){
        System.out.println("= 프로그램을 종료합니다 =");
        // return; 안 넣으면 JAVA 가 알아서 넣어줌
    }
}
