package jane.swift.demo.service;

import jane.swift.demo.domain.GuestBookEntry;
import jane.swift.demo.domain.GuestBookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
public class GuestBookService {

    @Autowired
    private GuestBookEntryRepository guestBookEntryRepository;

    public List<GuestBookEntry> findAllEntries() {
        return this.guestBookEntryRepository.findAll();
    }
}

