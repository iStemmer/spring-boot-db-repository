package com.example.demo.controller;

import com.example.demo.model.Brief;
import com.example.demo.service.BriefService;
import com.example.demo.to.BriefTo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class BriefController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    //https://habr.com/ru/post/438808/

    @Autowired
    private BriefService service;

    @GetMapping("/briefs")
    @ResponseBody
    public Page<Brief> getBriefs(@RequestParam(defaultValue = "0") Integer pageNo,
                                 @RequestParam(defaultValue = "10") Integer pageSize,
                                 @RequestParam(defaultValue = "id") String sortBy) {
        return service.findAllPage(pageNo, pageSize, sortBy);
    }

    @PostMapping("/briefs")
    @ResponseBody
    public Brief saveBrief(@RequestBody Brief brief){
        //service.update(brief);
        return brief;
    }

}
