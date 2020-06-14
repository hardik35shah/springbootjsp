package com.example.demojsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String helloMessage;

    @GetMapping("/")
    public String welcome(Map model) {

        model.put("message", helloMessage);

        return "welcome";
    }
}
