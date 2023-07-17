package Lesson_5.Task_2;

import Lesson_5.Task_2.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Иван","Борисович","Ершов");
        controller.createStudent("Анна","Леонидовна","Власова");
        controller.createStudent("Петр","Алексеевич","Бодин");
        controller.createStudent("Игнат","Ринатович","Газин");
        controller.getAllStudents();
    }
}