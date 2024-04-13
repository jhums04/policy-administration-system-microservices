package com.policyadminsystem.policyadminsystem.entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Builder
public class PolicyHolder {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String address;
    private String licenseNumber;
    private LocalDate licensedIssuedDate;
    private AccountOwner accountOwner;

    private Integer driverLicenseExpiry;



    public void setDriverLicenseExpiry() {
        this.driverLicenseExpiry = LocalDate.now().getYear() + 1 - getLicensedIssuedDate().getYear();
    }
}
