package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/accounts")
    @ResponseBody
    public String getAccounts(@RequestParam(required = false) String usernamePart) {
        return "Hello";
    }

}
