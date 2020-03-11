package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    public UserController(){}


    @PostMapping("/user/login")
    public @ResponseBody String userLogin(@RequestBody String username, @RequestBody String password){
        //TODO
        return null;
    }
}
