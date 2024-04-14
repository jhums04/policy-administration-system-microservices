package com.policyadminsystem.policyadminsystem.exception;

public class AccountOwnerNotFoundException extends RuntimeException{

    public AccountOwnerNotFoundException(String accountOwner, String fieldName, long fieldValue) {
        super(String.format("%s not found with the given input data %s: %s", accountOwner, fieldName, fieldValue));
    }
}
