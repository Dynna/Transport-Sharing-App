package com.utm.udrive.TransportSharingApp.Controlers;

import com.utm.udrive.TransportSharingApp.Services.Service;
import com.utm.udrive.TransportSharingApp.Services.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controler {

    @Autowired
    private Service service;

    @RequestMapping("/home")
    public String homePage(){
        return "Home Page";
    }

    @RequestMapping("/show")
    public List<User> showUsers(){
        return service.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @RequestMapping("/user/id/{email}")
    public User getUser(@PathVariable String email){
        return service.getUser(email);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/id/{email}")
    public void deleteUser(@PathVariable String email){
        service.deleteUser(email);
    }
}
