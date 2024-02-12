package com.vsprk.demo.service;

import java.util.List;

import com.vsprk.demo.domain.Greeting;

public interface GreetingsService {
    
    public Greeting createGreeting(Greeting greeting);

    public List<Greeting> getAllGreetings();

}
