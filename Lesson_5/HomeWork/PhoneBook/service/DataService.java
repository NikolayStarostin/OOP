package Lesson_5.HomeWork.PhoneBook.service;

import Lesson_5.HomeWork.PhoneBook.model.PhoneBook;
import Lesson_5.HomeWork.PhoneBook.model.TypePB;

import java.util.List;

public interface DataService {
    void create(String name, String surname, Integer phoneNumber, String comment);

    List<PhoneBook> readPB();

    TypePB getFormat();

    void changeFormat(TypePB typePB);
}