package com.didispace.chapter11;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        System.out.println("test create a pull request");
        return "Hello World";
    }

}