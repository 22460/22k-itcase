package com.xys.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    /**
     * 转账操作
     * @Param out 传出方
     * @Param in   转入方
     * @Param money  转账金额
     */
    @Transactional
    public void transfer(String out, String in, Double money);
}
