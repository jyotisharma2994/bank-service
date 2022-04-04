package com.example.bank.controller;

import com.example.bank.service.BaseService;
import com.example.bank.model.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/base")
public class BaseController {

    Logger logger = LogManager.getLogger(BaseService.class);

    @Autowired
    BaseService baseService;

    @GetMapping("/atm")
    public Root getAtms(
            @RequestParam String url,
            @RequestParam String identification) {
        logger.info("The request has landed on controller");
        return baseService.getAtms(url,identification);
    }
}
