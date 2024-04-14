package com.policyadminsystem.policyadminsystem.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Builder
@Table(name = "policy_holder")
public class PolicyHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long policy_holder_id;

    @OneToOne
    @JoinColumn(name = "account_owner_id")
    private AccountOwner accountOwner;

    private String firstName;
    private String lastName;

    @Column(columnDefinition = "DATE")
    private LocalDate dateOfBirth;
    private String address;
    private String licenseNumber;

    @Column(columnDefinition = "DATE")
    private LocalDate licensedIssuedDate;
    private int driverLicenseExpiry;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

}
