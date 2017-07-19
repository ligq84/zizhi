package com.zizhi.mapper;

import com.zizhi.model.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface AccountMapper extends Mapper<Account> {
    @Select("SELECT a.* from usr_account a LEFT JOIN usr_company c ON a.company_Id = c.company_Id where c.company_code = #{companyCode}" +
            " and a.account_login = #{name}")
    Account selectAccountByName(@Param(value="name") String name,@Param(value="companyCode")  String companyCode);
}