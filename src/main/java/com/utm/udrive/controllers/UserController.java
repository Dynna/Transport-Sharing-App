package com.utm.udrive.controllers;


import com.utm.udrive.model.User;
import com.utm.udrive.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserSerivce serivce;

    @RequestMapping("/home")
    public String homePage(){
        return "Home Page";
    }

    @RequestMapping("/show")
    public List<User> showUsers(){
        return serivce.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addUser(@RequestBody User user){
        serivce.addUser(user);
    }


    @RequestMapping("/user/id/{email}")
    public User getUser(@PathVariable String email){
        return serivce.getUser(email);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/id/{email}")
    public void deleteUser(@PathVariable String email){
        serivce.deleteUser(email);
    }
}
