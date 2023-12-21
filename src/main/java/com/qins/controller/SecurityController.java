package com.qins.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SecurityController {

    @RequestMapping ("/index")
    public String login(){
        return "index";
    }
}
