package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/InfoController")
public class InfoController {


    @RequestMapping("/getHa")
    public String getHa(HttpServletRequest  request) {
        System.out.println("-----------------------------"+request.getQueryString());
        return "hard";

    }

}
