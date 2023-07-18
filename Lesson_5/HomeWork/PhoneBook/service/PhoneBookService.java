package Lesson_5.HomeWork.PhoneBook.service;

import Lesson_5.HomeWork.PhoneBook.model.PhoneBook;
import Lesson_5.HomeWork.PhoneBook.model.TypePB;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookService implements DataService {
    List<PhoneBook> phoneBookList = new ArrayList<>();

    @Override
    public void create(String name, String surname, Integer phoneNumber, String comment) {
        int number = getNumberContact();
        phoneBookList.add(new PhoneBook(name, surname, phoneNumber, number, comment, TypePB.TXT));
    }

    private int getNumberContact() {
        int cnt = 0;
        for (PhoneBook phoneBook : phoneBookList) {
            cnt++;
        }
        return ++cnt;
    }

    @Override
    public List<PhoneBook> readPB() {
        return phoneBookList;
    }

    @Override
    public TypePB getFormat() {
        if (!phoneBookList.isEmpty()) {
            return phoneBookList.get(0).getTypePB();
        } else
            return TypePB.TXT;

    }

    @Override
    public void changeFormat(TypePB typePB) {
        for (PhoneBook phoneBook : phoneBookList) {
            phoneBook.setTypePB(typePB);
        }
    }

}