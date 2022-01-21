package com.czb.account.service.impl;

import com.czb.account.domain.Account;
import com.czb.account.mapper.AccountMapper;
import com.czb.account.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Stream;

@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public List<Account> selectList() {
        List<Account> accountList = accountMapper.selectList(null);
        //Stream.of(accountList).map()
        return accountList;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Long id) {

    }
}
