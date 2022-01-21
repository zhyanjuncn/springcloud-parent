package com.czb.account.controller;

import com.czb.account.domain.Account;
import com.czb.account.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final static Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    @Resource
    private AccountService accountService;

    @RequestMapping("/selectList")
    public void selectList(){
        List<Account> accounts = accountService.selectList();
        LOGGER.info("accounts: {}",accounts);
    }
}
