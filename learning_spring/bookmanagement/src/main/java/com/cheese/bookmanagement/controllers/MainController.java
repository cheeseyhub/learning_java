package com.cheese.bookmanagement.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cheese.bookmanagement.Entities.BookEntitiy;

@RestController
@RequestMapping("/book")
public class MainController {


    private HashMap<Long,BookEntitiy>  books = new HashMap<>();



    @GetMapping
    public ArrayList<BookEntitiy> getAllBooks() {
        return new ArrayList<BookEntitiy>(books.values());
    }
    @PostMapping
    public void addBook(@RequestBody BookEntitiy book) {
        books.put(book.getId(), book);
    }
    @PutMapping
    public void updateBook(@RequestBody BookEntitiy book)
    {
        books.put(book.getId(), book);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id)
    {
        books.remove(id);
    }

}
