package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();   // 학생을 담는 변수를 선언 + 학생 생성 후 변수에 할당
        student1.name = "학생1";     // 객체 멤버변수에 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();   // 학생을 담는 변수를 선언 + 학생 생성 후 변수에 할당
        student2.name = "학생2";     // 객체 멤버변수에 접근
        student2.age = 16;
        student2.grade = 80;

        // 스튜던트 인스턴스(객체)를 스튜던트형 배열에 담기
//        Student[] students = new Student[2];
//        students[0] = student1;
//        students[1] = student2;
        Student[] students = new Student[]{ student1, student2 };
//      Student[] students = { student1, student2 };

        // 학생 정보 출력
//        System.out.println("이름: " + students[0].name + "  나이: " + students[0].age + "  성적: " + students[0].grade);
//        System.out.println("이름: " + students[1].name + "  나이: " + students[1].age + "  성적: " + students[1].grade);

        for( Student s : students ){
            System.out.println("이름: " + s.name + "  나이: " + s.age + "  성적: " + s.grade);
        }

        System.out.println(students[0] + "\n" + students[1]);


    }
}
