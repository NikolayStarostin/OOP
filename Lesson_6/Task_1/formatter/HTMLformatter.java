package Lesson_6.Task_1.formatter;

import Lesson_6.Task_1.book.Book;

public class HTMLformatter implements Formatter {
    @Override
    public Formatter toFormat(Book book) {
        System.out.println("Форматируется " + book + " в HTML");
        return null;
    }
}