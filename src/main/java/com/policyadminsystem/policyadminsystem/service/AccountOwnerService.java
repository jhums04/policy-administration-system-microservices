package com.policyadminsystem.policyadminsystem.service;


import com.policyadminsystem.policyadminsystem.dto.AccountOwnerDTO;
import com.policyadminsystem.policyadminsystem.exception.AccountOwnerNotFoundException;
import com.policyadminsystem.policyadminsystem.mapper.CustomerAccountMapper;
import com.policyadminsystem.policyadminsystem.repository.AccountOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
}
