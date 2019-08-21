package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String aboutUs(){
        return "aboutUs";
    }

    @RequestMapping("/2")
    public String index(){
        return "index";
    }

    @RequestMapping("/3")
    public String contactUs(){
        return "contactUs";
    }
}
