package scanner;

import java.util.Scanner;   //  Scanner 클래스 객체를 사용하기 위함

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 사용자 입력(System.in)을 사용하나보다

        System.out.print("hello\n");    // = println("hello")
        System.out.print("world\n");    // = println("world")
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();    // 입력을 String 으로 가져와 리턴한다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();   // 입력을 int 로 가져와서 리턴한다.
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();  // 입력을 double 로 가져와서 리턴한다.
        System.out.println("입력한 실수: " + doubleValue);
    }
}
