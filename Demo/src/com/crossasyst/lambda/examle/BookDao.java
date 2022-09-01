package com.crossasyst.lambda.examle;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(102, "Hibernate", 400));
        books.add(new Book(103, "WebServices", 400));
        return books;
    }

}
