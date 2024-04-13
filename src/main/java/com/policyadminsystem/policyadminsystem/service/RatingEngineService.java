package com.policyadminsystem.policyadminsystem.service;


import com.policyadminsystem.policyadminsystem.entity.Vehicle;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RatingEngineService {

    public double vehiclePriceFactor(Vehicle vehicle) {
        int vehicleAge = LocalDate.now().getYear() - vehicle.getYearModel();

        if (vehicleAge == 0) {
            return 0.01;
        } else if (vehicleAge < 3) {
            return 0.008;
        } else if (vehicleAge < 5) {
            return 0.007;
        } else if (vehicleAge < 10) {
            return 0.006;
        } else if (vehicleAge < 15) {
            return 0.004;
        } else if (vehicleAge < 20) {
            return 0.002;
        } else {
            return 0.001;
        }
    }

    public double premiumCalculation(double vehiclePurchasePrice, double vpf, int driverLicenceExpiry) {
        return Double.valueOf((vehiclePurchasePrice * vpf) + ((vehiclePurchasePrice / 100) / driverLicenceExpiry));
    }

}
