package com.vsprk.demo.api;

import org.springframework.web.bind.annotation.RestController;

import com.vsprk.demo.domain.Greeting;
import com.vsprk.demo.service.GreetingsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class DemoService {
    
    @Autowired 
    private GreetingsService greetingsService;

    @GetMapping("/hello")
    public String getHello(@RequestParam(required = false, defaultValue = "Vladimir") String param) {
        return new String("Hello! " + param);
    }

    @PostMapping("/greetings")
    public ResponseEntity<Greeting> postMethodName(@RequestBody Greeting entity) {
        return ResponseEntity.ok().body(this.greetingsService.createGreeting(entity));
    }

    @GetMapping("/greetings")
    public ResponseEntity < List < Greeting >> getGreetings() {
        return ResponseEntity.ok().body(this.greetingsService.getAllGreetings());
    }
    
    
    
}
