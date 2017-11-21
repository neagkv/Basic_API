package service;

import model.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class InfoService {

    @Autowired
    RestTemplate restTemplate;


    public Value loadValue() {

        Value value = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Value.class);

        return(value);


    }
}
