package com.lwy94.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liweiya
 * @date 2019/7/11 17:25
 */
@RestController
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam(value = "hello") String hello ) {
        System.out.println("hello world" + hello);
        for (int i = 0; i < 100; i++) {
            System.out.println("love u " + i + "times");
        }
        return "wooooooo" + hello;
    }
}
