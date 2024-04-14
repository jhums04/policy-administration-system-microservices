package com.policyadminsystem.policyadminsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "customer_account")
public class CustomerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customer_account_id;

    @ManyToOne
    @JoinColumn(name = "account_owner_id")
    private AccountOwner accountOwner;

    @OneToMany(mappedBy = "customerAccount")
    private List<Policy> policies;




}
