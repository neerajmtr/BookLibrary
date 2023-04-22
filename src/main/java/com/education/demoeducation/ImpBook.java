package com.education.demoeducation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping("/impBook") //my final commit
public class ImpBook {
    @Autowired
    public LibraryImpl library;

    @GetMapping("/show")
    public List<Book> showAll() {
        System.out.println("books in show");
        return library.showAll();
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
        library.books.addAll(book);
   }

    @PutMapping("/update")
    public String update(@RequestBody Book book) {
        ListIterator<Book> iterator= library.books.listIterator();
        while(iterator.hasNext()){
            Book val = iterator.next();
            if(val.getName().equals(book.getName())){
                /* iterator.set(book);*/
               library.books.remove(val);
                library.books.add(book);
           /*     iterator.remove();
                iterator.add(book);*/
              /*  val.setId(book.getId());
                val.setAuthor(book.getAuthor());
                val.setPrice(book.getPrice());*/
                break;
            }
        }
     return "book update";
    }
    @DeleteMapping("/remove")
    public String remove(@RequestBody Book book) {
        ListIterator<Book>item=library.books.listIterator();
        library.books.remove(book);
    /*    while (item.hasNext()){
            Book net = item.next();
            if(net.getName().equals(book.getName())){
                library.books.remove(net);

                //                item.remove();
                break;
            }
        }*/
        return "book deleted";
    }

    @GetMapping("/search")
    public Book search(@RequestParam String name) {
        Book book1 = null;
        Iterator<Book> iterator = library.books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("found book");
                book1 = book;
                break;
            }
        }
        return book1;


    }
}


