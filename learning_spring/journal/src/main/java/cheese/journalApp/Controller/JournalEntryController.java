package cheese.journalApp.Controller;

import org.springframework.web.bind.annotation.RestController;

import cheese.journalApp.Entities.JournalEntry;
import cheese.journalApp.Services.JournalEntryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    JournalEntryService journalEntryService;

    @PostMapping
    public void addEntry(@RequestBody JournalEntry entity) {
        journalEntryService.add(entity);
    }
    
    
}
