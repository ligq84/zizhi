package com.zizhi.service;

import com.zizhi.mapper.LoginLogMapper;
import com.zizhi.model.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auth liguoqiang
 * @Date 2017-7-23
 * @Update
 * @UDate
 */
@Service
public class LoginLogService{

    @Autowired
    LoginLogMapper loginLogMapper;

    public void insertLoginLog(LoginLog loginLog){
        loginLogMapper.insert(loginLog);
    }
}
