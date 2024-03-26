package home_made_05;

import java.util.List;
/* 
— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) 
формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его; 
*/
public class StudyGroupService {
    
    public StudyGroup createGroup (User teacher, List<User> students) {
        return new StudyGroup(teacher,students);
    }
}
