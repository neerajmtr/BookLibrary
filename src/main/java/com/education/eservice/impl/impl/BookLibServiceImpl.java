package com.education.eservice.impl.impl;

import com.education.edao.BookLibDao;
import com.education.edatabase.Book;
import com.education.edatabase.LibraryImpl;
import com.education.eservice.impl.BookLibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public  class BookLibServiceImpl implements BookLibService {

    @Autowired
    BookLibDao bookDao;

    @Override
    public List<Book> display() {
        return bookDao.display();
    }

    @Override
    public void addBook(List<Book> book) {
        bookDao.addBook(book);

    }

    @Override
    public String update(Book book) {
        return bookDao.update(book);
    }

    @Override
    public String remove(Book book) {
        return bookDao.remove(book);
    }

    @Override
    public Book search(String name) {
        return bookDao.search(name);
    }

}
