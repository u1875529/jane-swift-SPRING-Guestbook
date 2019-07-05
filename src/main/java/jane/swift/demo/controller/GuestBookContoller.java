package jane.swift.demo.controller;

import jane.swift.demo.domain.GuestBookEntry;
import jane.swift.demo.service.GuestBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public class GuestBookContoller {

    @Autowired
    private GuestBookService guestBookService;
    @GetMapping ("/")
    public List <GuestBookEntry> testMapping (){
        return guestBookService.findAllEntries();
    }
}
