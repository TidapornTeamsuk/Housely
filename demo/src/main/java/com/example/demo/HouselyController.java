package com.example.demo;



@Controller
public class HouselyController {

    @GetMapping("/")
    public String getMethodName() {
        return "index";
    }
    
    
}
