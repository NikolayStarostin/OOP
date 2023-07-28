package Lesson_6.Task_1;

import Lesson_6.Task_1.book.Book;
import Lesson_6.Task_1.book.ElectronBook;
import Lesson_6.Task_1.formatter.Formatter;
import Lesson_6.Task_1.formatter.JSONformatter;
import Lesson_6.Task_1.genre.GenreBook;
import Lesson_6.Task_1.search.Library;

import java.util.Arrays;

public class Main {
    /**
     * a) Book - должен отвечать только за хранение информации о книге.
     * (единственная ответственность -> Single Responsibility Principle)
     * b) Genre - должен хранить информацию о жанрах книг.
     * (открыт для расширения, но закрыт для изменения -> Open-Closed Principle)
     * c) ElectronBook - должна иметь формат чтения и размер.
     * (Принцип подстановки Барбары Лисков -> Liskov Substitution Principle)
     * d) Searchable - должен производить поиск по авторам книг.
     * (Принцип разделения интерфейса -> Interface Segregation Principle)
     * e) Formatter - должен выводить информацию в различных форматах
     * (без формата,json,html) - заглушки (Принцип инверсии зависимостей ->
     * Dependency Inversion Principle)
     * 
     * @param args список книг
     */
    public static void main(String[] args) {
        Library library = new Library(Arrays.asList(
                new Book("Капитанская дочка", "Пушкин", 1836, new GenreBook("Novel")),
                new Book("Мцыри", "Лермонтов", 1840, new GenreBook("Novel")),
                new Book("Сборник", "Лермонтов", 1841, new GenreBook("Poems")),
                new ElectronBook("Сказки", "Пушкин", 2007, new GenreBook("Poems"), "pdf", 125),
                new ElectronBook("Бородино", "Лермонтов", 2012, new GenreBook("Poems"), "pdf", 200)));
        System.out.println("library.booksSearchByAuthor(\"Пушкин\") = " + library.booksSearchByAuthor("Пушкин"));
        System.out.println("library.booksSearchByAuthor(\"Лермонтов\") = " + library.booksSearchByAuthor("Лермонтов"));
        Formatter formatter = new JSONformatter();
        formatter.toFormat(library.getBooks().get(2));
    }
}