package scope;

public class compare_While2_3 {
    public static void main(String[] args) {
        // 변수 덕분에 쉬워지는 코드
        int sum = 0;
        int i = 1;
        int endNum = 3;

        // int i 는 while 문 속에서 쓰지만
        // while 의 구조상 scope 를 while 로 지정할 수 없다
        while ( i<= endNum) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}