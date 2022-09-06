package com.ck567.log4j2json2.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Controller {
    protected Logger logger = LogManager.getLogger(Controller.class);
    @PostConstruct
    public void init() throws Exception {

            logger.info("Initializing==========");
            Exception exception = new RuntimeException();
            throw exception;


    }
}
