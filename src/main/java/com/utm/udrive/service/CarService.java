package com.utm.udrive.service;

import com.utm.udrive.controllers.model.CarDto;
import com.utm.udrive.dao.CarRepository;
import com.utm.udrive.model.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    @Autowired
    CarRepository carRepository;

    public void addCar(CarDto carDto){
        Car car = new Car(carDto.nr_of_seats, carDto.driver_id, carDto.car_name);
        //business validation
        carRepository.save(car);
    }

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<Car>();
        carRepository.findAll().forEach(cars::add);
        return cars;
    }

    public Car getCar(Long id) {
        return carRepository.findById(id).get();
    }

    public void deleteCar(Long id) {
        carRepository.delete(getCar(id));
    }


}
