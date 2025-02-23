package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;     // 실체(10)이 복사된 것이 아닌 참조값이 복사 & 할당

        System.out.println("dataA: " + dataA);  // dataA: ref.Data@6acbcfc0
        System.out.println("dataB: " + dataB);  // dataB: ref.Data@6acbcfc0
        System.out.println("dataA.value: " + dataA.value);  // dataA.value: 10
        System.out.println("dataB.value: " + dataB.value);  // dataB.value: 10

        dataA.value = 20;
        System.out.println("dataA.value: " + dataA.value + "로 변경합니다.");
        System.out.println("dataA: " + dataA);  // dataA: ref.Data@6acbcfc0 [참조값 고정]
        System.out.println("dataB: " + dataB);  // dataB: ref.Data@6acbcfc0 [참조값 고정]
        System.out.println("dataA.value: " + dataA.value);  // dataA.value: 20
        System.out.println("dataB.value: " + dataB.value);  // dataB.value: 20

        dataB.value = 30;
        System.out.println("dataB.value: " + dataB.value + "로 변경합니다.");
        System.out.println("dataA: " + dataA);  // dataA: ref.Data@6acbcfc0 [참조값 고정]
        System.out.println("dataB: " + dataB);  // dataB: ref.Data@6acbcfc0 [참조값 고정]
        System.out.println("dataA.value: " + dataA.value);  // dataA.value: 30
        System.out.println("dataB.value: " + dataB.value);  // dataB.value: 30


    }
}
