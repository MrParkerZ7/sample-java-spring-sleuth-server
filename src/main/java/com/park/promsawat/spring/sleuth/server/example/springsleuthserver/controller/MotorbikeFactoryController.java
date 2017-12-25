package com.park.promsawat.spring.sleuth.server.example.springsleuthserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class MotorbikeFactoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MotorbikeFactoryController.class);

    @GetMapping("/order/{bike}")
    public String buildMotorBike(@PathVariable("bike") final String bike) {

        if (bike.equals("BMW"))
            return "S1000RR";
        else if (bike.equals("Kawasaki"))
            return "ZX10R";
        else if (bike.equals("Honda"))
            return "CBR1000RR";
        else if (bike.equals("Yamaha"))
            return "R1";
        else
            return "No bike for you";
    }
}
