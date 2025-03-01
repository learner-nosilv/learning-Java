package construct;

import java.lang.reflect.Member;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
        this(name, age, 50);
        System.out.println("첫번째 생성자 호출 name: "+name+"  age: "+age+" grade: "+grade);
    }

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("두번째 생성자 호출 name: "+name+"  age: "+age+" grade: "+grade);
    }
}
