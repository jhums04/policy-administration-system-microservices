package com.policyadminsystem.policyadminsystem.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AccountOwnerDTO {

    public Long id;
    private String firstName;
    private String lastName;
    private String address;

    private String fullName;
}
