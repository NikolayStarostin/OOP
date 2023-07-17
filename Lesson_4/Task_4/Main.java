package Lesson_4.Task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LRUCache<Employee> lru = new LRUCache<Employee>(4);
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            employees.add(new Employee("Николай " + i, i * 100, "прод " + i));
        }
        for (Employee employee : employees) {
            lru.addElement(employee);
            System.out.println(lru.getAllElements());
        }
    }
}