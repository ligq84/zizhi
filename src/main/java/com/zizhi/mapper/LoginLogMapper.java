package com.zizhi.mapper;

import com.zizhi.model.LoginLog;
import org.apache.ibatis.annotations.Insert;
import tk.mybatis.mapper.common.Mapper;

public interface LoginLogMapper extends Mapper<LoginLog> {
    @Insert("INSERT INTO usr_login_log(companyId,accountLogin,accountName,loginIp,loginTime) VALUES(#{companyId},#{accountLogin},#{accountName},#{loginIp},#{loginTime})")
    void insertLoginLog(LoginLog loginLog);
}