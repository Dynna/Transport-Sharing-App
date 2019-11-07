package com.utm.udrive.service;

import com.utm.udrive.dao.UserRepository;
import com.utm.udrive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSerivce {
    @Autowired
    UserRepository repository;


    public void addUser(User user){
        repository.save(user);
    }

    public List<User> getUsers(){
        List<User> users = new ArrayList<User>();
        repository.findAll().forEach(users :: add);
        return users;
    }

    public User getUser(String email){
        List<User> users = getUsers();
        for(User user : users){
            if(user.getEmail().equals(email)) return user;
        }
        return null;
    }

    public void deleteUser(String email){
        repository.delete(getUser(email));
    }


}
