package com.zizhi.mapper;

import com.zizhi.model.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AccountMapper extends Mapper<Account> {
    @Select("SELECT a.* from usr_account a LEFT JOIN usr_company c ON a.companyId = c.companyId" +
            " WHERE a.accountLogin=#{loginName} and c.companyCode=#{companyCode}")
    List<Account> getAccountByNameAndCompanyCode(@Param("loginName") String loginName, @Param("companyCode") String companyCode);
}