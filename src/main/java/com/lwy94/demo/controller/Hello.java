package com.lwy94.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

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
            System.out.println("change one times.");
        }

        int[] arr = {1,43,455,2,42,5,12,2,41,4,14};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return "wooooooo" + hello;
    }
}
