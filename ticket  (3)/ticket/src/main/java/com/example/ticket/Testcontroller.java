package com.example.ticket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Testcontroller {
    @GetMapping ("/test-create-ticket")
    public String createTicketPage(){
        return "someView";
    }
}
