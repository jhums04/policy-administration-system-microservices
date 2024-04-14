package com.policyadminsystem.policyadminsystem.controller;

import com.policyadminsystem.policyadminsystem.dto.AccountOwnerDTO;
import com.policyadminsystem.policyadminsystem.service.AccountOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account-owner")
public class CustomerAccountOwnerController {

    @Autowired
    private AccountOwnerService accountOwnerService;


    @GetMapping
    public AccountOwnerDTO findAccountOwnerById(@RequestParam Long id) {
        return accountOwnerService.findAccountOwnerById(id);
    }



}
