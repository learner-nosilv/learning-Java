package loop;

public class Break2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        for (; ; ) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i= " + i + "  sum: " + sum);
                break;
            }
            i++;
        }
    }
}
/*
while 대신    for(;;) 로 해도 무방
 */