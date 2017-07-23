package com.zizhi.service;

import com.zizhi.mapper.AccountMapper;
import com.zizhi.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @UDate
 */
@Service
public class AccountService{
    @Autowired
    AccountMapper accountMapper;

    /**
     * 根据公司编号和登录用户名 查询用户
     * @param loginName
     * @param companyCode
     * @return
     */
    public Account getAccountByNameAndCompanyCode(String loginName,String companyCode){
        List<Account> accountList = accountMapper.getAccountByNameAndCompanyCode(loginName,companyCode);
        if(null != accountList && accountList.size()>0){
            return accountList.get(0);
        }
        return null;
    }
}
