package com.policyadminsystem.policyadminsystem.controller;

import com.policyadminsystem.policyadminsystem.dto.AccountOwnerDTO;
import com.policyadminsystem.policyadminsystem.service.AccountOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/account-owner")
@RequiredArgsConstructor
public class CustomerAccountOwnerController {

    private AccountOwnerService accountOwnerService;


    @GetMapping
    public AccountOwnerDTO findAccountOwnerById(@RequestParam Long id) {
        return accountOwnerService.findAccountOwnerById(id);
    }



}
