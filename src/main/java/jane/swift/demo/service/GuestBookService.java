package jane.swift.demo.service;

import jane.swift.demo.domain.GuestBookEntry;
import jane.swift.demo.domain.GuestBookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GuestBookService {
    //Declare instance of GuestBookRepository
    @Autowired
    private GuestBookEntryRepository guestBookEntryRepository;
    public List<GuestBookEntry> findAllEntries (){
        return this.guestBookEntryRepository.findAll ();
    }
}
