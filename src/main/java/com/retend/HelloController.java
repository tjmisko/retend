package com.retend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello_page";
    }
}