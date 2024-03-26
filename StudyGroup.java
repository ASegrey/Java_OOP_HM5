package home_made_05;
/* 
— Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
*/

import java.util.List;

public class StudyGroup {
    private User teacherGroup;
    private List<User> students;

    public StudyGroup(User teacherGroup, List<User> students) {
        this.teacherGroup = teacherGroup;
        this.students = students;
    }

    public User getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(User teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Группа " +
                 teacherGroup.toString() +
                ", Студенты:" + students.toString()
                ;
    }
}
