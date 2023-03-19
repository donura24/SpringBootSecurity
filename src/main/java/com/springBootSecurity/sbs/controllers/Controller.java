package com.springBootSecurity.sbs.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/greetings")
public class Controller {
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello form the API!");
    }
    @GetMapping("/goodbye")
    public ResponseEntity<String> sayGoodBye(){
        return ResponseEntity.ok("Good bye!");
    }
}
