package loop;

public class While2_2 {
    public static void main(String[] args) {
        // 변수 덕분에 쉬워지는 코드
        int sum = 0;
        int i = 10;
        sum += i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;
        sum += i;
        System.out.println("i = " + i + " sum = " + sum);
        i++;
        sum += i;
        System.out.println("i = " + i + " sum = " + sum);
    }
}
// 변경에 유연하지 않다.