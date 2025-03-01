package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        myRectangle.setRectangle(8, 8);

        System.out.println("넓이: " + myRectangle.calculateArea());
        System.out.println("둘레 길이: " + myRectangle.calulaterPerimeter());
        System.out.println("정사각형 여부: " + myRectangle.isSquare());
    }
}
