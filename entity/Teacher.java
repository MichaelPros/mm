package lesson.ts005.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends User {
    private Integer teacherId;

    public Teacher(String birthday, String fullname, Integer teacherId) {
        super(birthday, fullname);
        this.teacherId = teacherId;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
