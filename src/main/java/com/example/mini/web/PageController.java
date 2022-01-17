package com.example.mini.web;

import com.example.mini.config.auth.LoginUser;
import com.example.mini.config.auth.SessionUser;
import com.example.mini.config.auth.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
//    @GetMapping("/")
//    public String index(Model model, @LoginUser SessionUser user, @AuthenticationPrincipal UserDetailsImpl userDetails) {
//        if (user != null) {
//            model.addAttribute("username", user.getName());
//        } else if(userDetails != null) {
//            model.addAttribute("username", userDetails.getUsername());
//        }
//        return "index";
//    }
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/movie")
    public String movie(){
        return "movie";
    }
}