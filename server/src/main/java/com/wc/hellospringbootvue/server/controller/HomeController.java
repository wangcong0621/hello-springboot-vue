package com.wc.hellospringbootvue.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/getdata")
    @ResponseBody
    public String getData() {
        return "Hello springboot vue!";
    }
}
