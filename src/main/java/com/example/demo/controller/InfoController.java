package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/InfoController")
public class InfoController {


    @RequestMapping("/getHa")
    public String getHa(HttpServletRequest  request, JSONObject object) {

        System.out.println("object-----------------------------"+object);
        System.out.println("request-----------------------------"+request.getQueryString());

        if (object == null ) {
            return "没有数据";
        }

        return "hard";

    }

}
