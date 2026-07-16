package com.springboot.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This controller which controls what the API should do should. You can use multiple controller.
                    // Representational State Transfer (REST).
public class PracticeController {

    @GetMapping("/hii") // It is the endpoint of API.
    public String sayHelloHumans(){
        return "Hello Humans";
    }
}