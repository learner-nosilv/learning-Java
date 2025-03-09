package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1;           // 학생type(class)를 담는 변수 선언
        student1 = new Student();   // 학생 하나를 실제 메모리에 할당(x001) 하고 student1에 대입
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();   // 학생을 담는 변수를 선언 + 학생 생성 후 변수에 할당
        initStudent(student2, "학생2", 16, 80);

        // 학생 정보 출력
        printStudent(student1);
        printStudent(student2);
        System.out.println(student1 + "\n" + student2);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;     // X001.name -> 참조값.실체로 가서 실체의 값을 고침
        student.age = age;
        student.grade = grade;
    }

    // 실체가 아닌 참조값을 넘겨받음
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + "  나이: " + student.age + "  성적: "+student.grade);
    }
}
