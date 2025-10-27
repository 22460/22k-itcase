package com.xys.service.impl;

import com.xys.dao.AccountDao;
import com.xys.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
//        int i = 1 / 0;
        accountDao.inMoney(in, money);
    }
}
