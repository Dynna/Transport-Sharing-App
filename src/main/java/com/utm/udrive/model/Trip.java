package com.utm.udrive.model;

import javax.persistence.*;

@Entity
@Table(name = "Trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Trip_Id")
    private Long Trip_Id;

    @Column(name = "Car_id")
    private  Long Car_id;

    @Column(name = "Destination")
    private String Destination;

    @Column(name = "Start_location")
    private String Start_location;

    @Column(name = "Start_time")
    private String Start_time;

    public Trip(){};

    public Trip(Long car_id, String destination, String start_location, String start_time) {
//        Trip_Id = trip_Id;
        Car_id = car_id;
        Destination = destination;
        Start_location = start_location;
        Start_time = start_time;
    }

    public Long getTrip_Id() {
        return Trip_Id;
    }

    public Long getCar_id() {
        return Car_id;
    }

    public String getDestination() {
        return Destination;
    }

    public String getStart_location() {
        return Start_location;
    }

    public String getStart_time() {
        return Start_time;
    }

}
