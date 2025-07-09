package com.tw.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {

    @GetMapping(value = "/text", produces = "text/plain")
    public String getName() {
        return "Text: Hello Shalini";
    }

    @GetMapping(value = "/html", produces = "text/html")
    public String htmlGreeting() {
        return "<h1>HTML: Hello World!</h1>";
    }

    @GetMapping(value = "/xml", produces = "text/xml")
    public String xmlGreeting() {
        return "<?xml version=\"1.0\"?><greeting>XML: Hello World!</greeting>";
    }

    @GetMapping(value = "/json", produces = "application/json")
    public String jsonGreeting() {
        return "{\"greeting\":\"Hello World!\"}";
    }

}
