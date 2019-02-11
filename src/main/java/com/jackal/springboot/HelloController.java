package com.jackal.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@EnableAutoConfiguration
@Controller(value = "org.springframework.stereotype.Controller.HelloController")
@RequestMapping(value = "myHello")
public class HelloController {

    @RequestMapping(value = "hello")
    @ResponseBody
    public String hello() {
        return "Hello SpringBoot!";
    }
}
