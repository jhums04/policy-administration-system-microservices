package com.policyadminsystem.policyadminsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account_owner")
@Data
@Builder
public class AccountOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;


    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;
    private String address;

    public String getFullName() {
        return String.format("%s %s", getFirstName(), getFullName());
    }
}
