package com.run.api.domain.users.service;

import com.run.api.global.dao.AccountMapper;
import com.run.api.global.dto.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountMapper accountMapper;

    @Override
    public List<Account> getAccountList() {
        return accountMapper.getUserList();
    }
}
