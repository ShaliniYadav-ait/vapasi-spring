package com.tw.rest;

import com.tw.bean.Login;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    // passing details in query parameters
    @GetMapping(value = "/auth", produces = "text/html")
    public String authenticate(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (username.equals("shalini") && password.equals("12345")) {
            return "<h1>Login Success!</h1>";
        } else {
            return "<h1>Login Failed!</h1>";
        }
    }

    // passing details in a json object
    @GetMapping(value = "/auth2", consumes = "application/json", produces = "text/html")
    public String authenticate(@RequestBody Login login) {
        if (login.getUsername().equals("shalini") && login.getPassword().equals("12345")) {
            return "<h1>Login Success!</h1>";
        } else {
            return "<h1>Login Failed!</h1>";
        }
    }
}
