package com.policyadminsystem.policyadminsystem.entity;


import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
public class Policy {

    private AccountOwner accountOwner;

    private Long id;

    private LocalDate effectiveDate;
    private LocalDate expiryDate;

    private List<PolicyHolder> policyHolder;


}
