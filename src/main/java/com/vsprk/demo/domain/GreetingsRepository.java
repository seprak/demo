package com.vsprk.demo.domain;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GreetingsRepository extends MongoRepository<Greeting, Long> {

}
