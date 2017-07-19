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

    //登录 根据公司编号和登录账号 查找用户信息
    public Account selectAccountByName(String name,String companyCode){
        return accountMapper.selectAccountByName(name,companyCode);
    }

}
