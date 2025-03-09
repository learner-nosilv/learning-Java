package oop1.ex;

public class Rectangle {
    // 속성 --------
    int width;  // 직사각형 가로 길이
    int height; // 직사각형 세로 길이

    // 기능 --------
    // 직사각형 가로, 세로 설정
    void setRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 직사각형 넓이 계산 & 리턴
    int calculateArea() {
        return width * height;
    }

    // 직사각형 둘레 계산 & 리턴
    int calulaterPerimeter() {
        return 2 * (width + height);
    }

    // 직사각형이 정사각형인지 판별
    boolean isSquare() {
        return (width == height);
    }
}