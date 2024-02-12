package com.vsprk.demo.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Document(collection = "ProductDB")
public class Greeting {
    
    @Id
    private long id;

    String content;


}
