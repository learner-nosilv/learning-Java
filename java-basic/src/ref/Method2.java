package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("createStudent 탈출: student1 = " + student1);
        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("createStudent 탈출: student2 = " + student2);

        // 학생 정보 출력
        printStudent(student1);
        printStudent(student2);
        System.out.println(student1 + "\n" + student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        System.out.println("createStudent 진입: student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    // 실체가 아닌 참조값을 넘겨받음
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + "  나이: " + student.age + "  성적: "+student.grade);
    }
}
