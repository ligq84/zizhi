package com.zizhi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "usr_login_log")
public class LoginLog {
    @Column(name = "log_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logId;

    /**
     * 公司Id
     */
    @Column(name = "company_Id")
    private Integer companyId;

    /**
     * 登录用户名
     */
    @Column(name = "account_login")
    private String accountLogin;

    /**
     * 登录人
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 登录ip
     */
    @Column(name = "login_Ip")
    private String loginIp;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * @return log_Id
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * @param logId
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * 获取公司Id
     *
     * @return company_Id - 公司Id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置公司Id
     *
     * @param companyId 公司Id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取登录用户名
     *
     * @return account_login - 登录用户名
     */
    public String getAccountLogin() {
        return accountLogin;
    }

    /**
     * 设置登录用户名
     *
     * @param accountLogin 登录用户名
     */
    public void setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
    }

    /**
     * 获取登录人
     *
     * @return account_name - 登录人
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置登录人
     *
     * @param accountName 登录人
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取登录ip
     *
     * @return login_Ip - 登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录ip
     *
     * @param loginIp 登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}