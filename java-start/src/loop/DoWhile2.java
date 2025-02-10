package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        do {    // 한 번은 실행함
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3);    // 세미콜론 잊지 않기!
    }
}
