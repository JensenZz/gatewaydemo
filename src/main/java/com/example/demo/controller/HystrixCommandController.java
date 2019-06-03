package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j(topic = "access")
public class HystrixCommandController {


    @RequestMapping("/hystrixTimeout")
    public String hystrixTimeout() {
        return "request time out";
    }
}
