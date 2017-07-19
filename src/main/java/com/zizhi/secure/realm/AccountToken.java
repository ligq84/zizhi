package com.zizhi.secure.realm;

import com.zizhi.jopo.UserPrincipal;
import com.zizhi.model.Account;
import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Auth liguoqiang
 * @Date 2017-7-13
 * @Update
 * @UDate
 */
public class AccountToken implements AuthenticationToken {
    private UserPrincipal userPrincipal;

    private String password;
    private String companyCode;
    private Account account;

    public AccountToken() {
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    public AccountToken(UserPrincipal principal, String password) {
        super();
        this.userPrincipal = principal;
        this.password = password;
    }

    // 返回用户验证信息
    @Override
    public Object getCredentials() {
        return password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setPrincipal(UserPrincipal principal) {
        this.userPrincipal = principal;
    }


    @Override
    public String toString() {
        return "AccountToken [principal=" + userPrincipal + ", password=" + password + "]";
    }

    @Override
    public Object getPrincipal() {
        return userPrincipal;
    }


    public UserPrincipal getUserPrincipal() {
        return userPrincipal;
    }


    public void setUserPrincipal(UserPrincipal userPrincipal) {
        this.userPrincipal = userPrincipal;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
