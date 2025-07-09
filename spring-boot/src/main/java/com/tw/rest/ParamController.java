package com.tw.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/params")
public class ParamController {

//    /params/hello/Shalini - not preferred for multi variables
//    @GetMapping(value = "/hello/{name}")
//    public String greet(@PathVariable String name){

    @GetMapping(value = "/hello/{pname}")
    public String greet(@PathVariable("pname") String name) {
        return "Hello " + name;
    }

    //     /params/bye?name=Shalini
    @GetMapping(value = "/bye")
    public String sayBye(@RequestParam String name) {
        return "Bye " + name;
    }


}
