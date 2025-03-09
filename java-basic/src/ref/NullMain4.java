package ref;

public class NullMain4 {
    public static void main(String[] args) {
        // NullPointerException으로 골탕먹는 경우
        BigData bigData = new BigData();
        bigData.data = new Data(); // 해결
        System.out.println("bigData.count = " + bigData.count); // 기본 초기화 0
        System.out.println("bigData.data = " + bigData.data);   // 기본 초기화 null

        System.out.println("bigData.data.value = " + bigData.data.value);
        // bigData.data = null // null.value (X)
    }
}

/*
bigData.count = 0
bigData.data = null
Exception in thread "main" java.lang.NullPointerException:
Cannot read field "value" because "bigData.data" is null
	at ref.NullMain3.main(NullMain3.java:10)
 */
