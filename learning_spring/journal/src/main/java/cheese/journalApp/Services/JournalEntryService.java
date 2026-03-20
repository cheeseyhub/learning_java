package cheese.journalApp.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cheese.journalApp.Entities.JournalEntry;
import cheese.journalApp.Repositories.JournalEntryRepository;



@Component
public class JournalEntryService {

    @Autowired
    JournalEntryRepository journalEntryRepository;

    public void add(JournalEntry entry)
    {
        journalEntryRepository.insert(entry);
    }
    
}
