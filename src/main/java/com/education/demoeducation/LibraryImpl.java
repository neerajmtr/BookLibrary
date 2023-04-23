package com.education.demoeducation;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Component
public class LibraryImpl {

    List<Book> books = new ArrayList<>();
    public LibraryImpl() { /*this is collection of books*/
        Book b = new Book("Computer graphic", " Joshua Isaac ", 303061602, 4600);
        Book b1 = new Book("Lost in math", "Sabine", 32061602, 5000);
        Book b2 = new Book("Quantum physics", "Einstein,bohr", 3030000, 3000);
        books.add(b);
        books.add(b1);
        books.add(b2);
    }

    public List<Book> showAll() {
        return books;


    }
}
