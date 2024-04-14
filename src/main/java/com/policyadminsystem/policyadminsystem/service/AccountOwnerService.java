package com.policyadminsystem.policyadminsystem.service;


import com.policyadminsystem.policyadminsystem.dto.AccountOwnerDTO;
import com.policyadminsystem.policyadminsystem.exception.AccountOwnerNotFoundException;
import com.policyadminsystem.policyadminsystem.mapper.CustomerAccountMapper;
import com.policyadminsystem.policyadminsystem.repository.AccountOwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountOwnerService {

    private AccountOwnerRepository accountOwnerRepository;

    public AccountOwnerDTO findAccountOwnerById(Long id) {
        return CustomerAccountMapper.accountOwnerDataToDTO(accountOwnerRepository.findById(id).orElseThrow(
                () -> new AccountOwnerNotFoundException("AccountOwner", "id", id)
        ));
    }

}
