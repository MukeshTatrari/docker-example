package com.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("welcome/{id}")
    public String welcomeUser(@PathVariable String id) {
        return "hello " + id + " welcome ";
    }
}
