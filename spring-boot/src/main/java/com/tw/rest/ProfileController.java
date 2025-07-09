package com.tw.rest;

import com.tw.bean.Login;
import com.tw.bean.Profile;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

    @GetMapping(value = "/details", produces = "application/json")
    public Profile authenticate(@RequestParam String fullName, @RequestParam int age, @RequestParam(required = false) Double salary) {
           Profile profile = new Profile();
           profile.setFullName(fullName);
           profile.setAge(age);
           profile.setSalary(salary);
           return profile;
    }

    @GetMapping(value = "/jsondetails",consumes = "application/json", produces = "text/html")
    public String authenticate(@RequestBody Profile profile) {
    return profile.getFullName() + String.valueOf(profile.getAge()) + String.valueOf(profile.getSalary());
    }
}
