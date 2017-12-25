package com.park.promsawat.spring.sleuth.server.example.springsleuthserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class MotorbikeFactoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MotorbikeFactoryController.class);

    @RequestMapping("/oder/{bike}")
    public String builMotorBike(@PathVariable("bike") final String bike) {
        return null;
    }
}
