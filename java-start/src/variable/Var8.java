package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수 [4]
        byte b = 127;       // -128(- 2의 7제곱) ~ 127         | 2의 8제곱 종류
        short s = 32767;    // -32768(- 2의 15제곱) ~ 32767    | 2의 16제곱 종류
        int i = 2147483647; // [DEFAULT] 약 21억              | 2의 32제곱 종류
        long l = 9223372036854775807L;  // (- 2의 63제곱)      | 2의 64제곱 종류

        // 실수 [2]
        float f = 3.14159265358979f;    // 4byte
        double d = 3.14159265358979d;   // 8byte [DEFAULT]
    }
}
