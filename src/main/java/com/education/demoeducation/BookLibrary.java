package com.education.demoeducation;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lib")
public class BookLibrary {
    @GetMapping("/display")
    public List<String> displayBooks() {
        System.out.println("display books in lib");
        return LibBooks.books;
    }

    @PostMapping("/add/{book}")
    public void addBook(@PathVariable String book) {
        LibBooks.books.add(book);
    }

    @PutMapping("/update")
    public String updateBook(@RequestParam String book){
        LibBooks.books.remove(1);
        LibBooks.books.add(1,book);
        return "book has been updated";
    }
/*    @PutMapping("/update")
    public String updateBook(@RequestParam String oldBook,@RequestParam String newBook){
        LibBooks.books.remove(oldBook);
        LibBooks.books.add(newBook);
        return "book update";
    }*/
@DeleteMapping("/remove")
    public String removeBook(@RequestParam String book){
        LibBooks.books.indexOf(2);
        LibBooks.books.remove(book);
        return "book has been deleted";


}}
