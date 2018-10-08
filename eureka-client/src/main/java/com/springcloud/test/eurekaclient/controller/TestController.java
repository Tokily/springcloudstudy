package com.springcloud.test.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    String port;
    @RequestMapping("test")
    public String test(@RequestParam(value = "name", defaultValue = "beach") String name){
        return "hello "+name+" you request port is "+port;
    }
}