package com.sevia.kc.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testAll")
public class TestController {

    @GetMapping("/testString")
    public String testString(){
        return "is ok";
    }

}
