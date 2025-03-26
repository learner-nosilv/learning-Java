package poly.ex2;

public class Animal {
    protected Animal() {}

    // 실제 쓰이지 않고 Method overriding 될 예정
    public void sound(){
        System.out.println("sound");
    }
}
