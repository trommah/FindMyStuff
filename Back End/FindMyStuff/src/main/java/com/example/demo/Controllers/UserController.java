package com.example.demo.Controllers;

import org.json.JSONObject;
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
    public @ResponseBody
    JSONObject userLogin(@RequestBody JSONObject request) //Takes a JSONObject with fields "username" and "password", checks if
    {
        //TODO
        return null;
    }
}
