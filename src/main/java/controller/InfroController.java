package controller;

import model.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.InfoService;







@RestController
public class InfroController {

    @Autowired
    InfoService infoService;

    @RequestMapping("/info")
    public Value loadInfo()  {
        return infoService.loadValue();
    }


}
