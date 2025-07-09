package com.tw.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greeting")
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayGetHello(){
        return "Get: Hello World!";
    }

    @PutMapping(value = "/hello")
    public String sayPutHello(){
        return "Put: Hello World!";
    }

    @PostMapping(value = "/hello")
    public String sayPostHello(){
        return "Post: Hello World!";
    }

    @DeleteMapping(value = "/hello")
    public String sayDeleteHello(){
        return "Delete: Hello World!";
    }

}
