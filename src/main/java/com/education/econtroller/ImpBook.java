package com.education.econtroller;
import com.education.edatabase.Book;
import com.education.edatabase.LibraryImpl;
import com.education.eservice.impl.BookLibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping("/impBook")
public class ImpBook {
    @Autowired
    public BookLibService service;

    @GetMapping("/show")
    public List<Book> display() {
        System.out.println("books in show");
      return service.display();
    }

    @GetMapping("/search")
    public Book search(@RequestParam String name) {
     return service.search(name);
    }

    /*@PostMapping("/add_new")
    public void addBook(@RequestBody Book book) {
        library.books.add(book);
    }*/
    /* @GetMapping("map")
    public Book map(@RequestParam String author) {
        Book book1 = null;
        Iterator<Book> iterator = library.books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                System.out.println("found book");
                book1 = book;
                break;
            }
        }
        return book1;
    }*/
    @PostMapping("/add1")
    public void addBook(@RequestBody List<Book> book) {
        service.addBook(book);
    }

    @PutMapping("/update")
    public String update(@RequestBody Book book) {
        return service.update(book);

    }
        @DeleteMapping("/remove")
        public String remove(@RequestBody Book book) {
        return service.remove(book);
    }}


