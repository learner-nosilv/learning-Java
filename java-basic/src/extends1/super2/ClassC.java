package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        super(10, 20);    // C의 부모는 B인데, B는 기본 생성자 X
        System.out.println("ClassC constructor");
    }

}
