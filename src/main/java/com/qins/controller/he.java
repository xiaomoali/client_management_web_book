package com.qins.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class he {

    @GetMapping("/he")
    public String hello(){
        return "ok";
    }
}