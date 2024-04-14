package com.policyadminsystem.policyadminsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account_owner")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long account_owner_id;


    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;
    private String address;

}
