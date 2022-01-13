package com.czb.account.service;

import com.czb.account.domain.Account;

import java.util.List;

public interface AccountService {
    Account findById(Long id);

    List<Account> selectList();

    void deleteById(Long id);

    void update(Long id);
}
