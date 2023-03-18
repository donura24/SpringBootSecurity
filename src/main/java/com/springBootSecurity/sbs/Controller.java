package com.springBootSecurity.sbs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class Controller {
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello form the API!");
    }
    @GetMapping
    public ResponseEntity<String> sayGoodBye(){
        return ResponseEntity.ok("Good bye!");
    }
}
