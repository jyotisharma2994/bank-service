package com.example.bank.service;

import com.example.bank.model.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BaseService {
    Logger logger = LogManager.getLogger(BaseService.class);

    @Autowired
    RestTemplate restTemplate;

    @Value("${service.url}")
    String host;

    public Root getAtms(String url, String identification){
        ResponseEntity<Root> response
                = restTemplate.getForEntity(url, Root.class);
        logger.info("The response status from api call : " + response.getStatusCode());
        return response.getBody();
    }
}
