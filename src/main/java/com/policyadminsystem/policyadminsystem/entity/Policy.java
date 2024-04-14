package com.policyadminsystem.policyadminsystem.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@Table(name = "policy")
public class Policy {


    @OneToOne
    @JoinColumn(name = "account_owner_id")
    private AccountOwner accountOwner;

    @Id
    private Long id;

    private LocalDate effectiveDate;
    private LocalDate expiryDate;


    @OneToMany(mappedBy = "policy")
    private List<PolicyHolder> policyHolder;

    @ManyToOne
    @JoinColumn(name = "customer_account_id")
    private CustomerAccount customerAccount;



}
