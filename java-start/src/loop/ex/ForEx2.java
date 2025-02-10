package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int even = 2;
        // 증감식을 사용하는 용도이므로 even까지 안 섞는 것이 더 가독성있다.
        for (int i = 0; i < 10; i++) {
            System.out.println(even);
            even += 2;
        }
    }
}