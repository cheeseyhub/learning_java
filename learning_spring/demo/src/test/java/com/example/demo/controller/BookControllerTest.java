package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {
    @Autowired
    private MockMvc mockMvc;



    @Test
    void testDisplayBook() throws Exception{
        mockMvc.perform(get("/books")).andExpect(status().isOk()).andExpect(content().string("List of Books."));
        

    }

    @Test
    void testGetBooks() {

    }

    @Test
    void testUpdateBook() {

    }
}
