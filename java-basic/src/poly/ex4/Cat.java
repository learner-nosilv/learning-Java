package poly.ex4;

public class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("야옹~");
    }

    @Override
    public void move(){
        System.out.println("고양이가 이동합니다.");
    }
}
