package com.example.datefinder;

import java.time.format.DateTimeFormatter;  
import java.time.*;
import java.time.LocalDateTime;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String todayDate(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateAfter100Days = now.plusDays(100);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        return dtf.format(dateAfter100Days);
    }
}
