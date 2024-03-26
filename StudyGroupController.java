package home_made_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) 
и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса; 
*/
public class StudyGroupController {
    private List<User> userList = new ArrayList<>();
    private StudyGroupService groupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName) {
        int id = 1;
        for (User user : userList) {
            if (user instanceof Student) {
                id = ((Student) user).getStudentID() + 1;
            }
        }
        userList.add(new Student(firstName, secondName, lastName, id));
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        int id = 1;
        for (User user : userList) {
            if (user instanceof Teacher) {
                id = ((Teacher) user).getTeacherID() + 1;
            }
        }
        userList.add(new Teacher(firstName, secondName, lastName, id));
    }



    public User getGroupTeacher() { // назначить преподавателя группы
        int id;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID педагога");
        while(true){
            id = scanner.nextInt();
            for (User user : userList) {
                if (user instanceof Teacher && ((Teacher) user).getTeacherID() == id) {
                    return user;
                }
            }
            System.out.println("Нет такого ID педагога");
            System.out.println("Введите ID педагога");
        }
    }
    // подбираем студентов в группу
    public List<User> studentsInGroup() { 

        List<User> studentsGroup = new ArrayList<>();
        System.out.println("Добавляем всех студентов в группу");
        for (User user : userList) {
            if (user instanceof Student) {
                studentsGroup.add(user);
            }
        }
        return studentsGroup;

    }

    public void createGroup() {
        User teacherGroup = getGroupTeacher();
        List<User> students = studentsInGroup();
        StudyGroup group = groupService.createGroup(teacherGroup, students);
        System.out.println(group.toString());
    }
}
