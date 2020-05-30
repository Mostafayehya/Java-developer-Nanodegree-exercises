package com.example.springbootfreemarker.controller;

import com.example.springbootfreemarker.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Controller: creates input for template

@Controller
public class StudentList {

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Tom", 80.5));
        students.add(new Student(2, "Jerry", 90.4));
        students.add(new Student(3, "Paul", 77.5));
    }

    @RequestMapping("/studentList")
    public String getList(Model model) {

        model.addAttribute("students", students);
        return "list";
    }
}