package com.example.mini.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/main")
    public String main(){
        return "aaaa/main";
    }

    @GetMapping("/movie")
    public String movie(){
        return "movie";
    }
}