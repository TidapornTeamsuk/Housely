package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class MyController {

    @GetMapping("/greeting")
    public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        ModelAndView mav = new ModelAndView("greeting"); // ชื่อของ HTML template
        mav.addObject("name", name);
        return mav;
    }
}
