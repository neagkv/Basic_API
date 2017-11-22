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

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    SpringInfoMapper info;

    public Quote loadQuote() {

        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);

        valueInsert(quote);

        return (quote);
    }



    public void valueInsert(Quote quote) {

        int id = 0;

        Value v = quote.getValue();

            int success =info.insertValue(v);
    }
}














