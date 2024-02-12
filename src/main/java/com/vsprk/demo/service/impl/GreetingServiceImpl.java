package com.vsprk.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vsprk.demo.domain.Greeting;
import com.vsprk.demo.domain.GreetingsRepository;
import com.vsprk.demo.service.GreetingsService;

@Service
@Transactional
public class GreetingServiceImpl implements GreetingsService {

    @Autowired
    GreetingsRepository repo;

    @Override
    public Greeting createGreeting(Greeting greeting) {
        return repo.insert(greeting);
    }

    @Override
    public List<Greeting> getAllGreetings() {
        return repo.findAll();
    }

    
}
