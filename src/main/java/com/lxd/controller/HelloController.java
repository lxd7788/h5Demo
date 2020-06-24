package com.lxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "world") String name) {
        request.setAttribute("name", name);
        return "index";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add() {
        System.out.println("add请求收到了");
        return "{'sss':'qq'}";
    }

}
