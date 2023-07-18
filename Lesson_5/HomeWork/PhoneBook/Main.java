package Lesson_5.HomeWork.PhoneBook;

import Lesson_5.HomeWork.PhoneBook.controller.ControllerPB;
import Lesson_5.HomeWork.PhoneBook.model.TypePB;

public class Main {
    public static void main(String[] args) {
        ControllerPB controllerPB = new ControllerPB();
        controllerPB.addPhoneContact("Иван", "Петров", 892512313, "работа");
        controllerPB.addPhoneContact("Алексей", "Егоров", 892512314, "работа");
        controllerPB.addPhoneContact("София", "Васильева", 892531356, "подруга");
        controllerPB.addPhoneContact("Анна", "Федулова", 892531385, "сестра");

        controllerPB.getAllContacts();
        controllerPB.getPBFormat();
        controllerPB.changePBFormat(TypePB.JSON);
        controllerPB.getPBFormat();
    }
}