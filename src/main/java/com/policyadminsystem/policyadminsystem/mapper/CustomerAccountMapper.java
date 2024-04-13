package com.policyadminsystem.policyadminsystem.mapper;

import com.policyadminsystem.policyadminsystem.dto.AccountOwnerDTO;
import com.policyadminsystem.policyadminsystem.entity.AccountOwner;
import com.policyadminsystem.policyadminsystem.repository.AccountOwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
public class CustomerAccountMapper {

    @Autowired
    private static AccountOwnerRepository accountOwnerRepository;

    public static AccountOwnerDTO accountOwnerDataToDTO(AccountOwner accountOwner) {
        AccountOwnerDTO accountOwnerDTO = new AccountOwnerDTO();
        accountOwnerDTO.setId(accountOwner.getId());
        accountOwnerDTO.setAddress(accountOwner.getAddress());
        accountOwnerDTO.setFirstName(accountOwner.getFirstName());
        accountOwnerDTO.setLastName(accountOwner.getLastName());
        accountOwnerDTO.setFullName(accountOwnerDTO.getFullName());
        return accountOwnerDTO;
    }

    public static AccountOwner accountOwnerDTOtoEntity(AccountOwnerDTO accountOwnerDTO) {
        return accountOwnerRepository.findById(accountOwnerDTO.getId()).orElseThrow(
                () -> new RuntimeException("Account Owner Entity Not existing")
        );
    }
}
