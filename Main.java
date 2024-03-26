package home_made_05;

public class Main {
    public static void main(String[] args) {
        StudyGroupController controller = new StudyGroupController();
        controller.createStudent("Иван", "Иванович", "Иванов");
        controller.createStudent("Серафим", "Акакевич", "Петров");
        controller.createStudent("Семен", "Сергеевич", "Автономов");
        controller.createStudent("Татьяна", "Сергеевна", "Якушева");

        controller.createTeacher("Сергей", "Дмитриевич", "Автономов");
             
        controller.createGroup();
    }
}
