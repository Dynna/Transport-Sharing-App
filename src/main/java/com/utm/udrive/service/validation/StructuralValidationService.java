package com.utm.udrive.service.validation;

import org.springframework.stereotype.Service;

@Service
public class StructuralValidationService {

    public boolean validateEmail(String email) {
        return email.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    }

    public boolean validatePassword(String password){
        return password.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}" );
    }
    public boolean uniqueEmail(String email){
        return true;
    }
//    public  boolean validateCar(String name){
//        return name.matches("");
//    }
}
