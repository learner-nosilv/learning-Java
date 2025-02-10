package operator;

public class OperatorCompare2 {
    public static void main(String[] args) {
        System.out.println("문자열 간 비교는 연산자 == 보다 String 클래스의 메서드 .equals() 를 사용하자!");
        System.out.println();

        String str1 = "문자열1";
        String str2 = "문자열2";

        // 문자열 리터럴. 문자열 리터럴 비교
        boolean result1 = "hello".equals("hello");
        System.out.println("\"hello\".equals(\"hello\") ? " + result1);

        // 문자열 변수. 문자열 리터럴 비교
        boolean result2 = str1.equals("문자열1");
        System.out.println("str1.equals(\"문자열1\") ? " + result2);

        // 문자열 리터럴. 문자열 변수 비교
        boolean result3 = "문자열2".equals(str1);
        System.out.println("\"문자열2\".equals(str1) ? " +  result3);

        // 문자열 변수. 문자열 변수 비교
        boolean result4 = str2.equals(str1);
        System.out.println("str2.equals(str1) ? " +  result4);

        // == 로 비교하면? 지금은 옳게 나오지만, 특정한 조건에 맞으면 틀린 답을 내놓는다
        System.out.println("str1 == str2 ? " + (str1 == str2));
    }
}
