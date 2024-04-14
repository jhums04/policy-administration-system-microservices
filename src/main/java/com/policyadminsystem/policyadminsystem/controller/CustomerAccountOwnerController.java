package com.policyadminsystem.policyadminsystem.controller;

import com.policyadminsystem.policyadminsystem.dto.AccountOwnerDTO;
import com.policyadminsystem.policyadminsystem.service.AccountOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account-owner")
public class CustomerAccountOwnerController {

    @Autowired
    private AccountOwnerService accountOwnerService;


    @GetMapping("/{id}")
    public AccountOwnerDTO findAccountOwnerById(@PathVariable("id") Long id) {
        return accountOwnerService.findAccountOwnerById(id);
    }
    @GetMapping
    public List<AccountOwnerDTO> findAccountOwners() {
        return accountOwnerService.findAll();
    }

    @PostMapping
    public AccountOwnerDTO createAccountOwner(@RequestBody AccountOwnerDTO accountOwnerDTO) {
        return accountOwnerService.createNewOwner(accountOwnerDTO);
    }

    @DeleteMapping("/delete-all")
    public String deleteAllAccountOwners() {
        return accountOwnerService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public String deleteAccountOwnerById(@PathVariable Long id) {
        return accountOwnerService.deleteAccountOwnerById(id);
    }

    @PutMapping("/{id}")
    public AccountOwnerDTO updateAccountOwnerInfoById(@RequestBody AccountOwnerDTO accountOwnerDTO) {
        return accountOwnerService.updateAccountOwnerInfoById(accountOwnerDTO);
    }



}
