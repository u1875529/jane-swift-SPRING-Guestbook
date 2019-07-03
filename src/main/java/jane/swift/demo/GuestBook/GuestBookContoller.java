package jane.swift.demo.GuestBook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GuestBookContoller {

    @GetMapping ("/")
    public String testMapping (){
        return "Hello, World";
    }
}
