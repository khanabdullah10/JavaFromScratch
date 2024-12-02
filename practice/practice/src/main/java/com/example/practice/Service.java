package com.example.practice;

@org.springframework.stereotype.Service
public class Service {

    String getMessage(){
        Model model = new Model();
        return model.message;
    }

}
