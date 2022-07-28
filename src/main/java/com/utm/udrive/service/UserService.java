package com.utm.udrive.service;

import com.utm.udrive.controllers.model.UserDto;
import com.utm.udrive.dao.UserRepository;
import com.utm.udrive.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    UserRepository repository;

    public void addUser(UserDto userDto) {
        User user = new User(userDto.email, userDto.name, userDto.surname, userDto.address, userDto.tel, userDto.password);
        //business validation
        repository.save(user);
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        repository.findAll().forEach(users::add);
        return users;
    }

    public User getUser(String email) {
        return repository.findByEmail(email).get();
    }

    public void deleteUser(String email) {
        repository.delete(getUser(email));
    }


}
