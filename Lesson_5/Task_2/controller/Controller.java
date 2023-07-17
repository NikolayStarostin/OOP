package Lesson_5.Task_2.controller;

import Lesson_5.Task_2.view.StudentView;
import Lesson_5.Task_2.data.Student;
import Lesson_5.Task_2.data.Type;
import Lesson_5.Task_2.data.User;
import Lesson_5.Task_2.service.UserService;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String name, String surname, String patronymic){
        userService.create(name, surname, patronymic, Type.STUDENT);
    }

    public void getAllStudents(){
        List<User> studentList = userService.readStudent();
        for (User user : studentList) {
            Student student = ((Student) user);
            studentView.printConsoleStudent(student);
        }
    }
}