package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/books")
public class BookController {

  @GetMapping
  public String getBooks() {
    return "The server is running.";
  }
  @PostMapping
  public String displayBook(@RequestBody Book book) {
    return "The title of the book is " + book.getTitle();

  }
  @PutMapping("book/{id}")
  public String updateBook(@PathVariable String id, @RequestBody Book book) {
      
    book.setTitle(book.getTitle());
    return "The book with the id" + id + "is updated to " + book.getTitle();
  }
  

}
