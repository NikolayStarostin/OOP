package Lesson_5.HomeWork.PhoneBook.controller;

import Lesson_5.HomeWork.PhoneBook.model.PhoneBook;
import Lesson_5.HomeWork.PhoneBook.model.TypePB;
import Lesson_5.HomeWork.PhoneBook.service.PhoneBookService;
import Lesson_5.HomeWork.PhoneBook.view.PBView;

import java.util.List;

public class ControllerPB {
    private final PhoneBookService phoneBookService = new PhoneBookService();
    private final PBView pbView = new PBView();

    public void addPhoneContact(String name, String surname, Integer phoneNumber, String comment) {
        phoneBookService.create(name, surname, phoneNumber, comment);
    }

    public void getAllContacts() {
        List<PhoneBook> phoneBookList = phoneBookService.readPB();
        for (PhoneBook phoneBook : phoneBookList) {
            pbView.printConsolePB(phoneBook);
        }

    }

    public void changePBFormat(TypePB typePB) {
        phoneBookService.changeFormat(typePB);
    }

    public void getPBFormat() {
        System.out.println("phoneBookService.getFormat() = " + phoneBookService.getFormat());
    }
}