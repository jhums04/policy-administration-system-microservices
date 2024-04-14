package com.policyadminsystem.policyadminsystem.entity;

import com.policyadminsystem.policyadminsystem.enums.CarType;
import com.policyadminsystem.policyadminsystem.enums.FuelType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Vehicle {

    @Id
    private Long id;

    private String make;
    private String model;
    private int yearModel;
    private double purchasePrice;
    private String plateNumber;
    private String color;
    private long premiumCharged;

    private CarType carType;

    private FuelType fuelType;
}
