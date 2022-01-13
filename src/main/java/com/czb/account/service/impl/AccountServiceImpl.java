package com.czb.account.service.impl;

import com.czb.account.domain.Account;
import com.czb.account.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public List<Account> selectList() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Long id) {

    }
}
