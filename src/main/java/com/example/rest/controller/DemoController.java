package com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
    @RequestMapping("/demo")
    public String home() {
        return "Hello Docker Demo";
    }	
}
