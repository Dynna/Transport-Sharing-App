package com.utm.udrive.TransportSharingApp.Services;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Users")
public class User {
    @Id
    private String email;
    private String password;
    private String name;
    private String surname;

    public User() {
    }

    public User(String email, String password, String name, String surname) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
