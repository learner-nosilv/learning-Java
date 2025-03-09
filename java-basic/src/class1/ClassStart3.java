package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;           // 학생type(class)를 담는 변수 선언
        student1 = new Student();   // 학생 하나를 실제 메모리에 할당하고 student1에 대입
        student1.name = "학생1";     // 객체 멤버변수에 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();   // 학생을 담는 변수를 선언 + 학생 생성 후 변수에 할당
        student2.name = "학생2";     // 객체 멤버변수에 접근
        student2.age = 16;
        student2.grade = 80;

        // 학생 정보 출력
        System.out.println("이름: " + student1.name + "  나이: " + student1.age + "  성적: "+student1.grade);
        System.out.println("이름: " + student2.name + "  나이: " + student2.age + "  성적: "+student2.grade);

        System.out.println(student1 + "\n" + student2);



    }
}
