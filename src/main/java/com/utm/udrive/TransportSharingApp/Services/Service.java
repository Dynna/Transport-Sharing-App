package com.utm.udrive.TransportSharingApp.Services;

import com.utm.udrive.TransportSharingApp.Dao.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {


    @Autowired
    Repository repository;

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
