package com.utm.udrive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

    @Id
    private String email;
    private String name;
    private String surname;
    private String address;
    private String tel;
    private String password;

    public User(String email, String name, String surname, String address, String tel, String password) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.tel = tel;
        this.password = password;
    }

    public User(){

    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public String getPassword() {
        return password;
    }
}
