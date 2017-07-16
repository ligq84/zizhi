package com.zizhi.service;

import com.zizhi.mapper.AccountMapper;
import com.zizhi.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auth liguoqiang
 * @Date 2017-7-15
 * @Update
 * @UDate
 */
@Service
public class AccountService extends BaseService{

    @Autowired
    private AccountMapper accountMapper;

    public Account selectAccountByName(String name){
        Account account  = new Account();
        account.setAccountLogin(name);
        return (Account) accountMapper.selectOne(account);
    }

}
