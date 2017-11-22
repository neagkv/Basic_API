package com.service;

import com.mapper.SpringInfoMapper;
import com.model.Quote;
import com.model.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class InfoService {

    //restTemplate is a built in spring class that allows for http access
    @Autowired
    RestTemplate restTemplate;

    //mapper object
    @Autowired
    SpringInfoMapper info;

    //method that takes in the JSON object from the requested url using the restTemplate, and maps it to the Quote.class
    public Quote loadQuote() {

        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);

        //uses the valueInsert method from below to populate inner JSON object
        valueInsert(quote);

        return (quote);
    }


    //takes in an object of type quote
    public void valueInsert(Quote quote) {

        //creates a value object and sets it equal to quote.getValue();
        Value v = quote.getValue();

        //if the value object is null use the mapper to get the value id
        //and insert it into the db.
        //by writing null == object instead of object == null, avoid null point exception
        if(null == info.getValueById(v.getId())) {

            info.insertValue(v);
       }
    }
}














