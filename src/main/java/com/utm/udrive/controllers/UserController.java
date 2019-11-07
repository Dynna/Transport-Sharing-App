package com.utm.udrive.controllers;


import com.utm.udrive.controllers.model.UserDto;
import com.utm.udrive.model.User;
import com.utm.udrive.service.UserService;
import com.utm.udrive.service.validation.StructuralValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    StructuralValidationService structuralValidationService;

    @RequestMapping("/home")
    public String homePage(){
        return "Home Page";
    }

    @RequestMapping("/show")
    public List<User> showUsers(){
        return userService.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addUser(@RequestBody UserDto userDto){
        userService.addUser(userDto);
    }

    @RequestMapping("/{email}")
    public ResponseEntity<?> getUser(@PathVariable String email){
        if (structuralValidationService.validateEmail(email)) {
            return new ResponseEntity<>(userService.getUser(email), HttpStatus.OK);
        } else return new ResponseEntity<>(email, HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/id/{email}")
    public void deleteUser(@PathVariable String email){
        userService.deleteUser(email);
    }
}
