package com.utm.udrive.controllers;

import com.utm.udrive.controllers.model.TripDao;
import com.utm.udrive.model.Trip;
import com.utm.udrive.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {
    @Autowired
    TripService tripService;
    @RequestMapping("/show")
    public List<Trip> showCars(){
        return tripService.getTrips();
    }
    @Transactional
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addTrip(@RequestBody TripDao tripDao){
        tripService.addTrip(tripDao);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/id/{id}")
    public void deleteTrip(@PathVariable Long id){
        tripService.deleteTrip(id);
    }
}
