package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("Bird.새가 \"짹짹\"");
    }

    @Override
    public void fly() {
        System.out.println("Bird.새가 비행합니다");
    }
}