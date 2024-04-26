package com.run.api.domain.users.controller;

import com.run.api.domain.users.service.AccountService;
import com.run.api.global.dto.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    @GetMapping("/user")
    public List<Account> user() {
        return accountService.getAccountList();
    }
}
