package com.policyadminsystem.policyadminsystem.service;


import com.policyadminsystem.policyadminsystem.dto.AccountOwnerDTO;
import com.policyadminsystem.policyadminsystem.entity.AccountOwner;
import com.policyadminsystem.policyadminsystem.exception.AccountOwnerDataCannotBeNull;
import com.policyadminsystem.policyadminsystem.exception.AccountOwnerNotFoundException;
import com.policyadminsystem.policyadminsystem.mapper.CustomerAccountMapper;
import com.policyadminsystem.policyadminsystem.repository.AccountOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AccountOwnerService {


    @Autowired
    private AccountOwnerRepository accountOwnerRepository;

    public AccountOwnerDTO findAccountOwnerById(Long id) {
        return CustomerAccountMapper.accountOwnerDataToDTO(accountOwnerRepository.findById(id).orElseThrow(
                () -> new AccountOwnerNotFoundException("AccountOwner", "id", id)
        ));
    }

    public List<AccountOwnerDTO> findAll() {
        return accountOwnerRepository.findAll().isEmpty() ?
                Collections.emptyList() :
                accountOwnerRepository.findAll()
                        .stream()
                        .map(accountOwner -> CustomerAccountMapper.accountOwnerDataToDTO(accountOwner))
                        .toList();
    }

    public AccountOwnerDTO createNewOwner(AccountOwnerDTO accountOwnerDTO) {
        if (accountOwnerDTO.getFirstName().equals(null) && accountOwnerDTO.getLastName().equals(null))
            throw new AccountOwnerDataCannotBeNull("Account owner", "firstName", "lastName");

        if (accountOwnerDTO.getFirstName().equals(null))
            throw new AccountOwnerDataCannotBeNull("Account owner", "firstname", accountOwnerDTO.getFirstName());

        if (accountOwnerDTO.getLastName().equals(null))
            throw new AccountOwnerDataCannotBeNull("Account owner", "lastName", accountOwnerDTO.getLastName());

        AccountOwner accountOwner = CustomerAccountMapper.accountOwnerDTOtoData(accountOwnerDTO);
        return CustomerAccountMapper.accountOwnerDataToDTO(accountOwnerRepository.save(accountOwner));
    }

    public String deleteAll() {
        accountOwnerRepository.deleteAll();
        return "Deleted all account owners";
    }

    public String deleteAccountOwnerById(Long id) {
        accountOwnerRepository.findById(id).orElseThrow(
                () -> new AccountOwnerNotFoundException("Account owner", "id", id)
        );
        accountOwnerRepository.deleteById(id);
        return String.format("Account owner with id: %d deleted successfully", id);
    }
}
