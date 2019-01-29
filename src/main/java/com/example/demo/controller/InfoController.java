package com.example.demo.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/InfoController")
public class InfoController {


    @RequestMapping("/getHa")
    @ResponseBody
    public String getHa(HttpServletRequest  request, String str , JSONPObject object) {

        System.out.println("object-----------------------------"+object);
        System.out.println("request-----------------------------"+request.getQueryString());

        if (object == null ) {
            return "没有数据";
        }

        return object.toString();

    }

}
