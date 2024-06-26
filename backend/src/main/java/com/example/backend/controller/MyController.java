package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Value("${databasename}")
    private String databasename;
    @RequestMapping("/")
    @ResponseBody
    public String test() {
        return "<h1>[" + databasename + "]</h1>";
    }
}
