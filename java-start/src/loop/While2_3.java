package loop;

public class While2_3 {
    public static void main(String[] args) {
        // 변수 덕분에 쉬워지는 코드
        int sum = 0;
        int i = 10;
        int endNum = 12;

        while ( i<= endNum) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}