package com.controller;

import com.model.Value;
import com.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.InfoService;







@RestController
public class InfroController {

    @Autowired
    InfoService infoService;

    //maps /info to the http:// request
    @RequestMapping("/info")
    public Quote loadInfo()  {
        return infoService.loadQuote();
    }



}
