package com.example.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/security/")
public class DemoController {
    @GetMapping("/one")
    public String getDemoOne() {
    	return ("<h1>Spring Securit Demo one</h1>");
    }
    @GetMapping("/two")
    public String getDemoTwo() {
    	return ("<h2>Spring Securit Demo two</h2>");
    }
    @GetMapping("/three")
    public String getDemoThree() {
    	return ("<h3>Spring Securit Demo three</h3>");
    }
    @GetMapping("/four")
    public String getDemoFour() {
    	return ("<h4>Spring Securit Demo four</h4>");
    }
    
}
