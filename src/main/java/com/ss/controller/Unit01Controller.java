package com.ss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("u01")
public class Unit01Controller {

    @GetMapping("/tenants")
    public String tenants(){
        return "tenants-info";
    }
}
