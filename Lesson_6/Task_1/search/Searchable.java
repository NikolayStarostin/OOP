package Lesson_6.Task_1.search;

import Lesson_6.Task_1.book.Book;

import java.util.List;

public interface Searchable {
    public List<Book> booksSearchByAuthor(String author);

}