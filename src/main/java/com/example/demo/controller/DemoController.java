package com.example.demo.controller;

import com.example.demo.model.Brief;
import com.example.demo.service.BriefService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/api/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private BriefService service;

    @GetMapping("/accounts")
    @ResponseBody
    public List<Brief> getAccounts(@RequestParam(required = false) String usernamePart) {
        return service.findByClientId(5);
    }

}
