package lesson.ts005.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends User {
    private Integer studentId;

    public Student(String birthday, String fullname, Integer studentId) {
        super(birthday, fullname);
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
