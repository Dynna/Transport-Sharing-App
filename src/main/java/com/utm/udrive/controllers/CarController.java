package com.utm.udrive.controllers;

import com.utm.udrive.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("/car")
public class CarController {

    @Autowired
    CarService carService;


}
