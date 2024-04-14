package com.policyadminsystem.policyadminsystem.mapper;

import com.policyadminsystem.policyadminsystem.dto.AccountOwnerDTO;
import com.policyadminsystem.policyadminsystem.entity.AccountOwner;
import com.policyadminsystem.policyadminsystem.exception.AccountOwnerNotFoundException;
import com.policyadminsystem.policyadminsystem.repository.AccountOwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
public class CustomerAccountMapper {

    @Autowired
    private static AccountOwnerRepository accountOwnerRepository;

    public static AccountOwnerDTO accountOwnerDataToDTO(AccountOwner accountOwner) {
        AccountOwnerDTO accountOwnerDTO = new AccountOwnerDTO();
        accountOwnerDTO.setId(accountOwner.getAccount_owner_id());
        accountOwnerDTO.setAddress(accountOwner.getAddress());
        accountOwnerDTO.setFirstName(accountOwner.getFirstName());
        accountOwnerDTO.setLastName(accountOwner.getLastName());
        return accountOwnerDTO;
    }
}
