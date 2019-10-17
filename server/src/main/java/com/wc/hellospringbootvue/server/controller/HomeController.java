package com.wc.hellospringbootvue.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/getdata")
    public String getData() {
        return "Hello springboot vue!";
    }
}
