package com.education.edao;
import com.education.edatabase.Book;
import com.education.edatabase.LibraryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Repository
public class BookLibDaoImpl implements BookLibDao{
    @Autowired
    public LibraryImpl library;
    @Override
    public List<Book> display() {
        System.out.println("display successfully");
        return library.books;

        }

    @Override
    public void addBook(List<Book> book) {
        System.out.println("Add book successfully");
        library.books.addAll(book);
    }

    @Override
    public String update(Book book) {
        ListIterator<Book> iterator= library.books.listIterator();
        while(iterator.hasNext()){
            Book val = iterator.next();
            if(val.getName().equals(book.getName())){
                library.books.remove(val);
                library.books.add(book);
            /*
                iterator.set(book);
                iterator.remove();
                iterator.add(book);
                  val.setId(book.getId());
                val.setAuthor(book.getAuthor());
                val.setPrice(book.getPrice());*/
                break;
            }
            System.out.println("book update successfully");
        }
        return "book update";
    }

    @Override
    public String remove(Book book) {
        ListIterator<Book> item = library.books.listIterator();
        library.books.remove(book);
     /*   while (item.hasNext()) {
            Book net = item.next();
            if (net.getName().equals(book.getName())) {
                library.books.remove(net);
                //                item.remove();
            }
            break;*/
               System.out.println("book deleted successfully");
    return "book deleted";
}

    @Override
    public Book search(String name) {
        Book book1 = null;
        Iterator<Book> iterator = library.books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("found book");
                book1 = book;
                break;
            }
            System.out.println("book searched successfully");
        }

        return book1;
    }
    }




