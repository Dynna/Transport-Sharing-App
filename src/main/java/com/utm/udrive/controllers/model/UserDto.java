package com.utm.udrive.controllers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Value
public class UserDto {

    public String email;
    public String name;
    public String surname;
    public String address;
    public String tel;
    public String password;

}
