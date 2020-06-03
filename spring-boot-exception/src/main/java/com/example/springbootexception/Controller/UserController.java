package com.example.springbootexception.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/add")
    public String add(){
        int num = 10/0;
        return "add";
    }
    @RequestMapping("/update")
    public String update(){
        String word = null;
        word.toUpperCase();
        return "update";
    }
}
