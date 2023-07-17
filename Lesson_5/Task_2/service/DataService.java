package Lesson_5.Task_2.service;

import Lesson_5.Task_2.data.Type;
import Lesson_5.Task_2.data.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, String patronymic, Type type);
    List<User> read();

    List<User> readStudent();
}