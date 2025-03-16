package static2.ex;

public class MathArrayUtils {
    // 누군가 실수로 인스턴스를 생성하지 못하게 private 처리 [객체생성이 메모리낭비임]
    private MathArrayUtils() {}

    // 배열의 합 반환
    static int sum(int[] values) {
        int total = 0;
        for (int i : values) {
            total += i;
        }
        return total;
    }

    // 배열의 평균값 반환
    static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    // 배열의 최소값 반환
    static int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }

    // 배열의 최소값 반환
    static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }
}
