package com.utm.udrive.controllers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor
@Getter
@Value
public class TripDao {
    public Long Trip_id;
    public Long Car_id;
    public String Destination;
    public String Start_location;
    public String Start_time;
}
