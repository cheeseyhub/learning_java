package cheese.journalApp.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import cheese.journalApp.Entities.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry,String>{

}

    
