package com.education.demoeducation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreRoom {
    @Autowired
   private StoreBooks store;
    @GetMapping("/displays")

    public List<String> displayBooks (){
        System.out.println("display books in store");
        return store.getBooks();


}}
