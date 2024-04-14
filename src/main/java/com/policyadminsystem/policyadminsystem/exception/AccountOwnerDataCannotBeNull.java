package com.policyadminsystem.policyadminsystem.exception;

public class AccountOwnerDataCannotBeNull extends RuntimeException{

    public AccountOwnerDataCannotBeNull(String accountOwner, String fieldName, long fieldValue) {
        super(String.format("%s not found with the given input data %s: %s", accountOwner, fieldName, fieldValue));
    }

    public AccountOwnerDataCannotBeNull(String accountOwner, String fieldName1,String fieldName2) {
        super(String.format("Cannot Create %s given input data %s: %s as null", accountOwner, fieldName1, fieldName2));
    }
}
