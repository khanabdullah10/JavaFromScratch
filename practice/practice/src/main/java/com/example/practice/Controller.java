package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
public class Controller {

LocalDateTime time = LocalDateTime.now();

    @Autowired
    Service service ;

    @GetMapping("/get")
    public String getMsg(){
        return service.getMessage();
    }


    @GetMapping("/hello")
    public Message getMsgg(){
        return new Message("Hello , World!",time);
    }

}
