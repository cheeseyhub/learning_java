package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Book;

import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {
    @Autowired
    private MockMvc  mockMvc;

    @Test
    public void testGetBooks() throws Exception{
        mockMvc.perform(get("/books"))
        .andExpect(status().isOk())
        .andExpect(content().string("List of Books."));

        
    }
    @Test
    public void testDisplayBook() throws Exception{
        Book testBook = new Book();
        testBook.setTitle("Levy");
        mockMvc.perform(post("/books")
        .contentType(MediaType.APPLICATION_JSON)
        .content(new ObjectMapper().writeValueAsString(testBook)))
        .andExpect(status().isOk())
        .andExpect(content().string("The title of the book is Levy"));

    }

}
