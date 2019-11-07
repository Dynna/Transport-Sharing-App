package com.utm.udrive.service.validation;

import org.springframework.stereotype.Service;

@Service
public class StructuralValidationService {


    public boolean validateEmail(String email) {
        return email.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
    }
}
