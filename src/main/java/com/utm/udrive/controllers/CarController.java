package com.utm.udrive.controllers;

import com.utm.udrive.controllers.model.CarDto;
import com.utm.udrive.model.Car;
import com.utm.udrive.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @RequestMapping("/show")
    public List<Car> showCars(){
        return carService.getCars();
    }

    @Transactional
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addCar(@RequestBody CarDto carDto){
        carService.addCar(carDto);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/id/{id}")
    public void deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
    }
}
