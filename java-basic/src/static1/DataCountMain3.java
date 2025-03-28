package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = "+ Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = "+ Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = "+ Data3.count);

        // 추가
        // 인스턴스를 통한 static 변수 접근
        Data3 data4 = new Data3("D");
        System.out.println("D count = "+ data4.count);
        // 클래스를 통한 접근
        System.out.println("D count = "+ Data3.count);
    }
}

/**
 * A count = 1
 * B count = 2
 * C count = 3
 * D count = 4
 * D count = 4
 */
