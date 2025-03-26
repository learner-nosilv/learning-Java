package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("Chicken.닭이 \"꼬끼오\"");
    }

    @Override
    public void fly() {
        System.out.println("Chicken.닭이 비행합니다");
    }
}