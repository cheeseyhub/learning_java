package com.cheese.journalApp.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cheese.journalApp.Entries.JournalEntry;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private  Map<Long, JournalEntry> JournalEntries = new  HashMap<>();


    @GetMapping
    public List<JournalEntry> getAll() {
        return  new  ArrayList<>(JournalEntries.values());

    }
    @PostMapping
    public void addEntry(@RequestBody JournalEntry je){
        JournalEntries.put(je.getId(),je);

    }

    
}
