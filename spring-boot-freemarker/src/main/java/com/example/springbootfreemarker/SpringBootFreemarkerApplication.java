package com.example.springbootfreemarker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SpringBootFreemarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFreemarkerApplication.class, args);
	}

}
