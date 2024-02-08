package lesson.ts005;

import lesson.ts005.entity.Student;
import lesson.ts005.entity.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("01.01.1999", "Ivan Ivan Ivan", 1);
        Teacher teacher1 = new Teacher("01.01.1988", "Ivan Ivan Vladimir", 1);


        System.out.println(student1);
        System.out.println(teacher1);
    }
}
