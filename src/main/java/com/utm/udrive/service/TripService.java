package com.utm.udrive.service;

import com.utm.udrive.controllers.model.TripDao;
import com.utm.udrive.dao.TripRepository;
import com.utm.udrive.model.Trip;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TripService {
    @Autowired
    TripRepository tripRepository;

    public void addTrip(TripDao tripDao) {
        Trip trip = new Trip(tripDao.Car_id, tripDao.Destination, tripDao.Start_location, tripDao.Start_time);
        tripRepository.save(trip);
    }

    public List<Trip> getTrips() {
        List<Trip> cars = new ArrayList<Trip>();
        tripRepository.findAll().forEach(cars::add);
        return cars;
    }
    public Trip getTrip(Long id) {
        return tripRepository.findById(id).get();
    }

    public void deleteTrip(Long id) {
        tripRepository.delete(getTrip(id));
    }

}
