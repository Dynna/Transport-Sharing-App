package com.utm.udrive.controllers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor
@Getter
@Value
public class CarDto {

        public Long car_Id;
        public String nr_of_seats;
        public Long driver_id;
        public String car_name;
}
