package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData vd = new ValueData();
        vd.add();
        vd.add();
        vd.add();
        System.out.println("최종 숫자: "+vd.value);
    }
}
