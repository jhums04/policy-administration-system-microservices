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
    @GetMapping()
    public List<AccountOwnerDTO> findAccountOwners() {
        return accountOwnerService.findAll();
    }



}
