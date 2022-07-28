package com.utm.udrive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_Id")
    private Long car_Id;

    @Column(name = "nr_of_seats")
    private String nr_of_seats;

    @Column(name = "driver_id")
    private Long driver_id;

    @Column(name = "car_Name")
    private String car_name;

    public Car(){};
    public Car( String nr_of_seats, Long driver_id, String car_name) {
        this.nr_of_seats = nr_of_seats;
        this.driver_id = driver_id;
        this.car_name = car_name;
    }

    public Long getCar_Id() {
        return car_Id;
    }

    public String getNr_of_seats() {
        return nr_of_seats;
    }

    public Long getDriver_id() {
        return driver_id;
    }

    public String getCar_name() {
        return car_name;
    }
}


