package com.example.springbootthymeleaf.controllers;

import com.example.springbootthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    public static List<User> listOfUsers = new ArrayList<>();

  static {

      listOfUsers.add(new User(0,"mostafa",26));
      listOfUsers.add(new User(125,"AIda",57));
      listOfUsers.add(new User(2654,"GIGI",14));
      listOfUsers.add(new User(2654,"LOLII",2));
      listOfUsers.add(new User(2654,"Yehia",63));

  }
    private String convertGPA(double grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade < 90 && grade >= 80) {
            return "B";
        } else if (grade < 80 && grade >= 70) {
            return "C";
        } else if (grade < 70 && grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
  static {

  }
    @RequestMapping("demo")
    public String demo(Model model) {
        model.addAttribute("message", "Hello, World");
        double grade = 40;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));

        // return to templates/demo.html page.

        return "demo";
    }

    @RequestMapping("demo2")
    public String demo2(Model model) {
        model.addAttribute("listOfUsers",listOfUsers);

        return "demo2";
    }

    @RequestMapping("demo3")
    public String demo3(HttpServletRequest request,Model model) {

        // setting request attribute
        request.setAttribute("request" , "request data");

        // setting session attribute
        request.getSession().setAttribute("session","session data");

        // setting application attribute scope
        request.getSession().getServletContext().setAttribute("application","application data");

        return "demo2";
    }


}
