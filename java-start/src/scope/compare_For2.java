package scope;

public class compare_For2 {
    public static void main(String[] args) {
        int sumResult = 0;
        int endNum =3;

        // i = 1, 2, 3, 4(escape)
        for (int i = 1; i <= endNum; i++) {     // (1, 2, 3) 총 3회 반복
            sumResult += i;
            System.out.println("i = " + i + "  sumResult = " + sumResult);
        }
    }
}
