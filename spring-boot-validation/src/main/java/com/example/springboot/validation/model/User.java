package com.example.springboot.validation.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
public class User {

    @NotBlank(message = "username cannot be empty")
    private String name;
    @NotBlank(message="password can not be empty")
    @Length(min = 6, max = 10,message = "Password length must be between 6 and 10 characters")
    private String password;
    @Min(0)
    @Max(100)
    private Double grade;
    @Email(message = "Email has incorrect format")
    private String Email;

    public User(){}

    public User( String name, String password, Double grade, String email) {
        this.name = name;
        this.password = password;
        this.grade = grade;
        Email = email;
    }

    public User(String name, String password, Double grade) {
        this.name = name;
        this.password = password;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

