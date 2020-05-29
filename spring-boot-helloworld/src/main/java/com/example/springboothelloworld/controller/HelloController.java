package com.example.springboothelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private Map<String,Object> result = new HashMap<>();

    @RequestMapping("/hello")
    public Map<String,Object> hello(){
        result.put("name","Stephan");
        result.put("city","Bani Mansour");

        return result;

    }
}
