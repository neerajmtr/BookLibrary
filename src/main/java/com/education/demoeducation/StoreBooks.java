package com.education.demoeducation;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StoreBooks {
    private List<String>books=new ArrayList<>();
    {
        books.add("Computer science");
        books.add("Science");
        books.add("Art");
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }


}
