package com.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);
    }

    @Autowired
    private Environment env;

    @RequestMapping
    public String test() {
        return "Working on port " + env.getProperty("local.server.port");
    }

    @RequestMapping("test")
    public String test2() {
        return "HHHHHHHHHHHHHHHHh from service1 app " + env.getProperty("local.server.port");
    }
    
}
