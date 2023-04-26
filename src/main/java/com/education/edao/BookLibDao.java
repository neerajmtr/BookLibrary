package com.education.edao;
import com.education.edatabase.Book;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface BookLibDao {

    public  List<Book> display();
    public void addBook(@RequestBody List<Book> book);

    public String update(@RequestBody Book book);
    public String remove(@RequestBody Book book);

    public Book search(@RequestParam String name);
}